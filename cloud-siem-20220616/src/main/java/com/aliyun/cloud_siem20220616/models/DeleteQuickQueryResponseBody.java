// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DeleteQuickQueryResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the saved search is deleted. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteQuickQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteQuickQueryResponseBody self = new DeleteQuickQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteQuickQueryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteQuickQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
