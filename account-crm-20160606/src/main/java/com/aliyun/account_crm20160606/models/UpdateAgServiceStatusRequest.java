// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateAgServiceStatusRequest extends TeaModel {
    @NameInMap("AgAccountType")
    public String agAccountType;

    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("Status")
    public String status;

    public static UpdateAgServiceStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgServiceStatusRequest self = new UpdateAgServiceStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgServiceStatusRequest setAgAccountType(String agAccountType) {
        this.agAccountType = agAccountType;
        return this;
    }
    public String getAgAccountType() {
        return this.agAccountType;
    }

    public UpdateAgServiceStatusRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public UpdateAgServiceStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
