// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryPromInstallStatusResponseBody extends TeaModel {
    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public QueryPromInstallStatusResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryPromInstallStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPromInstallStatusResponseBody self = new QueryPromInstallStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPromInstallStatusResponseBody setData(QueryPromInstallStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPromInstallStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryPromInstallStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPromInstallStatusResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <br>
         * <p>true: The call was successful. false: The call failed.</p>
         */
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
