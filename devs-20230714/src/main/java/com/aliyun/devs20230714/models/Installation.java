// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Installation extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://github.com/login/oauth/authorize?client_id=86059a1b2bb20d3e5fc3&scope=repo,repo:status,delete_repo">https://github.com/login/oauth/authorize?client_id=86059a1b2bb20d3e5fc3&amp;scope=repo,repo:status,delete_repo</a></p>
     */
    @NameInMap("actionUri")
    public String actionUri;

    /**
     * <strong>example:</strong>
     * <p>Please click &quot;actionUri&quot; to complete the OAuth authorization process</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>finished</p>
     */
    @NameInMap("stage")
    public String stage;

    public static Installation build(java.util.Map<String, ?> map) throws Exception {
        Installation self = new Installation();
        return TeaModel.build(map, self);
    }

    public Installation setActionUri(String actionUri) {
        this.actionUri = actionUri;
        return this;
    }
    public String getActionUri() {
        return this.actionUri;
    }

    public Installation setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public Installation setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

}
