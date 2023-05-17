// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class VerifyIdTokenRequest extends TeaModel {
    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    /**
     * <p>jwtIdToken</p>
     */
    @NameInMap("JwtIdToken")
    public String jwtIdToken;

    public static VerifyIdTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyIdTokenRequest self = new VerifyIdTokenRequest();
        return TeaModel.build(map, self);
    }

    public VerifyIdTokenRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
    }

    public VerifyIdTokenRequest setJwtIdToken(String jwtIdToken) {
        this.jwtIdToken = jwtIdToken;
        return this;
    }
    public String getJwtIdToken() {
        return this.jwtIdToken;
    }

}
