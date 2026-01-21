// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512.models;

import com.aliyun.tea.*;

public class GrantBsnCodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>456*******163</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>124*******345</p>
     */
    @NameInMap("GrantToAliuid")
    public Long grantToAliuid;

    @NameInMap("Notes")
    public String notes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1131-*******-233</p>
     */
    @NameInMap("Sn")
    public String sn;

    public static GrantBsnCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantBsnCodeRequest self = new GrantBsnCodeRequest();
        return TeaModel.build(map, self);
    }

    public GrantBsnCodeRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GrantBsnCodeRequest setGrantToAliuid(Long grantToAliuid) {
        this.grantToAliuid = grantToAliuid;
        return this;
    }
    public Long getGrantToAliuid() {
        return this.grantToAliuid;
    }

    public GrantBsnCodeRequest setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public GrantBsnCodeRequest setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

}
