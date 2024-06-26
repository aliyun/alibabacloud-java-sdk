// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DownloadSDK2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static DownloadSDK2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadSDK2ResponseBody self = new DownloadSDK2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadSDK2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadSDK2ResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
