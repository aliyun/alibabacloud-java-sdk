// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class SdkGenerateByAppResponseBody extends TeaModel {
    @NameInMap("DownloadLink")
    public String downloadLink;

    @NameInMap("RequestId")
    public String requestId;

    public static SdkGenerateByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByAppResponseBody self = new SdkGenerateByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByAppResponseBody setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }
    public String getDownloadLink() {
        return this.downloadLink;
    }

    public SdkGenerateByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
