// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class UpdateAccessKeyStatusForAccountRequest extends TeaModel {
    @NameInMap("AKId")
    public String AKId;

    @NameInMap("AKStatus")
    public String AKStatus;

    @NameInMap("PK")
    public String PK;

    public static UpdateAccessKeyStatusForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccessKeyStatusForAccountRequest self = new UpdateAccessKeyStatusForAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccessKeyStatusForAccountRequest setAKId(String AKId) {
        this.AKId = AKId;
        return this;
    }
    public String getAKId() {
        return this.AKId;
    }

    public UpdateAccessKeyStatusForAccountRequest setAKStatus(String AKStatus) {
        this.AKStatus = AKStatus;
        return this;
    }
    public String getAKStatus() {
        return this.AKStatus;
    }

    public UpdateAccessKeyStatusForAccountRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
