// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetVideoDeviceByIdRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Id")
    public String id;

    public static GetVideoDeviceByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoDeviceByIdRequest self = new GetVideoDeviceByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoDeviceByIdRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetVideoDeviceByIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
