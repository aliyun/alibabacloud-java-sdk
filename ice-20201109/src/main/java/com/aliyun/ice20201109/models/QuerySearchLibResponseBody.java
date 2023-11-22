// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QuerySearchLibResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchLibName")
    public String searchLibName;

    @NameInMap("Status")
    public String status;

    public static QuerySearchLibResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySearchLibResponseBody self = new QuerySearchLibResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySearchLibResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySearchLibResponseBody setSearchLibName(String searchLibName) {
        this.searchLibName = searchLibName;
        return this;
    }
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public QuerySearchLibResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
