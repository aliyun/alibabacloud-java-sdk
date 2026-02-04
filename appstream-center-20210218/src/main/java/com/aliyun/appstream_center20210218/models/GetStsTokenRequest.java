// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetStsTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Alex</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("Expiration")
    public Long expiration;

    /**
     * <strong>example:</strong>
     * <p>Alex</p>
     */
    @NameInMap("ExternalId")
    public String externalId;

    public static GetStsTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStsTokenRequest self = new GetStsTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetStsTokenRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetStsTokenRequest setExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }
    public Long getExpiration() {
        return this.expiration;
    }

    public GetStsTokenRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
