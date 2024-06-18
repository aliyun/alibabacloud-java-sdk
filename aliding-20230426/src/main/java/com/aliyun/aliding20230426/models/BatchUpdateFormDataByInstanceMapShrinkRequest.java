// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchUpdateFormDataByInstanceMapShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AsynchronousExecution")
    public Boolean asynchronousExecution;

    /**
     * <strong>example:</strong>
     * <p>FORM-GX866MC1NC1VOFF6WVQW33FD16E23L3CPMKVKA</p>
     */
    @NameInMap("FormUuid")
    public String formUuid;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreEmpty")
    public Boolean ignoreEmpty;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NoExecuteExpression")
    public Boolean noExecuteExpression;

    /**
     * <strong>example:</strong>
     * <p>09866181UTZVVD4R3DC955FNKIM52HVPU5WWK7</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    @NameInMap("UpdateFormDataJsonMap")
    public String updateFormDataJsonMapShrink;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseLatestFormSchemaVersion")
    public Boolean useLatestFormSchemaVersion;

    public static BatchUpdateFormDataByInstanceMapShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFormDataByInstanceMapShrinkRequest self = new BatchUpdateFormDataByInstanceMapShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFormDataByInstanceMapShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public BatchUpdateFormDataByInstanceMapShrinkRequest setAsynchronousExecution(Boolean asynchronousExecution) {
        this.asynchronousExecution = asynchronousExecution;
        return this;
    }
    public Boolean getAsynchronousExecution() {
        return this.asynchronousExecution;
    }

    public BatchUpdateFormDataByInstanceMapShrinkRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public BatchUpdateFormDataByInstanceMapShrinkRequest setIgnoreEmpty(Boolean ignoreEmpty) {
        this.ignoreEmpty = ignoreEmpty;
        return this;
    }
    public Boolean getIgnoreEmpty() {
        return this.ignoreEmpty;
    }

    public BatchUpdateFormDataByInstanceMapShrinkRequest setNoExecuteExpression(Boolean noExecuteExpression) {
        this.noExecuteExpression = noExecuteExpression;
        return this;
    }
    public Boolean getNoExecuteExpression() {
        return this.noExecuteExpression;
    }

    public BatchUpdateFormDataByInstanceMapShrinkRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public BatchUpdateFormDataByInstanceMapShrinkRequest setUpdateFormDataJsonMapShrink(String updateFormDataJsonMapShrink) {
        this.updateFormDataJsonMapShrink = updateFormDataJsonMapShrink;
        return this;
    }
    public String getUpdateFormDataJsonMapShrink() {
        return this.updateFormDataJsonMapShrink;
    }

    public BatchUpdateFormDataByInstanceMapShrinkRequest setUseLatestFormSchemaVersion(Boolean useLatestFormSchemaVersion) {
        this.useLatestFormSchemaVersion = useLatestFormSchemaVersion;
        return this;
    }
    public Boolean getUseLatestFormSchemaVersion() {
        return this.useLatestFormSchemaVersion;
    }

}
