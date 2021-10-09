// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class UpdateLiveTeleprompterStateRequest extends TeaModel {
    @NameInMap("Display")
    public Boolean display;

    public static UpdateLiveTeleprompterStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveTeleprompterStateRequest self = new UpdateLiveTeleprompterStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveTeleprompterStateRequest setDisplay(Boolean display) {
        this.display = display;
        return this;
    }
    public Boolean getDisplay() {
        return this.display;
    }

}
