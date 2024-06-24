// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainStationSearchResponseBody extends TeaModel {
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
    public TrainStationSearchResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
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
     * <p>210e847f16611516748613869de4f6</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static TrainStationSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainStationSearchResponseBody self = new TrainStationSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainStationSearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainStationSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainStationSearchResponseBody setModule(TrainStationSearchResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainStationSearchResponseBodyModule getModule() {
        return this.module;
    }

    public TrainStationSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainStationSearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainStationSearchResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainStationSearchResponseBodyModuleCities extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>hz</p>
         */
        @NameInMap("code")
        public String code;

        @NameInMap("name")
        public String name;

        public static TrainStationSearchResponseBodyModuleCities build(java.util.Map<String, ?> map) throws Exception {
            TrainStationSearchResponseBodyModuleCities self = new TrainStationSearchResponseBodyModuleCities();
            return TeaModel.build(map, self);
        }

        public TrainStationSearchResponseBodyModuleCities setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public TrainStationSearchResponseBodyModuleCities setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class TrainStationSearchResponseBodyModule extends TeaModel {
        @NameInMap("cities")
        public java.util.List<TrainStationSearchResponseBodyModuleCities> cities;

        public static TrainStationSearchResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainStationSearchResponseBodyModule self = new TrainStationSearchResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainStationSearchResponseBodyModule setCities(java.util.List<TrainStationSearchResponseBodyModuleCities> cities) {
            this.cities = cities;
            return this;
        }
        public java.util.List<TrainStationSearchResponseBodyModuleCities> getCities() {
            return this.cities;
        }

    }

}
