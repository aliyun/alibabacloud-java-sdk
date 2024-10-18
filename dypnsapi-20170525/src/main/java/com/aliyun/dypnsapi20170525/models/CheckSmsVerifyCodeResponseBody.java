// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CheckSmsVerifyCodeResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>For more information about other error codes, see <a href="https://help.aliyun.com/zh/pnvs/developer-reference/api-return-code?spm=a2c4g.11174283.0.0.70c5616bkj38Wa">Response codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Model")
    public CheckSmsVerifyCodeResponseBodyModel model;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckSmsVerifyCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSmsVerifyCodeResponseBody self = new CheckSmsVerifyCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSmsVerifyCodeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CheckSmsVerifyCodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckSmsVerifyCodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckSmsVerifyCodeResponseBody setModel(CheckSmsVerifyCodeResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public CheckSmsVerifyCodeResponseBodyModel getModel() {
        return this.model;
    }

    public CheckSmsVerifyCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CheckSmsVerifyCodeResponseBodyModel extends TeaModel {
        /**
         * <p>The external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1212312</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The verification results. Valid values:</p>
         * <ul>
         * <li>PASS: The verification is successful.</li>
         * <li>UNKNOWN: The verification failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        public static CheckSmsVerifyCodeResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CheckSmsVerifyCodeResponseBodyModel self = new CheckSmsVerifyCodeResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CheckSmsVerifyCodeResponseBodyModel setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public CheckSmsVerifyCodeResponseBodyModel setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

    }

}
