// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetDpChGeneralCTBResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetDpChGeneralCTBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDpChGeneralCTBResponseBody self = new GetDpChGeneralCTBResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDpChGeneralCTBResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetDpChGeneralCTBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
