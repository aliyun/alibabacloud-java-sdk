// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AliyunUidWhiteListResponseBody extends TeaModel {
    @NameInMap("Exist")
    public String exist;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AliyunUidWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AliyunUidWhiteListResponseBody self = new AliyunUidWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public AliyunUidWhiteListResponseBody setExist(String exist) {
        this.exist = exist;
        return this;
    }
    public String getExist() {
        return this.exist;
    }

    public AliyunUidWhiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AliyunUidWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
