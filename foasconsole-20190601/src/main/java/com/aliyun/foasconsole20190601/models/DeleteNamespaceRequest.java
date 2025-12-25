// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DeleteNamespaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteNamespaceRequest")
    public DeleteNamespaceRequestDeleteNamespaceRequest deleteNamespaceRequest;

    public static DeleteNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNamespaceRequest self = new DeleteNamespaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNamespaceRequest setDeleteNamespaceRequest(DeleteNamespaceRequestDeleteNamespaceRequest deleteNamespaceRequest) {
        this.deleteNamespaceRequest = deleteNamespaceRequest;
        return this;
    }
    public DeleteNamespaceRequestDeleteNamespaceRequest getDeleteNamespaceRequest() {
        return this.deleteNamespaceRequest;
    }

    public static class DeleteNamespaceRequestDeleteNamespaceRequest extends TeaModel {
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

        public static DeleteNamespaceRequestDeleteNamespaceRequest build(java.util.Map<String, ?> map) throws Exception {
            DeleteNamespaceRequestDeleteNamespaceRequest self = new DeleteNamespaceRequestDeleteNamespaceRequest();
            return TeaModel.build(map, self);
        }

        public DeleteNamespaceRequestDeleteNamespaceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeleteNamespaceRequestDeleteNamespaceRequest setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public DeleteNamespaceRequestDeleteNamespaceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
