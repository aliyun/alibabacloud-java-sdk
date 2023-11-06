// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class FlashbackRecycleBinTableResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the deleted logical table is restored.</p>
     */
    @NameInMap("Data")
    public Boolean data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FlashbackRecycleBinTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlashbackRecycleBinTableResponseBody self = new FlashbackRecycleBinTableResponseBody();
        return TeaModel.build(map, self);
    }

    public FlashbackRecycleBinTableResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public FlashbackRecycleBinTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlashbackRecycleBinTableResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
