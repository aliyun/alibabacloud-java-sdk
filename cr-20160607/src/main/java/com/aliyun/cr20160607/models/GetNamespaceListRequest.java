// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetNamespaceListRequest extends TeaModel {
    @NameInMap("Authorize")
    public String authorize;

    @NameInMap("Status")
    public String status;

    public static GetNamespaceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceListRequest self = new GetNamespaceListRequest();
        return TeaModel.build(map, self);
    }

    public GetNamespaceListRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

    public GetNamespaceListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
