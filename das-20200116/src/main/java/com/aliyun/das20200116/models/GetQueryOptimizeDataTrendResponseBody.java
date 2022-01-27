// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTrendResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQueryOptimizeDataTrendResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetQueryOptimizeDataTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeDataTrendResponseBody self = new GetQueryOptimizeDataTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeDataTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeDataTrendResponseBody setData(GetQueryOptimizeDataTrendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueryOptimizeDataTrendResponseBodyData getData() {
        return this.data;
    }

    public GetQueryOptimizeDataTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeDataTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeDataTrendResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueryOptimizeDataTrendResponseBodyDataList extends TeaModel {
        @NameInMap("Kpi")
        public String kpi;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public Double value;

        public static GetQueryOptimizeDataTrendResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeDataTrendResponseBodyDataList self = new GetQueryOptimizeDataTrendResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeDataTrendResponseBodyDataList setKpi(String kpi) {
            this.kpi = kpi;
            return this;
        }
        public String getKpi() {
            return this.kpi;
        }

        public GetQueryOptimizeDataTrendResponseBodyDataList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetQueryOptimizeDataTrendResponseBodyDataList setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

    public static class GetQueryOptimizeDataTrendResponseBodyData extends TeaModel {
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public java.util.List<GetQueryOptimizeDataTrendResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetQueryOptimizeDataTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeDataTrendResponseBodyData self = new GetQueryOptimizeDataTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeDataTrendResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetQueryOptimizeDataTrendResponseBodyData setList(java.util.List<GetQueryOptimizeDataTrendResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetQueryOptimizeDataTrendResponseBodyDataList> getList() {
            return this.list;
        }

        public GetQueryOptimizeDataTrendResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQueryOptimizeDataTrendResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueryOptimizeDataTrendResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
