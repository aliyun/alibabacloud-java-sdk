// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectShareModelListRequest extends TeaModel {
    @NameInMap("ShareId")
    public String shareId;

    public static GetBimProjectShareModelListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectShareModelListRequest self = new GetBimProjectShareModelListRequest();
        return TeaModel.build(map, self);
    }

    public GetBimProjectShareModelListRequest setShareId(String shareId) {
        this.shareId = shareId;
        return this;
    }
    public String getShareId() {
        return this.shareId;
    }

}
