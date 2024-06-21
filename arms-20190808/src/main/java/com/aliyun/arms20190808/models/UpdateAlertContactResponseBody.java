// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertContactResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the alert contact was updated. Valid values:</p>
     * <ul>
     * <li>true: The alert contact was updated.</li>
     * <li>false: The alert contact failed to be updated.</li>
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
     * <p>1A474FF8-7861-4D00-81B5-5BC3DA4E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactResponseBody self = new UpdateAlertContactResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlertContactResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdateAlertContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
