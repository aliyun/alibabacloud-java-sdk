// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CompleteAppRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    public static CompleteAppRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteAppRequest self = new CompleteAppRequest();
        return TeaModel.build(map, self);
    }

    public CompleteAppRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
