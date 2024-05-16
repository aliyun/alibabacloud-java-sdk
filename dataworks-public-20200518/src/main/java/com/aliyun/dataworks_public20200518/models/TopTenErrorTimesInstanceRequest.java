// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class TopTenErrorTimesInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static TopTenErrorTimesInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TopTenErrorTimesInstanceRequest self = new TopTenErrorTimesInstanceRequest();
        return TeaModel.build(map, self);
    }

    public TopTenErrorTimesInstanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
