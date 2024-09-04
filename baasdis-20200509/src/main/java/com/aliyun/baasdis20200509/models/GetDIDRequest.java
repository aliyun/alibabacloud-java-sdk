// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class GetDIDRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>did:mychain:xxx</p>
     */
    @NameInMap("DID")
    public String DID;

    public static GetDIDRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDIDRequest self = new GetDIDRequest();
        return TeaModel.build(map, self);
    }

    public GetDIDRequest setDID(String DID) {
        this.DID = DID;
        return this;
    }
    public String getDID() {
        return this.DID;
    }

}
