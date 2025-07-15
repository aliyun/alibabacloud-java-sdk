// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeRtcCloudRecordingFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRtcCloudRecordingFilesResponseBody body;

    public static DescribeRtcCloudRecordingFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcCloudRecordingFilesResponse self = new DescribeRtcCloudRecordingFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRtcCloudRecordingFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRtcCloudRecordingFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRtcCloudRecordingFilesResponse setBody(DescribeRtcCloudRecordingFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRtcCloudRecordingFilesResponseBody getBody() {
        return this.body;
    }

}
