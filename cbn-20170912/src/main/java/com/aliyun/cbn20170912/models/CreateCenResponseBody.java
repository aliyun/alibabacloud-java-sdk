// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenResponseBody extends TeaModel {
    @NameInMap("CenId")
    public String cenId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCenResponseBody self = new CreateCenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCenResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
