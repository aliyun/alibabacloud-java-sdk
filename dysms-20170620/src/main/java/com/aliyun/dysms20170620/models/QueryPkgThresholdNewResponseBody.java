// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryPkgThresholdNewResponseBody extends TeaModel {
    @NameInMap("PackageWarningLimit")
    public Long packageWarningLimit;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryPkgThresholdNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPkgThresholdNewResponseBody self = new QueryPkgThresholdNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPkgThresholdNewResponseBody setPackageWarningLimit(Long packageWarningLimit) {
        this.packageWarningLimit = packageWarningLimit;
        return this;
    }
    public Long getPackageWarningLimit() {
        return this.packageWarningLimit;
    }

    public QueryPkgThresholdNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
