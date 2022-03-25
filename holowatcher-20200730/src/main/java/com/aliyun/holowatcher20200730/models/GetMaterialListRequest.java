// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetMaterialListRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("Name")
    public String name;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Type")
    public String type;

    public static GetMaterialListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMaterialListRequest self = new GetMaterialListRequest();
        return TeaModel.build(map, self);
    }

    public GetMaterialListRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public GetMaterialListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetMaterialListRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public GetMaterialListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
