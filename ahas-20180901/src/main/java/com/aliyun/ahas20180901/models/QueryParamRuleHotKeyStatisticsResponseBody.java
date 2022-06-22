// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryParamRuleHotKeyStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryParamRuleHotKeyStatisticsResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryParamRuleHotKeyStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryParamRuleHotKeyStatisticsResponseBody self = new QueryParamRuleHotKeyStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryParamRuleHotKeyStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryParamRuleHotKeyStatisticsResponseBody setData(java.util.List<QueryParamRuleHotKeyStatisticsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryParamRuleHotKeyStatisticsResponseBodyData> getData() {
        return this.data;
    }

    public QueryParamRuleHotKeyStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryParamRuleHotKeyStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryParamRuleHotKeyStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryParamRuleHotKeyStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Block")
        public Integer block;

        @NameInMap("Pass")
        public Integer pass;

        @NameInMap("Time")
        public Long time;

        public static QueryParamRuleHotKeyStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryParamRuleHotKeyStatisticsResponseBodyData self = new QueryParamRuleHotKeyStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryParamRuleHotKeyStatisticsResponseBodyData setBlock(Integer block) {
            this.block = block;
            return this;
        }
        public Integer getBlock() {
            return this.block;
        }

        public QueryParamRuleHotKeyStatisticsResponseBodyData setPass(Integer pass) {
            this.pass = pass;
            return this;
        }
        public Integer getPass() {
            return this.pass;
        }

        public QueryParamRuleHotKeyStatisticsResponseBodyData setTime(Long time) {
            this.time = time;
            return this;
        }
        public Long getTime() {
            return this.time;
        }

    }

}
