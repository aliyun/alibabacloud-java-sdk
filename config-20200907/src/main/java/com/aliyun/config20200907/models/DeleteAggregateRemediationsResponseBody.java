// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateRemediationsResponseBody extends TeaModel {
    /**
     * <p>The results of the delete operation.</p>
     */
    @NameInMap("RemediationDeleteResults")
    public java.util.List<DeleteAggregateRemediationsResponseBodyRemediationDeleteResults> remediationDeleteResults;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAggregateRemediationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateRemediationsResponseBody self = new DeleteAggregateRemediationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateRemediationsResponseBody setRemediationDeleteResults(java.util.List<DeleteAggregateRemediationsResponseBodyRemediationDeleteResults> remediationDeleteResults) {
        this.remediationDeleteResults = remediationDeleteResults;
        return this;
    }
    public java.util.List<DeleteAggregateRemediationsResponseBodyRemediationDeleteResults> getRemediationDeleteResults() {
        return this.remediationDeleteResults;
    }

    public DeleteAggregateRemediationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteAggregateRemediationsResponseBodyRemediationDeleteResults extends TeaModel {
        /**
         * <p>The error code returned.</p>
         * <br>
         * <p>*   If the remediation template is deleted, no error code is returned.</p>
         * <p>*   If the remediation template fails to be deleted, an error code is returned. For more information about error codes, see [Error codes](https://error-center.alibabacloud.com/status/product/Config).</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the remediation template.</p>
         */
        @NameInMap("RemediationId")
        public String remediationId;

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <br>
         * <p>*   true: The request was successful.</p>
         * <p>*   false: The request failed.</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static DeleteAggregateRemediationsResponseBodyRemediationDeleteResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteAggregateRemediationsResponseBodyRemediationDeleteResults self = new DeleteAggregateRemediationsResponseBodyRemediationDeleteResults();
            return TeaModel.build(map, self);
        }

        public DeleteAggregateRemediationsResponseBodyRemediationDeleteResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeleteAggregateRemediationsResponseBodyRemediationDeleteResults setRemediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }
        public String getRemediationId() {
            return this.remediationId;
        }

        public DeleteAggregateRemediationsResponseBodyRemediationDeleteResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
