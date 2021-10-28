// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UploadEntityRequest extends TeaModel {
    // 表格文件地址
    @NameInMap("EntityCSVFile")
    public String entityCSVFile;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static UploadEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadEntityRequest self = new UploadEntityRequest();
        return TeaModel.build(map, self);
    }

    public UploadEntityRequest setEntityCSVFile(String entityCSVFile) {
        this.entityCSVFile = entityCSVFile;
        return this;
    }
    public String getEntityCSVFile() {
        return this.entityCSVFile;
    }

    public UploadEntityRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
