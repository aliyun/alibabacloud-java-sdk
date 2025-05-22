// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class SubmitSolutionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://companyreg.console.aliyun.com/#/intention-notarize?Type=119&bizid=I20220114181457000001">https://companyreg.console.aliyun.com/#/intention-notarize?Type=119&amp;bizid=I20220114181457000001</a></p>
     */
    @NameInMap("ConfirmUrl")
    public String confirmUrl;

    /**
     * <strong>example:</strong>
     * <p>NoPermission</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>0A3CFCF5-E0C0-5C0B-A2ED-03827F16D85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>S20211109140729000001</p>
     */
    @NameInMap("SolutionBizId")
    public String solutionBizId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SubmitSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSolutionResponseBody self = new SubmitSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSolutionResponseBody setConfirmUrl(String confirmUrl) {
        this.confirmUrl = confirmUrl;
        return this;
    }
    public String getConfirmUrl() {
        return this.confirmUrl;
    }

    public SubmitSolutionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubmitSolutionResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public SubmitSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSolutionResponseBody setSolutionBizId(String solutionBizId) {
        this.solutionBizId = solutionBizId;
        return this;
    }
    public String getSolutionBizId() {
        return this.solutionBizId;
    }

    public SubmitSolutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
