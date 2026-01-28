// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class OneMetaDatabaseObject extends TeaModel {
    @NameInMap("ObjectName")
    public String objectName;

    @NameInMap("ObjectQualifiedName")
    public String objectQualifiedName;

    @NameInMap("ObjectType")
    public String objectType;

    public static OneMetaDatabaseObject build(java.util.Map<String, ?> map) throws Exception {
        OneMetaDatabaseObject self = new OneMetaDatabaseObject();
        return TeaModel.build(map, self);
    }

    public OneMetaDatabaseObject setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public OneMetaDatabaseObject setObjectQualifiedName(String objectQualifiedName) {
        this.objectQualifiedName = objectQualifiedName;
        return this;
    }
    public String getObjectQualifiedName() {
        return this.objectQualifiedName;
    }

    public OneMetaDatabaseObject setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
