// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ProjectDeleteRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("third_part_id")
    public String thirdPartId;

    public static ProjectDeleteRequest build(java.util.Map<String, ?> map) throws Exception {
        ProjectDeleteRequest self = new ProjectDeleteRequest();
        return TeaModel.build(map, self);
    }

    public ProjectDeleteRequest setThirdPartId(String thirdPartId) {
        this.thirdPartId = thirdPartId;
        return this;
    }
    public String getThirdPartId() {
        return this.thirdPartId;
    }

}
