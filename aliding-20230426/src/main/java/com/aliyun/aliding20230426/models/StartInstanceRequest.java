// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APP_PBxxx</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>18295</p>
     */
    @NameInMap("DepartmentId")
    public String departmentId;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("FormDataJson")
    public String formDataJson;

    /**
     * <strong>example:</strong>
     * <p>FORM-EF6Yxxx</p>
     */
    @NameInMap("FormUuid")
    public String formUuid;

    /**
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>TPROC--EF6Y4xxx</p>
     */
    @NameInMap("ProcessCode")
    public String processCode;

    @NameInMap("ProcessData")
    public String processData;

    /**
     * <strong>example:</strong>
     * <p>hexxyy</p>
     */
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
