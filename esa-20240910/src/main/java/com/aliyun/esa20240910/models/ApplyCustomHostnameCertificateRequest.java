// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ApplyCustomHostnameCertificateRequest extends TeaModel {
    /**
     * <p>The ID of the SaaS domain name. Call the <a href="https://help.aliyun.com/document_detail/3018667.html">ListCustomHostnames</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("HostnameId")
    public Long hostnameId;

    public static ApplyCustomHostnameCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyCustomHostnameCertificateRequest self = new ApplyCustomHostnameCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ApplyCustomHostnameCertificateRequest setHostnameId(Long hostnameId) {
        this.hostnameId = hostnameId;
        return this;
    }
    public Long getHostnameId() {
        return this.hostnameId;
    }

}
