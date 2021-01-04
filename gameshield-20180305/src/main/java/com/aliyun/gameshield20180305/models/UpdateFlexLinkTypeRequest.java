// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexLinkTypeRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("LinkType")
    public Integer linkType;

    public static UpdateFlexLinkTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexLinkTypeRequest self = new UpdateFlexLinkTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlexLinkTypeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateFlexLinkTypeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateFlexLinkTypeRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public UpdateFlexLinkTypeRequest setLinkType(Integer linkType) {
        this.linkType = linkType;
        return this;
    }
    public Integer getLinkType() {
        return this.linkType;
    }

}
