// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class GetManagerInfoByAuthCodeRequest extends TeaModel {
    /**
     * <p>The authorization code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e49cd070452f0044813a467d4743****</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    public static GetManagerInfoByAuthCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetManagerInfoByAuthCodeRequest self = new GetManagerInfoByAuthCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetManagerInfoByAuthCodeRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

}
