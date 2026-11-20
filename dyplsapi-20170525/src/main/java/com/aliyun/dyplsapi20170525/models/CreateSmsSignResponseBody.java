// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsSignResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The returned status code. Valid values:</p>
     * <ul>
     * <li><p>0000: The request is successful.</p>
     * </li>
     * <li><p>Other values: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The text message signature creation result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CalledNoSign&quot;:&quot;sign23343466&quot;}</p>
     */
    @NameInMap("Data")
    public CreateSmsSignResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request is successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateSmsSignResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignResponseBody self = new CreateSmsSignResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CreateSmsSignResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSmsSignResponseBody setData(CreateSmsSignResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSmsSignResponseBodyData getData() {
        return this.data;
    }

    public CreateSmsSignResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSmsSignResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateSmsSignResponseBodyData extends TeaModel {
        /**
         * <p>The signature string of the recipient number. Append this string to the text message content to parse the actual called number.</p>
         * 
         * <strong>example:</strong>
         * <p>sign23343466</p>
         */
        @NameInMap("CalledNoSign")
        public String calledNoSign;

        public static CreateSmsSignResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSmsSignResponseBodyData self = new CreateSmsSignResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSmsSignResponseBodyData setCalledNoSign(String calledNoSign) {
            this.calledNoSign = calledNoSign;
            return this;
        }
        public String getCalledNoSign() {
            return this.calledNoSign;
        }

    }

}
