// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeModelOperatorApiKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>QEDGOTAJOG</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ApiKeyId")
    public Integer apiKeyId;

    /**
     * <strong>example:</strong>
     * <p>2026-06-01T00:00:00Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>test-apikey</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxx">https://xxxx</a></p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeModelOperatorApiKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeModelOperatorApiKeyResponseBody self = new DescribeModelOperatorApiKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeModelOperatorApiKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DescribeModelOperatorApiKeyResponseBody setApiKeyId(Integer apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }
    public Integer getApiKeyId() {
        return this.apiKeyId;
    }

    public DescribeModelOperatorApiKeyResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeModelOperatorApiKeyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeModelOperatorApiKeyResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public DescribeModelOperatorApiKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
