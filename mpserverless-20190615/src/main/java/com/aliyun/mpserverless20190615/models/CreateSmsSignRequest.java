// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateSmsSignRequest extends TeaModel {
    @NameInMap("SignName")
    public String signName;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SpaceId")
    public String spaceId;

    public static CreateSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSignRequest self = new CreateSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateSmsSignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public CreateSmsSignRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
