// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class UsersayMtopDTO extends TeaModel {
    // Id
    @NameInMap("Id")
    public String id;

    // Data
    @NameInMap("Data")
    public java.util.List<SectionMtopDTO> data;

    // Strict
    @NameInMap("Strict")
    public Boolean strict;

    public static UsersayMtopDTO build(java.util.Map<String, ?> map) throws Exception {
        UsersayMtopDTO self = new UsersayMtopDTO();
        return TeaModel.build(map, self);
    }

    public UsersayMtopDTO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UsersayMtopDTO setData(java.util.List<SectionMtopDTO> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SectionMtopDTO> getData() {
        return this.data;
    }

    public UsersayMtopDTO setStrict(Boolean strict) {
        this.strict = strict;
        return this;
    }
    public Boolean getStrict() {
        return this.strict;
    }

}
