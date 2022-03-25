// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class BimUpdateProjectRequest extends TeaModel {
    @NameInMap("Component")
    public java.util.List<java.util.Map<String, ?>> component;

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

    public static BimUpdateProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        BimUpdateProjectRequest self = new BimUpdateProjectRequest();
        return TeaModel.build(map, self);
    }

    public BimUpdateProjectRequest setComponent(java.util.List<java.util.Map<String, ?>> component) {
        this.component = component;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getComponent() {
        return this.component;
    }

    public BimUpdateProjectRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public BimUpdateProjectRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BimUpdateProjectRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public BimUpdateProjectRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
