// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteRemediationsResponseBody extends TeaModel {
    /**
     * <p>The results of the delete operation.</p>
     */
    @NameInMap("RemediationDeleteResults")
    public java.util.List<DeleteRemediationsResponseBodyRemediationDeleteResults> remediationDeleteResults;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRemediationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRemediationsResponseBody self = new DeleteRemediationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRemediationsResponseBody setRemediationDeleteResults(java.util.List<DeleteRemediationsResponseBodyRemediationDeleteResults> remediationDeleteResults) {
        this.remediationDeleteResults = remediationDeleteResults;
        return this;
    }
    public java.util.List<DeleteRemediationsResponseBodyRemediationDeleteResults> getRemediationDeleteResults() {
        return this.remediationDeleteResults;
    }

    public DeleteRemediationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteRemediationsResponseBodyRemediationDeleteResults extends TeaModel {
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

        public static DeleteRemediationsResponseBodyRemediationDeleteResults build(java.util.Map<String, ?> map) throws Exception {
            DeleteRemediationsResponseBodyRemediationDeleteResults self = new DeleteRemediationsResponseBodyRemediationDeleteResults();
            return TeaModel.build(map, self);
        }

        public DeleteRemediationsResponseBodyRemediationDeleteResults setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeleteRemediationsResponseBodyRemediationDeleteResults setRemediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }
        public String getRemediationId() {
            return this.remediationId;
        }

        public DeleteRemediationsResponseBodyRemediationDeleteResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
