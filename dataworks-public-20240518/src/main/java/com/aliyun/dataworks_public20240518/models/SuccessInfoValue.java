// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class SuccessInfoValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Message")
    public String message;

    public static SuccessInfoValue build(java.util.Map<String, ?> map) throws Exception {
        SuccessInfoValue self = new SuccessInfoValue();
        return TeaModel.build(map, self);
    }

    public SuccessInfoValue setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SuccessInfoValue setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
