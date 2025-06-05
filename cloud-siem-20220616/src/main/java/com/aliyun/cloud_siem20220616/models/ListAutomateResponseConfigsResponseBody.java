// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListAutomateResponseConfigsResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("Data")
    public ListAutomateResponseConfigsResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAutomateResponseConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutomateResponseConfigsResponseBody self = new ListAutomateResponseConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutomateResponseConfigsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAutomateResponseConfigsResponseBody setData(ListAutomateResponseConfigsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAutomateResponseConfigsResponseBodyData getData() {
        return this.data;
    }

    public ListAutomateResponseConfigsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAutomateResponseConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutomateResponseConfigsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAutomateResponseConfigsResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListAutomateResponseConfigsResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAutomateResponseConfigsResponseBodyDataPageInfo self = new ListAutomateResponseConfigsResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAutomateResponseConfigsResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAutomateResponseConfigsResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAutomateResponseConfigsResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListAutomateResponseConfigsResponseBodyDataResponseData extends TeaModel {
        /**
         * <p>The configuration of the action that is performed after the automated response rule is hit. The value is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;actionType&quot;: &quot;doPlaybook&quot;,
         *             &quot;playbookName&quot;: &quot;WafBlockIP&quot;,
         *             &quot;playbookUuid&quot;: &quot;bdad6220-6584-41b2-9704-fc6584568758&quot;
         *       }
         * ]</p>
         */
        @NameInMap("ActionConfig")
        public String actionConfig;

        /**
         * <p>The type of the handling action. Multiple types are separated by commas (,). Valid values:</p>
         * <ul>
         * <li><strong>doPlaybook</strong>: runs the playbook.</li>
         * <li><strong>changeEventStatus</strong>: changes the event status.</li>
         * <li><strong>changeThreatLevel</strong>: changes the risk level of the event.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>doPlaybook,changeEventStatus</p>
         */
        @NameInMap("ActionType")
        public String actionType;

        /**
         * <p>The ID of the Alibaba Cloud account that is associated with the rule in SIEM.</p>
         * 
         * <strong>example:</strong>
         * <p>127608589417****</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The type of the automated response rule. Valid values:</p>
         * <ul>
         * <li><strong>event</strong></li>
         * <li><strong>alert</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>event</p>
         */
        @NameInMap("AutoResponseType")
        public String autoResponseType;

        /**
         * <p>The type of the view. Valid values:</p>
         * <p>0: the current Alibaba Cloud account
         * 1: the global account</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataType")
        public Integer dataType;

        /**
         * <p>The trigger condition of the automated response rule. The value is in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;left&quot;:{&quot;value&quot;:&quot;alert_name&quot;},&quot;operator&quot;:&quot;containsString&quot;,&quot;right&quot;:{&quot;value&quot;:&quot;webshell_online&quot;}}]</p>
         */
        @NameInMap("ExecutionCondition")
        public String executionCondition;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-06 16:37:29</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the automated response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("ResponseRuleType")
        public String responseRuleType;

        /**
         * <p>The name of the automated response rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw kill quara book</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>100</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the user who created the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>17108579417****</p>
         */
        @NameInMap("SubUserId")
        public Long subUserId;

        public static ListAutomateResponseConfigsResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListAutomateResponseConfigsResponseBodyDataResponseData self = new ListAutomateResponseConfigsResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setActionConfig(String actionConfig) {
            this.actionConfig = actionConfig;
            return this;
        }
        public String getActionConfig() {
            return this.actionConfig;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setAutoResponseType(String autoResponseType) {
            this.autoResponseType = autoResponseType;
            return this;
        }
        public String getAutoResponseType() {
            return this.autoResponseType;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setExecutionCondition(String executionCondition) {
            this.executionCondition = executionCondition;
            return this;
        }
        public String getExecutionCondition() {
            return this.executionCondition;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setResponseRuleType(String responseRuleType) {
            this.responseRuleType = responseRuleType;
            return this;
        }
        public String getResponseRuleType() {
            return this.responseRuleType;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListAutomateResponseConfigsResponseBodyDataResponseData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

    }

    public static class ListAutomateResponseConfigsResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public ListAutomateResponseConfigsResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
        @NameInMap("ResponseData")
        public java.util.List<ListAutomateResponseConfigsResponseBodyDataResponseData> responseData;

        public static ListAutomateResponseConfigsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAutomateResponseConfigsResponseBodyData self = new ListAutomateResponseConfigsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAutomateResponseConfigsResponseBodyData setPageInfo(ListAutomateResponseConfigsResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListAutomateResponseConfigsResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public ListAutomateResponseConfigsResponseBodyData setResponseData(java.util.List<ListAutomateResponseConfigsResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<ListAutomateResponseConfigsResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
