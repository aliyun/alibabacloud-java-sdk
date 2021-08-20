// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DesensitizeDataRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("SceneCode")
    public String sceneCode;

    public static DesensitizeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DesensitizeDataRequest self = new DesensitizeDataRequest();
        return TeaModel.build(map, self);
    }

    public DesensitizeDataRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DesensitizeDataRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

}
