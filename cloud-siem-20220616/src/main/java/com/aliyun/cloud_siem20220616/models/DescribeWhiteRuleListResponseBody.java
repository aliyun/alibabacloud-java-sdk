// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeWhiteRuleListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeWhiteRuleListResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("IsVar")
        public Boolean isVar;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ModifierParam")
        public java.util.Map<String, ?> modifierParam;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("IsVar")
        public Boolean isVar;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("ModifierParam")
        public java.util.Map<String, ?> modifierParam;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("IsNot")
        public Boolean isNot;

        @NameInMap("ItemId")
        public Integer itemId;

        @NameInMap("Left")
        public DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditionsLeft left;

        @NameInMap("Operator")
        public String operator;

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
        @NameInMap("Conditions")
        public java.util.List<DescribeWhiteRuleListResponseBodyDataResponseDataExpressionConditions> conditions;

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
        @NameInMap("AlertName")
        public String alertName;

        @NameInMap("AlertNameId")
        public String alertNameId;

        @NameInMap("AlertType")
        public String alertType;

        @NameInMap("AlertTypeId")
        public String alertTypeId;

        @NameInMap("AlertUuid")
        public String alertUuid;

        @NameInMap("Aliuid")
        public Long aliuid;

        @NameInMap("Expression")
        public DescribeWhiteRuleListResponseBodyDataResponseDataExpression expression;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("IncidentUuid")
        public String incidentUuid;

        @NameInMap("Status")
        public Integer status;

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
        @NameInMap("PageInfo")
        public DescribeWhiteRuleListResponseBodyDataPageInfo pageInfo;

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
