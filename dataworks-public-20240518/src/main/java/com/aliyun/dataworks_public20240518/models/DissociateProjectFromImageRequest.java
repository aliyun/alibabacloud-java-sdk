// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DissociateProjectFromImageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Custom_image_xxxx_xxxx</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static DissociateProjectFromImageRequest build(java.util.Map<String, ?> map) throws Exception {
        DissociateProjectFromImageRequest self = new DissociateProjectFromImageRequest();
        return TeaModel.build(map, self);
    }

    public DissociateProjectFromImageRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DissociateProjectFromImageRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
