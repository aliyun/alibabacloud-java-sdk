// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class MoveResourceResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to troubleshoot errors.</p>
     * 
     * <strong>example:</strong>
     * <p>F332BED4-DD73-5972-A9C2-642BA6CFXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful.</p>
     * <ul>
     * <li><p>true: The call is successful.</p>
     * </li>
     * <li><p>false: The call fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MoveResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MoveResourceResponseBody self = new MoveResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public MoveResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MoveResourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
