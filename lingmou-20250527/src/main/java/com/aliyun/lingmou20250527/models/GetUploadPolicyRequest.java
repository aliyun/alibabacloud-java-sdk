// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetUploadPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Token</p>
     */
    @NameInMap("jwtToken")
    public String jwtToken;

    /**
     * <strong>example:</strong>
     * <p>INPUT_CHAT_BACKGROUND_PIC</p>
     */
    @NameInMap("type")
    public String type;

    public static GetUploadPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadPolicyRequest self = new GetUploadPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadPolicyRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public GetUploadPolicyRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
