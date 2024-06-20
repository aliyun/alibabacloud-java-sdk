// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class ResetAntChainUserCertificateRequest extends TeaModel {
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
     * <p>uid-128712635330****</p>
     */
    @NameInMap("Username")
    public String username;

    public static ResetAntChainUserCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAntChainUserCertificateRequest self = new ResetAntChainUserCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ResetAntChainUserCertificateRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ResetAntChainUserCertificateRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
