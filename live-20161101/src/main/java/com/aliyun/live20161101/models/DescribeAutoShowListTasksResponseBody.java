// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeAutoShowListTasksResponseBody extends TeaModel {
    /**
     * <p>The information about the scheduled tasks. The following fields are included:</p>
     * <ul>
     * <li>Status: the status of the scheduled task. Valid values: 0 and 1. A value of 0 indicates that the scheduled task is paused. A value of 1 indicates that the scheduled task is started.</li>
     * <li>LiveTemplate: the transcoding templates.</li>
     * <li>TranscodeConfig: the transcoding configuration for the source URL.</li>
     * <li>CasterId: the ID of the production studio.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Status&quot;:0,&quot;TranscodeConfig&quot;:{&quot;CasterTemplate&quot;:&quot;lp_hd&quot;, &quot;LiveTemplate&quot;:[&quot;lhd&quot;,&quot;lsd&quot;]}, &quot;CasterId&quot;:&quot;cce04ef3-2226-4865-8704-f84b8375****&quot;}</p>
     */
    @NameInMap("AutoShowListTasks")
    public String autoShowListTasks;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAutoShowListTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAutoShowListTasksResponseBody self = new DescribeAutoShowListTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAutoShowListTasksResponseBody setAutoShowListTasks(String autoShowListTasks) {
        this.autoShowListTasks = autoShowListTasks;
        return this;
    }
    public String getAutoShowListTasks() {
        return this.autoShowListTasks;
    }

    public DescribeAutoShowListTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
