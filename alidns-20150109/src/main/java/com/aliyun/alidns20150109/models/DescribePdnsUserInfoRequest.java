// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsUserInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribePdnsUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsUserInfoRequest self = new DescribePdnsUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribePdnsUserInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
