// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportMeasurementDataResponseBody extends TeaModel {
    /**
     * <p>The download path of the exported file.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://test-oss.com/image_01.jpeg">http://test-oss.com/image_01.jpeg</a></p>
     */
    @NameInMap("FilePath")
    public String filePath;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportMeasurementDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportMeasurementDataResponseBody self = new ExportMeasurementDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportMeasurementDataResponseBody setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public ExportMeasurementDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
