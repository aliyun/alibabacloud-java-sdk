// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDefaultIPSConfigRequest extends TeaModel {
    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default)</li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeDefaultIPSConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultIPSConfigRequest self = new DescribeDefaultIPSConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultIPSConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
