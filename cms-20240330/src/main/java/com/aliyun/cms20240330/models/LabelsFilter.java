// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class LabelsFilter extends TeaModel {
    /**
     * <p>An array of <code>LabelMatcher</code> requirements. An object is selected only if it satisfies all of the requirements in this list (a logical AND). If provided, the list cannot be empty.</p>
     */
    @NameInMap("allOf")
    public java.util.List<LabelMatcher> allOf;

    /**
     * <p>An array of <code>LabelMatcher</code> requirements. An object is selected if it satisfies at least one of the requirements in this list (a logical OR). If provided, the list cannot be empty.</p>
     */
    @NameInMap("anyOf")
    public java.util.List<LabelMatcher> anyOf;

    public static LabelsFilter build(java.util.Map<String, ?> map) throws Exception {
        LabelsFilter self = new LabelsFilter();
        return TeaModel.build(map, self);
    }

    public LabelsFilter setAllOf(java.util.List<LabelMatcher> allOf) {
        this.allOf = allOf;
        return this;
    }
    public java.util.List<LabelMatcher> getAllOf() {
        return this.allOf;
    }

    public LabelsFilter setAnyOf(java.util.List<LabelMatcher> anyOf) {
        this.anyOf = anyOf;
        return this;
    }
    public java.util.List<LabelMatcher> getAnyOf() {
        return this.anyOf;
    }

}
