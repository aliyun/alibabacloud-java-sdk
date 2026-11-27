// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetQualityRuleListResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The quality check rule information.</p>
     */
    @NameInMap("Data")
    public GetQualityRuleListResponseBodyData data;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

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

    public GetQualityRuleListResponseBody setData(GetQualityRuleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityRuleListResponseBodyData getData() {
        return this.data;
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

    public static class GetQualityRuleListResponseBodyDataQualityRuleList extends TeaModel {
        /**
         * <p>The keywords.</p>
         */
        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

        /**
         * <p>The keyword match type. Valid values:	</p>
         * <ul>
         * <li><strong>1</strong>: Any keyword appears.</li>
         * <li><strong>2</strong>: All keywords appear.</li>
         * <li><strong>3</strong>: No keywords appear.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MatchType")
        public Integer matchType;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>Automatically created quality check rule</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the rule was created.</p>
         * 
         * <strong>example:</strong>
         * <p>Mon Mar 29 22:14:02 CST 2021</p>
         */
        @NameInMap("RuleCreateTime")
        public String ruleCreateTime;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>5369</p>
         */
        @NameInMap("RuleId")
        public Long ruleId;

        /**
         * <p>The tag of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>638</p>
         */
        @NameInMap("RuleTag")
        public Integer ruleTag;

        public static GetQualityRuleListResponseBodyDataQualityRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityRuleListResponseBodyDataQualityRuleList self = new GetQualityRuleListResponseBodyDataQualityRuleList();
            return TeaModel.build(map, self);
        }

        public GetQualityRuleListResponseBodyDataQualityRuleList setKeyWords(java.util.List<String> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
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

        public GetQualityRuleListResponseBodyDataQualityRuleList setRuleTag(Integer ruleTag) {
            this.ruleTag = ruleTag;
            return this;
        }
        public Integer getRuleTag() {
            return this.ruleTag;
        }

    }

    public static class GetQualityRuleListResponseBodyData extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of rule details.</p>
         */
        @NameInMap("QualityRuleList")
        public java.util.List<GetQualityRuleListResponseBodyDataQualityRuleList> qualityRuleList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>84</p>
         */
        @NameInMap("Total")
        public Long total;

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

        public GetQualityRuleListResponseBodyData setQualityRuleList(java.util.List<GetQualityRuleListResponseBodyDataQualityRuleList> qualityRuleList) {
            this.qualityRuleList = qualityRuleList;
            return this;
        }
        public java.util.List<GetQualityRuleListResponseBodyDataQualityRuleList> getQualityRuleList() {
            return this.qualityRuleList;
        }

        public GetQualityRuleListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
