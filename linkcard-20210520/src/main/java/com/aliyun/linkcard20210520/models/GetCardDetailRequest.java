// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardDetailRequest extends TeaModel {
    @NameInMap("DestroyCard")
    public Boolean destroyCard;

    @NameInMap("Iccid")
    public String iccid;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ShowPsim")
    public Boolean showPsim;

    public static GetCardDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardDetailRequest self = new GetCardDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetCardDetailRequest setDestroyCard(Boolean destroyCard) {
        this.destroyCard = destroyCard;
        return this;
    }
    public Boolean getDestroyCard() {
        return this.destroyCard;
    }

    public GetCardDetailRequest setIccid(String iccid) {
        this.iccid = iccid;
        return this;
    }
    public String getIccid() {
        return this.iccid;
    }

    public GetCardDetailRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCardDetailRequest setShowPsim(Boolean showPsim) {
        this.showPsim = showPsim;
        return this;
    }
    public Boolean getShowPsim() {
        return this.showPsim;
    }

}
