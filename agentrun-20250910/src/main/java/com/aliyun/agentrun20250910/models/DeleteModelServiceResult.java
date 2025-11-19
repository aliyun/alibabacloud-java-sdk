// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteModelServiceResult extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ModelService data;

    @NameInMap("requestId")
    public String requestId;

    public static DeleteModelServiceResult build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelServiceResult self = new DeleteModelServiceResult();
        return TeaModel.build(map, self);
    }

    public DeleteModelServiceResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteModelServiceResult setData(ModelService data) {
        this.data = data;
        return this;
    }
    public ModelService getData() {
        return this.data;
    }

    public DeleteModelServiceResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
