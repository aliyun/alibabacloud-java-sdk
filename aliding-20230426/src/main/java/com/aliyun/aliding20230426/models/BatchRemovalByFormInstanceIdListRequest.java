// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class BatchRemovalByFormInstanceIdListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>APP_XCE0EVXS6DYG3YDYC5RD</p>
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
     * <p>false</p>
     */
    @NameInMap("ExecuteExpression")
    public Boolean executeExpression;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("FormInstanceIdList")
    public java.util.List<String> formInstanceIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FORM-GX866MC1NC1VOFF6WVQW33FD16E23L3CPMKVKA</p>
     */
    @NameInMap("FormUuid")
    public String formUuid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>09866181UTZVVD4R3DC955FNKIM52HVPU5WWK7</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    public static BatchRemovalByFormInstanceIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchRemovalByFormInstanceIdListRequest self = new BatchRemovalByFormInstanceIdListRequest();
        return TeaModel.build(map, self);
    }

    public BatchRemovalByFormInstanceIdListRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public BatchRemovalByFormInstanceIdListRequest setAsynchronousExecution(Boolean asynchronousExecution) {
        this.asynchronousExecution = asynchronousExecution;
        return this;
    }
    public Boolean getAsynchronousExecution() {
        return this.asynchronousExecution;
    }

    public BatchRemovalByFormInstanceIdListRequest setExecuteExpression(Boolean executeExpression) {
        this.executeExpression = executeExpression;
        return this;
    }
    public Boolean getExecuteExpression() {
        return this.executeExpression;
    }

    public BatchRemovalByFormInstanceIdListRequest setFormInstanceIdList(java.util.List<String> formInstanceIdList) {
        this.formInstanceIdList = formInstanceIdList;
        return this;
    }
    public java.util.List<String> getFormInstanceIdList() {
        return this.formInstanceIdList;
    }

    public BatchRemovalByFormInstanceIdListRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public BatchRemovalByFormInstanceIdListRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
