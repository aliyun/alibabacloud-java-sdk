// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateApplicationMonitorRequest extends TeaModel {
    /**
     * <p>The URL or IP address that you want to probe.</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable the automatic diagnostics feature. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: yes</p>
     * <p>*   **false**: no</p>
     */
    @NameInMap("DetectEnable")
    public Boolean detectEnable;

    /**
     * <p>Set the threshold that is used to trigger the automatic diagnostics feature. If the liveness of the origin in percentile drops below the specified threshold, the automatic diagnostics feature is triggered.</p>
     * <br>
     * <p>Valid values: **0** to **100**.</p>
     */
    @NameInMap("DetectThreshold")
    public Integer detectThreshold;

    /**
     * <p>The number of times that are required to reach the threshold before the automatic diagnostics feature can be triggered.</p>
     * <br>
     * <p>Valid values: **1** to **20**.</p>
     */
    @NameInMap("DetectTimes")
    public Integer detectTimes;

    /**
     * <p>The ID of the listener that you want to modify. The listener runs the origin probing task.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The extended options of the listener protocol that is used by the origin probing task. The options vary based on the listener protocol.</p>
     */
    @NameInMap("OptionsJson")
    public String optionsJson;

    /**
     * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The silence period of the automatic diagnostics feature. This parameter specifies the interval at which the automatic diagnostics feature is triggered. If the availability rate does not return to normal after GA triggers an automatic diagnostic, GA must wait until the silence period ends before GA can trigger another automatic diagnostic.</p>
     * <br>
     * <p>If the number of consecutive times that the availability rate drops below the threshold of automatic diagnostics reaches the value of the **DetectTimes** parameter, the automatic diagnostics feature is triggered. The automatic diagnostics feature is not triggered again within the silence period even if the availability rate stays below the threshold. If the availability rate does not return to normal after the silence period ends, the automatic diagnostics feature is triggered again.</p>
     * <br>
     * <p>Unit: seconds. Valid values: **300** to **86400**.</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The ID of the origin probing task that you want to modify.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The name of the origin probing task.</p>
     * <br>
     * <p>The name must be 4 to 100 characters in length, and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static UpdateApplicationMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationMonitorRequest self = new UpdateApplicationMonitorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationMonitorRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateApplicationMonitorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateApplicationMonitorRequest setDetectEnable(Boolean detectEnable) {
        this.detectEnable = detectEnable;
        return this;
    }
    public Boolean getDetectEnable() {
        return this.detectEnable;
    }

    public UpdateApplicationMonitorRequest setDetectThreshold(Integer detectThreshold) {
        this.detectThreshold = detectThreshold;
        return this;
    }
    public Integer getDetectThreshold() {
        return this.detectThreshold;
    }

    public UpdateApplicationMonitorRequest setDetectTimes(Integer detectTimes) {
        this.detectTimes = detectTimes;
        return this;
    }
    public Integer getDetectTimes() {
        return this.detectTimes;
    }

    public UpdateApplicationMonitorRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateApplicationMonitorRequest setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public UpdateApplicationMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateApplicationMonitorRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public UpdateApplicationMonitorRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public UpdateApplicationMonitorRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
