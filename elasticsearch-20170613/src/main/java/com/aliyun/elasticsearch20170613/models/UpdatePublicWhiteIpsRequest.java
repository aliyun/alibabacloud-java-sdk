// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdatePublicWhiteIpsRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The results that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("modifyMode")
    public String modifyMode;

    public static UpdatePublicWhiteIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePublicWhiteIpsRequest self = new UpdatePublicWhiteIpsRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePublicWhiteIpsRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public UpdatePublicWhiteIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePublicWhiteIpsRequest setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
        return this;
    }
    public String getModifyMode() {
        return this.modifyMode;
    }

}
