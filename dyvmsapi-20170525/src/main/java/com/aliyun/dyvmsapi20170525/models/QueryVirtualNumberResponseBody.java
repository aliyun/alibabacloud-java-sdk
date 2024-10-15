// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryVirtualNumberResponseBody extends TeaModel {
    /**
     * <p>The response code. The value 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the numbers associated with the virtual numbers. The following fields are returned:</p>
     * <ul>
     * <li>createTime: the time when the number was activated.</li>
     * <li>qualificationCount: the number of qualifications.</li>
     * <li>cityCount: the number of cities.</li>
     * <li>phoneNumCount: the number of virtual numbers.</li>
     * <li>remark: the additional information.</li>
     * <li>phoneNum: the virtual number.</li>
     * <li>routeType: the route type.</li>
     * <li>canCancel: indicates whether the number can be deactivated.</li>
     * <li>specCount: the number of Internet service providers (ISPs).</li>
     * <li>status: the number state. Valid values: <strong>1</strong>, <strong>0</strong>, and <strong>-1</strong>. The value 1 indicates that the number is valid. The value 0 indicates that the number is invalid. The value -1 indicates that the number was deactivated.</li>
     * <li>pageNo: the page number.</li>
     * <li>pageSize: the number of entries per page.</li>
     * <li>total: the total number of virtual numbers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;data&quot;:[{&quot;createTime&quot;:&quot;2020-07-15 04:00:00&quot;,&quot;qualificationCount&quot;:0,&quot;cityCount&quot;:0,&quot;phoneNumCount&quot;:1,&quot;remark&quot;:&quot;20200715Unicom CTD shut down&quot;,&quot;phoneNum&quot;:&quot;05516214****&quot;,&quot;routeType&quot;:1,&quot;canCancel&quot;:true,&quot;specCount&quot;:0,&quot;status&quot;:&quot;1&quot;}],&quot;pageSize&quot;:1,&quot;total&quot;:17,&quot;pageNo&quot;:1}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9FF70B74-1B3C-44C1-ACDF-8DF962988F0E</p>
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
