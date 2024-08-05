// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://oss-bucket/object">http://oss-bucket/object</a></p>
     */
    @NameInMap("DownloadLink")
    public String downloadLink;

    /**
     * <strong>example:</strong>
     * <p>D0075BDA-8AED-5073-A70A-FE44E86AB20F</p>
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
