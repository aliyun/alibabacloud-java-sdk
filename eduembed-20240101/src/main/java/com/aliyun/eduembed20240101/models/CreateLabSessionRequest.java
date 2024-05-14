// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class CreateLabSessionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("LabId")
    public Long labId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RamAccountId")
    public Long ramAccountId;

    public static CreateLabSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLabSessionRequest self = new CreateLabSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateLabSessionRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public CreateLabSessionRequest setLabId(Long labId) {
        this.labId = labId;
        return this;
    }
    public Long getLabId() {
        return this.labId;
    }

    public CreateLabSessionRequest setRamAccountId(Long ramAccountId) {
        this.ramAccountId = ramAccountId;
        return this;
    }
    public Long getRamAccountId() {
        return this.ramAccountId;
    }

}
