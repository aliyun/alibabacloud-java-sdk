// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcDataUploadResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("headers")
    public java.util.Map<String, ?> headers;

    @NameInMap("params")
    public java.util.Map<String, ?> params;

    @NameInMap("speed")
    public String speed;

    @NameInMap("totalBytes")
    public Long totalBytes;

    @NameInMap("totalTime")
    public Long totalTime;

    @NameInMap("url")
    public String url;

    public static RpcDataUploadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RpcDataUploadResponseBody self = new RpcDataUploadResponseBody();
        return TeaModel.build(map, self);
    }

    public RpcDataUploadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RpcDataUploadResponseBody setHeaders(java.util.Map<String, ?> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, ?> getHeaders() {
        return this.headers;
    }

    public RpcDataUploadResponseBody setParams(java.util.Map<String, ?> params) {
        this.params = params;
        return this;
    }
    public java.util.Map<String, ?> getParams() {
        return this.params;
    }

    public RpcDataUploadResponseBody setSpeed(String speed) {
        this.speed = speed;
        return this;
    }
    public String getSpeed() {
        return this.speed;
    }

    public RpcDataUploadResponseBody setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
        return this;
    }
    public Long getTotalBytes() {
        return this.totalBytes;
    }

    public RpcDataUploadResponseBody setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public Long getTotalTime() {
        return this.totalTime;
    }

    public RpcDataUploadResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
