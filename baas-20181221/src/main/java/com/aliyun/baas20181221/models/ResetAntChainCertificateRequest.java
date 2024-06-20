// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetAntChainCertificateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pYogqb9v</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    public static ResetAntChainCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAntChainCertificateRequest self = new ResetAntChainCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ResetAntChainCertificateRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

}
