// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dsjob-9jx1******uj9e</p>
     */
    @NameInMap("DatasetJobId")
    public String datasetJobId;

    /**
     * <strong>example:</strong>
     * <p>99341606-****-0757724D97EE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDatasetJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetJobResponseBody self = new CreateDatasetJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetJobResponseBody setDatasetJobId(String datasetJobId) {
        this.datasetJobId = datasetJobId;
        return this;
    }
    public String getDatasetJobId() {
        return this.datasetJobId;
    }

    public CreateDatasetJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
