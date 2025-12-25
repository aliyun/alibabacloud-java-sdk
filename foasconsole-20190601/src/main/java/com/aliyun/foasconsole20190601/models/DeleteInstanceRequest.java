// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20190601.models;

import com.aliyun.tea.*;

public class DeleteInstanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeleteInstanceRequest")
    public DeleteInstanceRequestDeleteInstanceRequest deleteInstanceRequest;

    public static DeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceRequest self = new DeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceRequest setDeleteInstanceRequest(DeleteInstanceRequestDeleteInstanceRequest deleteInstanceRequest) {
        this.deleteInstanceRequest = deleteInstanceRequest;
        return this;
    }
    public DeleteInstanceRequestDeleteInstanceRequest getDeleteInstanceRequest() {
        return this.deleteInstanceRequest;
    }

    public static class DeleteInstanceRequestDeleteInstanceRequest extends TeaModel {
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
         * <p>cn-beijing</p>
         */
        @NameInMap("Region")
        public String region;

        public static DeleteInstanceRequestDeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
            DeleteInstanceRequestDeleteInstanceRequest self = new DeleteInstanceRequestDeleteInstanceRequest();
            return TeaModel.build(map, self);
        }

        public DeleteInstanceRequestDeleteInstanceRequest setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DeleteInstanceRequestDeleteInstanceRequest setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
