// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatAclPageStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeNatAclPageStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatAclPageStatusRequest self = new DescribeNatAclPageStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNatAclPageStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
