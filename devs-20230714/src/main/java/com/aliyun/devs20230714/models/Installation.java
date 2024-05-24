// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Installation extends TeaModel {
    @NameInMap("actionUri")
    public String actionUri;

    @NameInMap("message")
    public String message;

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
