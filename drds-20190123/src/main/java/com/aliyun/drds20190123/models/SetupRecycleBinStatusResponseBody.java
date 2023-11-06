// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class SetupRecycleBinStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the table recycle bin is enabled.</p>
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

    public static SetupRecycleBinStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetupRecycleBinStatusResponseBody self = new SetupRecycleBinStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetupRecycleBinStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SetupRecycleBinStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetupRecycleBinStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
