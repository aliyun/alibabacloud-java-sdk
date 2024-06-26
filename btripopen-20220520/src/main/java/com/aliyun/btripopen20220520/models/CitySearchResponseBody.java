// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CitySearchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public CitySearchResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
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
     * <p>210f079e16603757182131635d866a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static CitySearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CitySearchResponseBody self = new CitySearchResponseBody();
        return TeaModel.build(map, self);
    }

    public CitySearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CitySearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CitySearchResponseBody setModule(CitySearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CitySearchResponseBodyModule getModule() {
        return this.module;
    }

    public CitySearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CitySearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CitySearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CitySearchResponseBodyModuleCities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("code")
        public String code;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("region")
        public Integer region;

        public static CitySearchResponseBodyModuleCities build(java.util.Map<String, ?> map) throws Exception {
            CitySearchResponseBodyModuleCities self = new CitySearchResponseBodyModuleCities();
            return TeaModel.build(map, self);
        }

        public CitySearchResponseBodyModuleCities setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CitySearchResponseBodyModuleCities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CitySearchResponseBodyModuleCities setRegion(Integer region) {
            this.region = region;
            return this;
        }
        public Integer getRegion() {
            return this.region;
        }

    }

    public static class CitySearchResponseBodyModule extends TeaModel {
        @NameInMap("cities")
        public java.util.List<CitySearchResponseBodyModuleCities> cities;

        public static CitySearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CitySearchResponseBodyModule self = new CitySearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CitySearchResponseBodyModule setCities(java.util.List<CitySearchResponseBodyModuleCities> cities) {
            this.cities = cities;
            return this;
        }
        public java.util.List<CitySearchResponseBodyModuleCities> getCities() {
            return this.cities;
        }

    }

}
