// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceDataUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DownloadUrl")
    public String downloadUrl;

    public static DescribeGeoipInstanceDataUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceDataUrlResponseBody self = new DescribeGeoipInstanceDataUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceDataUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGeoipInstanceDataUrlResponseBody setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

}
