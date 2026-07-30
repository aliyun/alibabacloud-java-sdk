// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySecurityIPGroupResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ModifySecurityIPGroupResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message is returned, such as an error code.</p>
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
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifySecurityIPGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPGroupResponseBody self = new ModifySecurityIPGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIPGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySecurityIPGroupResponseBody setData(ModifySecurityIPGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifySecurityIPGroupResponseBodyData getData() {
        return this.data;
    }

    public ModifySecurityIPGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySecurityIPGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySecurityIPGroupResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup extends TeaModel {
        /**
         * <p>The IP addresses in the whitelist template.</p>
         * <blockquote>
         * <p>Separate multiple IP addresses with commas. All IP address whitelists support a combined total of 1,000 IP addresses or address segments.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <p>The name of the IP address whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <p>The ID of the IP address whitelist template.</p>
         * 
         * <strong>example:</strong>
         * <p>g-b1asblm5ae****</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <p>The region ID.</p>
         * <p>Example: cn-hangzhou</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
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

        public static ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup self = new ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup();
            return TeaModel.build(map, self);
        }

        public ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setSecurityIpType(String securityIpType) {
            this.securityIpType = securityIpType;
            return this;
        }
        public String getSecurityIpType() {
            return this.securityIpType;
        }

        public ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup setWhitelistNetType(String whitelistNetType) {
            this.whitelistNetType = whitelistNetType;
            return this;
        }
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

    }

    public static class ModifySecurityIPGroupResponseBodyData extends TeaModel {
        /**
         * <p>The information about the cross-product whitelist template.</p>
         */
        @NameInMap("GlobalSecurityIPGroup")
        public java.util.List<ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup> globalSecurityIPGroup;

        public static ModifySecurityIPGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityIPGroupResponseBodyData self = new ModifySecurityIPGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifySecurityIPGroupResponseBodyData setGlobalSecurityIPGroup(java.util.List<ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup> globalSecurityIPGroup) {
            this.globalSecurityIPGroup = globalSecurityIPGroup;
            return this;
        }
        public java.util.List<ModifySecurityIPGroupResponseBodyDataGlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
            return this.globalSecurityIPGroup;
        }

    }

}
