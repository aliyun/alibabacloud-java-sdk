// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class QueryDumpFilesRequest extends TeaModel {
    @NameInMap("AppVersionId")
    public String appVersionId;

    @NameInMap("OperatorId")
    public String operatorId;

    @NameInMap("OperatorType")
    public String operatorType;

    public static QueryDumpFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDumpFilesRequest self = new QueryDumpFilesRequest();
        return TeaModel.build(map, self);
    }

    public QueryDumpFilesRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public QueryDumpFilesRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public QueryDumpFilesRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

}
