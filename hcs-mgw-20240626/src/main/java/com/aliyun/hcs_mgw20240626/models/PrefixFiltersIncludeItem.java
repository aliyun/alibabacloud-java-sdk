// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class PrefixFiltersIncludeItem extends TeaModel {
    /**
     * <p>The full object key prefix. A maximum of 10,000 prefixes are supported by default, and each prefix can be up to 1,024 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>source-prefix/dir-a/</p>
     */
    @NameInMap("Prefix")
    public java.util.List<String> prefix;

    public static PrefixFiltersIncludeItem build(java.util.Map<String, ?> map) throws Exception {
        PrefixFiltersIncludeItem self = new PrefixFiltersIncludeItem();
        return TeaModel.build(map, self);
    }

    public PrefixFiltersIncludeItem setPrefix(java.util.List<String> prefix) {
        this.prefix = prefix;
        return this;
    }
    public java.util.List<String> getPrefix() {
        return this.prefix;
    }

}
