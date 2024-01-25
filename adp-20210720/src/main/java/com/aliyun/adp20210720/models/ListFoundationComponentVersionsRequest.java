// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListFoundationComponentVersionsRequest extends TeaModel {
    @NameInMap("onlyEnabled")
    public Boolean onlyEnabled;

    @NameInMap("parentComponentRelationUID")
    public String parentComponentRelationUID;

    public static ListFoundationComponentVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFoundationComponentVersionsRequest self = new ListFoundationComponentVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListFoundationComponentVersionsRequest setOnlyEnabled(Boolean onlyEnabled) {
        this.onlyEnabled = onlyEnabled;
        return this;
    }
    public Boolean getOnlyEnabled() {
        return this.onlyEnabled;
    }

    public ListFoundationComponentVersionsRequest setParentComponentRelationUID(String parentComponentRelationUID) {
        this.parentComponentRelationUID = parentComponentRelationUID;
        return this;
    }
    public String getParentComponentRelationUID() {
        return this.parentComponentRelationUID;
    }

}
