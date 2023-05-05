// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class CompleteIconRequest extends TeaModel {
    @NameInMap("FileName")
    public String fileName;

    public static CompleteIconRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteIconRequest self = new CompleteIconRequest();
        return TeaModel.build(map, self);
    }

    public CompleteIconRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
