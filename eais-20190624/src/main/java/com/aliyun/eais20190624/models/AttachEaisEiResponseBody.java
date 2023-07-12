// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class AttachEaisEiResponseBody extends TeaModel {
    @NameInMap("ClientInstanceId")
    public String clientInstanceId;

    @NameInMap("EiInstanceId")
    public String eiInstanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static AttachEaisEiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachEaisEiResponseBody self = new AttachEaisEiResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachEaisEiResponseBody setClientInstanceId(String clientInstanceId) {
        this.clientInstanceId = clientInstanceId;
        return this;
    }
    public String getClientInstanceId() {
        return this.clientInstanceId;
    }

    public AttachEaisEiResponseBody setEiInstanceId(String eiInstanceId) {
        this.eiInstanceId = eiInstanceId;
        return this;
    }
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    public AttachEaisEiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
