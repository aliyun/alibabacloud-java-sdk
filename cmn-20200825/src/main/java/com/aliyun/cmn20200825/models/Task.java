// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Task extends TeaModel {
    // 模板类别
    @NameInMap("Category")
    public String category;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModify")
    public String gmtModify;

    // 任务参数
    @NameInMap("Params")
    public String params;

    // 任务错误码
    @NameInMap("ResponseCode")
    public String responseCode;

    // 任务返回
    @NameInMap("Result")
    public String result;

    // 任务状态
    @NameInMap("Status")
    public String status;

    // 任务id
    @NameInMap("TaskId")
    public String taskId;

    // 模板id
    @NameInMap("TemplateId")
    public String templateId;

    // 模板名称
    @NameInMap("TemplateName")
    public String templateName;

    public static Task build(java.util.Map<String, ?> map) throws Exception {
        Task self = new Task();
        return TeaModel.build(map, self);
    }

    public Task setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public Task setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Task setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public Task setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public Task setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public Task setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public Task setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Task setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public Task setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public Task setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public static class InspectionTaskInspectionAlarmRules extends TeaModel {
        // 告警实际值
        @NameInMap("ActualValue")
        public String actualValue;

        // 告警表达式
        @NameInMap("Expression")
        public String expression;

        // 告警级别
        @NameInMap("Level")
        public String level;

        // 告警操作符
        @NameInMap("Operator")
        public String operator;

        // 告警值
        @NameInMap("Value")
        public String value;

        public static InspectionTaskInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            InspectionTaskInspectionAlarmRules self = new InspectionTaskInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public InspectionTaskInspectionAlarmRules setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public InspectionTaskInspectionAlarmRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public InspectionTaskInspectionAlarmRules setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public InspectionTaskInspectionAlarmRules setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public InspectionTaskInspectionAlarmRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules extends TeaModel {
        // 告警实际值
        @NameInMap("ActualValue")
        public String actualValue;

        // 告警符号
        @NameInMap("Expression")
        public String expression;

        // 告警级别
        @NameInMap("Level")
        public String level;

        // 告警操作符
        @NameInMap("Operator")
        public String operator;

        // 告警值
        @NameInMap("Value")
        public String value;

        public static GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules self = new GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic extends TeaModel {
        // 高危数量
        @NameInMap("CriticalNumber")
        public Long criticalNumber;

        // 巡检项
        @NameInMap("InspectionItem")
        public String inspectionItem;

        // 型号
        @NameInMap("Model")
        public String model;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 中危数量
        @NameInMap("WarningNumber")
        public Long warningNumber;

        public static ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic self = new ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic();
            return TeaModel.build(map, self);
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setCriticalNumber(Long criticalNumber) {
            this.criticalNumber = criticalNumber;
            return this;
        }
        public Long getCriticalNumber() {
            return this.criticalNumber;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setInspectionItem(String inspectionItem) {
            this.inspectionItem = inspectionItem;
            return this;
        }
        public String getInspectionItem() {
            return this.inspectionItem;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListInspectionTaskReportsResponseBodyInspectionTaskAlarmStatistic setWarningNumber(Long warningNumber) {
            this.warningNumber = warningNumber;
            return this;
        }
        public Long getWarningNumber() {
            return this.warningNumber;
        }

    }

}
