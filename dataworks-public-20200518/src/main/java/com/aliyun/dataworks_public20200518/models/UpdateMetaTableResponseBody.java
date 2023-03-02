// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the metadata information about the table is updated.</p>
     */
    @NameInMap("UpdateResult")
    public Boolean updateResult;

    public static UpdateMetaTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableResponseBody self = new UpdateMetaTableResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMetaTableResponseBody setUpdateResult(Boolean updateResult) {
        this.updateResult = updateResult;
        return this;
    }
    public Boolean getUpdateResult() {
        return this.updateResult;
    }

}
