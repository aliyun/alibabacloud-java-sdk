// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // 用于确保实际更改的资源和期望更改的资源是一致的，该值来自Create，Get和Update API的响应
    @NameInMap("If-Match")
    public String ifMatch;

    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    public static UpdateTriggerHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerHeaders self = new UpdateTriggerHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateTriggerHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public UpdateTriggerHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

}
