// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.layout20220801.models;

import com.aliyun.tea.*;

public class AddTreeNodeRequest extends TeaModel {
    @NameInMap("BusinessId")
    public String businessId;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("Title")
    public String title;

    @NameInMap("Type")
    public String type;

    public static AddTreeNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTreeNodeRequest self = new AddTreeNodeRequest();
        return TeaModel.build(map, self);
    }

    public AddTreeNodeRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public AddTreeNodeRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public AddTreeNodeRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public AddTreeNodeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
