// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlbumDetailByIdRequest extends TeaModel {
    @NameInMap("AlbumId")
    public String albumId;

    public static GetAlbumDetailByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlbumDetailByIdRequest self = new GetAlbumDetailByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetAlbumDetailByIdRequest setAlbumId(String albumId) {
        this.albumId = albumId;
        return this;
    }
    public String getAlbumId() {
        return this.albumId;
    }

}
