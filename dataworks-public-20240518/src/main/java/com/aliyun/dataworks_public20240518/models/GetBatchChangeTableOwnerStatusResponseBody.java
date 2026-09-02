// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetBatchChangeTableOwnerStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetBatchChangeTableOwnerStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>01A017D3-207E-582C-A683-BE991E54051D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBatchChangeTableOwnerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchChangeTableOwnerStatusResponseBody self = new GetBatchChangeTableOwnerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchChangeTableOwnerStatusResponseBody setData(GetBatchChangeTableOwnerStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBatchChangeTableOwnerStatusResponseBodyData getData() {
        return this.data;
    }

    public GetBatchChangeTableOwnerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchChangeTableOwnerStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBatchChangeTableOwnerStatusResponseBodyDataDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Forbidden: You are not a member of this project</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>maxcompute-table:123:project_a::table_1</p>
         */
        @NameInMap("TableMetaEntityId")
        public String tableMetaEntityId;

        public static GetBatchChangeTableOwnerStatusResponseBodyDataDetails build(java.util.Map<String, ?> map) throws Exception {
            GetBatchChangeTableOwnerStatusResponseBodyDataDetails self = new GetBatchChangeTableOwnerStatusResponseBodyDataDetails();
            return TeaModel.build(map, self);
        }

        public GetBatchChangeTableOwnerStatusResponseBodyDataDetails setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetBatchChangeTableOwnerStatusResponseBodyDataDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchChangeTableOwnerStatusResponseBodyDataDetails setTableMetaEntityId(String tableMetaEntityId) {
            this.tableMetaEntityId = tableMetaEntityId;
            return this;
        }
        public String getTableMetaEntityId() {
            return this.tableMetaEntityId;
        }

    }

    public static class GetBatchChangeTableOwnerStatusResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>524257_openapi-req-abc123</p>
         */
        @NameInMap("BatchId")
        public String batchId;

        @NameInMap("Details")
        public java.util.List<GetBatchChangeTableOwnerStatusResponseBodyDataDetails> details;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FailedCount")
        public Integer failedCount;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("OngoingCount")
        public Integer ongoingCount;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GetBatchChangeTableOwnerStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBatchChangeTableOwnerStatusResponseBodyData self = new GetBatchChangeTableOwnerStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBatchChangeTableOwnerStatusResponseBodyData setBatchId(String batchId) {
            this.batchId = batchId;
            return this;
        }
        public String getBatchId() {
            return this.batchId;
        }

        public GetBatchChangeTableOwnerStatusResponseBodyData setDetails(java.util.List<GetBatchChangeTableOwnerStatusResponseBodyDataDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<GetBatchChangeTableOwnerStatusResponseBodyDataDetails> getDetails() {
            return this.details;
        }

        public GetBatchChangeTableOwnerStatusResponseBodyData setFailedCount(Integer failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public Integer getFailedCount() {
            return this.failedCount;
        }

        public GetBatchChangeTableOwnerStatusResponseBodyData setOngoingCount(Integer ongoingCount) {
            this.ongoingCount = ongoingCount;
            return this;
        }
        public Integer getOngoingCount() {
            return this.ongoingCount;
        }

        public GetBatchChangeTableOwnerStatusResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchChangeTableOwnerStatusResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public GetBatchChangeTableOwnerStatusResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
