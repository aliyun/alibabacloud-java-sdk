// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateToolOutput extends TeaModel {
    @NameInMap("data")
    public UpdateToolData data;

    @NameInMap("message")
    public String message;

    @NameInMap("success")
    public Boolean success;

    public static UpdateToolOutput build(java.util.Map<String, ?> map) throws Exception {
        UpdateToolOutput self = new UpdateToolOutput();
        return TeaModel.build(map, self);
    }

    public UpdateToolOutput setData(UpdateToolData data) {
        this.data = data;
        return this;
    }
    public UpdateToolData getData() {
        return this.data;
    }

    public UpdateToolOutput setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateToolOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
