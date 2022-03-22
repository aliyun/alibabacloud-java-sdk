// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20220322.models;

import com.aliyun.tea.*;

public class GridWeatherQueryResponseBody extends TeaModel {
    // 响应码
    @NameInMap("code")
    public Long code;

    // 响应信息
    @NameInMap("message")
    public String message;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    // 响应结果
    @NameInMap("result")
    public java.util.List<GridWeatherQueryResponseBodyResult> result;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    public static GridWeatherQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GridWeatherQueryResponseBody self = new GridWeatherQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public GridWeatherQueryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GridWeatherQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GridWeatherQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GridWeatherQueryResponseBody setResult(java.util.List<GridWeatherQueryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GridWeatherQueryResponseBodyResult> getResult() {
        return this.result;
    }

    public GridWeatherQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GridWeatherQueryResponseBodyResultDataElements extends TeaModel {
        @NameInMap("element")
        public String element;

        @NameInMap("value")
        public String value;

        public static GridWeatherQueryResponseBodyResultDataElements build(java.util.Map<String, ?> map) throws Exception {
            GridWeatherQueryResponseBodyResultDataElements self = new GridWeatherQueryResponseBodyResultDataElements();
            return TeaModel.build(map, self);
        }

        public GridWeatherQueryResponseBodyResultDataElements setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public GridWeatherQueryResponseBodyResultDataElements setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GridWeatherQueryResponseBodyResultData extends TeaModel {
        @NameInMap("elements")
        public java.util.List<GridWeatherQueryResponseBodyResultDataElements> elements;

        // 预报时间
        @NameInMap("forecastTimestamp")
        public String forecastTimestamp;

        // 观测时间
        @NameInMap("observationTimestamp")
        public String observationTimestamp;

        public static GridWeatherQueryResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            GridWeatherQueryResponseBodyResultData self = new GridWeatherQueryResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public GridWeatherQueryResponseBodyResultData setElements(java.util.List<GridWeatherQueryResponseBodyResultDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<GridWeatherQueryResponseBodyResultDataElements> getElements() {
            return this.elements;
        }

        public GridWeatherQueryResponseBodyResultData setForecastTimestamp(String forecastTimestamp) {
            this.forecastTimestamp = forecastTimestamp;
            return this;
        }
        public String getForecastTimestamp() {
            return this.forecastTimestamp;
        }

        public GridWeatherQueryResponseBodyResultData setObservationTimestamp(String observationTimestamp) {
            this.observationTimestamp = observationTimestamp;
            return this;
        }
        public String getObservationTimestamp() {
            return this.observationTimestamp;
        }

    }

    public static class GridWeatherQueryResponseBodyResultLocation extends TeaModel {
        // 纬度
        @NameInMap("latitude")
        public Double latitude;

        // 经度
        @NameInMap("longitude")
        public Double longitude;

        public static GridWeatherQueryResponseBodyResultLocation build(java.util.Map<String, ?> map) throws Exception {
            GridWeatherQueryResponseBodyResultLocation self = new GridWeatherQueryResponseBodyResultLocation();
            return TeaModel.build(map, self);
        }

        public GridWeatherQueryResponseBodyResultLocation setLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }
        public Double getLatitude() {
            return this.latitude;
        }

        public GridWeatherQueryResponseBodyResultLocation setLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }
        public Double getLongitude() {
            return this.longitude;
        }

    }

    public static class GridWeatherQueryResponseBodyResult extends TeaModel {
        // 该位置的查询结果
        @NameInMap("data")
        public java.util.List<GridWeatherQueryResponseBodyResultData> data;

        // 位置
        @NameInMap("location")
        public GridWeatherQueryResponseBodyResultLocation location;

        // 起报时间
        @NameInMap("reportTimestamp")
        public String reportTimestamp;

        public static GridWeatherQueryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GridWeatherQueryResponseBodyResult self = new GridWeatherQueryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GridWeatherQueryResponseBodyResult setData(java.util.List<GridWeatherQueryResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<GridWeatherQueryResponseBodyResultData> getData() {
            return this.data;
        }

        public GridWeatherQueryResponseBodyResult setLocation(GridWeatherQueryResponseBodyResultLocation location) {
            this.location = location;
            return this;
        }
        public GridWeatherQueryResponseBodyResultLocation getLocation() {
            return this.location;
        }

        public GridWeatherQueryResponseBodyResult setReportTimestamp(String reportTimestamp) {
            this.reportTimestamp = reportTimestamp;
            return this;
        }
        public String getReportTimestamp() {
            return this.reportTimestamp;
        }

    }

}
