// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetInspectionReportDownloadUrlRequest extends TeaModel {
    @NameInMap("DownloadReportListJson")
    public String downloadReportListJson;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetInspectionReportDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionReportDownloadUrlRequest self = new GetInspectionReportDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetInspectionReportDownloadUrlRequest setDownloadReportListJson(String downloadReportListJson) {
        this.downloadReportListJson = downloadReportListJson;
        return this;
    }
    public String getDownloadReportListJson() {
        return this.downloadReportListJson;
    }

    public GetInspectionReportDownloadUrlRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
