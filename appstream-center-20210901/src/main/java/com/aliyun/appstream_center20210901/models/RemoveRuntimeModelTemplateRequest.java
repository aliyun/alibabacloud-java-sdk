// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RemoveRuntimeModelTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mt-xxxxxxx</p>
     */
    @NameInMap("ModelTemplateId")
    public String modelTemplateId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeIds")
    public java.util.List<String> runtimeIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudDesktop</p>
     */
    @NameInMap("RuntimeType")
    public String runtimeType;

    public static RemoveRuntimeModelTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveRuntimeModelTemplateRequest self = new RemoveRuntimeModelTemplateRequest();
        return TeaModel.build(map, self);
    }

    public RemoveRuntimeModelTemplateRequest setModelTemplateId(String modelTemplateId) {
        this.modelTemplateId = modelTemplateId;
        return this;
    }
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    public RemoveRuntimeModelTemplateRequest setRuntimeIds(java.util.List<String> runtimeIds) {
        this.runtimeIds = runtimeIds;
        return this;
    }
    public java.util.List<String> getRuntimeIds() {
        return this.runtimeIds;
    }

    public RemoveRuntimeModelTemplateRequest setRuntimeType(String runtimeType) {
        this.runtimeType = runtimeType;
        return this;
    }
    public String getRuntimeType() {
        return this.runtimeType;
    }

}
