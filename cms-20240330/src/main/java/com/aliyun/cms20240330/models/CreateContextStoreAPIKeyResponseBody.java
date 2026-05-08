// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateContextStoreAPIKeyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("apiKey")
    public String apiKey;

    /**
     * <strong>example:</strong>
     * <p>Production Service Key</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>3B311FD9-A60B-55E0-A896-A0C73*********</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateContextStoreAPIKeyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContextStoreAPIKeyResponseBody self = new CreateContextStoreAPIKeyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContextStoreAPIKeyResponseBody setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public CreateContextStoreAPIKeyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContextStoreAPIKeyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
