// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteContactResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the alert contact is deleted. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The alert contact is deleted.</li>
     * <li><code>false</code>: The alert contact is not deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C21AB7CF-B7AF-410F-BD61-82D1567F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactResponseBody self = new DeleteContactResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContactResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
