// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeApplicationStatisticsRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese. This is the default value.</li>
     * <li><strong>en</strong>: English.
     * This parameter determines whether the category names and technology type names are returned in Chinese or English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeApplicationStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationStatisticsRequest self = new DescribeApplicationStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
