// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateCcTunnelGrayAndOnlyAllowRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("OnlyAllow")
    public Integer onlyAllow;

    @NameInMap("Gray")
    public Integer gray;

    public static UpdateCcTunnelGrayAndOnlyAllowRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCcTunnelGrayAndOnlyAllowRequest self = new UpdateCcTunnelGrayAndOnlyAllowRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCcTunnelGrayAndOnlyAllowRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateCcTunnelGrayAndOnlyAllowRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateCcTunnelGrayAndOnlyAllowRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public UpdateCcTunnelGrayAndOnlyAllowRequest setOnlyAllow(Integer onlyAllow) {
        this.onlyAllow = onlyAllow;
        return this;
    }
    public Integer getOnlyAllow() {
        return this.onlyAllow;
    }

    public UpdateCcTunnelGrayAndOnlyAllowRequest setGray(Integer gray) {
        this.gray = gray;
        return this;
    }
    public Integer getGray() {
        return this.gray;
    }

}
