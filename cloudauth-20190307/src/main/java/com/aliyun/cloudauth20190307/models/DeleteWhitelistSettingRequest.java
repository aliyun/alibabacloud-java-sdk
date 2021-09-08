// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteWhitelistSettingRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("Ids")
    public String ids;

    public static DeleteWhitelistSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWhitelistSettingRequest self = new DeleteWhitelistSettingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWhitelistSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteWhitelistSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteWhitelistSettingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DeleteWhitelistSettingRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

}
