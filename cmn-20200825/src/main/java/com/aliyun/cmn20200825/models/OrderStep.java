// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class OrderStep extends TeaModel {
    // 步骤展示方式
    @NameInMap("DisplayMethod")
    public String displayMethod;

    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModify")
    public String gmtModify;

    // 步骤任务参数
    @NameInMap("JobKwargs")
    public String jobKwargs;

    // 步骤标题
    @NameInMap("JobMessage")
    public String jobMessage;

    // 步骤标题
    @NameInMap("JobReturnStatus")
    public String jobReturnStatus;

    // 步骤任务返回
    @NameInMap("JobReturnValues")
    public String jobReturnValues;

    // 步骤任务系统
    @NameInMap("JobSystem")
    public String jobSystem;

    // 工单id
    @NameInMap("OrderId")
    public String orderId;

    // 工单步骤id
    @NameInMap("OrderStepId")
    public String orderStepId;

    // 下一步步骤名
    @NameInMap("RealNextStep")
    public String realNextStep;

    // 下一步步骤可选列表
    @NameInMap("Restriction")
    public java.util.List<OrderStepRestriction> restriction;

    // 步骤名
    @NameInMap("StepName")
    public String stepName;

    // 步骤状态
    @NameInMap("StepStatus")
    public String stepStatus;

    // 步骤标题
    @NameInMap("StepTitle")
    public String stepTitle;

    // 步骤类型
    @NameInMap("StepType")
    public String stepType;

    public static OrderStep build(java.util.Map<String, ?> map) throws Exception {
        OrderStep self = new OrderStep();
        return TeaModel.build(map, self);
    }

    public OrderStep setDisplayMethod(String displayMethod) {
        this.displayMethod = displayMethod;
        return this;
    }
    public String getDisplayMethod() {
        return this.displayMethod;
    }

    public OrderStep setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OrderStep setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public OrderStep setJobKwargs(String jobKwargs) {
        this.jobKwargs = jobKwargs;
        return this;
    }
    public String getJobKwargs() {
        return this.jobKwargs;
    }

    public OrderStep setJobMessage(String jobMessage) {
        this.jobMessage = jobMessage;
        return this;
    }
    public String getJobMessage() {
        return this.jobMessage;
    }

    public OrderStep setJobReturnStatus(String jobReturnStatus) {
        this.jobReturnStatus = jobReturnStatus;
        return this;
    }
    public String getJobReturnStatus() {
        return this.jobReturnStatus;
    }

    public OrderStep setJobReturnValues(String jobReturnValues) {
        this.jobReturnValues = jobReturnValues;
        return this;
    }
    public String getJobReturnValues() {
        return this.jobReturnValues;
    }

    public OrderStep setJobSystem(String jobSystem) {
        this.jobSystem = jobSystem;
        return this;
    }
    public String getJobSystem() {
        return this.jobSystem;
    }

    public OrderStep setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public OrderStep setOrderStepId(String orderStepId) {
        this.orderStepId = orderStepId;
        return this;
    }
    public String getOrderStepId() {
        return this.orderStepId;
    }

    public OrderStep setRealNextStep(String realNextStep) {
        this.realNextStep = realNextStep;
        return this;
    }
    public String getRealNextStep() {
        return this.realNextStep;
    }

    public OrderStep setRestriction(java.util.List<OrderStepRestriction> restriction) {
        this.restriction = restriction;
        return this;
    }
    public java.util.List<OrderStepRestriction> getRestriction() {
        return this.restriction;
    }

    public OrderStep setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public OrderStep setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
        return this;
    }
    public String getStepStatus() {
        return this.stepStatus;
    }

    public OrderStep setStepTitle(String stepTitle) {
        this.stepTitle = stepTitle;
        return this;
    }
    public String getStepTitle() {
        return this.stepTitle;
    }

    public OrderStep setStepType(String stepType) {
        this.stepType = stepType;
        return this;
    }
    public String getStepType() {
        return this.stepType;
    }

    public static class OrderStepRestriction extends TeaModel {
        // 步骤标题
        @NameInMap("Label")
        public String label;

        // 步骤名
        @NameInMap("Value")
        public String value;

        public static OrderStepRestriction build(java.util.Map<String, ?> map) throws Exception {
            OrderStepRestriction self = new OrderStepRestriction();
            return TeaModel.build(map, self);
        }

        public OrderStepRestriction setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public OrderStepRestriction setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
