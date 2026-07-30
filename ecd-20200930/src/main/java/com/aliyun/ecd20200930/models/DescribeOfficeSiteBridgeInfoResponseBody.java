// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOfficeSiteBridgeInfoResponseBody extends TeaModel {
    /**
     * <p>The virtual bridge information.</p>
     */
    @NameInMap("Bridge")
    public DescribeOfficeSiteBridgeInfoResponseBodyBridge bridge;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F7E4322D-D679-5ACB-A909-490D2F0E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOfficeSiteBridgeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOfficeSiteBridgeInfoResponseBody self = new DescribeOfficeSiteBridgeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOfficeSiteBridgeInfoResponseBody setBridge(DescribeOfficeSiteBridgeInfoResponseBodyBridge bridge) {
        this.bridge = bridge;
        return this;
    }
    public DescribeOfficeSiteBridgeInfoResponseBodyBridge getBridge() {
        return this.bridge;
    }

    public DescribeOfficeSiteBridgeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOfficeSiteBridgeInfoResponseBodyBridge extends TeaModel {
        /**
         * <p>The access type of the management page.</p>
         * 
         * <strong>example:</strong>
         * <p>intranet</p>
         */
        @NameInMap("AccessType")
        public String accessType;

        /**
         * <p>The virtual bridge ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vb-sofiahfish***</p>
         */
        @NameInMap("BridgeId")
        public String bridgeId;

        /**
         * <p>The virtual bridge specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>vb.pro</p>
         */
        @NameInMap("BridgeLevel")
        public String bridgeLevel;

        /**
         * <p>The virtual bridge status.</p>
         * 
         * <strong>example:</strong>
         * <p>inuse</p>
         */
        @NameInMap("BridgeStatus")
        public String bridgeStatus;

        /**
         * <p>The third-party plugin type of the virtual bridge.</p>
         * 
         * <strong>example:</strong>
         * <p>unsr</p>
         */
        @NameInMap("BridgeType")
        public String bridgeType;

        /**
         * <p>The default password for the administrator page.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("DefaultPassword")
        public String defaultPassword;

        /**
         * <p>The default account for the administrator page.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("DefaultUser")
        public String defaultUser;

        /**
         * <p>The deployment time of the virtual bridge.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-07T02:02:00Z</p>
         */
        @NameInMap("DeployTime")
        public String deployTime;

        /**
         * <p>The expiration time of the virtual bridge.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-03-18T00:00:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The public network address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://8.*.*.*:8080">http://8.*.*.*:8080</a></p>
         */
        @NameInMap("InternetUrl")
        public String internetUrl;

        /**
         * <p>The internal network address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://10.0.0.0:8080">http://10.0.0.0:8080</a></p>
         */
        @NameInMap("IntranetUrl")
        public String intranetUrl;

        /**
         * <p>The ID of the locked convenience office network.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing+dir-0211574032</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The office network name. The name must be 2 to 255 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter or Chinese character and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>P0801-1</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        /**
         * <p>The start time of the virtual bridge.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-07T02:02:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeOfficeSiteBridgeInfoResponseBodyBridge build(java.util.Map<String, ?> map) throws Exception {
            DescribeOfficeSiteBridgeInfoResponseBodyBridge self = new DescribeOfficeSiteBridgeInfoResponseBodyBridge();
            return TeaModel.build(map, self);
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setBridgeId(String bridgeId) {
            this.bridgeId = bridgeId;
            return this;
        }
        public String getBridgeId() {
            return this.bridgeId;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setBridgeLevel(String bridgeLevel) {
            this.bridgeLevel = bridgeLevel;
            return this;
        }
        public String getBridgeLevel() {
            return this.bridgeLevel;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setBridgeStatus(String bridgeStatus) {
            this.bridgeStatus = bridgeStatus;
            return this;
        }
        public String getBridgeStatus() {
            return this.bridgeStatus;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setBridgeType(String bridgeType) {
            this.bridgeType = bridgeType;
            return this;
        }
        public String getBridgeType() {
            return this.bridgeType;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setDefaultPassword(String defaultPassword) {
            this.defaultPassword = defaultPassword;
            return this;
        }
        public String getDefaultPassword() {
            return this.defaultPassword;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setDefaultUser(String defaultUser) {
            this.defaultUser = defaultUser;
            return this;
        }
        public String getDefaultUser() {
            return this.defaultUser;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setDeployTime(String deployTime) {
            this.deployTime = deployTime;
            return this;
        }
        public String getDeployTime() {
            return this.deployTime;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setInternetUrl(String internetUrl) {
            this.internetUrl = internetUrl;
            return this;
        }
        public String getInternetUrl() {
            return this.internetUrl;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setIntranetUrl(String intranetUrl) {
            this.intranetUrl = intranetUrl;
            return this;
        }
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

        public DescribeOfficeSiteBridgeInfoResponseBodyBridge setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
