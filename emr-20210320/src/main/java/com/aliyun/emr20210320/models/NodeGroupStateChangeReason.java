// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class NodeGroupStateChangeReason extends TeaModel {
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

    public static NodeGroupStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
        NodeGroupStateChangeReason self = new NodeGroupStateChangeReason();
        return TeaModel.build(map, self);
    }

    public NodeGroupStateChangeReason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public NodeGroupStateChangeReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
