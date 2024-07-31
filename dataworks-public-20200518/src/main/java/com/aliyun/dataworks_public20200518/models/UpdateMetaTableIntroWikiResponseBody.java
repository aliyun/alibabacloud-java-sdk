// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableIntroWikiResponseBody extends TeaModel {
    /**
     * <p>The request ID. You can troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abcde</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the instructions on how to use the table are updated.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UpdateResult")
    public Boolean updateResult;

    public static UpdateMetaTableIntroWikiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableIntroWikiResponseBody self = new UpdateMetaTableIntroWikiResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableIntroWikiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMetaTableIntroWikiResponseBody setUpdateResult(Boolean updateResult) {
        this.updateResult = updateResult;
        return this;
    }
    public Boolean getUpdateResult() {
        return this.updateResult;
    }

}
