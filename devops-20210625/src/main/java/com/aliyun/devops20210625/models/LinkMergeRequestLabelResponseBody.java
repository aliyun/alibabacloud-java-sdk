// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class LinkMergeRequestLabelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public LinkMergeRequestLabelResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static LinkMergeRequestLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LinkMergeRequestLabelResponseBody self = new LinkMergeRequestLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public LinkMergeRequestLabelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public LinkMergeRequestLabelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public LinkMergeRequestLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LinkMergeRequestLabelResponseBody setResult(LinkMergeRequestLabelResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public LinkMergeRequestLabelResponseBodyResult getResult() {
        return this.result;
    }

    public LinkMergeRequestLabelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LinkMergeRequestLabelResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("result")
        public Boolean result;

        public static LinkMergeRequestLabelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            LinkMergeRequestLabelResponseBodyResult self = new LinkMergeRequestLabelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public LinkMergeRequestLabelResponseBodyResult setResult(Boolean result) {
            this.result = result;
            return this;
        }
        public Boolean getResult() {
            return this.result;
        }

    }

}
