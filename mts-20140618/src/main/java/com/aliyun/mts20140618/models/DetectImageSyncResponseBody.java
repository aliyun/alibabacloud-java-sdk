// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DetectImageSyncResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 返回结果
    @NameInMap("Result")
    public String result;

    // 请求状态
    @NameInMap("Status")
    public String status;

    // 返回信息
    @NameInMap("Message")
    public String message;

    public static DetectImageSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageSyncResponseBody self = new DetectImageSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectImageSyncResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public DetectImageSyncResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DetectImageSyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
