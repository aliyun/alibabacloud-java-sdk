// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StopCloudRecordResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StopCloudRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopCloudRecordResponseBody self = new StopCloudRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public StopCloudRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopCloudRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
