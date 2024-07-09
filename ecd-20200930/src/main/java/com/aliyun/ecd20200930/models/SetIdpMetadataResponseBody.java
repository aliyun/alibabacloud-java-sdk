// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetIdpMetadataResponseBody extends TeaModel {
    /**
     * <p>The entity ID obtained after the IdP metadata file is parsed.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://test****.cn/adfs/services/trust">http://test****.cn/adfs/services/trust</a></p>
     */
    @NameInMap("IdpEntityId")
    public String idpEntityId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetIdpMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetIdpMetadataResponseBody self = new SetIdpMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public SetIdpMetadataResponseBody setIdpEntityId(String idpEntityId) {
        this.idpEntityId = idpEntityId;
        return this;
    }
    public String getIdpEntityId() {
        return this.idpEntityId;
    }

    public SetIdpMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
