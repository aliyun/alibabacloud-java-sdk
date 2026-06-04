// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaEntityResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AASFDFSDFG-DFSDF-DFSDFD-SDFSDF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public UpdateMetaEntityResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateMetaEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaEntityResponseBody self = new UpdateMetaEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMetaEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMetaEntityResponseBody setResult(UpdateMetaEntityResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateMetaEntityResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateMetaEntityResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMetaEntityResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>custom_entity-customer_api:api_001</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static UpdateMetaEntityResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateMetaEntityResponseBodyResult self = new UpdateMetaEntityResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateMetaEntityResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateMetaEntityResponseBodyResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
