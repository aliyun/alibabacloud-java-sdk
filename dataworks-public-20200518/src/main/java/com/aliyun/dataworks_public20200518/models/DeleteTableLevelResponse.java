// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableLevelResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DeleteResult")
    @Validation(required = true)
    public Boolean deleteResult;

    public static DeleteTableLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableLevelResponse self = new DeleteTableLevelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTableLevelResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTableLevelResponse setDeleteResult(Boolean deleteResult) {
        this.deleteResult = deleteResult;
        return this;
    }
    public Boolean getDeleteResult() {
        return this.deleteResult;
    }

}
