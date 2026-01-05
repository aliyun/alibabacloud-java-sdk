// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDatasetVersionResponseBody extends TeaModel {
    /**
     * <p>The dataset version.</p>
     */
    @NameInMap("DatasetVersion")
    public DatasetVersion datasetVersion;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4CDF7B72-020B-542A-8465-21CFFA8XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDatasetVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetVersionResponseBody self = new GetDatasetVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetVersionResponseBody setDatasetVersion(DatasetVersion datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }
    public DatasetVersion getDatasetVersion() {
        return this.datasetVersion;
    }

    public GetDatasetVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
