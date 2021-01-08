// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListRuleTasksResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListRuleTasksResponseBodyResult result;

    public static ListRuleTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleTasksResponseBody self = new ListRuleTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuleTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleTasksResponseBody setResult(ListRuleTasksResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListRuleTasksResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListRuleTasksResponseBodyResult extends TeaModel {
        @NameInMap("FinishTime")
        public Integer finishTime;

        @NameInMap("FinishRate")
        public Integer finishRate;

        public static ListRuleTasksResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRuleTasksResponseBodyResult self = new ListRuleTasksResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRuleTasksResponseBodyResult setFinishTime(Integer finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Integer getFinishTime() {
            return this.finishTime;
        }

        public ListRuleTasksResponseBodyResult setFinishRate(Integer finishRate) {
            this.finishRate = finishRate;
            return this;
        }
        public Integer getFinishRate() {
            return this.finishRate;
        }

    }

}
