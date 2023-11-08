// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateStatusShrinkRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("ErrorLines")
    public String errorLinesShrink;

    @NameInMap("ImportSequence")
    public String importSequence;

    @NameInMap("Language")
    public String language;

    @NameInMap("Status")
    public String status;

    @NameInMap("SystemToken")
    public String systemToken;

    public static UpdateStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStatusShrinkRequest self = new UpdateStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStatusShrinkRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public UpdateStatusShrinkRequest setErrorLinesShrink(String errorLinesShrink) {
        this.errorLinesShrink = errorLinesShrink;
        return this;
    }
    public String getErrorLinesShrink() {
        return this.errorLinesShrink;
    }

    public UpdateStatusShrinkRequest setImportSequence(String importSequence) {
        this.importSequence = importSequence;
        return this;
    }
    public String getImportSequence() {
        return this.importSequence;
    }

    public UpdateStatusShrinkRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateStatusShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateStatusShrinkRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
