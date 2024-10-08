// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBlockedRegionsRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh, en, and jp.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    public static DescribeDcdnBlockedRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBlockedRegionsRequest self = new DescribeDcdnBlockedRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBlockedRegionsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
