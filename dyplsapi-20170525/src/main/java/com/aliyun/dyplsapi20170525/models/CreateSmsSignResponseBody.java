// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmsSignResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>返回状态码 0000表示成功 其他表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateSmsSignResponseBodyData data;

    /**
     * <p>返回信息</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>返回是否成功 true  表示成功 false表示失败</p>
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
         * <p>短信接收者号码签名串(加到短信内容中供解析真实被叫号码)</p>
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
