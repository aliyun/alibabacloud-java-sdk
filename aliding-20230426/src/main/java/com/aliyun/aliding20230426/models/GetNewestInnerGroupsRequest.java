// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNewestInnerGroupsRequest extends TeaModel {
    @NameInMap("Request")
    public java.util.Map<String, ?> request;

    public static GetNewestInnerGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNewestInnerGroupsRequest self = new GetNewestInnerGroupsRequest();
        return TeaModel.build(map, self);
    }

    public GetNewestInnerGroupsRequest setRequest(java.util.Map<String, ?> request) {
        this.request = request;
        return this;
    }
    public java.util.Map<String, ?> getRequest() {
        return this.request;
    }

}
