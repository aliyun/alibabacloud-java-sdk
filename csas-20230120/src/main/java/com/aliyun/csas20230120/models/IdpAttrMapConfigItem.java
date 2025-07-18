// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class IdpAttrMapConfigItem extends TeaModel {
    @NameInMap("Source")
    public String source;

    @NameInMap("Target")
    public String target;

    @NameInMap("TargetType")
    public String targetType;

    public static IdpAttrMapConfigItem build(java.util.Map<String, ?> map) throws Exception {
        IdpAttrMapConfigItem self = new IdpAttrMapConfigItem();
        return TeaModel.build(map, self);
    }

    public IdpAttrMapConfigItem setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public IdpAttrMapConfigItem setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public IdpAttrMapConfigItem setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

}
