// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class OperationStateChangeReason extends TeaModel {
    /**
     * <p>状态码。</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>状态变化信息。</p>
     */
    @NameInMap("Message")
    public String message;

    public static OperationStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
        OperationStateChangeReason self = new OperationStateChangeReason();
        return TeaModel.build(map, self);
    }

    public OperationStateChangeReason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OperationStateChangeReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
