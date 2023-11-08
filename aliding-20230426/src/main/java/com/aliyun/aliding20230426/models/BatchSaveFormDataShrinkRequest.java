// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchSaveFormDataShrinkRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("AsynchronousExecution")
    public Boolean asynchronousExecution;

    @NameInMap("FormDataJsonList")
    public String formDataJsonListShrink;

    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("KeepRunningAfterException")
    public Boolean keepRunningAfterException;

    @NameInMap("NoExecuteExpression")
    public Boolean noExecuteExpression;

    @NameInMap("SystemToken")
    public String systemToken;

    public static BatchSaveFormDataShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSaveFormDataShrinkRequest self = new BatchSaveFormDataShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchSaveFormDataShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public BatchSaveFormDataShrinkRequest setAsynchronousExecution(Boolean asynchronousExecution) {
        this.asynchronousExecution = asynchronousExecution;
        return this;
    }
    public Boolean getAsynchronousExecution() {
        return this.asynchronousExecution;
    }

    public BatchSaveFormDataShrinkRequest setFormDataJsonListShrink(String formDataJsonListShrink) {
        this.formDataJsonListShrink = formDataJsonListShrink;
        return this;
    }
    public String getFormDataJsonListShrink() {
        return this.formDataJsonListShrink;
    }

    public BatchSaveFormDataShrinkRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public BatchSaveFormDataShrinkRequest setKeepRunningAfterException(Boolean keepRunningAfterException) {
        this.keepRunningAfterException = keepRunningAfterException;
        return this;
    }
    public Boolean getKeepRunningAfterException() {
        return this.keepRunningAfterException;
    }

    public BatchSaveFormDataShrinkRequest setNoExecuteExpression(Boolean noExecuteExpression) {
        this.noExecuteExpression = noExecuteExpression;
        return this;
    }
    public Boolean getNoExecuteExpression() {
        return this.noExecuteExpression;
    }

    public BatchSaveFormDataShrinkRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
