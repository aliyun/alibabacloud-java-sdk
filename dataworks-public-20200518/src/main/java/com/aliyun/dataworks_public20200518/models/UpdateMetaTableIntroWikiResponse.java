// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableIntroWikiResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UpdateResult")
    @Validation(required = true)
    public Boolean updateResult;

    public static UpdateMetaTableIntroWikiResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableIntroWikiResponse self = new UpdateMetaTableIntroWikiResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableIntroWikiResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMetaTableIntroWikiResponse setUpdateResult(Boolean updateResult) {
        this.updateResult = updateResult;
        return this;
    }
    public Boolean getUpdateResult() {
        return this.updateResult;
    }

}
