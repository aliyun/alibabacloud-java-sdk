// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteCollectorResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the shipper is deleted. Valid values:</p>
     * <br>
     * <p>*   true: The shipper is deleted.</p>
     * <p>*   false: The shipper fails to be deleted.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeleteCollectorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectorResponseBody self = new DeleteCollectorResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCollectorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCollectorResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
