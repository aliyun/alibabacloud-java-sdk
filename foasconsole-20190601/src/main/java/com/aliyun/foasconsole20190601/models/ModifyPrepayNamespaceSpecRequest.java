// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ModifyPrepayNamespaceSpecRequest extends TeaModel {
    @NameInMap("ModifyPrepayNamespaceSpecRequest")
    public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest modifyPrepayNamespaceSpecRequest;

    public static ModifyPrepayNamespaceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrepayNamespaceSpecRequest self = new ModifyPrepayNamespaceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPrepayNamespaceSpecRequest setModifyPrepayNamespaceSpecRequest(ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest modifyPrepayNamespaceSpecRequest) {
        this.modifyPrepayNamespaceSpecRequest = modifyPrepayNamespaceSpecRequest;
        return this;
    }
    public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest getModifyPrepayNamespaceSpecRequest() {
        return this.modifyPrepayNamespaceSpecRequest;
    }

    public static class ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequestResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequestResourceSpec self = new ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Namespace")
        public String namespace;

        @NameInMap("Region")
        public String region;

        @NameInMap("ResourceSpec")
        public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequestResourceSpec resourceSpec;

        public static ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
            ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest self = new ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest();
            return TeaModel.build(map, self);
        }

        public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequest setResourceSpec(ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequestResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public ModifyPrepayNamespaceSpecRequestModifyPrepayNamespaceSpecRequestResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

}
