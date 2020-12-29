// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainMiniAppQRCodeAuthorizedUserRequest extends TeaModel {
    @NameInMap("AntChainId")
    public String antChainId;

    @NameInMap("Phone")
    public String phone;

    public static DeleteAntChainMiniAppQRCodeAuthorizedUserRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainMiniAppQRCodeAuthorizedUserRequest self = new DeleteAntChainMiniAppQRCodeAuthorizedUserRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainMiniAppQRCodeAuthorizedUserRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public DeleteAntChainMiniAppQRCodeAuthorizedUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
