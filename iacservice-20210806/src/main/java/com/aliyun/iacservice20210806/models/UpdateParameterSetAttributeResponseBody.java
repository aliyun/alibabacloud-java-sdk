// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateParameterSetAttributeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>81CF7E18-D318-5670-9A4D-C08476BC4899</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateParameterSetAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateParameterSetAttributeResponseBody self = new UpdateParameterSetAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateParameterSetAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
