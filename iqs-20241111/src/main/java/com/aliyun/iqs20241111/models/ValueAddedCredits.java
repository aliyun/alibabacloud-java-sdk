// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ValueAddedCredits extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("advanced")
    public Integer advanced;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("summary")
    public Integer summary;

    public static ValueAddedCredits build(java.util.Map<String, ?> map) throws Exception {
        ValueAddedCredits self = new ValueAddedCredits();
        return TeaModel.build(map, self);
    }

    public ValueAddedCredits setAdvanced(Integer advanced) {
        this.advanced = advanced;
        return this;
    }
    public Integer getAdvanced() {
        return this.advanced;
    }

    public ValueAddedCredits setSummary(Integer summary) {
        this.summary = summary;
        return this;
    }
    public Integer getSummary() {
        return this.summary;
    }

}
