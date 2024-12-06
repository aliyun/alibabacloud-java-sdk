// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByAppForRegionResponseBody extends TeaModel {
    /**
     * <p>The code of the SDK by using the Base64 scheme. You can obtain the file by using the Base64 decoding scheme.</p>
     * 
     * <strong>example:</strong>
     * <p>UEsDBBQACAAIADdwnFQAAAAAAAAAAAAAAAA2AAAAQ0FTREtfSkFWQV8xMjI3NDY2NjY0MzM0MTMzXzE2NTExMjU3MD......</p>
     */
    @NameInMap("DownloadLink")
    public String downloadLink;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CE5722A6-AE78-4741-A9B0-6C817D360510</p>
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
