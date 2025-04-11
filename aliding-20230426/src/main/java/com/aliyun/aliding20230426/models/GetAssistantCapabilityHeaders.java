// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetAssistantCapabilityHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("accountId")
    public String accountId;

    public static GetAssistantCapabilityHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetAssistantCapabilityHeaders self = new GetAssistantCapabilityHeaders();
        return TeaModel.build(map, self);
    }

    public GetAssistantCapabilityHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetAssistantCapabilityHeaders setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
