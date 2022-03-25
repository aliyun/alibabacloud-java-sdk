// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimUpdateProjectShrinkRequest extends TeaModel {
    @NameInMap("Component")
    public String componentShrink;

    @NameInMap("Id")
    public Long id;

    // 项目名
    @NameInMap("Name")
    public String name;

    // 备注
    @NameInMap("Remarks")
    public String remarks;

    // 类型
    @NameInMap("Type")
    public String type;

    public static BimUpdateProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BimUpdateProjectShrinkRequest self = new BimUpdateProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BimUpdateProjectShrinkRequest setComponentShrink(String componentShrink) {
        this.componentShrink = componentShrink;
        return this;
    }
    public String getComponentShrink() {
        return this.componentShrink;
    }

    public BimUpdateProjectShrinkRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BimUpdateProjectShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BimUpdateProjectShrinkRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public BimUpdateProjectShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
