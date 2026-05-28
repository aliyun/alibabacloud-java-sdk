// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ScanFileRequest extends TeaModel {
    @NameInMap("body")
    public ScanFileInput body;

    public static ScanFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanFileRequest self = new ScanFileRequest();
        return TeaModel.build(map, self);
    }

    public ScanFileRequest setBody(ScanFileInput body) {
        this.body = body;
        return this;
    }
    public ScanFileInput getBody() {
        return this.body;
    }

}
