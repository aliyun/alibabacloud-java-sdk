// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class SdkGenerateResponseBody extends TeaModel {
    @NameInMap("DownloadLink")
    public String downloadLink;

    @NameInMap("RequestId")
    public String requestId;

    public static SdkGenerateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateResponseBody self = new SdkGenerateResponseBody();
        return TeaModel.build(map, self);
    }

    public SdkGenerateResponseBody setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }
    public String getDownloadLink() {
        return this.downloadLink;
    }

    public SdkGenerateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
