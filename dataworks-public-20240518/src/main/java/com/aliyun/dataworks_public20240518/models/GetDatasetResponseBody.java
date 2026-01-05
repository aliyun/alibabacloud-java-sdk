// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDatasetResponseBody extends TeaModel {
    /**
     * <p>The dataset information.</p>
     */
    @NameInMap("Dataset")
    public Dataset dataset;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>204EAF68-CCE3-5112-8DA0-E7A60F02XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatasetResponseBody self = new GetDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatasetResponseBody setDataset(Dataset dataset) {
        this.dataset = dataset;
        return this;
    }
    public Dataset getDataset() {
        return this.dataset;
    }

    public GetDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
