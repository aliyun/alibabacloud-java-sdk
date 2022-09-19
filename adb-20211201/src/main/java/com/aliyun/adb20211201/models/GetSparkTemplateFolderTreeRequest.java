// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFolderTreeRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static GetSparkTemplateFolderTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFolderTreeRequest self = new GetSparkTemplateFolderTreeRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFolderTreeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
