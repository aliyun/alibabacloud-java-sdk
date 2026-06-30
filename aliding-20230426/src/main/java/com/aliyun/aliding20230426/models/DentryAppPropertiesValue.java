// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DentryAppPropertiesValue extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Value")
    public String value;

    @NameInMap("Visibility")
    public String visibility;

    public static DentryAppPropertiesValue build(java.util.Map<String, ?> map) throws Exception {
        DentryAppPropertiesValue self = new DentryAppPropertiesValue();
        return TeaModel.build(map, self);
    }

    public DentryAppPropertiesValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DentryAppPropertiesValue setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public DentryAppPropertiesValue setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
