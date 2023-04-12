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
     * <p>The ID of the request.</p>
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
         * <p>The error code.</p>
         * <br>
         * <p>*   If the remediation setting is deleted, no error code is returned.</p>
         * <p>*   If the remediation setting fails to be deleted, an error code is returned. For more information about error codes, visit the [API Error Center](https://error-center.alibabacloud.com/status/product/Config).</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the remediation setting.</p>
         */
        @NameInMap("RemediationId")
        public String remediationId;

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <br>
         * <p>*   true: The call is successful.</p>
         * <p>*   false: The call fails.</p>
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
