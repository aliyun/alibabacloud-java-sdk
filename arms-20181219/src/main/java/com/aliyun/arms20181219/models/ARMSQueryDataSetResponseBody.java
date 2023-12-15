// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20181219.models;

import com.aliyun.tea.*;

public class ARMSQueryDataSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static ARMSQueryDataSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ARMSQueryDataSetResponseBody self = new ARMSQueryDataSetResponseBody();
        return TeaModel.build(map, self);
    }

    public ARMSQueryDataSetResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ARMSQueryDataSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
