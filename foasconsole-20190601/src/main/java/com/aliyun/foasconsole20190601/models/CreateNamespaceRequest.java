// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class CreateNamespaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CreateNamespaceRequest")
    public CreateNamespaceRequestCreateNamespaceRequest createNamespaceRequest;

    public static CreateNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNamespaceRequest self = new CreateNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNamespaceRequest setCreateNamespaceRequest(CreateNamespaceRequestCreateNamespaceRequest createNamespaceRequest) {
        this.createNamespaceRequest = createNamespaceRequest;
        return this;
    }
    public CreateNamespaceRequestCreateNamespaceRequest getCreateNamespaceRequest() {
        return this.createNamespaceRequest;
    }

    public static class CreateNamespaceRequestCreateNamespaceRequestResourceSpec extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("MemoryGB")
        public Integer memoryGB;

        public static CreateNamespaceRequestCreateNamespaceRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateNamespaceRequestCreateNamespaceRequestResourceSpec self = new CreateNamespaceRequestCreateNamespaceRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public CreateNamespaceRequestCreateNamespaceRequestResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public CreateNamespaceRequestCreateNamespaceRequestResourceSpec setMemoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            return this;
        }
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

    }

    public static class CreateNamespaceRequestCreateNamespaceRequest extends TeaModel {
        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("Ha")
        public Boolean ha;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>223493C7-FCA9-13D4-B75B-AF8B32F4****</p>
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

        @NameInMap("ResourceSpec")
        public CreateNamespaceRequestCreateNamespaceRequestResourceSpec resourceSpec;

        public static CreateNamespaceRequestCreateNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
            CreateNamespaceRequestCreateNamespaceRequest self = new CreateNamespaceRequestCreateNamespaceRequest();
            return TeaModel.build(map, self);
        }

        public CreateNamespaceRequestCreateNamespaceRequest setHa(Boolean ha) {
            this.ha = ha;
            return this;
        }
        public Boolean getHa() {
            return this.ha;
        }

        public CreateNamespaceRequestCreateNamespaceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateNamespaceRequestCreateNamespaceRequest setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateNamespaceRequestCreateNamespaceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateNamespaceRequestCreateNamespaceRequest setResourceSpec(CreateNamespaceRequestCreateNamespaceRequestResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public CreateNamespaceRequestCreateNamespaceRequestResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

    }

}
