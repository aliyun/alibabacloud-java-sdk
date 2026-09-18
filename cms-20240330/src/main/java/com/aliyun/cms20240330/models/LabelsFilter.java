// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class LabelsFilter extends TeaModel {
    /**
     * <p>Match all labels (AND).</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;production&quot;},{&quot;key&quot;:&quot;team&quot;,&quot;value&quot;:&quot;ops&quot;}]</p>
     */
    @NameInMap("allOf")
    public java.util.List<LabelMatcher> allOf;

    /**
     * <p>Match any label (OR).</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;production&quot;},{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;:&quot;staging&quot;}]</p>
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
