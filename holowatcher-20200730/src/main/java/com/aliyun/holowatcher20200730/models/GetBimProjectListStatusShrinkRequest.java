// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class GetBimProjectListStatusShrinkRequest extends TeaModel {
    @NameInMap("Ids")
    public String idsShrink;

    public static GetBimProjectListStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBimProjectListStatusShrinkRequest self = new GetBimProjectListStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetBimProjectListStatusShrinkRequest setIdsShrink(String idsShrink) {
        this.idsShrink = idsShrink;
        return this;
    }
    public String getIdsShrink() {
        return this.idsShrink;
    }

}
