// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCustomAttributeResponseBody extends TeaModel {
    @NameInMap("CustomAttribute")
    public CustomAttribute customAttribute;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BA51C9E6-0CBC-5BB9-92BD-0C4FE66E1717</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCustomAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomAttributeResponseBody self = new GetCustomAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomAttributeResponseBody setCustomAttribute(CustomAttribute customAttribute) {
        this.customAttribute = customAttribute;
        return this;
    }
    public CustomAttribute getCustomAttribute() {
        return this.customAttribute;
    }

    public GetCustomAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomAttributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
