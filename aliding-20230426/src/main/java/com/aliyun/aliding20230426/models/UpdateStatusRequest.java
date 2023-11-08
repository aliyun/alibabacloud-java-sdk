// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateStatusRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("ErrorLines")
    public java.util.List<Integer> errorLines;

    @NameInMap("ImportSequence")
    public String importSequence;

    @NameInMap("Language")
    public String language;

    @NameInMap("Status")
    public String status;

    @NameInMap("SystemToken")
    public String systemToken;

    public static UpdateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStatusRequest self = new UpdateStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStatusRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public UpdateStatusRequest setErrorLines(java.util.List<Integer> errorLines) {
        this.errorLines = errorLines;
        return this;
    }
    public java.util.List<Integer> getErrorLines() {
        return this.errorLines;
    }

    public UpdateStatusRequest setImportSequence(String importSequence) {
        this.importSequence = importSequence;
        return this;
    }
    public String getImportSequence() {
        return this.importSequence;
    }

    public UpdateStatusRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateStatusRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
