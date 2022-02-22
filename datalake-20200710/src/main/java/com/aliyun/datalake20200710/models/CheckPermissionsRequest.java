// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CheckPermissionsRequest extends TeaModel {
    @NameInMap("Body")
    public AccessRequest body;

    public static CheckPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckPermissionsRequest self = new CheckPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public CheckPermissionsRequest setBody(AccessRequest body) {
        this.body = body;
        return this;
    }
    public AccessRequest getBody() {
        return this.body;
    }

}
