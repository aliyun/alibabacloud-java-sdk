// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class WaIdPermissions extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsBasicChild")
    public Boolean isBasicChild;

    @NameInMap("Name")
    public String name;

    @NameInMap("SubPermissions")
    public java.util.List<WaIdPermissions> subPermissions;

    @NameInMap("Type")
    public String type;

    public static WaIdPermissions build(java.util.Map<String, ?> map) throws Exception {
        WaIdPermissions self = new WaIdPermissions();
        return TeaModel.build(map, self);
    }

    public WaIdPermissions setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public WaIdPermissions setIsBasicChild(Boolean isBasicChild) {
        this.isBasicChild = isBasicChild;
        return this;
    }
    public Boolean getIsBasicChild() {
        return this.isBasicChild;
    }

    public WaIdPermissions setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public WaIdPermissions setSubPermissions(java.util.List<WaIdPermissions> subPermissions) {
        this.subPermissions = subPermissions;
        return this;
    }
    public java.util.List<WaIdPermissions> getSubPermissions() {
        return this.subPermissions;
    }

    public WaIdPermissions setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
