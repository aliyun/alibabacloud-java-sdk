// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteDcdnRealTimeLogProjectRequest extends TeaModel {
    /**
     * <p>The name of a real-time log delivery project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static DeleteDcdnRealTimeLogProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDcdnRealTimeLogProjectRequest self = new DeleteDcdnRealTimeLogProjectRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDcdnRealTimeLogProjectRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
