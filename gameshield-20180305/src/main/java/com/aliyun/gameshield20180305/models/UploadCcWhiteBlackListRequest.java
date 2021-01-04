// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UploadCcWhiteBlackListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizId")
    public Long bizId;

    @NameInMap("BWList")
    public String BWList;

    public static UploadCcWhiteBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCcWhiteBlackListRequest self = new UploadCcWhiteBlackListRequest();
        return TeaModel.build(map, self);
    }

    public UploadCcWhiteBlackListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UploadCcWhiteBlackListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UploadCcWhiteBlackListRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public UploadCcWhiteBlackListRequest setBWList(String BWList) {
        this.BWList = BWList;
        return this;
    }
    public String getBWList() {
        return this.BWList;
    }

}
