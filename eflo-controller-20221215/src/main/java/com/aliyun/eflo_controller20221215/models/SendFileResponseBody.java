// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class SendFileResponseBody extends TeaModel {
    /**
     * <p>The ID of the execution.</p>
     * 
     * <strong>example:</strong>
     * <p>t-hz03la52z1zkvls</p>
     */
    @NameInMap("InvokeId")
    public String invokeId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3C683243-7915-57FB-9570-A2932C1C0F78</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendFileResponseBody self = new SendFileResponseBody();
        return TeaModel.build(map, self);
    }

    public SendFileResponseBody setInvokeId(String invokeId) {
        this.invokeId = invokeId;
        return this;
    }
    public String getInvokeId() {
        return this.invokeId;
    }

    public SendFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
