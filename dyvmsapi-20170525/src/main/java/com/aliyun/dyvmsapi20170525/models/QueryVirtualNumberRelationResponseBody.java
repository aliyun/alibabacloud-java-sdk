// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberRelationResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value 200 indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of associations between virtual numbers and real numbers. The following fields are returned:</p>
     * <br>
     * <p>*   **relatedNum**: the real number.</p>
     * <p>*   **createTime**: the time when the number was activated.</p>
     * <p>*   **pageNo**: the page number.</p>
     * <p>*   **pageSize**: the number of entries per page.</p>
     * <p>*   **total**: the total number of entries returned.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryVirtualNumberRelationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVirtualNumberRelationResponseBody self = new QueryVirtualNumberRelationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVirtualNumberRelationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVirtualNumberRelationResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryVirtualNumberRelationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
