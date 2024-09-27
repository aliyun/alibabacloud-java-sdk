// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteCloudGtmMonitorTemplateResponseBody extends TeaModel {
    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation to delete the health check template was successful:</p>
     * <ul>
     * <li>true: Operation successful</li>
     * <li>false: Operation failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteCloudGtmMonitorTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCloudGtmMonitorTemplateResponseBody self = new DeleteCloudGtmMonitorTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCloudGtmMonitorTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCloudGtmMonitorTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
