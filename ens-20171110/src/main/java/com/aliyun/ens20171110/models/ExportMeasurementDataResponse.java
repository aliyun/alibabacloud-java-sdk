// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportMeasurementDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("FilePath")
    @Validation(required = true)
    public String filePath;

    public static ExportMeasurementDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportMeasurementDataResponse self = new ExportMeasurementDataResponse();
        return TeaModel.build(map, self);
    }

    public ExportMeasurementDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportMeasurementDataResponse setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

}
