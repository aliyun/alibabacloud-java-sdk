// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceLogRequest extends TeaModel {
    // sls日志库
    @NameInMap("LogStore")
    public String logStore;

    // 资源组对应的sls日志管理项目
    @NameInMap("ProjectName")
    public String projectName;

    public static CreateResourceLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceLogRequest self = new CreateResourceLogRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceLogRequest setLogStore(String logStore) {
        this.logStore = logStore;
        return this;
    }
    public String getLogStore() {
        return this.logStore;
    }

    public CreateResourceLogRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
