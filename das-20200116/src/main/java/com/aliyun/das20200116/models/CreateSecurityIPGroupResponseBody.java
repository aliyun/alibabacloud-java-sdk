// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSecurityIPGroupResponseBody extends TeaModel {
    /**
     * <p>The returned status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>ListResult<InstanceSSL></p>
     */
    @NameInMap("Data")
    public CreateSecurityIPGroupResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D578DB3C-06BF-54F2-A78F-C6C25Exxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateSecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityIPGroupResponseBody self = new CreateSecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSecurityIPGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSecurityIPGroupResponseBody setData(CreateSecurityIPGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSecurityIPGroupResponseBodyData getData() {
        return this.data;
    }

    public CreateSecurityIPGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSecurityIPGroupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup extends TeaModel {
        /**
         * <p>The IP addresses in the whitelist template.</p>
         * <blockquote>
         * <p>Separate multiple IP addresses with commas (,). A maximum of 1000 IP addresses or CIDR blocks can be added across all IP whitelists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/24</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <p>The name of the IP whitelist template. The name must meet the following requirements:</p>
         * <ul>
         * <li><p>Contains only lowercase letters, digits, and underscores (_).</p>
         * </li>
         * <li><p>Starts with a letter and ends with a letter or digit.</p>
         * </li>
         * <li><p>Is 2 to 120 characters in length.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <p>The ID of the IP whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>g-2uztsd6yvhmsqyjXXX</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <p>The region ID.</p>
         * <p>Example value:
         * cn-hangzhou</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The IP type.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        @NameInMap("SecurityIpType")
        public String securityIpType;

        /**
         * <p>The network type of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>mix</p>
         */
        @NameInMap("WhitelistNetType")
        public String whitelistNetType;

        public static CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup self = new CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setSecurityIpType(String securityIpType) {
            this.securityIpType = securityIpType;
            return this;
        }
        public String getSecurityIpType() {
            return this.securityIpType;
        }

        public CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setWhitelistNetType(String whitelistNetType) {
            this.whitelistNetType = whitelistNetType;
            return this;
        }
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

    }

    public static class CreateSecurityIPGroupResponseBodyData extends TeaModel {
        /**
         * <p>The cross-service whitelist template information.</p>
         */
        @NameInMap("GlobalSecurityIPGroup")
        public java.util.List<CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup> globalSecurityIPGroup;

        public static CreateSecurityIPGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityIPGroupResponseBodyData self = new CreateSecurityIPGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSecurityIPGroupResponseBodyData setGlobalSecurityIPGroup(java.util.List<CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup> globalSecurityIPGroup) {
            this.globalSecurityIPGroup = globalSecurityIPGroup;
            return this;
        }
        public java.util.List<CreateSecurityIPGroupResponseBodyDataGlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
            return this.globalSecurityIPGroup;
        }

    }

}
