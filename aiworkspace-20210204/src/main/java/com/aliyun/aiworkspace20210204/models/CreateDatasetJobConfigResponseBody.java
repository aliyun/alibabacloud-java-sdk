// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetJobConfigResponseBody extends TeaModel {
    /**
     * <p>The configuration ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dscfg-xxxxxxxxxxxxxx</p>
     */
    @NameInMap("DatasetJobConfigId")
    public String datasetJobConfigId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasetJobConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetJobConfigResponseBody self = new CreateDatasetJobConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetJobConfigResponseBody setDatasetJobConfigId(String datasetJobConfigId) {
        this.datasetJobConfigId = datasetJobConfigId;
        return this;
    }
    public String getDatasetJobConfigId() {
        return this.datasetJobConfigId;
    }

    public CreateDatasetJobConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
