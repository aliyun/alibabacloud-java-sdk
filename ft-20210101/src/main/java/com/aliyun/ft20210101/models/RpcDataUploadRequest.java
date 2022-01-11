// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20210101.models;

import com.aliyun.tea.*;

public class RpcDataUploadRequest extends TeaModel {
    @NameInMap("largeParam")
    public String largeParam;

    @NameInMap("query1")
    public String query1;

    @NameInMap("query2")
    public Long query2;

    public static RpcDataUploadRequest build(java.util.Map<String, ?> map) throws Exception {
        RpcDataUploadRequest self = new RpcDataUploadRequest();
        return TeaModel.build(map, self);
    }

    public RpcDataUploadRequest setLargeParam(String largeParam) {
        this.largeParam = largeParam;
        return this;
    }
    public String getLargeParam() {
        return this.largeParam;
    }

    public RpcDataUploadRequest setQuery1(String query1) {
        this.query1 = query1;
        return this;
    }
    public String getQuery1() {
        return this.query1;
    }

    public RpcDataUploadRequest setQuery2(Long query2) {
        this.query2 = query2;
        return this;
    }
    public Long getQuery2() {
        return this.query2;
    }

}
