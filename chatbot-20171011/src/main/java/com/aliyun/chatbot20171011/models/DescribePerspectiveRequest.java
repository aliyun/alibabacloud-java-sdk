// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribePerspectiveRequest extends TeaModel {
    @NameInMap("PerspectiveId")
    public String perspectiveId;

    public static DescribePerspectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePerspectiveRequest self = new DescribePerspectiveRequest();
        return TeaModel.build(map, self);
    }

    public DescribePerspectiveRequest setPerspectiveId(String perspectiveId) {
        this.perspectiveId = perspectiveId;
        return this;
    }
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

}
