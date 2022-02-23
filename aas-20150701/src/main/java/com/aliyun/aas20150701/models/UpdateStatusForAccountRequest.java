// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class UpdateStatusForAccountRequest extends TeaModel {
    @NameInMap("AccountStatus")
    public String accountStatus;

    @NameInMap("ChangeReason")
    public String changeReason;

    @NameInMap("PK")
    public String PK;

    public static UpdateStatusForAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateStatusForAccountRequest self = new UpdateStatusForAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateStatusForAccountRequest setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public UpdateStatusForAccountRequest setChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }
    public String getChangeReason() {
        return this.changeReason;
    }

    public UpdateStatusForAccountRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
