// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateBlueprintInstanceHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateBlueprintInstanceHeaders build(java.util.Map<String, ?> map) throws Exception {
        CreateBlueprintInstanceHeaders self = new CreateBlueprintInstanceHeaders();
        return TeaModel.build(map, self);
    }

    public CreateBlueprintInstanceHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public CreateBlueprintInstanceHeaders setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
