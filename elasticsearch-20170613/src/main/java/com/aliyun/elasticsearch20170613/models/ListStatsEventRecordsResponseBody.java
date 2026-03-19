// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListStatsEventRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F99407AB-2FA9-489E-A259-40CF6DCC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListStatsEventRecordsResponseBodyResult result;

    public static ListStatsEventRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStatsEventRecordsResponseBody self = new ListStatsEventRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStatsEventRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStatsEventRecordsResponseBody setResult(ListStatsEventRecordsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListStatsEventRecordsResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListStatsEventRecordsResponseBodyResultResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("cnt")
        public String cnt;

        /**
         * <strong>example:</strong>
         * <p>Info</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>Executed</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>UserOperator</p>
         */
        @NameInMap("type")
        public String type;

        public static ListStatsEventRecordsResponseBodyResultResult build(java.util.Map<String, ?> map) throws Exception {
            ListStatsEventRecordsResponseBodyResultResult self = new ListStatsEventRecordsResponseBodyResultResult();
            return TeaModel.build(map, self);
        }

        public ListStatsEventRecordsResponseBodyResultResult setCnt(String cnt) {
            this.cnt = cnt;
            return this;
        }
        public String getCnt() {
            return this.cnt;
        }

        public ListStatsEventRecordsResponseBodyResultResult setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListStatsEventRecordsResponseBodyResultResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListStatsEventRecordsResponseBodyResultResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListStatsEventRecordsResponseBodyResult extends TeaModel {
        @NameInMap("result")
        public java.util.List<ListStatsEventRecordsResponseBodyResultResult> result;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("total")
        public String total;

        public static ListStatsEventRecordsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListStatsEventRecordsResponseBodyResult self = new ListStatsEventRecordsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListStatsEventRecordsResponseBodyResult setResult(java.util.List<ListStatsEventRecordsResponseBodyResultResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListStatsEventRecordsResponseBodyResultResult> getResult() {
            return this.result;
        }

        public ListStatsEventRecordsResponseBodyResult setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
