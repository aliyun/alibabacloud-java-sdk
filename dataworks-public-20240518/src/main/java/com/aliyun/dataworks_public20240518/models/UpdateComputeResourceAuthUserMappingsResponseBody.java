// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateComputeResourceAuthUserMappingsResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     */
    @NameInMap("Data")
    public UpdateComputeResourceAuthUserMappingsResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>10000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateComputeResourceAuthUserMappingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateComputeResourceAuthUserMappingsResponseBody self = new UpdateComputeResourceAuthUserMappingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateComputeResourceAuthUserMappingsResponseBody setData(UpdateComputeResourceAuthUserMappingsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateComputeResourceAuthUserMappingsResponseBodyData getData() {
        return this.data;
    }

    public UpdateComputeResourceAuthUserMappingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateComputeResourceAuthUserMappingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateComputeResourceAuthUserMappingsResponseBodyData extends TeaModel {
        /**
         * <p>The change record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123xx</p>
         */
        @NameInMap("ChangeRecordId")
        public Long changeRecordId;

        /**
         * <p>Indicates whether the operation succeeded. Valid values:</p>
         * <ul>
         * <li>success: The update succeeded.</li>
         * <li>fail: The update failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static UpdateComputeResourceAuthUserMappingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateComputeResourceAuthUserMappingsResponseBodyData self = new UpdateComputeResourceAuthUserMappingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateComputeResourceAuthUserMappingsResponseBodyData setChangeRecordId(Long changeRecordId) {
            this.changeRecordId = changeRecordId;
            return this;
        }
        public Long getChangeRecordId() {
            return this.changeRecordId;
        }

        public UpdateComputeResourceAuthUserMappingsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
