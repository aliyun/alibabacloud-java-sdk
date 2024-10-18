// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportOssCheckStatResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/console_data/production/scanResult/osscheck/ossCheckStat_aliUf5B3lJfOkLpqozLIn94Uy-1XxKyX.xlsx">https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/console_data/production/scanResult/osscheck/ossCheckStat_aliUf5B3lJfOkLpqozLIn94Uy-1XxKyX.xlsx</a></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportOssCheckStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportOssCheckStatResponseBody self = new ExportOssCheckStatResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportOssCheckStatResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExportOssCheckStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
