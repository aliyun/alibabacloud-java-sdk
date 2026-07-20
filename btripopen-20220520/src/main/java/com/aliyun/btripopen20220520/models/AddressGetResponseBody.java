// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddressGetResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("module")
    public AddressGetResponseBodyModule module;

    /**
     * <p>The unique identifier of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>407543AF-<strong><strong>-</strong></strong>-****-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Use this parameter to determine the result of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The global trace identifier of the request, typically used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>210bcc3a********d33d7</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static AddressGetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddressGetResponseBody self = new AddressGetResponseBody();
        return TeaModel.build(map, self);
    }

    public AddressGetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddressGetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddressGetResponseBody setModule(AddressGetResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public AddressGetResponseBodyModule getModule() {
        return this.module;
    }

    public AddressGetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddressGetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddressGetResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class AddressGetResponseBodyModule extends TeaModel {
        /**
         * <p>The redirect URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://trip-hisv.taobao.com/ding/trustLogin.htm?********aff8-2c2e58da659b">https://trip-hisv.taobao.com/ding/trustLogin.htm?********aff8-2c2e58da659b</a></p>
         */
        @NameInMap("url")
        public String url;

        public static AddressGetResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            AddressGetResponseBodyModule self = new AddressGetResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public AddressGetResponseBodyModule setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
