// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQueryOptimizeRuleListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetQueryOptimizeRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeRuleListResponseBody self = new GetQueryOptimizeRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeRuleListResponseBody setData(GetQueryOptimizeRuleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueryOptimizeRuleListResponseBodyData getData() {
        return this.data;
    }

    public GetQueryOptimizeRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeRuleListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueryOptimizeRuleListResponseBodyDataList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("RuleId")
        public String ruleId;

        @NameInMap("Type")
        public String type;

        public static GetQueryOptimizeRuleListResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeRuleListResponseBodyDataList self = new GetQueryOptimizeRuleListResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeRuleListResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQueryOptimizeRuleListResponseBodyDataList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetQueryOptimizeRuleListResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetQueryOptimizeRuleListResponseBodyData extends TeaModel {
        @NameInMap("Extra")
        public String extra;

        @NameInMap("List")
        public java.util.List<GetQueryOptimizeRuleListResponseBodyDataList> list;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetQueryOptimizeRuleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeRuleListResponseBodyData self = new GetQueryOptimizeRuleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeRuleListResponseBodyData setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public GetQueryOptimizeRuleListResponseBodyData setList(java.util.List<GetQueryOptimizeRuleListResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetQueryOptimizeRuleListResponseBodyDataList> getList() {
            return this.list;
        }

        public GetQueryOptimizeRuleListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQueryOptimizeRuleListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQueryOptimizeRuleListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
