// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteRetcodeAppResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRetcodeAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRetcodeAppResponseBody self = new DeleteRetcodeAppResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRetcodeAppResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeleteRetcodeAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
