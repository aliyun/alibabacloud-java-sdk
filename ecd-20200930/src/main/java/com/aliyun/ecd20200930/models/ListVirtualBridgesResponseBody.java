// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ListVirtualBridgesResponseBody extends TeaModel {
    /**
     * <p>The virtual bridge information.</p>
     */
    @NameInMap("Bridges")
    public java.util.List<ListVirtualBridgesResponseBodyBridges> bridges;

    /**
     * <p>The maximum number of entries returned. Valid values: 1 to 100. If this parameter is not specified, the default value 100 is used.
     * The number of returned entries can be less than the specified value but cannot exceed it.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVirtualBridgesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirtualBridgesResponseBody self = new ListVirtualBridgesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirtualBridgesResponseBody setBridges(java.util.List<ListVirtualBridgesResponseBodyBridges> bridges) {
        this.bridges = bridges;
        return this;
    }
    public java.util.List<ListVirtualBridgesResponseBodyBridges> getBridges() {
        return this.bridges;
    }

    public ListVirtualBridgesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListVirtualBridgesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVirtualBridgesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVirtualBridgesResponseBodyBridges extends TeaModel {
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
         * <p>vb-sfijaosifiosjfoij***</p>
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
         * <p>panbit</p>
         */
        @NameInMap("BridgeType")
        public String bridgeType;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-07T02:02:00Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The internal network address.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://10.0.0.0:8080">http://10.0.0.0:8080</a></p>
         */
        @NameInMap("IntranetUrl")
        public String intranetUrl;

        /**
         * <p>The office network ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen+dir-8485473914</p>
         */
        @NameInMap("OfficeSiteId")
        public String officeSiteId;

        /**
         * <p>The office network name.</p>
         * 
         * <strong>example:</strong>
         * <p>hk11</p>
         */
        @NameInMap("OfficeSiteName")
        public String officeSiteName;

        public static ListVirtualBridgesResponseBodyBridges build(java.util.Map<String, ?> map) throws Exception {
            ListVirtualBridgesResponseBodyBridges self = new ListVirtualBridgesResponseBodyBridges();
            return TeaModel.build(map, self);
        }

        public ListVirtualBridgesResponseBodyBridges setAccessType(String accessType) {
            this.accessType = accessType;
            return this;
        }
        public String getAccessType() {
            return this.accessType;
        }

        public ListVirtualBridgesResponseBodyBridges setBridgeId(String bridgeId) {
            this.bridgeId = bridgeId;
            return this;
        }
        public String getBridgeId() {
            return this.bridgeId;
        }

        public ListVirtualBridgesResponseBodyBridges setBridgeLevel(String bridgeLevel) {
            this.bridgeLevel = bridgeLevel;
            return this;
        }
        public String getBridgeLevel() {
            return this.bridgeLevel;
        }

        public ListVirtualBridgesResponseBodyBridges setBridgeStatus(String bridgeStatus) {
            this.bridgeStatus = bridgeStatus;
            return this;
        }
        public String getBridgeStatus() {
            return this.bridgeStatus;
        }

        public ListVirtualBridgesResponseBodyBridges setBridgeType(String bridgeType) {
            this.bridgeType = bridgeType;
            return this;
        }
        public String getBridgeType() {
            return this.bridgeType;
        }

        public ListVirtualBridgesResponseBodyBridges setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListVirtualBridgesResponseBodyBridges setIntranetUrl(String intranetUrl) {
            this.intranetUrl = intranetUrl;
            return this;
        }
        public String getIntranetUrl() {
            return this.intranetUrl;
        }

        public ListVirtualBridgesResponseBodyBridges setOfficeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public ListVirtualBridgesResponseBodyBridges setOfficeSiteName(String officeSiteName) {
            this.officeSiteName = officeSiteName;
            return this;
        }
        public String getOfficeSiteName() {
            return this.officeSiteName;
        }

    }

}
