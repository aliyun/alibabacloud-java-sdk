// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.metastore20241012.models;

import com.aliyun.tea.*;

public class AccessTypeDef extends TeaModel {
    @NameInMap("ImpliedGrants")
    public java.util.List<String> impliedGrants;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("Label")
    public String label;

    @NameInMap("Name")
    public String name;

    @NameInMap("RbKeyLabel")
    public String rbKeyLabel;

    public static AccessTypeDef build(java.util.Map<String, ?> map) throws Exception {
        AccessTypeDef self = new AccessTypeDef();
        return TeaModel.build(map, self);
    }

    public AccessTypeDef setImpliedGrants(java.util.List<String> impliedGrants) {
        this.impliedGrants = impliedGrants;
        return this;
    }
    public java.util.List<String> getImpliedGrants() {
        return this.impliedGrants;
    }

    public AccessTypeDef setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public AccessTypeDef setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public AccessTypeDef setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AccessTypeDef setRbKeyLabel(String rbKeyLabel) {
        this.rbKeyLabel = rbKeyLabel;
        return this;
    }
    public String getRbKeyLabel() {
        return this.rbKeyLabel;
    }

}
