// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFolderTreeResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetSparkTemplateFolderTreeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFolderTreeResponseBody self = new GetSparkTemplateFolderTreeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFolderTreeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetSparkTemplateFolderTreeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
