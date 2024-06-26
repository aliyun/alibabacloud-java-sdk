// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateAntChainQRCodeAuthorizationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthorizationType")
    public String authorizationType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QRCodeType")
    public String QRCodeType;

    public static UpdateAntChainQRCodeAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainQRCodeAuthorizationRequest self = new UpdateAntChainQRCodeAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainQRCodeAuthorizationRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public UpdateAntChainQRCodeAuthorizationRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

    public UpdateAntChainQRCodeAuthorizationRequest setQRCodeType(String QRCodeType) {
        this.QRCodeType = QRCodeType;
        return this;
    }
    public String getQRCodeType() {
        return this.QRCodeType;
    }

}
