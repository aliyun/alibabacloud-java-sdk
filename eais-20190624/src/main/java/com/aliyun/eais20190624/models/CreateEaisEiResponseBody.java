// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class CreateEaisEiResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eais-hzu00xufs1c8j5nn****</p>
     */
    @NameInMap("EiInstanceId")
    public String eiInstanceId;

    /**
     * <strong>example:</strong>
     * <p>F5FEB9AA-C108-577C-AB3D-D13524AF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEaisEiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEaisEiResponseBody self = new CreateEaisEiResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEaisEiResponseBody setEiInstanceId(String eiInstanceId) {
        this.eiInstanceId = eiInstanceId;
        return this;
    }
    public String getEiInstanceId() {
        return this.eiInstanceId;
    }

    public CreateEaisEiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
