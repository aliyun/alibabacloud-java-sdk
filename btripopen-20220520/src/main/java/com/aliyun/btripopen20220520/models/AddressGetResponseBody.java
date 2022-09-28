// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class AddressGetResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public AddressGetResponseBodyModule module;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static AddressGetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddressGetResponseBody self = new AddressGetResponseBody();
        return TeaModel.build(map, self);
    }

    public AddressGetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddressGetResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
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
