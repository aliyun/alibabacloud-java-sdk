// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DesensitizeDataRequest extends TeaModel {
    /**
     * <p>The data that you want to mask.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The code of the data masking scene. You can view the code on the Data Masking page in Data Security Guard of the DataWorks console.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
