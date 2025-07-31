// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetUploadLinkResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyuncs.com/test.mp3">http://www.aliyuncs.com/test.mp3</a></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>E37E2B77-A664-5278-8219-23BBC0EB2A35</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUploadLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadLinkResponseBody self = new GetUploadLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadLinkResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetUploadLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
