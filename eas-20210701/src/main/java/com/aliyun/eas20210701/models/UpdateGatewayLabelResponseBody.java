// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateGatewayLabelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Succeed to update gateway gw-1uhcqmsc7x22****** labels.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateGatewayLabelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayLabelResponseBody self = new UpdateGatewayLabelResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayLabelResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateGatewayLabelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
