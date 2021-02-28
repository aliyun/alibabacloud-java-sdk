// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ActivatePerspectiveRequest extends TeaModel {
    @NameInMap("PerspectiveId")
    public String perspectiveId;

    public static ActivatePerspectiveRequest build(java.util.Map<String, ?> map) throws Exception {
        ActivatePerspectiveRequest self = new ActivatePerspectiveRequest();
        return TeaModel.build(map, self);
    }

    public ActivatePerspectiveRequest setPerspectiveId(String perspectiveId) {
        this.perspectiveId = perspectiveId;
        return this;
    }
    public String getPerspectiveId() {
        return this.perspectiveId;
    }

}
