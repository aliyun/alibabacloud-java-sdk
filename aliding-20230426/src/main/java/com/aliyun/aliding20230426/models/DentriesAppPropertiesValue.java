// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DentriesAppPropertiesValue extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static DentriesAppPropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        DentriesAppPropertiesValue self = new DentriesAppPropertiesValue();
        return TeaModel.build(map, self);
    }

    public DentriesAppPropertiesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DentriesAppPropertiesValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DentriesAppPropertiesValue setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
