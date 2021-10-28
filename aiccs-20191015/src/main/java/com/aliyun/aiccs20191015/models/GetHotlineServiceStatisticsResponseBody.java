// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineServiceStatisticsResponseBody extends TeaModel {
    // 错误编码
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public GetHotlineServiceStatisticsResponseBodyData data;

    // 错误描述
    @NameInMap("Message")
    public String message;

    // 请求ID，用于跟踪错误原因
    @NameInMap("RequestId")
    public String requestId;

    // 调用接口是否成功
    @NameInMap("Success")
    public String success;

    public static GetHotlineServiceStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineServiceStatisticsResponseBody self = new GetHotlineServiceStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetHotlineServiceStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetHotlineServiceStatisticsResponseBody setData(GetHotlineServiceStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetHotlineServiceStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetHotlineServiceStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetHotlineServiceStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetHotlineServiceStatisticsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetHotlineServiceStatisticsResponseBodyData extends TeaModel {
        // 当前页数
        @NameInMap("PageNum")
        public Integer pageNum;

        // 页大小
        @NameInMap("PageSize")
        public Integer pageSize;

        // 信息为list<map>类型的json字符串
        @NameInMap("Rows")
        public String rows;

        // 总记录数
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static GetHotlineServiceStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetHotlineServiceStatisticsResponseBodyData self = new GetHotlineServiceStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetHotlineServiceStatisticsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public GetHotlineServiceStatisticsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetHotlineServiceStatisticsResponseBodyData setRows(String rows) {
            this.rows = rows;
            return this;
        }
        public String getRows() {
            return this.rows;
        }

        public GetHotlineServiceStatisticsResponseBodyData setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
