// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationReferenceComponentsRequest extends TeaModel {
    @NameInMap("foundationReferenceUID")
    public String foundationReferenceUID;

    @NameInMap("foundationVersionUID")
    public String foundationVersionUID;

    @NameInMap("onlyEnabled")
    public Boolean onlyEnabled;

    @NameInMap("parentComponentReferenceUID")
    public String parentComponentReferenceUID;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static ListFoundationReferenceComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationReferenceComponentsRequest self = new ListFoundationReferenceComponentsRequest();
        return TeaModel.build(map, self);
    }

    public ListFoundationReferenceComponentsRequest setFoundationReferenceUID(String foundationReferenceUID) {
        this.foundationReferenceUID = foundationReferenceUID;
        return this;
    }
    public String getFoundationReferenceUID() {
        return this.foundationReferenceUID;
    }

    public ListFoundationReferenceComponentsRequest setFoundationVersionUID(String foundationVersionUID) {
        this.foundationVersionUID = foundationVersionUID;
        return this;
    }
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

    public ListFoundationReferenceComponentsRequest setOnlyEnabled(Boolean onlyEnabled) {
        this.onlyEnabled = onlyEnabled;
        return this;
    }
    public Boolean getOnlyEnabled() {
        return this.onlyEnabled;
    }

    public ListFoundationReferenceComponentsRequest setParentComponentReferenceUID(String parentComponentReferenceUID) {
        this.parentComponentReferenceUID = parentComponentReferenceUID;
        return this;
    }
    public String getParentComponentReferenceUID() {
        return this.parentComponentReferenceUID;
    }

    public ListFoundationReferenceComponentsRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
