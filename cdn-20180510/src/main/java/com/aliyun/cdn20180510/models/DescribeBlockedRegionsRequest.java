// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeBlockedRegionsRequest extends TeaModel {
    /**
     * <p>The language. Valid values:</p>
     * <br>
     * <p>*   **zh**: simplified Chinese</p>
     * <p>*   **en**: English</p>
     * <p>*   **jp**: Japanese</p>
     * <br>
     * <p>This parameter is required.</p>
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
