// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetReportResponseBody extends TeaModel {
    /**
     * <p>The details for obtaining the migration report.</p>
     */
    @NameInMap("GetReportResponse")
    public GetReportResp getReportResponse;

    public static GetReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportResponseBody self = new GetReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportResponseBody setGetReportResponse(GetReportResp getReportResponse) {
        this.getReportResponse = getReportResponse;
        return this;
    }
    public GetReportResp getGetReportResponse() {
        return this.getReportResponse;
    }

}
