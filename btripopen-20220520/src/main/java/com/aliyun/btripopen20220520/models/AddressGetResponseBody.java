// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddressGetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public AddressGetResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>210bcc3a16583004579056128d33d7</p>
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
         * <strong>example:</strong>
         * <p><a href="https://trip-hisv.taobao.com/ding/trustLogin.htm?redirectUrl=https%3A%2F%2Fmarket.m.taobao.com%2Fapp%2Fbtrip-fe%2Frx-alitrip-main%2Fhome.html%3Ffpt%3DbIdentify%2528dingtalk.isv.h5.home%2529%26corpId%3Dding3f9797e277423f14a1320dcb25e91351%26dingUserId%3Dmanager9302%26dingAppId%3D1692%26fit%3Dtrue&token=b73e0b9e-d25a-40f0-aff8-2c2e58da659b">https://trip-hisv.taobao.com/ding/trustLogin.htm?redirectUrl=https%3A%2F%2Fmarket.m.taobao.com%2Fapp%2Fbtrip-fe%2Frx-alitrip-main%2Fhome.html%3Ffpt%3DbIdentify%2528dingtalk.isv.h5.home%2529%26corpId%3Dding3f9797e277423f14a1320dcb25e91351%26dingUserId%3Dmanager9302%26dingAppId%3D1692%26fit%3Dtrue&amp;token=b73e0b9e-d25a-40f0-aff8-2c2e58da659b</a></p>
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
