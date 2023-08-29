// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class StartCloudRecordResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static StartCloudRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartCloudRecordResponseBody self = new StartCloudRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public StartCloudRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StartCloudRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
