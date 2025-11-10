// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateUmodelRequest extends TeaModel {
    /**
     * <p>Description.</p>
     * 
     * <strong>example:</strong>
     * <p>workspace test</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateUmodelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUmodelRequest self = new UpdateUmodelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUmodelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
