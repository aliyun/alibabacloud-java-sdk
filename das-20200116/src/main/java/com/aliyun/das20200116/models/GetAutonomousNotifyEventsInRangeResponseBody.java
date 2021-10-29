// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutonomousNotifyEventsInRangeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAutonomousNotifyEventsInRangeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetAutonomousNotifyEventsInRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutonomousNotifyEventsInRangeResponseBody self = new GetAutonomousNotifyEventsInRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutonomousNotifyEventsInRangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutonomousNotifyEventsInRangeResponseBody setData(GetAutonomousNotifyEventsInRangeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutonomousNotifyEventsInRangeResponseBodyData getData() {
        return this.data;
    }

    public GetAutonomousNotifyEventsInRangeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutonomousNotifyEventsInRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutonomousNotifyEventsInRangeResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetAutonomousNotifyEventsInRangeResponseBodyDataList extends TeaModel {
        @NameInMap("T")
        public java.util.List<String> t;

        public static GetAutonomousNotifyEventsInRangeResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAutonomousNotifyEventsInRangeResponseBodyDataList self = new GetAutonomousNotifyEventsInRangeResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAutonomousNotifyEventsInRangeResponseBodyDataList setT(java.util.List<String> t) {
            this.t = t;
            return this;
        }
        public java.util.List<String> getT() {
            return this.t;
        }

    }

    public static class GetAutonomousNotifyEventsInRangeResponseBodyData extends TeaModel {
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public GetAutonomousNotifyEventsInRangeResponseBodyDataList list;

        @NameInMap("PageNo")
        public Long pageNo;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetAutonomousNotifyEventsInRangeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutonomousNotifyEventsInRangeResponseBodyData self = new GetAutonomousNotifyEventsInRangeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutonomousNotifyEventsInRangeResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetAutonomousNotifyEventsInRangeResponseBodyData setList(GetAutonomousNotifyEventsInRangeResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public GetAutonomousNotifyEventsInRangeResponseBodyDataList getList() {
            return this.list;
        }

        public GetAutonomousNotifyEventsInRangeResponseBodyData setPageNo(Long pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Long getPageNo() {
            return this.pageNo;
        }

        public GetAutonomousNotifyEventsInRangeResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public GetAutonomousNotifyEventsInRangeResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
