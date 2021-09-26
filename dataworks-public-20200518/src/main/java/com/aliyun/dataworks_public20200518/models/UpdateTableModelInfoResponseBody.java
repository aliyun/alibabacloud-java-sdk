// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateTableModelInfoResponseBody extends TeaModel {
    @NameInMap("UpdateResult")
    public Boolean updateResult;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateTableModelInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTableModelInfoResponseBody self = new UpdateTableModelInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTableModelInfoResponseBody setUpdateResult(Boolean updateResult) {
        this.updateResult = updateResult;
        return this;
    }
    public Boolean getUpdateResult() {
        return this.updateResult;
    }

    public UpdateTableModelInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
