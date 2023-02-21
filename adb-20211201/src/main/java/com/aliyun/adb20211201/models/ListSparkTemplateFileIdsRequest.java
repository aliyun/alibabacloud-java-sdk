// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkTemplateFileIdsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static ListSparkTemplateFileIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSparkTemplateFileIdsRequest self = new ListSparkTemplateFileIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListSparkTemplateFileIdsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
