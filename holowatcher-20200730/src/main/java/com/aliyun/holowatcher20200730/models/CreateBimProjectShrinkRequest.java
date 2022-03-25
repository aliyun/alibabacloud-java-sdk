// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreateBimProjectShrinkRequest extends TeaModel {
    @NameInMap("Component")
    public String componentShrink;

    // 项目名
    @NameInMap("Name")
    public String name;

    // 备注
    @NameInMap("Remarks")
    public String remarks;

    // 类型
    @NameInMap("Type")
    public String type;

    public static CreateBimProjectShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBimProjectShrinkRequest self = new CreateBimProjectShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateBimProjectShrinkRequest setComponentShrink(String componentShrink) {
        this.componentShrink = componentShrink;
        return this;
    }
    public String getComponentShrink() {
        return this.componentShrink;
    }

    public CreateBimProjectShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBimProjectShrinkRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public CreateBimProjectShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
