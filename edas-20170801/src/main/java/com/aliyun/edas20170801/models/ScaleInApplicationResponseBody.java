// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleInApplicationResponseBody extends TeaModel {
    /**
     * <p>The ID of the change process for this operation. You can call the GetChangeOrderInfo operation to query the progress of this scale-in. For more information, see [GetChangeOrderInfo](~~62072~~). No ID is generated if the ForceStatus parameter is set to true. You can check whether the request is successful based on the value of the Code parameter.</p>
     */
    @NameInMap("ChangeOrderId")
    public String changeOrderId;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The message that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    public static ScaleInApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScaleInApplicationResponseBody self = new ScaleInApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ScaleInApplicationResponseBody setChangeOrderId(String changeOrderId) {
        this.changeOrderId = changeOrderId;
        return this;
    }
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public ScaleInApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ScaleInApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
