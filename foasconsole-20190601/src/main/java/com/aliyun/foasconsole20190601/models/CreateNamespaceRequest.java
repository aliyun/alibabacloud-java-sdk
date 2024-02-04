// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class CreateNamespaceRequest extends TeaModel {
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
        @NameInMap("Cpu")
        public Integer cpu;

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
        @NameInMap("Ha")
        public Boolean ha;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Namespace")
        public String namespace;

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
