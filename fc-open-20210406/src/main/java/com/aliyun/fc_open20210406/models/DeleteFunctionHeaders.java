// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteFunctionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // 用于确保实际更改的资源和期望更改的资源是一致的，该值来自Create，Get和Update API的响应
    @NameInMap("If-Match")
    public String ifMatch;

    public static DeleteFunctionHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionHeaders self = new DeleteFunctionHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteFunctionHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

}
