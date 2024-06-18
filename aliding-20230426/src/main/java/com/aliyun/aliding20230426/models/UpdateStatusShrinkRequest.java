// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateStatusShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APP_PBKT0MFBEBTDO8T7SLVP</p>
     */
    @NameInMap("AppType")
    public String appType;

    @NameInMap("ErrorLines")
    public String errorLinesShrink;

    /**
     * <strong>example:</strong>
     * <p>seq-123</p>
     */
    @NameInMap("ImportSequence")
    public String importSequence;

    /**
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>hexxxx</p>
     */
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
