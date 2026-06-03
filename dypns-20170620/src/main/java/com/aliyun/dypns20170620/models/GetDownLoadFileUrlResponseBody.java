// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetDownLoadFileUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Boolean data;

    public static GetDownLoadFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDownLoadFileUrlResponseBody self = new GetDownLoadFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDownLoadFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDownLoadFileUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDownLoadFileUrlResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
