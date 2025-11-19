// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteTemplateResult extends TeaModel {
    /**
     * <p>SUCCESS 为成功</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Template data;

    /**
     * <p>唯一的请求标识符，用于问题追踪</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteTemplateResult build(java.util.Map<String, ?> map) throws Exception {
        DeleteTemplateResult self = new DeleteTemplateResult();
        return TeaModel.build(map, self);
    }

    public DeleteTemplateResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteTemplateResult setData(Template data) {
        this.data = data;
        return this;
    }
    public Template getData() {
        return this.data;
    }

    public DeleteTemplateResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
