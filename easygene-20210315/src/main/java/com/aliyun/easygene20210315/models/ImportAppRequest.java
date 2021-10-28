// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ImportAppRequest extends TeaModel {
    // 安装后应用名
    @NameInMap("AppName")
    public String appName;

    // 来源
    @NameInMap("Source")
    public String source;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static ImportAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAppRequest self = new ImportAppRequest();
        return TeaModel.build(map, self);
    }

    public ImportAppRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ImportAppRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public ImportAppRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
