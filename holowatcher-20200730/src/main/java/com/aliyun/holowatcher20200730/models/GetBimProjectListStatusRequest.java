// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectListStatusRequest extends TeaModel {
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    public static GetBimProjectListStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectListStatusRequest self = new GetBimProjectListStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetBimProjectListStatusRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

}
