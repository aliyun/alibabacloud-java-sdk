// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class QueryDataImportProcessRequest extends TeaModel {
    @NameInMap("SubUid")
    public String subUid;

    public static QueryDataImportProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDataImportProcessRequest self = new QueryDataImportProcessRequest();
        return TeaModel.build(map, self);
    }

    public QueryDataImportProcessRequest setSubUid(String subUid) {
        this.subUid = subUid;
        return this;
    }
    public String getSubUid() {
        return this.subUid;
    }

}
