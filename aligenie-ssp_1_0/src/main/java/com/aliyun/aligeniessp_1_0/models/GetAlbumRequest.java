// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlbumRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Type")
    public String type;

    public static GetAlbumRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlbumRequest self = new GetAlbumRequest();
        return TeaModel.build(map, self);
    }

    public GetAlbumRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetAlbumRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
