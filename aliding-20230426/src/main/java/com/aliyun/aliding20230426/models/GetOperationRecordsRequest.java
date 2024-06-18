// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOperationRecordsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APP_PBxxx</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>f30233fb-72e1-4af4-8cb8-c7e0ea9ee530</p>
     */
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    /**
     * <strong>example:</strong>
     * <p>hexxyy</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    public static GetOperationRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRecordsRequest self = new GetOperationRecordsRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationRecordsRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetOperationRecordsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetOperationRecordsRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public GetOperationRecordsRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
