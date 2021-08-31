// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public GetQualityRuleListResponseBodyData data;

    public static GetQualityRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityRuleListResponseBody self = new GetQualityRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityRuleListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetQualityRuleListResponseBody setData(GetQualityRuleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityRuleListResponseBodyData getData() {
        return this.data;
    }

    public static class GetQualityRuleListResponseBodyDataQualityRuleList extends TeaModel {
        @NameInMap("RuleTag")
        public Integer ruleTag;

        @NameInMap("MatchType")
        public Integer matchType;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuleCreateTime")
        public String ruleCreateTime;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

        public static GetQualityRuleListResponseBodyDataQualityRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleListResponseBodyDataQualityRuleList self = new GetQualityRuleListResponseBodyDataQualityRuleList();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleListResponseBodyDataQualityRuleList setRuleTag(Integer ruleTag) {
            this.ruleTag = ruleTag;
            return this;
        }
        public Integer getRuleTag() {
            return this.ruleTag;
        }

        public GetQualityRuleListResponseBodyDataQualityRuleList setMatchType(Integer matchType) {
            this.matchType = matchType;
            return this;
        }
        public Integer getMatchType() {
            return this.matchType;
        }

        public GetQualityRuleListResponseBodyDataQualityRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityRuleListResponseBodyDataQualityRuleList setRuleCreateTime(String ruleCreateTime) {
            this.ruleCreateTime = ruleCreateTime;
            return this;
        }
        public String getRuleCreateTime() {
            return this.ruleCreateTime;
        }

        public GetQualityRuleListResponseBodyDataQualityRuleList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public GetQualityRuleListResponseBodyDataQualityRuleList setKeyWords(java.util.List<String> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

    }

    public static class GetQualityRuleListResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        @NameInMap("QualityRuleList")
        public java.util.List<GetQualityRuleListResponseBodyDataQualityRuleList> qualityRuleList;

        public static GetQualityRuleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleListResponseBodyData self = new GetQualityRuleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetQualityRuleListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetQualityRuleListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetQualityRuleListResponseBodyData setQualityRuleList(java.util.List<GetQualityRuleListResponseBodyDataQualityRuleList> qualityRuleList) {
            this.qualityRuleList = qualityRuleList;
            return this;
        }
        public java.util.List<GetQualityRuleListResponseBodyDataQualityRuleList> getQualityRuleList() {
            return this.qualityRuleList;
        }

    }

}
