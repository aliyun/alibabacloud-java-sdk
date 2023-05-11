// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReupgradeOTATaskRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the ID of an instance on the **Overview** page in the IoT Platform console.****</p>
     * <br>
     * <p>>*   If the instance has an ID, you must specify the **IotInstanceId** parameter. If you do not specify this parameter, the call fails.</p>
     * <p>>*   If the instance does not have an **ID** or no **Overview** page is displayed for the instance, you do not need to specify this parameter.</p>
     * <br>
     * <p>For more information, see [Instance overview](~~356505~~).</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the update batch.</p>
     * <br>
     * <p>After you call the [CreateOTAStaticUpgradeJob](~~147496~~) or [CreateOTADynamicUpgradeJob](~~147887~~) operation to create an update batch, the **JobId** parameter is returned.</p>
     * <br>
     * <p>You can also view the **batch ID** on the **Firmware Details** page in the IoT Platform console.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("TaskId")
    public java.util.List<String> taskId;

    public static ReupgradeOTATaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReupgradeOTATaskRequest self = new ReupgradeOTATaskRequest();
        return TeaModel.build(map, self);
    }

    public ReupgradeOTATaskRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ReupgradeOTATaskRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ReupgradeOTATaskRequest setTaskId(java.util.List<String> taskId) {
        this.taskId = taskId;
        return this;
    }
    public java.util.List<String> getTaskId() {
        return this.taskId;
    }

}
