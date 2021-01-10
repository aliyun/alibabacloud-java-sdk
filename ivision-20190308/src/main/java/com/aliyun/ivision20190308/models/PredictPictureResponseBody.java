// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class PredictPictureResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public PredictPictureResponseBodyData data;

    public static PredictPictureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PredictPictureResponseBody self = new PredictPictureResponseBody();
        return TeaModel.build(map, self);
    }

    public PredictPictureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PredictPictureResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PredictPictureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PredictPictureResponseBody setData(PredictPictureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PredictPictureResponseBodyData getData() {
        return this.data;
    }

    public static class PredictPictureResponseBodyData extends TeaModel {
        @NameInMap("PredictResult")
        public String predictResult;

        public static PredictPictureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PredictPictureResponseBodyData self = new PredictPictureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PredictPictureResponseBodyData setPredictResult(String predictResult) {
            this.predictResult = predictResult;
            return this;
        }
        public String getPredictResult() {
            return this.predictResult;
        }

    }

}
