// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeSolutionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQueryOptimizeSolutionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetQueryOptimizeSolutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeSolutionResponseBody self = new GetQueryOptimizeSolutionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeSolutionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeSolutionResponseBody setData(GetQueryOptimizeSolutionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueryOptimizeSolutionResponseBodyData getData() {
        return this.data;
    }

    public GetQueryOptimizeSolutionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeSolutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeSolutionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueryOptimizeSolutionResponseBodyDataList extends TeaModel {
        @NameInMap("Level")
        public String level;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("SolutionExt")
        public String solutionExt;

        public static GetQueryOptimizeSolutionResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeSolutionResponseBodyDataList self = new GetQueryOptimizeSolutionResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeSolutionResponseBodyDataList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetQueryOptimizeSolutionResponseBodyDataList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetQueryOptimizeSolutionResponseBodyDataList setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public GetQueryOptimizeSolutionResponseBodyDataList setSolutionExt(String solutionExt) {
            this.solutionExt = solutionExt;
            return this;
        }
        public String getSolutionExt() {
            return this.solutionExt;
        }

    }

    public static class GetQueryOptimizeSolutionResponseBodyData extends TeaModel {
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public java.util.List<GetQueryOptimizeSolutionResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetQueryOptimizeSolutionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeSolutionResponseBodyData self = new GetQueryOptimizeSolutionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeSolutionResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetQueryOptimizeSolutionResponseBodyData setList(java.util.List<GetQueryOptimizeSolutionResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetQueryOptimizeSolutionResponseBodyDataList> getList() {
            return this.list;
        }

        public GetQueryOptimizeSolutionResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQueryOptimizeSolutionResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueryOptimizeSolutionResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
