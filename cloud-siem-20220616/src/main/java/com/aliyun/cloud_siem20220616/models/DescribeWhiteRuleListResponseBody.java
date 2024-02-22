// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeWhiteRuleListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public DescribeWhiteRuleListResponseBodyData data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeWhiteRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhiteRuleListResponseBody self = new DescribeWhiteRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWhiteRuleListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeWhiteRuleListResponseBody setData(DescribeWhiteRuleListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeWhiteRuleListResponseBodyData getData() {
        return this.data;
    }

    public DescribeWhiteRuleListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeWhiteRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWhiteRuleListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeWhiteRuleListResponseBodyDataPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeWhiteRuleListResponseBodyDataPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteRuleListResponseBodyDataPageInfo self = new DescribeWhiteRuleListResponseBodyDataPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteRuleListResponseBodyDataPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeWhiteRuleListResponseBodyDataPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeWhiteRuleListResponseBodyDataPageInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft extends TeaModel {
        /**
         * <p>Indicates whether the left operand is a variable. Valid values:</p>
         * <br>
         * <p>*   true: variable</p>
         * <p>*   false: constant</p>
         */
        @NameInMap("IsVar")
        public Boolean isVar;

        /**
         * <p>The remarks on the left operand.</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The key-value pair information of the remarks.</p>
         */
        @NameInMap("ModifierParam")
        public java.util.Map<String, ?> modifierParam;

        /**
         * <p>Indicates whether the left operand is a constant. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The variable of the left operand.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft self = new DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft setIsVar(Boolean isVar) {
            this.isVar = isVar;
            return this;
        }
        public Boolean getIsVar() {
            return this.isVar;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft setModifierParam(java.util.Map<String, ?> modifierParam) {
            this.modifierParam = modifierParam;
            return this;
        }
        public java.util.Map<String, ?> getModifierParam() {
            return this.modifierParam;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight extends TeaModel {
        /**
         * <p>Indicates whether the right operand is a constant or a runtime variable that is obtained from the runtime context. Valid values:</p>
         * <br>
         * <p>*   true: runtime variable</p>
         * <p>*   false: constant</p>
         */
        @NameInMap("IsVar")
        public Boolean isVar;

        /**
         * <p>The remarks on the right operand.</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The key-value pair information of the remarks.</p>
         */
        @NameInMap("ModifierParam")
        public java.util.Map<String, ?> modifierParam;

        /**
         * <p>The data type of the right operand.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The right operand.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight self = new DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight setIsVar(Boolean isVar) {
            this.isVar = isVar;
            return this;
        }
        public Boolean getIsVar() {
            return this.isVar;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight setModifierParam(java.util.Map<String, ?> modifierParam) {
            this.modifierParam = modifierParam;
            return this;
        }
        public java.util.Map<String, ?> getModifierParam() {
            return this.modifierParam;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions extends TeaModel {
        /**
         * <p>Indicates whether the result is inverted. Valid values:</p>
         * <br>
         * <p>*   true</p>
         * <p>*   false</p>
         */
        @NameInMap("IsNot")
        public Boolean isNot;

        /**
         * <p>The ID of the rule condition.</p>
         */
        @NameInMap("ItemId")
        public Integer itemId;

        /**
         * <p>The left operand of the rule condition.</p>
         */
        @NameInMap("Left")
        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft left;

        /**
         * <p>The logical operator of the rule condition. Valid values:</p>
         * <br>
         * <p>*   `=`: equals to</p>
         * <p>*   `<>`: does not equal to</p>
         * <p>*   `in`: contains</p>
         * <p>*   `not in`: does not contain</p>
         * <p>*   `REGEXP`: matches a regular expression</p>
         * <p>*   `NOT REGEXP`: does not match a regular expression</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The right operand of the rule condition.</p>
         */
        @NameInMap("Right")
        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight right;

        public static DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions self = new DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions setIsNot(Boolean isNot) {
            this.isNot = isNot;
            return this;
        }
        public Boolean getIsNot() {
            return this.isNot;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions setItemId(Integer itemId) {
            this.itemId = itemId;
            return this;
        }
        public Integer getItemId() {
            return this.itemId;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions setLeft(DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft left) {
            this.left = left;
            return this;
        }
        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft getLeft() {
            return this.left;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions setRight(DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight right) {
            this.right = right;
            return this;
        }
        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsRight getRight() {
            return this.right;
        }

    }

    public static class DescribeWhiteRuleListResponseBodyDataResponseDataExpression extends TeaModel {
        /**
         * <p>The rule conditions.</p>
         */
        @NameInMap("Conditions")
        public java.util.List<DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions> conditions;

        /**
         * <p>The logical relationships among the rule conditions.</p>
         */
        @NameInMap("Logic")
        public String logic;

        public static DescribeWhiteRuleListResponseBodyDataResponseDataExpression build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteRuleListResponseBodyDataResponseDataExpression self = new DescribeWhiteRuleListResponseBodyDataResponseDataExpression();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpression setConditions(java.util.List<DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions> conditions) {
            this.conditions = conditions;
            return this;
        }
        public java.util.List<DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions> getConditions() {
            return this.conditions;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseDataExpression setLogic(String logic) {
            this.logic = logic;
            return this;
        }
        public String getLogic() {
            return this.logic;
        }

    }

    public static class DescribeWhiteRuleListResponseBodyDataResponseData extends TeaModel {
        /**
         * <p>The alert name.</p>
         */
        @NameInMap("AlertName")
        public String alertName;

        /**
         * <p>The ID of the alert name.</p>
         */
        @NameInMap("AlertNameId")
        public String alertNameId;

        /**
         * <p>The alert type.</p>
         */
        @NameInMap("AlertType")
        public String alertType;

        /**
         * <p>The ID of the alert type.</p>
         */
        @NameInMap("AlertTypeId")
        public String alertTypeId;

        /**
         * <p>The UUID of the alert.</p>
         */
        @NameInMap("AlertUuid")
        public String alertUuid;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
         */
        @NameInMap("Aliuid")
        public Long aliuid;

        /**
         * <p>The conditions in the rule. The value is a JSON array.</p>
         */
        @NameInMap("Expression")
        public DescribeWhiteRuleListResponseBodyDataResponseDataExpression expression;

        /**
         * <p>The time when the whitelist rule was created.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the whitelist rule was modified.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the whitelist rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The UUID of the event.</p>
         */
        @NameInMap("IncidentUuid")
        public String incidentUuid;

        /**
         * <p>The status of the whitelist rule. Valid values:</p>
         * <br>
         * <p>*   1: enabled</p>
         * <p>*   0: disabled</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the Alibaba Cloud account that is used to create the whitelist rule.</p>
         */
        @NameInMap("SubAliuid")
        public Long subAliuid;

        public static DescribeWhiteRuleListResponseBodyDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteRuleListResponseBodyDataResponseData self = new DescribeWhiteRuleListResponseBodyDataResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setAlertName(String alertName) {
            this.alertName = alertName;
            return this;
        }
        public String getAlertName() {
            return this.alertName;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setAlertNameId(String alertNameId) {
            this.alertNameId = alertNameId;
            return this;
        }
        public String getAlertNameId() {
            return this.alertNameId;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setAlertType(String alertType) {
            this.alertType = alertType;
            return this;
        }
        public String getAlertType() {
            return this.alertType;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setAlertTypeId(String alertTypeId) {
            this.alertTypeId = alertTypeId;
            return this;
        }
        public String getAlertTypeId() {
            return this.alertTypeId;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setAlertUuid(String alertUuid) {
            this.alertUuid = alertUuid;
            return this;
        }
        public String getAlertUuid() {
            return this.alertUuid;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setAliuid(Long aliuid) {
            this.aliuid = aliuid;
            return this;
        }
        public Long getAliuid() {
            return this.aliuid;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setExpression(DescribeWhiteRuleListResponseBodyDataResponseDataExpression expression) {
            this.expression = expression;
            return this;
        }
        public DescribeWhiteRuleListResponseBodyDataResponseDataExpression getExpression() {
            return this.expression;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setIncidentUuid(String incidentUuid) {
            this.incidentUuid = incidentUuid;
            return this;
        }
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeWhiteRuleListResponseBodyDataResponseData setSubAliuid(Long subAliuid) {
            this.subAliuid = subAliuid;
            return this;
        }
        public Long getSubAliuid() {
            return this.subAliuid;
        }

    }

    public static class DescribeWhiteRuleListResponseBodyData extends TeaModel {
        /**
         * <p>The pagination information.</p>
         */
        @NameInMap("PageInfo")
        public DescribeWhiteRuleListResponseBodyDataPageInfo pageInfo;

        /**
         * <p>The detailed data.</p>
         */
        @NameInMap("ResponseData")
        public java.util.List<DescribeWhiteRuleListResponseBodyDataResponseData> responseData;

        public static DescribeWhiteRuleListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeWhiteRuleListResponseBodyData self = new DescribeWhiteRuleListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeWhiteRuleListResponseBodyData setPageInfo(DescribeWhiteRuleListResponseBodyDataPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public DescribeWhiteRuleListResponseBodyDataPageInfo getPageInfo() {
            return this.pageInfo;
        }

        public DescribeWhiteRuleListResponseBodyData setResponseData(java.util.List<DescribeWhiteRuleListResponseBodyDataResponseData> responseData) {
            this.responseData = responseData;
            return this;
        }
        public java.util.List<DescribeWhiteRuleListResponseBodyDataResponseData> getResponseData() {
            return this.responseData;
        }

    }

}
