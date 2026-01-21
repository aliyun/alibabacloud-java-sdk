// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bsn20150512.models;

import com.aliyun.tea.*;

public class GrantBsnCodeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>456*******163</p>
     */
    @NameInMap("AliUid")
    public Long aliUid;

    /**
     * <strong>example:</strong>
     * <p>124*******345</p>
     */
    @NameInMap("GrantToAliuid")
    public Long grantToAliuid;

    @NameInMap("Notes")
    public String notes;

    /**
     * <strong>example:</strong>
     * <p>FA30A2AF-9542-5927-9B73-2030F1A68DBF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1131-*******-233</p>
     */
    @NameInMap("Sn")
    public String sn;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GrantBsnCodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GrantBsnCodeResponseBody self = new GrantBsnCodeResponseBody();
        return TeaModel.build(map, self);
    }

    public GrantBsnCodeResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GrantBsnCodeResponseBody setGrantToAliuid(Long grantToAliuid) {
        this.grantToAliuid = grantToAliuid;
        return this;
    }
    public Long getGrantToAliuid() {
        return this.grantToAliuid;
    }

    public GrantBsnCodeResponseBody setNotes(String notes) {
        this.notes = notes;
        return this;
    }
    public String getNotes() {
        return this.notes;
    }

    public GrantBsnCodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GrantBsnCodeResponseBody setSn(String sn) {
        this.sn = sn;
        return this;
    }
    public String getSn() {
        return this.sn;
    }

    public GrantBsnCodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
