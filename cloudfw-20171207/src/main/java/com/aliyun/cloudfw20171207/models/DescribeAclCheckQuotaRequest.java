// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclCheckQuotaRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeAclCheckQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclCheckQuotaRequest self = new DescribeAclCheckQuotaRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAclCheckQuotaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
