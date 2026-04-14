// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class CreateStackResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>79284133-D4BA-56B3-954C-D538256F7EAA</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>stack-as1d4vld898ppnqbxxxxx</p>
     */
    @NameInMap("stackId")
    public String stackId;

    public static CreateStackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStackResponseBody self = new CreateStackResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStackResponseBody setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

}
