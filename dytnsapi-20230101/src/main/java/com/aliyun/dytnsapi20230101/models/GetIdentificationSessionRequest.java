// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetIdentificationSessionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    public static GetIdentificationSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdentificationSessionRequest self = new GetIdentificationSessionRequest();
        return TeaModel.build(map, self);
    }

    public GetIdentificationSessionRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
