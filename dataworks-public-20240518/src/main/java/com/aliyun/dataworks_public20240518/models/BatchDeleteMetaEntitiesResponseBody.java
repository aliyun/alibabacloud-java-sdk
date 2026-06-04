// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchDeleteMetaEntitiesResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1FC02D76-4A94-5D97-B52C-00A031B95359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Results")
    public java.util.List<MetaEntityWriteResult> results;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchDeleteMetaEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteMetaEntitiesResponseBody self = new BatchDeleteMetaEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteMetaEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteMetaEntitiesResponseBody setResults(java.util.List<MetaEntityWriteResult> results) {
        this.results = results;
        return this;
    }
    public java.util.List<MetaEntityWriteResult> getResults() {
        return this.results;
    }

    public BatchDeleteMetaEntitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
