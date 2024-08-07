// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class StateChangeReason extends TeaModel {
    /**
     * <p>状态码。</p>
     * 
     * <strong>example:</strong>
     * <p>MissingParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>描述信息。</p>
     * 
     * <strong>example:</strong>
     * <p>The instance type is required.</p>
     */
    @NameInMap("Message")
    public String message;

    public static StateChangeReason build(java.util.Map<String, ?> map) throws Exception {
        StateChangeReason self = new StateChangeReason();
        return TeaModel.build(map, self);
    }

    public StateChangeReason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StateChangeReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
