// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByGroupResponseBody extends TeaModel {
    /**
     * <p>The download link of the SDK.</p>
     */
    @NameInMap("DownloadLink")
    public String downloadLink;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SdkGenerateByGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByGroupResponseBody self = new SdkGenerateByGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByGroupResponseBody setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }
    public String getDownloadLink() {
        return this.downloadLink;
    }

    public SdkGenerateByGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
