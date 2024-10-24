// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class AttachEaisEiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>i-bp14ws9hbt1oe0u9****</p>
     */
    @NameInMap("ClientInstanceId")
    public String clientInstanceId;

    /**
     * <strong>example:</strong>
     * <p>eais-hzu00xufs1c8j5nn****</p>
     */
    @NameInMap("EiInstanceId")
    public String eiInstanceId;

    /**
     * <strong>example:</strong>
     * <p>C3BCB7DA-BEB6-4982-A765-6EA61EC8****</p>
     */
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
