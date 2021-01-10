// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class ImagePredictResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImagePredict")
    public ImagePredictResponseBodyImagePredict imagePredict;

    public static ImagePredictResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImagePredictResponseBody self = new ImagePredictResponseBody();
        return TeaModel.build(map, self);
    }

    public ImagePredictResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImagePredictResponseBody setImagePredict(ImagePredictResponseBodyImagePredict imagePredict) {
        this.imagePredict = imagePredict;
        return this;
    }
    public ImagePredictResponseBodyImagePredict getImagePredict() {
        return this.imagePredict;
    }

    public static class ImagePredictResponseBodyImagePredict extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("PredictResult")
        public String predictResult;

        @NameInMap("PredictId")
        public String predictId;

        @NameInMap("PredictTime")
        public String predictTime;

        @NameInMap("DataUrl")
        public String dataUrl;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("ModelId")
        public String modelId;

        public static ImagePredictResponseBodyImagePredict build(java.util.Map<String, ?> map) throws Exception {
            ImagePredictResponseBodyImagePredict self = new ImagePredictResponseBodyImagePredict();
            return TeaModel.build(map, self);
        }

        public ImagePredictResponseBodyImagePredict setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ImagePredictResponseBodyImagePredict setPredictResult(String predictResult) {
            this.predictResult = predictResult;
            return this;
        }
        public String getPredictResult() {
            return this.predictResult;
        }

        public ImagePredictResponseBodyImagePredict setPredictId(String predictId) {
            this.predictId = predictId;
            return this;
        }
        public String getPredictId() {
            return this.predictId;
        }

        public ImagePredictResponseBodyImagePredict setPredictTime(String predictTime) {
            this.predictTime = predictTime;
            return this;
        }
        public String getPredictTime() {
            return this.predictTime;
        }

        public ImagePredictResponseBodyImagePredict setDataUrl(String dataUrl) {
            this.dataUrl = dataUrl;
            return this;
        }
        public String getDataUrl() {
            return this.dataUrl;
        }

        public ImagePredictResponseBodyImagePredict setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ImagePredictResponseBodyImagePredict setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ImagePredictResponseBodyImagePredict setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

    }

}
