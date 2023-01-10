// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dop20221130.models;

import com.aliyun.tea.*;

public class GetOssMetaDownloadRequest extends TeaModel {
    @NameInMap("ds")
    public String ds;

    @NameInMap("expire")
    public Long expire;

    @NameInMap("tableName")
    public String tableName;

    public static GetOssMetaDownloadRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssMetaDownloadRequest self = new GetOssMetaDownloadRequest();
        return TeaModel.build(map, self);
    }

    public GetOssMetaDownloadRequest setDs(String ds) {
        this.ds = ds;
        return this;
    }
    public String getDs() {
        return this.ds;
    }

    public GetOssMetaDownloadRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public GetOssMetaDownloadRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
