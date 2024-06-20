// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelservice20220614.models;

import com.aliyun.tea.*;

public class GetMonthAmountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneType")
    public String sceneType;

    public static GetMonthAmountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMonthAmountRequest self = new GetMonthAmountRequest();
        return TeaModel.build(map, self);
    }

    public GetMonthAmountRequest setSceneType(String sceneType) {
        this.sceneType = sceneType;
        return this;
    }
    public String getSceneType() {
        return this.sceneType;
    }

}
