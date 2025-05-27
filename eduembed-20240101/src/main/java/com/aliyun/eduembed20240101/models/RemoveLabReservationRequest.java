// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class RemoveLabReservationRequest extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LabReservationId")
    public String labReservationId;

    public static RemoveLabReservationRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLabReservationRequest self = new RemoveLabReservationRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLabReservationRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public RemoveLabReservationRequest setLabReservationId(String labReservationId) {
        this.labReservationId = labReservationId;
        return this;
    }
    public String getLabReservationId() {
        return this.labReservationId;
    }

}
