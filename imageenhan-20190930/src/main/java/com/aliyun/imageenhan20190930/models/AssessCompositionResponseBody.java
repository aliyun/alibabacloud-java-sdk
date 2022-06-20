// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class AssessCompositionResponseBody extends TeaModel {
    @NameInMap("Data")
    public AssessCompositionResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static AssessCompositionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssessCompositionResponseBody self = new AssessCompositionResponseBody();
        return TeaModel.build(map, self);
    }

    public AssessCompositionResponseBody setData(AssessCompositionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AssessCompositionResponseBodyData getData() {
        return this.data;
    }

    public AssessCompositionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AssessCompositionResponseBodyData extends TeaModel {
        @NameInMap("Score")
        public Float score;

        public static AssessCompositionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AssessCompositionResponseBodyData self = new AssessCompositionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AssessCompositionResponseBodyData setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

}
