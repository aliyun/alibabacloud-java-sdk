// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class ModifyPrepayNamespaceSpecRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sc_flinkserverlesspost_public_cn-0ju2bj2****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ns-1</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>This parameter is required.</p>
         */
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
