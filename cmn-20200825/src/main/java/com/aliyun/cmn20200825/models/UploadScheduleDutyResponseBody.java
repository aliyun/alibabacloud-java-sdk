// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UploadScheduleDutyResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UploadScheduleDutyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadScheduleDutyResponseBody self = new UploadScheduleDutyResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadScheduleDutyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
