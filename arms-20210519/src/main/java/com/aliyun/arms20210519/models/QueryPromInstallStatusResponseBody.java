// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class QueryPromInstallStatusResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public QueryPromInstallStatusResponseBodyData data;

    public static QueryPromInstallStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPromInstallStatusResponseBody self = new QueryPromInstallStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPromInstallStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPromInstallStatusResponseBody setData(QueryPromInstallStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPromInstallStatusResponseBodyData getData() {
        return this.data;
    }

    public static class QueryPromInstallStatusResponseBodyData extends TeaModel {
        @NameInMap("isControllerInstalled")
        public Boolean isControllerInstalled;

        public static QueryPromInstallStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPromInstallStatusResponseBodyData self = new QueryPromInstallStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPromInstallStatusResponseBodyData setIsControllerInstalled(Boolean isControllerInstalled) {
            this.isControllerInstalled = isControllerInstalled;
            return this;
        }
        public Boolean getIsControllerInstalled() {
            return this.isControllerInstalled;
        }

    }

}
