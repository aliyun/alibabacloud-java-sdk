// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("DepartmentId")
    public String departmentId;

    @NameInMap("FormDataJson")
    public String formDataJson;

    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("Language")
    public String language;

    @NameInMap("ProcessCode")
    public String processCode;

    @NameInMap("ProcessData")
    public String processData;

    @NameInMap("SystemToken")
    public String systemToken;

    public static StartInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartInstanceRequest self = new StartInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartInstanceRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public StartInstanceRequest setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public String getDepartmentId() {
        return this.departmentId;
    }

    public StartInstanceRequest setFormDataJson(String formDataJson) {
        this.formDataJson = formDataJson;
        return this;
    }
    public String getFormDataJson() {
        return this.formDataJson;
    }

    public StartInstanceRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public StartInstanceRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public StartInstanceRequest setProcessCode(String processCode) {
        this.processCode = processCode;
        return this;
    }
    public String getProcessCode() {
        return this.processCode;
    }

    public StartInstanceRequest setProcessData(String processData) {
        this.processData = processData;
        return this;
    }
    public String getProcessData() {
        return this.processData;
    }

    public StartInstanceRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
