// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListInstanceIndicesRequest extends TeaModel {
    @NameInMap("all")
    public Boolean all;

    @NameInMap("name")
    public String name;

    @NameInMap("isManaged")
    public Boolean isManaged;

    public static ListInstanceIndicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceIndicesRequest self = new ListInstanceIndicesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceIndicesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public ListInstanceIndicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListInstanceIndicesRequest setIsManaged(Boolean isManaged) {
        this.isManaged = isManaged;
        return this;
    }
    public Boolean getIsManaged() {
        return this.isManaged;
    }

}
