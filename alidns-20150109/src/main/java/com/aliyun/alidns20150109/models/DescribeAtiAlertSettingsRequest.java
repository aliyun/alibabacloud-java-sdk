// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiAlertSettingsRequest extends TeaModel {
    /**
     * <p>The token that ensures the idempotence of the request. Generate a unique value from your client. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhbGciOiJIUzI1NiIsInR5cC.....</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    public static DescribeAtiAlertSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiAlertSettingsRequest self = new DescribeAtiAlertSettingsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAtiAlertSettingsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
