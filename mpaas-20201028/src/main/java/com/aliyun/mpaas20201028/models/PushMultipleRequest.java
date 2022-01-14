// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class PushMultipleRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DeliveryType")
    public Long deliveryType;

    @NameInMap("ExpiredSeconds")
    public Long expiredSeconds;

    @NameInMap("ExtendedParams")
    public String extendedParams;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("PushAction")
    public Long pushAction;

    @NameInMap("Silent")
    public Long silent;

    @NameInMap("StrategyContent")
    public String strategyContent;

    @NameInMap("StrategyType")
    public Integer strategyType;

    @NameInMap("TargetMsg")
    public java.util.List<PushMultipleRequestTargetMsg> targetMsg;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TemplateName")
    public String templateName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PushMultipleRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMultipleRequest self = new PushMultipleRequest();
        return TeaModel.build(map, self);
    }

    public PushMultipleRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PushMultipleRequest setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public Long getDeliveryType() {
        return this.deliveryType;
    }

    public PushMultipleRequest setExpiredSeconds(Long expiredSeconds) {
        this.expiredSeconds = expiredSeconds;
        return this;
    }
    public Long getExpiredSeconds() {
        return this.expiredSeconds;
    }

    public PushMultipleRequest setExtendedParams(String extendedParams) {
        this.extendedParams = extendedParams;
        return this;
    }
    public String getExtendedParams() {
        return this.extendedParams;
    }

    public PushMultipleRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public PushMultipleRequest setPushAction(Long pushAction) {
        this.pushAction = pushAction;
        return this;
    }
    public Long getPushAction() {
        return this.pushAction;
    }

    public PushMultipleRequest setSilent(Long silent) {
        this.silent = silent;
        return this;
    }
    public Long getSilent() {
        return this.silent;
    }

    public PushMultipleRequest setStrategyContent(String strategyContent) {
        this.strategyContent = strategyContent;
        return this;
    }
    public String getStrategyContent() {
        return this.strategyContent;
    }

    public PushMultipleRequest setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }
    public Integer getStrategyType() {
        return this.strategyType;
    }

    public PushMultipleRequest setTargetMsg(java.util.List<PushMultipleRequestTargetMsg> targetMsg) {
        this.targetMsg = targetMsg;
        return this;
    }
    public java.util.List<PushMultipleRequestTargetMsg> getTargetMsg() {
        return this.targetMsg;
    }

    public PushMultipleRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public PushMultipleRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public PushMultipleRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class PushMultipleRequestTargetMsg extends TeaModel {
        @NameInMap("ExtendedParams")
        public String extendedParams;

        @NameInMap("MsgKey")
        public String msgKey;

        @NameInMap("Target")
        public String target;

        @NameInMap("TemplateKeyValue")
        public String templateKeyValue;

        public static PushMultipleRequestTargetMsg build(java.util.Map<String, ?> map) throws Exception {
            PushMultipleRequestTargetMsg self = new PushMultipleRequestTargetMsg();
            return TeaModel.build(map, self);
        }

        public PushMultipleRequestTargetMsg setExtendedParams(String extendedParams) {
            this.extendedParams = extendedParams;
            return this;
        }
        public String getExtendedParams() {
            return this.extendedParams;
        }

        public PushMultipleRequestTargetMsg setMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
        public String getMsgKey() {
            return this.msgKey;
        }

        public PushMultipleRequestTargetMsg setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public PushMultipleRequestTargetMsg setTemplateKeyValue(String templateKeyValue) {
            this.templateKeyValue = templateKeyValue;
            return this;
        }
        public String getTemplateKeyValue() {
            return this.templateKeyValue;
        }

    }

}
