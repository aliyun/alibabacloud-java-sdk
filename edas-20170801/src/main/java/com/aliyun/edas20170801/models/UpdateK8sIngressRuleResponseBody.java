// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sIngressRuleResponseBody extends TeaModel {
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

    public static UpdateK8sIngressRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sIngressRuleResponseBody self = new UpdateK8sIngressRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateK8sIngressRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateK8sIngressRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
