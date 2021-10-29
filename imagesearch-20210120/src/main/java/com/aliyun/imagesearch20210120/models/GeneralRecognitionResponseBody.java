// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20210120.models;

import com.aliyun.tea.*;

public class GeneralRecognitionResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GeneralRecognitionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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

    public GeneralRecognitionResponseBody setData(GeneralRecognitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GeneralRecognitionResponseBodyData getData() {
        return this.data;
    }

    public GeneralRecognitionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GeneralRecognitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GeneralRecognitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GeneralRecognitionResponseBodyDataResult extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Tag")
        public String tag;

        public static GeneralRecognitionResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            GeneralRecognitionResponseBodyDataResult self = new GeneralRecognitionResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public GeneralRecognitionResponseBodyDataResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GeneralRecognitionResponseBodyDataResult setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class GeneralRecognitionResponseBodyData extends TeaModel {
        @NameInMap("Regions")
        public java.util.List<String> regions;

        @NameInMap("Result")
        public java.util.List<GeneralRecognitionResponseBodyDataResult> result;

        public static GeneralRecognitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GeneralRecognitionResponseBodyData self = new GeneralRecognitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GeneralRecognitionResponseBodyData setRegions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }
        public java.util.List<String> getRegions() {
            return this.regions;
        }

        public GeneralRecognitionResponseBodyData setResult(java.util.List<GeneralRecognitionResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<GeneralRecognitionResponseBodyDataResult> getResult() {
            return this.result;
        }

    }

}
