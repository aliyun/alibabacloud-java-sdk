// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.educloud20220202.models;

import com.aliyun.tea.*;

public class GetLabTokenRequest extends TeaModel {
    @NameInMap("AccountTagCode")
    public String accountTagCode;

    @NameInMap("LabId")
    public String labId;

    @NameInMap("RamUid")
    public String ramUid;

    public static GetLabTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLabTokenRequest self = new GetLabTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetLabTokenRequest setAccountTagCode(String accountTagCode) {
        this.accountTagCode = accountTagCode;
        return this;
    }
    public String getAccountTagCode() {
        return this.accountTagCode;
    }

    public GetLabTokenRequest setLabId(String labId) {
        this.labId = labId;
        return this;
    }
    public String getLabId() {
        return this.labId;
    }

    public GetLabTokenRequest setRamUid(String ramUid) {
        this.ramUid = ramUid;
        return this;
    }
    public String getRamUid() {
        return this.ramUid;
    }

}
