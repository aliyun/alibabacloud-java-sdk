// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class UpdateCloudGtmMonitorTemplateResponseBody extends TeaModel {
    /**
     * <p>Unique request identification code.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Modify the health check template operation status:</p>
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

    public static UpdateCloudGtmMonitorTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCloudGtmMonitorTemplateResponseBody self = new UpdateCloudGtmMonitorTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCloudGtmMonitorTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCloudGtmMonitorTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
