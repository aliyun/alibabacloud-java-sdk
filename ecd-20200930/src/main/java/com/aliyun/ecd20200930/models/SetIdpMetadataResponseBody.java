// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetIdpMetadataResponseBody extends TeaModel {
    @NameInMap("IdpEntityId")
    public String idpEntityId;

    @NameInMap("RequestId")
    public String requestId;

    public static SetIdpMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetIdpMetadataResponseBody self = new SetIdpMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public SetIdpMetadataResponseBody setIdpEntityId(String idpEntityId) {
        this.idpEntityId = idpEntityId;
        return this;
    }
    public String getIdpEntityId() {
        return this.idpEntityId;
    }

    public SetIdpMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
