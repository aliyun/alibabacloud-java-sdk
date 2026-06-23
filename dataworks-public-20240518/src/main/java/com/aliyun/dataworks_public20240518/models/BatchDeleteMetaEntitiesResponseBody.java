// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchDeleteMetaEntitiesResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1FC02D76-4A94-5D97-B52C-00A031B95359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array of deletion results, one for each requested entity. Each result indicates whether the deletion was successful and includes an error message upon failure.</p>
     */
    @NameInMap("Results")
    public java.util.List<MetaEntityWriteResult> results;

    /**
     * <p>Indicates whether the request was successful. This parameter returns true even if the deletion of some entities fails. To check the status of each individual deletion, see the Success and ErrorMessage fields in the Results array.</p>
     * 
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
