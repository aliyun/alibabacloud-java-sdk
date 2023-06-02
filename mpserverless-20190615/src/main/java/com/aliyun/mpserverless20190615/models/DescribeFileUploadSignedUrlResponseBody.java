// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFileUploadSignedUrlResponseBody extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("OssCallbackUrl")
    public String ossCallbackUrl;

    @NameInMap("Overwrite")
    public Boolean overwrite;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SignUrl")
    public String signUrl;

    public static DescribeFileUploadSignedUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileUploadSignedUrlResponseBody self = new DescribeFileUploadSignedUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileUploadSignedUrlResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DescribeFileUploadSignedUrlResponseBody setOssCallbackUrl(String ossCallbackUrl) {
        this.ossCallbackUrl = ossCallbackUrl;
        return this;
    }
    public String getOssCallbackUrl() {
        return this.ossCallbackUrl;
    }

    public DescribeFileUploadSignedUrlResponseBody setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public DescribeFileUploadSignedUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFileUploadSignedUrlResponseBody setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

}
