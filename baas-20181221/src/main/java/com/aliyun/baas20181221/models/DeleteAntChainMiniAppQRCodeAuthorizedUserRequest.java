// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainMiniAppQRCodeAuthorizedUserRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bDXK6boZ</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1380013****</p>
     */
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
