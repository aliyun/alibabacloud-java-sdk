// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509.models;

import com.aliyun.tea.*;

public class UpdateVCRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;did:mychain:xxx&quot;</p>
     */
    @NameInMap("IssuerDid")
    public String issuerDid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vc:mychain:xxx</p>
     */
    @NameInMap("VCId")
    public String VCId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;1&quot;</p>
     */
    @NameInMap("VCStatus")
    public String VCStatus;

    public static UpdateVCRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVCRequest self = new UpdateVCRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVCRequest setIssuerDid(String issuerDid) {
        this.issuerDid = issuerDid;
        return this;
    }
    public String getIssuerDid() {
        return this.issuerDid;
    }

    public UpdateVCRequest setVCId(String VCId) {
        this.VCId = VCId;
        return this;
    }
    public String getVCId() {
        return this.VCId;
    }

    public UpdateVCRequest setVCStatus(String VCStatus) {
        this.VCStatus = VCStatus;
        return this;
    }
    public String getVCStatus() {
        return this.VCStatus;
    }

}
