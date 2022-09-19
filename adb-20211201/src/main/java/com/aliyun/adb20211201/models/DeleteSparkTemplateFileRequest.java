// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DeleteSparkTemplateFileRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Id")
    public Long id;

    public static DeleteSparkTemplateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSparkTemplateFileRequest self = new DeleteSparkTemplateFileRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSparkTemplateFileRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteSparkTemplateFileRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
