// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class CreatePdnsAppKeyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Remark")
    public String remark;

    public static CreatePdnsAppKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePdnsAppKeyRequest self = new CreatePdnsAppKeyRequest();
        return TeaModel.build(map, self);
    }

    public CreatePdnsAppKeyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreatePdnsAppKeyRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
