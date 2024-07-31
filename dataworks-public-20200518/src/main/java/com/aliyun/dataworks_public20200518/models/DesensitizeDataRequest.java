// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DesensitizeDataRequest extends TeaModel {
    /**
     * <p>The data that you want to mask.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15365291784</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The code of the data masking scenario. You can view the code on the Data Masking Management page in Data Security Guard of the DataWorks console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>_default_scene_code</p>
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
