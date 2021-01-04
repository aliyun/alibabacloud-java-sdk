// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcUseRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("ActionType")
    public String actionType;

    @NameInMap("CcQps")
    public Integer ccQps;

    public static UpdateCcUseRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcUseRequest self = new UpdateCcUseRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCcUseRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateCcUseRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateCcUseRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public UpdateCcUseRequest setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public UpdateCcUseRequest setCcQps(Integer ccQps) {
        this.ccQps = ccQps;
        return this;
    }
    public Integer getCcQps() {
        return this.ccQps;
    }

}
