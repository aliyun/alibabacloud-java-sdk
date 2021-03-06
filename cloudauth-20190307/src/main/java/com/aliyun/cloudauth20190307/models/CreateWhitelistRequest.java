// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateWhitelistRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("IdCardNum")
    @Validation(required = true)
    public String idCardNum;

    @NameInMap("ValidDay")
    @Validation(required = true)
    public String validDay;

    public static CreateWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWhitelistRequest self = new CreateWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public CreateWhitelistRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateWhitelistRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateWhitelistRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateWhitelistRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateWhitelistRequest setIdCardNum(String idCardNum) {
        this.idCardNum = idCardNum;
        return this;
    }
    public String getIdCardNum() {
        return this.idCardNum;
    }

    public CreateWhitelistRequest setValidDay(String validDay) {
        this.validDay = validDay;
        return this;
    }
    public String getValidDay() {
        return this.validDay;
    }

}
