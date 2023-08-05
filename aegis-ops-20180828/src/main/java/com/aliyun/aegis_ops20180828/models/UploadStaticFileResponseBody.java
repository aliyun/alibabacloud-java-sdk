// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aegis_ops20180828.models;

import com.aliyun.tea.*;

public class UploadStaticFileResponseBody extends TeaModel {
    @NameInMap("result")
    public Boolean result;

    public static UploadStaticFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadStaticFileResponseBody self = new UploadStaticFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadStaticFileResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
