// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteRemediationsResponseBody extends TeaModel {
    /**
     * <p>The result of the delete operation.</p>
     */
    @NameInMap("RemediationDeleteResults")
    public java.util.List<DeleteRemediationsResponseBodyRemediationDeleteResults> remediationDeleteResults;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4BE28FB1-616A-5586-82E4-F34FB2AF7441</p>
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
         * <ul>
         * <li><p>This parameter is empty if the remediation setting is successfully deleted.</p>
         * </li>
         * <li><p>This parameter returns an error code if the operation fails. For more information about error codes, see &lt;props=&quot;intl&quot;&gt;<a href="https://error-center.alibabacloud.com/status/product/Config">Error Center</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RemediationConfigNotExist</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The remediation setting ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-909ba2d4716700eb****</p>
         */
        @NameInMap("RemediationId")
        public String remediationId;

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: The operation was successful.</p>
         * </li>
         * <li><p>false: The operation failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
