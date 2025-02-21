// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateUserAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    @Deprecated
    public Boolean data;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateUserAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserAttributeResponseBody self = new UpdateUserAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public UpdateUserAttributeResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateUserAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
