// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class CreateUmengTokenRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("code")
    public String code;

    public static CreateUmengTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUmengTokenRequest self = new CreateUmengTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateUmengTokenRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

}
