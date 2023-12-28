// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class ConfirmAvatar2dTrainRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Confirm")
    public String confirm;

    @NameInMap("TenantId")
    public Long tenantId;

    public static ConfirmAvatar2dTrainRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAvatar2dTrainRequest self = new ConfirmAvatar2dTrainRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAvatar2dTrainRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfirmAvatar2dTrainRequest setConfirm(String confirm) {
        this.confirm = confirm;
        return this;
    }
    public String getConfirm() {
        return this.confirm;
    }

    public ConfirmAvatar2dTrainRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
