// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class GetCaInstanceCrlAddressRequest extends TeaModel {
    /**
     * <p>The identifier of the CA certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>1f0167b4-ee84-XXX-49bc4d39fa68</p>
     */
    @NameInMap("CaIdentifier")
    public String caIdentifier;

    /**
     * <p>The ID of the zone where the CAS instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>1f047318-0815-XXX-f7ceb76b5c0a</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static GetCaInstanceCrlAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCaInstanceCrlAddressRequest self = new GetCaInstanceCrlAddressRequest();
        return TeaModel.build(map, self);
    }

    public GetCaInstanceCrlAddressRequest setCaIdentifier(String caIdentifier) {
        this.caIdentifier = caIdentifier;
        return this;
    }
    public String getCaIdentifier() {
        return this.caIdentifier;
    }

    public GetCaInstanceCrlAddressRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
