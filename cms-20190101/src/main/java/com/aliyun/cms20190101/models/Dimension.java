// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class Dimension extends TeaModel {
    /**
     * <p>The name of the metric dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>instanceId</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The value of the metric dimension.</p>
     * 
     * <strong>example:</strong>
     * <p>i-dferwret*****</p>
     */
    @NameInMap("Value")
    public String value;

    public static Dimension build(java.util.Map<String, ?> map) throws Exception {
        Dimension self = new Dimension();
        return TeaModel.build(map, self);
    }

    public Dimension setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public Dimension setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
