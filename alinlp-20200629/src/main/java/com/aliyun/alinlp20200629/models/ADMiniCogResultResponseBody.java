// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class ADMiniCogResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static ADMiniCogResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ADMiniCogResultResponseBody self = new ADMiniCogResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ADMiniCogResultResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ADMiniCogResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
