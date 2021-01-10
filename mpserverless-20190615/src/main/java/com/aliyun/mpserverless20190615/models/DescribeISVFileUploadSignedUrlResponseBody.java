// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeISVFileUploadSignedUrlResponseBody extends TeaModel {
    @NameInMap("SignUrl")
    public String signUrl;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Id")
    public String id;

    public static DescribeISVFileUploadSignedUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeISVFileUploadSignedUrlResponseBody self = new DescribeISVFileUploadSignedUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeISVFileUploadSignedUrlResponseBody setSignUrl(String signUrl) {
        this.signUrl = signUrl;
        return this;
    }
    public String getSignUrl() {
        return this.signUrl;
    }

    public DescribeISVFileUploadSignedUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeISVFileUploadSignedUrlResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
