// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class BatchCreateMetaEntitiesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E0C8E7A-C6BE-5A73-9562-2A030A80E8C6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of results for the batch creation operation. This list provides the success status and any error messages for each individual entity in the request.</p>
     */
    @NameInMap("Results")
    public java.util.List<MetaEntityWriteResult> results;

    /**
     * <p>Indicates whether the request was successful. This parameter returns <code>true</code> even if creating some entities fails. To determine the outcome for each entity, check the <code>Success</code> and <code>ErrorMessage</code> fields in the <code>Results</code> array.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchCreateMetaEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateMetaEntitiesResponseBody self = new BatchCreateMetaEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateMetaEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateMetaEntitiesResponseBody setResults(java.util.List<MetaEntityWriteResult> results) {
        this.results = results;
        return this;
    }
    public java.util.List<MetaEntityWriteResult> getResults() {
        return this.results;
    }

    public BatchCreateMetaEntitiesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
