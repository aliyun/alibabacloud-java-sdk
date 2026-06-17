// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeSlsAnalyzeOpenStatusRequest extends TeaModel {
    /**
     * <p>The language of the response messages. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeSlsAnalyzeOpenStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsAnalyzeOpenStatusRequest self = new DescribeSlsAnalyzeOpenStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSlsAnalyzeOpenStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
