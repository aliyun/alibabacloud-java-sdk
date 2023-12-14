// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SaveQuickQueryResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the query statement is saved as a saved search. Valid values:</p>
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

    public static SaveQuickQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveQuickQueryResponseBody self = new SaveQuickQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveQuickQueryResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SaveQuickQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
