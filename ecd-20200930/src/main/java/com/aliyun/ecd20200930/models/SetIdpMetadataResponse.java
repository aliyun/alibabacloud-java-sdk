// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetIdpMetadataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IdpEntityId")
    @Validation(required = true)
    public String idpEntityId;

    public static SetIdpMetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        SetIdpMetadataResponse self = new SetIdpMetadataResponse();
        return TeaModel.build(map, self);
    }

    public SetIdpMetadataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetIdpMetadataResponse setIdpEntityId(String idpEntityId) {
        this.idpEntityId = idpEntityId;
        return this;
    }
    public String getIdpEntityId() {
        return this.idpEntityId;
    }

}
