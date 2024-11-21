// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckUserProjectNameRequest extends TeaModel {
    /**
     * <p>The name of the real-time log delivery task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ali-dcdn-log-56</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static CheckUserProjectNameRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserProjectNameRequest self = new CheckUserProjectNameRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserProjectNameRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
