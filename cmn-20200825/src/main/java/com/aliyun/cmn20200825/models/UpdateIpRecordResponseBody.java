// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateIpRecordResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateIpRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateIpRecordResponseBody self = new UpdateIpRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateIpRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
