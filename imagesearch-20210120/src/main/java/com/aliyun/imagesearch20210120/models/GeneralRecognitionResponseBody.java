// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class GeneralRecognitionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GeneralRecognitionResponseBodyData data;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static GeneralRecognitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GeneralRecognitionResponseBody self = new GeneralRecognitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GeneralRecognitionResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GeneralRecognitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GeneralRecognitionResponseBody setData(GeneralRecognitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GeneralRecognitionResponseBodyData getData() {
        return this.data;
    }

    public GeneralRecognitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GeneralRecognitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GeneralRecognitionResponseBodyDataResult extends TeaModel {
        @NameInMap("Tag")
        public String tag;

        @NameInMap("Score")
        public String score;

        public static GeneralRecognitionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GeneralRecognitionResponseBodyDataResult self = new GeneralRecognitionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GeneralRecognitionResponseBodyDataResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GeneralRecognitionResponseBodyDataResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

    public static class GeneralRecognitionResponseBodyData extends TeaModel {
        @NameInMap("Result")
        public java.util.List<GeneralRecognitionResponseBodyDataResult> result;

        @NameInMap("Regions")
        public java.util.List<String> regions;

        public static GeneralRecognitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GeneralRecognitionResponseBodyData self = new GeneralRecognitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GeneralRecognitionResponseBodyData setResult(java.util.List<GeneralRecognitionResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GeneralRecognitionResponseBodyDataResult> getResult() {
            return this.result;
        }

        public GeneralRecognitionResponseBodyData setRegions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<String> getRegions() {
            return this.regions;
        }

    }

}
