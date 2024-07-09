// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeBlockedRegionsRequest extends TeaModel {
    /**
     * <p>The language. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: simplified Chinese</li>
     * <li><strong>en</strong>: English</li>
     * <li><strong>jp</strong>: Japanese</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    public static DescribeBlockedRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockedRegionsRequest self = new DescribeBlockedRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockedRegionsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
