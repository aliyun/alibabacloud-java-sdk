// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyElasticBizQpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyElasticBizQpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyElasticBizQpsResponseBody self = new ModifyElasticBizQpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyElasticBizQpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
