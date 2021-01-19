// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetNamespaceListRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("Authorize")
    public String authorize;

    public static GetNamespaceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceListRequest self = new GetNamespaceListRequest();
        return TeaModel.build(map, self);
    }

    public GetNamespaceListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetNamespaceListRequest setAuthorize(String authorize) {
        this.authorize = authorize;
        return this;
    }
    public String getAuthorize() {
        return this.authorize;
    }

}
