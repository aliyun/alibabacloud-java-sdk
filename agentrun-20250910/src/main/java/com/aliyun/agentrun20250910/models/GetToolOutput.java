// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class GetToolOutput extends TeaModel {
    @NameInMap("data")
    public ToolInfo data;

    @NameInMap("success")
    public Boolean success;

    public static GetToolOutput build(java.util.Map<String, ?> map) throws Exception {
        GetToolOutput self = new GetToolOutput();
        return TeaModel.build(map, self);
    }

    public GetToolOutput setData(ToolInfo data) {
        this.data = data;
        return this;
    }
    public ToolInfo getData() {
        return this.data;
    }

    public GetToolOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
