// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcDataUploadAndDownloadRequest extends TeaModel {
    @NameInMap("query1")
    public String query1;

    public static RpcDataUploadAndDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        RpcDataUploadAndDownloadRequest self = new RpcDataUploadAndDownloadRequest();
        return TeaModel.build(map, self);
    }

    public RpcDataUploadAndDownloadRequest setQuery1(String query1) {
        this.query1 = query1;
        return this;
    }
    public String getQuery1() {
        return this.query1;
    }

}
