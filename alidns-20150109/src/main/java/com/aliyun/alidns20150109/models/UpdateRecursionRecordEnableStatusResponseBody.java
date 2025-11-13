// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordEnableStatusResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRecursionRecordEnableStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordEnableStatusResponseBody self = new UpdateRecursionRecordEnableStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordEnableStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
