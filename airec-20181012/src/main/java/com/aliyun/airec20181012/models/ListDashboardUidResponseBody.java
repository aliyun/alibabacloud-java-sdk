// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardUidResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public ListDashboardUidResponseBodyResult result;

    public static ListDashboardUidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardUidResponseBody self = new ListDashboardUidResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDashboardUidResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDashboardUidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDashboardUidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDashboardUidResponseBody setResult(ListDashboardUidResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListDashboardUidResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListDashboardUidResponseBodyResult extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("Uid")
        public java.util.List<String> uid;

        public static ListDashboardUidResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardUidResponseBodyResult self = new ListDashboardUidResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListDashboardUidResponseBodyResult setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListDashboardUidResponseBodyResult setUid(java.util.List<String> uid) {
            this.uid = uid;
            return this;
        }
        public java.util.List<String> getUid() {
            return this.uid;
        }

    }

}
