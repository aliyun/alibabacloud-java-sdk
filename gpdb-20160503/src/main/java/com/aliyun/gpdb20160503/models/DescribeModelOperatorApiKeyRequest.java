// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorApiKeyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApiKeyId")
    public Integer apiKeyId;

    public static DescribeModelOperatorApiKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorApiKeyRequest self = new DescribeModelOperatorApiKeyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorApiKeyRequest setApiKeyId(Integer apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Integer getApiKeyId() {
        return this.apiKeyId;
    }

}
