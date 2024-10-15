// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberRelationResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value 200 indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of associations between virtual numbers and real numbers. The following fields are returned:</p>
     * <ul>
     * <li><strong>relatedNum</strong>: the real number.</li>
     * <li><strong>createTime</strong>: the time when the number was activated.</li>
     * <li><strong>pageNo</strong>: the page number.</li>
     * <li><strong>pageSize</strong>: the number of entries per page.</li>
     * <li><strong>total</strong>: the total number of entries returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;data&quot;:[{&quot;relatedNum&quot;:&quot;1705559****&quot;,&quot;createTime&quot;:&quot;2021-03-26 12:34:08&quot;}],&quot;pageSize&quot;:20,&quot;total&quot;:1,&quot;pageNo&quot;:1}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8FAD5988-B483-48A4-B251-6E8470A67371</p>
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
