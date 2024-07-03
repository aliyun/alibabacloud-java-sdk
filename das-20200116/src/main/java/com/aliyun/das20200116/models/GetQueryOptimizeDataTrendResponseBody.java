// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeDataTrendResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information.</p>
     */
    @NameInMap("Data")
    public GetQueryOptimizeDataTrendResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The name of the metric. Valid values:</p>
         * <ul>
         * <li><strong>sqlExecuteCount</strong>: the number of executions of slow SQL queries.</li>
         * <li><strong>sqlExecuteCountDiff</strong>: the difference in the number of executions of slow SQL queries compared to the previous day.</li>
         * <li><strong>sqlCount</strong>: the number of slow SQL templates.</li>
         * <li><strong>sqlCountDiff</strong>: the difference in the number of slow SQL templates compared to the previous day.</li>
         * <li><strong>optimizedSqlExecuteCount</strong>: the number of optimizable executions of slow SQL queries.</li>
         * <li><strong>optimizedSqlExecuteCountDiff</strong>: the difference in the number of optimizable executions of slow SQL queries compared to the previous day.</li>
         * <li><strong>optimizedSqlCount</strong>: the number of optimizable slow SQL templates.</li>
         * <li><strong>optimizedSqlCountDiff</strong>: the difference in the number of optimizable slow SQL templates compared to the previous day.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sqlExecuteCount</p>
         */
        @NameInMap("Kpi")
        public String kpi;

        /**
         * <p>The data timestamp. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1643040000000</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The value of the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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
        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <p>The details of the trend data.</p>
         */
        @NameInMap("List")
        public java.util.List<GetQueryOptimizeDataTrendResponseBodyDataList> list;

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
