// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNatAclPageStatusRequest extends TeaModel {
    /**
     * <p>The language of the request and the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
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
