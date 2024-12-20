// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTicketsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;totalResults&quot;:1 &quot;previousPage&quot;:1 &quot;data&quot;:[ 0:{ &quot;serviceType&quot;:1 &quot;lastUrgeTime&quot;:0 &quot;queueId&quot;:0 &quot;sopCateId&quot;:252011 &quot;totalUrgeMemo&quot;:&quot;&quot; &quot;taskGmtModified&quot;:0 &quot;departmentId&quot;:10 &quot;groupId&quot;:0 &quot;channelType&quot;:1 &quot;questionInfo&quot;:&quot;&quot; &quot;templateId&quot;:0 &quot;deadLine&quot;:0 &quot;srType&quot;:30701 &quot;caseId&quot;:2000000001165962}</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketsResponseBody self = new QueryTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTicketsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTicketsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryTicketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTicketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTicketsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
