// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ModifyPrepayInstanceSpecRequest extends TeaModel {
    @NameInMap("ModifyPrepayInstanceSpecRequest")
    public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest;

    public static ModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayInstanceSpecRequest self = new ModifyPrepayInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayInstanceSpecRequest setModifyPrepayInstanceSpecRequest(ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest modifyPrepayInstanceSpecRequest) {
        this.modifyPrepayInstanceSpecRequest = modifyPrepayInstanceSpecRequest;
        return this;
    }
    public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest getModifyPrepayInstanceSpecRequest() {
        return this.modifyPrepayInstanceSpecRequest;
    }

    public static class ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec extends TeaModel {
        @NameInMap("Cu")
        public Integer cu;

        public static ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec self = new ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

    }

    public static class ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest extends TeaModel {
        @NameInMap("Region")
        public String region;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ResourceSpec")
        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec resourceSpec;

        public static ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest self = new ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequest setResourceSpec(ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public ModifyPrepayInstanceSpecRequestModifyPrepayInstanceSpecRequestResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

}
