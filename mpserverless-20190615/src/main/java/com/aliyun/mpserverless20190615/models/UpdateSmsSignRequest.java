// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateSmsSignRequest extends TeaModel {
    @NameInMap("SignId")
    public String signId;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("SignName")
    public String signName;

    public static UpdateSmsSignRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmsSignRequest self = new UpdateSmsSignRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSmsSignRequest setSignId(String signId) {
        this.signId = signId;
        return this;
    }
    public String getSignId() {
        return this.signId;
    }

    public UpdateSmsSignRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateSmsSignRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public UpdateSmsSignRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
