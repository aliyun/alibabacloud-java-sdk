// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteSAMLProviderRequest extends TeaModel {
    /**
     * <p>The name of the IdP that you want to delete.</p>
     */
    @NameInMap("SAMLProviderName")
    public String SAMLProviderName;

    public static DeleteSAMLProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSAMLProviderRequest self = new DeleteSAMLProviderRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSAMLProviderRequest setSAMLProviderName(String SAMLProviderName) {
        this.SAMLProviderName = SAMLProviderName;
        return this;
    }
    public String getSAMLProviderName() {
        return this.SAMLProviderName;
    }

}
