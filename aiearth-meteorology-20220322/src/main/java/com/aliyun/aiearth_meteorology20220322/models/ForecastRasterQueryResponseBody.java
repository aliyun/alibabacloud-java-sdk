// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_meteorology20220322.models;

import com.aliyun.tea.*;

public class ForecastRasterQueryResponseBody extends TeaModel {
    // 响应码
    @NameInMap("code")
    public Long code;

    // 响应信息
    @NameInMap("message")
    public String message;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public ForecastRasterQueryResponseBodyResult result;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    public static ForecastRasterQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ForecastRasterQueryResponseBody self = new ForecastRasterQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public ForecastRasterQueryResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ForecastRasterQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ForecastRasterQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ForecastRasterQueryResponseBody setResult(ForecastRasterQueryResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ForecastRasterQueryResponseBodyResult getResult() {
        return this.result;
    }

    public ForecastRasterQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ForecastRasterQueryResponseBodyResultData extends TeaModel {
        @NameInMap("index")
        public Integer index;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("url")
        public String url;

        public static ForecastRasterQueryResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ForecastRasterQueryResponseBodyResultData self = new ForecastRasterQueryResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ForecastRasterQueryResponseBodyResultData setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public ForecastRasterQueryResponseBodyResultData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ForecastRasterQueryResponseBodyResultData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ForecastRasterQueryResponseBodyResult extends TeaModel {
        @NameInMap("data")
        public java.util.List<ForecastRasterQueryResponseBodyResultData> data;

        @NameInMap("element")
        public String element;

        @NameInMap("extent")
        public java.util.List<Float> extent;

        @NameInMap("format")
        public String format;

        @NameInMap("reportTimestamp")
        public Long reportTimestamp;

        public static ForecastRasterQueryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ForecastRasterQueryResponseBodyResult self = new ForecastRasterQueryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ForecastRasterQueryResponseBodyResult setData(java.util.List<ForecastRasterQueryResponseBodyResultData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ForecastRasterQueryResponseBodyResultData> getData() {
            return this.data;
        }

        public ForecastRasterQueryResponseBodyResult setElement(String element) {
            this.element = element;
            return this;
        }
        public String getElement() {
            return this.element;
        }

        public ForecastRasterQueryResponseBodyResult setExtent(java.util.List<Float> extent) {
            this.extent = extent;
            return this;
        }
        public java.util.List<Float> getExtent() {
            return this.extent;
        }

        public ForecastRasterQueryResponseBodyResult setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ForecastRasterQueryResponseBodyResult setReportTimestamp(Long reportTimestamp) {
            this.reportTimestamp = reportTimestamp;
            return this;
        }
        public Long getReportTimestamp() {
            return this.reportTimestamp;
        }

    }

}
