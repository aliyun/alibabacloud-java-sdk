// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class CalcCACSResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CalcCACSResponseBodyData data;

    public static CalcCACSResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CalcCACSResponseBody self = new CalcCACSResponseBody();
        return TeaModel.build(map, self);
    }

    public CalcCACSResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CalcCACSResponseBody setData(CalcCACSResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CalcCACSResponseBodyData getData() {
        return this.data;
    }

    public static class CalcCACSResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("Score")
        public String score;

        public static CalcCACSResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CalcCACSResponseBodyData self = new CalcCACSResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CalcCACSResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public CalcCACSResponseBodyData setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

}
