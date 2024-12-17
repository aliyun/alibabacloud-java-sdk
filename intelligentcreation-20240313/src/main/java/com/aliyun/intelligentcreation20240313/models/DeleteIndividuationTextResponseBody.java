// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class DeleteIndividuationTextResponseBody extends TeaModel {
    @NameInMap("desc")
    public String desc;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4830493A-728F-5F19-BBCC-1443292E9C49</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("status")
    public String status;

    public static DeleteIndividuationTextResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIndividuationTextResponseBody self = new DeleteIndividuationTextResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIndividuationTextResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public DeleteIndividuationTextResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIndividuationTextResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
