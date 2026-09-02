// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SubmitBatchChangeTableOwnerResponseBody extends TeaModel {
    @NameInMap("Data")
    public SubmitBatchChangeTableOwnerResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>824F80BA-1778-5D8A-BAFF-668A4D9C4CC7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitBatchChangeTableOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchChangeTableOwnerResponseBody self = new SubmitBatchChangeTableOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitBatchChangeTableOwnerResponseBody setData(SubmitBatchChangeTableOwnerResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitBatchChangeTableOwnerResponseBodyData getData() {
        return this.data;
    }

    public SubmitBatchChangeTableOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitBatchChangeTableOwnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitBatchChangeTableOwnerResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>524257_xxxxx</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        /**
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static SubmitBatchChangeTableOwnerResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitBatchChangeTableOwnerResponseBodyData self = new SubmitBatchChangeTableOwnerResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitBatchChangeTableOwnerResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public SubmitBatchChangeTableOwnerResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public SubmitBatchChangeTableOwnerResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
