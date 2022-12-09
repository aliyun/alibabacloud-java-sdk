// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnAclFieldsRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeDcdnAclFieldsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnAclFieldsRequest self = new DescribeDcdnAclFieldsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnAclFieldsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
