// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberResponseBody extends TeaModel {
    /**
     * <p>The response code. The value 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the numbers associated with the virtual numbers. The following fields are returned:</p>
     * <br>
     * <p>*   createTime: the time when the number was activated.</p>
     * <p>*   qualificationCount: the number of qualifications.</p>
     * <p>*   cityCount: the number of cities.</p>
     * <p>*   phoneNumCount: the number of virtual numbers.</p>
     * <p>*   remark: the additional information.</p>
     * <p>*   phoneNum: the virtual number.</p>
     * <p>*   routeType: the route type.</p>
     * <p>*   canCancel: indicates whether the number can be deactivated.</p>
     * <p>*   specCount: the number of Internet service providers (ISPs).</p>
     * <p>*   status: the number state. Valid values: **1**, **0**, and **-1**. The value 1 indicates that the number is valid. The value 0 indicates that the number is invalid. The value -1 indicates that the number was deactivated.</p>
     * <p>*   pageNo: the page number.</p>
     * <p>*   pageSize: the number of entries per page.</p>
     * <p>*   total: the total number of virtual numbers.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryVirtualNumberResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVirtualNumberResponseBody self = new QueryVirtualNumberResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVirtualNumberResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVirtualNumberResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryVirtualNumberResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
