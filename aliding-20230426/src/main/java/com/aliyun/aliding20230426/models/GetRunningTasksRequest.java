// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetRunningTasksRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("Language")
    public String language;

    @NameInMap("ProcessCodes")
    public String processCodes;

    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    @NameInMap("SystemToken")
    public String systemToken;

    public static GetRunningTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRunningTasksRequest self = new GetRunningTasksRequest();
        return TeaModel.build(map, self);
    }

    public GetRunningTasksRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetRunningTasksRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetRunningTasksRequest setProcessCodes(String processCodes) {
        this.processCodes = processCodes;
        return this;
    }
    public String getProcessCodes() {
        return this.processCodes;
    }

    public GetRunningTasksRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

    public GetRunningTasksRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
