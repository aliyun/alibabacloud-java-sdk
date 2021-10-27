// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateFaceConfigRequest extends TeaModel {
    @NameInMap("BizName")
    @Validation(required = true)
    public String bizName;

    @NameInMap("BizType")
    @Validation(required = true)
    public String bizType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateFaceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFaceConfigRequest self = new CreateFaceConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateFaceConfigRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateFaceConfigRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CreateFaceConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateFaceConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
