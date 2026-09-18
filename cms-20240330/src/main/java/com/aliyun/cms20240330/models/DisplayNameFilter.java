// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DisplayNameFilter extends TeaModel {
    /**
     * <p>The inclusion keyword for the display name. Only alert rules whose display names contain this keyword are returned. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU monitoring</p>
     */
    @NameInMap("contains")
    public String contains;

    /**
     * <p>The exclusion keyword for the display name. Alert rules whose display names contain this keyword are excluded. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ARM</p>
     */
    @NameInMap("notContains")
    public String notContains;

    public static DisplayNameFilter build(java.util.Map<String, ?> map) throws Exception {
        DisplayNameFilter self = new DisplayNameFilter();
        return TeaModel.build(map, self);
    }

    public DisplayNameFilter setContains(String contains) {
        this.contains = contains;
        return this;
    }
    public String getContains() {
        return this.contains;
    }

    public DisplayNameFilter setNotContains(String notContains) {
        this.notContains = notContains;
        return this;
    }
    public String getNotContains() {
        return this.notContains;
    }

}
