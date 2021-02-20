// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class AddOrgWebPathsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddOrgWebPathsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddOrgWebPathsResponseBody self = new AddOrgWebPathsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddOrgWebPathsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
