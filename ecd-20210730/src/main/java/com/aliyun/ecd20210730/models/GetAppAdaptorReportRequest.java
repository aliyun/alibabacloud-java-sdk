// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class GetAppAdaptorReportRequest extends TeaModel {
    @NameInMap("AdaptorUid")
    public String adaptorUid;

    public static GetAppAdaptorReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppAdaptorReportRequest self = new GetAppAdaptorReportRequest();
        return TeaModel.build(map, self);
    }

    public GetAppAdaptorReportRequest setAdaptorUid(String adaptorUid) {
        this.adaptorUid = adaptorUid;
        return this;
    }
    public String getAdaptorUid() {
        return this.adaptorUid;
    }

}
