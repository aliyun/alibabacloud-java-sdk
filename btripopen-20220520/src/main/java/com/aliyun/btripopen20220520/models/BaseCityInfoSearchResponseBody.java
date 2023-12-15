// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BaseCityInfoSearchResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public java.util.List<BaseCityInfoSearchResponseBodyModule> module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static BaseCityInfoSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BaseCityInfoSearchResponseBody self = new BaseCityInfoSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public BaseCityInfoSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BaseCityInfoSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BaseCityInfoSearchResponseBody setModule(java.util.List<BaseCityInfoSearchResponseBodyModule> module) {
        this.module = module;
        return this;
    }
    public java.util.List<BaseCityInfoSearchResponseBodyModule> getModule() {
        return this.module;
    }

    public BaseCityInfoSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BaseCityInfoSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BaseCityInfoSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class BaseCityInfoSearchResponseBodyModule extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("name")
        public String name;

        @NameInMap("nameTree")
        public String nameTree;

        @NameInMap("region")
        public String region;

        public static BaseCityInfoSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            BaseCityInfoSearchResponseBodyModule self = new BaseCityInfoSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public BaseCityInfoSearchResponseBodyModule setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public BaseCityInfoSearchResponseBodyModule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public BaseCityInfoSearchResponseBodyModule setNameTree(String nameTree) {
            this.nameTree = nameTree;
            return this;
        }
        public String getNameTree() {
            return this.nameTree;
        }

        public BaseCityInfoSearchResponseBodyModule setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

    }

}
