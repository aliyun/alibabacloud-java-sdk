// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateRecursionRecordResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>12*****</p>
     */
    @NameInMap("RecordId")
    public String recordId;

    /**
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRecursionRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRecursionRecordResponseBody self = new UpdateRecursionRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRecursionRecordResponseBody setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public UpdateRecursionRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
