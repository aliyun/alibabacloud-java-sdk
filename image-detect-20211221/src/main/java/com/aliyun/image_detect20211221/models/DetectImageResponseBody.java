// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class DetectImageResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Response")
    public DetectImageResponseBodyResponse response;

    @NameInMap("Success")
    public Boolean success;

    public static DetectImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageResponseBody self = new DetectImageResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DetectImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectImageResponseBody setResponse(DetectImageResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public DetectImageResponseBodyResponse getResponse() {
        return this.response;
    }

    public DetectImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DetectImageResponseBodyResponseDataInfo extends TeaModel {
        @NameInMap("Conf")
        public Double conf;

        @NameInMap("Direction")
        public String direction;

        public static DetectImageResponseBodyResponseDataInfo build(java.util.Map<String, ?> map) throws Exception {
            DetectImageResponseBodyResponseDataInfo self = new DetectImageResponseBodyResponseDataInfo();
            return TeaModel.build(map, self);
        }

        public DetectImageResponseBodyResponseDataInfo setConf(Double conf) {
            this.conf = conf;
            return this;
        }
        public Double getConf() {
            return this.conf;
        }

        public DetectImageResponseBodyResponseDataInfo setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

    }

    public static class DetectImageResponseBodyResponseDataResults extends TeaModel {
        @NameInMap("Category")
        public java.util.List<String> category;

        @NameInMap("Conf")
        public java.util.List<Double> conf;

        @NameInMap("Direction")
        public String direction;

        @NameInMap("Rect")
        public java.util.List<Double> rect;

        @NameInMap("TaskType")
        public String taskType;

        public static DetectImageResponseBodyResponseDataResults build(java.util.Map<String, ?> map) throws Exception {
            DetectImageResponseBodyResponseDataResults self = new DetectImageResponseBodyResponseDataResults();
            return TeaModel.build(map, self);
        }

        public DetectImageResponseBodyResponseDataResults setCategory(java.util.List<String> category) {
            this.category = category;
            return this;
        }
        public java.util.List<String> getCategory() {
            return this.category;
        }

        public DetectImageResponseBodyResponseDataResults setConf(java.util.List<Double> conf) {
            this.conf = conf;
            return this;
        }
        public java.util.List<Double> getConf() {
            return this.conf;
        }

        public DetectImageResponseBodyResponseDataResults setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DetectImageResponseBodyResponseDataResults setRect(java.util.List<Double> rect) {
            this.rect = rect;
            return this;
        }
        public java.util.List<Double> getRect() {
            return this.rect;
        }

        public DetectImageResponseBodyResponseDataResults setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

    public static class DetectImageResponseBodyResponseData extends TeaModel {
        @NameInMap("Info")
        public DetectImageResponseBodyResponseDataInfo info;

        @NameInMap("Results")
        public java.util.List<DetectImageResponseBodyResponseDataResults> results;

        public static DetectImageResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectImageResponseBodyResponseData self = new DetectImageResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public DetectImageResponseBodyResponseData setInfo(DetectImageResponseBodyResponseDataInfo info) {
            this.info = info;
            return this;
        }
        public DetectImageResponseBodyResponseDataInfo getInfo() {
            return this.info;
        }

        public DetectImageResponseBodyResponseData setResults(java.util.List<DetectImageResponseBodyResponseDataResults> results) {
            this.results = results;
            return this;
        }
        public java.util.List<DetectImageResponseBodyResponseDataResults> getResults() {
            return this.results;
        }

    }

    public static class DetectImageResponseBodyResponse extends TeaModel {
        @NameInMap("Data")
        public DetectImageResponseBodyResponseData data;

        @NameInMap("ErrorCode")
        public Integer errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Flag")
        public Boolean flag;

        public static DetectImageResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            DetectImageResponseBodyResponse self = new DetectImageResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public DetectImageResponseBodyResponse setData(DetectImageResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public DetectImageResponseBodyResponseData getData() {
            return this.data;
        }

        public DetectImageResponseBodyResponse setErrorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Integer getErrorCode() {
            return this.errorCode;
        }

        public DetectImageResponseBodyResponse setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DetectImageResponseBodyResponse setFlag(Boolean flag) {
            this.flag = flag;
            return this;
        }
        public Boolean getFlag() {
            return this.flag;
        }

    }

}
