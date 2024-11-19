// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ReupgradeOTATaskRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can view the ID of an instance on the <strong>Overview</strong> page in the IoT Platform console.****</p>
     * <blockquote>
     * <ul>
     * <li>If the instance has an ID, you must specify the <strong>IotInstanceId</strong> parameter. If you do not specify this parameter, the call fails.</li>
     * <li>If the instance does not have an <strong>ID</strong> or no <strong>Overview</strong> page is displayed for the instance, you do not need to specify this parameter.</li>
     * </ul>
     * </blockquote>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-v64***</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>The ID of the update batch.</p>
     * <p>After you call the <a href="https://help.aliyun.com/document_detail/147496.html">CreateOTAStaticUpgradeJob</a> or <a href="https://help.aliyun.com/document_detail/147887.html">CreateOTADynamicUpgradeJob</a> operation to create an update batch, the <strong>JobId</strong> parameter is returned.</p>
     * <p>You can also view the <strong>batch ID</strong> on the <strong>Firmware Details</strong> page in the IoT Platform console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7glPHmaDYLAYMD1HHutT02****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>y3tOmCDNgpR8F9jnVEzC01****</p>
     */
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
