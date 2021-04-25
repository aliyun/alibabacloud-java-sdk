// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class UploadEntityRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    @NameInMap("EntityTSVFile")
    public String entityTSVFile;

    public static UploadEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadEntityRequest self = new UploadEntityRequest();
        return TeaModel.build(map, self);
    }

    public UploadEntityRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public UploadEntityRequest setEntityTSVFile(String entityTSVFile) {
        this.entityTSVFile = entityTSVFile;
        return this;
    }
    public String getEntityTSVFile() {
        return this.entityTSVFile;
    }

}
