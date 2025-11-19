// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class ModifySecurityIPGroupRelationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>ListResult<InstanceSSL></p>
     */
    @NameInMap("Data")
    public ModifySecurityIPGroupRelationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>840F51F7-9C01-538D-94F6-AE712905****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifySecurityIPGroupRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityIPGroupRelationResponseBody self = new ModifySecurityIPGroupRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySecurityIPGroupRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySecurityIPGroupRelationResponseBody setData(ModifySecurityIPGroupRelationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifySecurityIPGroupRelationResponseBodyData getData() {
        return this.data;
    }

    public ModifySecurityIPGroupRelationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySecurityIPGroupRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySecurityIPGroupRelationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>192.168.0.1,192.168.100.0/24</p>
         */
        @NameInMap("GIpList")
        public String GIpList;

        /**
         * <strong>example:</strong>
         * <p>saas_jump</p>
         */
        @NameInMap("GlobalIgName")
        public String globalIgName;

        /**
         * <strong>example:</strong>
         * <p>g-v8kwereyd6u7kx****</p>
         */
        @NameInMap("GlobalSecurityGroupId")
        public String globalSecurityGroupId;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel self = new ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel();
            return TeaModel.build(map, self);
        }

        public ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel setGIpList(String GIpList) {
            this.GIpList = GIpList;
            return this;
        }
        public String getGIpList() {
            return this.GIpList;
        }

        public ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel setGlobalIgName(String globalIgName) {
            this.globalIgName = globalIgName;
            return this;
        }
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        public ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel setGlobalSecurityGroupId(String globalSecurityGroupId) {
            this.globalSecurityGroupId = globalSecurityGroupId;
            return this;
        }
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        public ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ModifySecurityIPGroupRelationResponseBodyData extends TeaModel {
        @NameInMap("GlobalSecurityIPGroupRel")
        public java.util.List<ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel> globalSecurityIPGroupRel;

        /**
         * <strong>example:</strong>
         * <p>rm-2ze1jdv45i7l6****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ModifySecurityIPGroupRelationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifySecurityIPGroupRelationResponseBodyData self = new ModifySecurityIPGroupRelationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifySecurityIPGroupRelationResponseBodyData setGlobalSecurityIPGroupRel(java.util.List<ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel> globalSecurityIPGroupRel) {
            this.globalSecurityIPGroupRel = globalSecurityIPGroupRel;
            return this;
        }
        public java.util.List<ModifySecurityIPGroupRelationResponseBodyDataGlobalSecurityIPGroupRel> getGlobalSecurityIPGroupRel() {
            return this.globalSecurityIPGroupRel;
        }

        public ModifySecurityIPGroupRelationResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
