// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DesensitizeDataRequest extends TeaModel {
    /**
     * <p>The input data to be masked.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15365291784</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The masking scene code. You can view this on the Data Masking Management page of DataWorks Data Protection Umbrella in the DataWorks console.</p>
     * <p>You can obtain this value from Data[].SceneCode in the response of DsgSceneQuerySceneListByName.</p>
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
