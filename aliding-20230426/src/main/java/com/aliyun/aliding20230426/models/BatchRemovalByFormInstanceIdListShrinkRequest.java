// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchRemovalByFormInstanceIdListShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppType")
    public String appType;

    @NameInMap("AsynchronousExecution")
    public Boolean asynchronousExecution;

    @NameInMap("ExecuteExpression")
    public Boolean executeExpression;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FormInstanceIdList")
    public String formInstanceIdListShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FormUuid")
    public String formUuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    public static BatchRemovalByFormInstanceIdListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRemovalByFormInstanceIdListShrinkRequest self = new BatchRemovalByFormInstanceIdListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BatchRemovalByFormInstanceIdListShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public BatchRemovalByFormInstanceIdListShrinkRequest setAsynchronousExecution(Boolean asynchronousExecution) {
        this.asynchronousExecution = asynchronousExecution;
        return this;
    }
    public Boolean getAsynchronousExecution() {
        return this.asynchronousExecution;
    }

    public BatchRemovalByFormInstanceIdListShrinkRequest setExecuteExpression(Boolean executeExpression) {
        this.executeExpression = executeExpression;
        return this;
    }
    public Boolean getExecuteExpression() {
        return this.executeExpression;
    }

    public BatchRemovalByFormInstanceIdListShrinkRequest setFormInstanceIdListShrink(String formInstanceIdListShrink) {
        this.formInstanceIdListShrink = formInstanceIdListShrink;
        return this;
    }
    public String getFormInstanceIdListShrink() {
        return this.formInstanceIdListShrink;
    }

    public BatchRemovalByFormInstanceIdListShrinkRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public BatchRemovalByFormInstanceIdListShrinkRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
