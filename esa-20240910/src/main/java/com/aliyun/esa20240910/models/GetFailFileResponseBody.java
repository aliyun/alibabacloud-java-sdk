// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetFailFileResponseBody extends TeaModel {
    /**
     * <p>The download link for the failed task file.</p>
     * 
     * <strong>example:</strong>
     * <p>https://<strong><strong>.oss-cn-shenzhen.aliyuncs.com/fail-1593805857882113?Expires=1708659191&amp;OSSAccessKeyId=</strong></strong><strong><strong><strong>&amp;Signature=</strong></strong></strong>****</p>
     */
    @NameInMap("DownloadLink")
    public String downloadLink;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetFailFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFailFileResponseBody self = new GetFailFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFailFileResponseBody setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
        return this;
    }
    public String getDownloadLink() {
        return this.downloadLink;
    }

    public GetFailFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
