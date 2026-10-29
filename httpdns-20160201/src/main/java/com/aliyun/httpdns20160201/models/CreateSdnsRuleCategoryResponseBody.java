// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.httpdns20160201.models;

import com.aliyun.tea.*;

public class CreateSdnsRuleCategoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the policy created and saved in this request. This ID is consistent with the ID in the list and details, and is used for querying, updating, enabling, disabling, and deleting the policy. The ID is saved as a string to avoid precision loss of large integers.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789012345678</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the request. This ID is used to troubleshoot call issues and is not the policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>50F9C40E-188D-4208-BE2C-74271337****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSdnsRuleCategoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSdnsRuleCategoryResponseBody self = new CreateSdnsRuleCategoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSdnsRuleCategoryResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateSdnsRuleCategoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
