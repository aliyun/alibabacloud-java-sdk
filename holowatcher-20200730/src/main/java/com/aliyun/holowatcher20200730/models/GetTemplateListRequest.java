// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetTemplateListRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Style")
    public String style;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Type")
    public String type;

    @NameInMap("Spec")
    public String spec;

    @NameInMap("Name")
    public String name;

    public static GetTemplateListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateListRequest self = new GetTemplateListRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateListRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public GetTemplateListRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public GetTemplateListRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public GetTemplateListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetTemplateListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetTemplateListRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public GetTemplateListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
