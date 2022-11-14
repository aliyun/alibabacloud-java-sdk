// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class GetCheckDuplicationChMedicalResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetCheckDuplicationChMedicalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckDuplicationChMedicalResponseBody self = new GetCheckDuplicationChMedicalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckDuplicationChMedicalResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetCheckDuplicationChMedicalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
