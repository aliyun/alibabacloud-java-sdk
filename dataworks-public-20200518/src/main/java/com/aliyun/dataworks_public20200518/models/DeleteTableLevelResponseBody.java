// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteTableLevelResponseBody extends TeaModel {
    @NameInMap("DeleteResult")
    public Boolean deleteResult;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteTableLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTableLevelResponseBody self = new DeleteTableLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTableLevelResponseBody setDeleteResult(Boolean deleteResult) {
        this.deleteResult = deleteResult;
        return this;
    }
    public Boolean getDeleteResult() {
        return this.deleteResult;
    }

    public DeleteTableLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
