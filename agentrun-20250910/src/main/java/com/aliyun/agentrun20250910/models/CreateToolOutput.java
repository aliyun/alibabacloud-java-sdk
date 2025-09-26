// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateToolOutput extends TeaModel {
    @NameInMap("data")
    public CreateToolData data;

    @NameInMap("message")
    public String message;

    @NameInMap("success")
    public Boolean success;

    public static CreateToolOutput build(java.util.Map<String, ?> map) throws Exception {
        CreateToolOutput self = new CreateToolOutput();
        return TeaModel.build(map, self);
    }

    public CreateToolOutput setData(CreateToolData data) {
        this.data = data;
        return this;
    }
    public CreateToolData getData() {
        return this.data;
    }

    public CreateToolOutput setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateToolOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
