// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <p>更新模板所需的配置信息</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public UpdateTemplateInput body;

    /**
     * <p>用于确保请求幂等性的唯一标识符</p>
     * 
     * <strong>example:</strong>
     * <p>clientToken</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setBody(UpdateTemplateInput body) {
        this.body = body;
        return this;
    }
    public UpdateTemplateInput getBody() {
        return this.body;
    }

    public UpdateTemplateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
