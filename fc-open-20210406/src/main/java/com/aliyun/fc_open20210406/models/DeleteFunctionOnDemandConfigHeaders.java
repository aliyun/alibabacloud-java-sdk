// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class DeleteFunctionOnDemandConfigHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("If-Match")
    public String ifMatch;

    public static DeleteFunctionOnDemandConfigHeaders build(java.util.Map<String, ?> map) throws Exception {
        DeleteFunctionOnDemandConfigHeaders self = new DeleteFunctionOnDemandConfigHeaders();
        return TeaModel.build(map, self);
    }

    public DeleteFunctionOnDemandConfigHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public DeleteFunctionOnDemandConfigHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

}
