// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dop20221130.models;

import com.aliyun.tea.*;

public class GetOssMetaListRequest extends TeaModel {
    @NameInMap("end")
    public String end;

    @NameInMap("start")
    public String start;

    @NameInMap("tableName")
    public String tableName;

    public static GetOssMetaListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOssMetaListRequest self = new GetOssMetaListRequest();
        return TeaModel.build(map, self);
    }

    public GetOssMetaListRequest setEnd(String end) {
        this.end = end;
        return this;
    }
    public String getEnd() {
        return this.end;
    }

    public GetOssMetaListRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public GetOssMetaListRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
