// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetOperationRecordsRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("Language")
    public String language;

    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

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
