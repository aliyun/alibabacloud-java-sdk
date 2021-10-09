// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class UpdateLiveSellPointStateRequest extends TeaModel {
    @NameInMap("Display")
    public Boolean display;

    public static UpdateLiveSellPointStateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveSellPointStateRequest self = new UpdateLiveSellPointStateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLiveSellPointStateRequest setDisplay(Boolean display) {
        this.display = display;
        return this;
    }
    public Boolean getDisplay() {
        return this.display;
    }

}
