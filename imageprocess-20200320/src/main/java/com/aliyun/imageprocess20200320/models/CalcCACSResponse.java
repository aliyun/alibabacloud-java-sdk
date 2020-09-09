// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcCACSResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public CalcCACSResponseData data;

    public static CalcCACSResponse build(java.util.Map<String, ?> map) throws Exception {
        CalcCACSResponse self = new CalcCACSResponse();
        return TeaModel.build(map, self);
    }

    public CalcCACSResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CalcCACSResponse setData(CalcCACSResponseData data) {
        this.data = data;
        return this;
    }
    public CalcCACSResponseData getData() {
        return this.data;
    }

    public static class CalcCACSResponseData extends TeaModel {
        @NameInMap("Score")
        @Validation(required = true)
        public String score;

        public static CalcCACSResponseData build(java.util.Map<String, ?> map) throws Exception {
            CalcCACSResponseData self = new CalcCACSResponseData();
            return TeaModel.build(map, self);
        }

        public CalcCACSResponseData setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

}
