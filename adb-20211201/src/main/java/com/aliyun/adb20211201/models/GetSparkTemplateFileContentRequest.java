// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkTemplateFileContentRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Id")
    public Long id;

    public static GetSparkTemplateFileContentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkTemplateFileContentRequest self = new GetSparkTemplateFileContentRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkTemplateFileContentRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetSparkTemplateFileContentRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
