// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DeleteModelServiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>model-qwen</p>
     */
    @NameInMap("modelServiceName")
    public String modelServiceName;

    public static DeleteModelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelServiceRequest self = new DeleteModelServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelServiceRequest setModelServiceName(String modelServiceName) {
        this.modelServiceName = modelServiceName;
        return this;
    }
    public String getModelServiceName() {
        return this.modelServiceName;
    }

}
