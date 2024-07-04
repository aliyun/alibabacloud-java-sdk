// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeAlertConfigurationResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the scaling activities that prompt text message or email notifications.</p>
     */
    @NameInMap("ScaleStatuses")
    public java.util.List<String> scaleStatuses;

    public static DescribeAlertConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertConfigurationResponseBody self = new DescribeAlertConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertConfigurationResponseBody setScaleStatuses(java.util.List<String> scaleStatuses) {
        this.scaleStatuses = scaleStatuses;
        return this;
    }
    public java.util.List<String> getScaleStatuses() {
        return this.scaleStatuses;
    }

}
