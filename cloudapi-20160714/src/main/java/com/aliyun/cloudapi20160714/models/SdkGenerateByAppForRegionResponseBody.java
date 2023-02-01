// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByAppForRegionResponseBody extends TeaModel {
    /**
     * <p>The code of the SDK by using the Base64 scheme. You can obtain the file by using the Base64 decoding scheme.</p>
     */
    @NameInMap("DownloadLink")
    public String downloadLink;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SdkGenerateByAppForRegionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByAppForRegionResponseBody self = new SdkGenerateByAppForRegionResponseBody();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByAppForRegionResponseBody setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }
    public String getDownloadLink() {
        return this.downloadLink;
    }

    public SdkGenerateByAppForRegionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
