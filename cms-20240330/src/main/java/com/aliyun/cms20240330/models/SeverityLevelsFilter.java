// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class SeverityLevelsFilter extends TeaModel {
    /**
     * <p>Matches a log entry if its severity level appears in this array of strings.</p>
     */
    @NameInMap("contains")
    public java.util.List<String> contains;

    public static SeverityLevelsFilter build(java.util.Map<String, ?> map) throws Exception {
        SeverityLevelsFilter self = new SeverityLevelsFilter();
        return TeaModel.build(map, self);
    }

    public SeverityLevelsFilter setContains(java.util.List<String> contains) {
        this.contains = contains;
        return this;
    }
    public java.util.List<String> getContains() {
        return this.contains;
    }

}
