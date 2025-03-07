// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaLiveInputResponseBody extends TeaModel {
    /**
     * <p>The ID of the input.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("InputId")
    public String inputId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateMediaLiveInputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaLiveInputResponseBody self = new CreateMediaLiveInputResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMediaLiveInputResponseBody setInputId(String inputId) {
        this.inputId = inputId;
        return this;
    }
    public String getInputId() {
        return this.inputId;
    }

    public CreateMediaLiveInputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
