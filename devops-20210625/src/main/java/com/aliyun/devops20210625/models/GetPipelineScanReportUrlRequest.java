// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetPipelineScanReportUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("reportPath")
    public String reportPath;

    public static GetPipelineScanReportUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineScanReportUrlRequest self = new GetPipelineScanReportUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetPipelineScanReportUrlRequest setReportPath(String reportPath) {
        this.reportPath = reportPath;
        return this;
    }
    public String getReportPath() {
        return this.reportPath;
    }

}
