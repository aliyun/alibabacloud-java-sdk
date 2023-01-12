// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateApplicationMonitorRequest extends TeaModel {
    /**
     * <p>The ID of the GA instance on which to execute the origin probing task.</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

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
     * <p>The threshold that is used to trigger the automatic diagnostics feature. Unit: %.</p>
     * <br>
     * <p>Valid values: **0** to **100**.</p>
     * <br>
     * <p>The default value is **0**, which indicates that the automatic diagnostics feature is not triggered.</p>
     */
    @NameInMap("DetectThreshold")
    public Integer detectThreshold;

    /**
     * <p>The number of times that are required to reach the threshold before the automatic diagnostics feature can be triggered.</p>
     * <br>
     * <p>Valid values: **1** to **20**. Default value: **1**.</p>
     */
    @NameInMap("DetectTimes")
    public Integer detectTimes;

    /**
     * <p>The ID of the listener on which to execute the origin probing task.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The extended options of the listener protocol that is used by the origin probing task. The options vary based on the listener protocol.</p>
     */
    @NameInMap("OptionsJson")
    public String optionsJson;

    /**
     * <p>The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The silence period of the automatic diagnostics feature. This parameter specifies the interval at which the automatic diagnostics feature is triggered. If the availability rate does not return to normal after GA triggers an automatic diagnostic, GA must wait until the silence period ends before GA can trigger another automatic diagnostic.</p>
     * <br>
     * <p>If the number of consecutive times that the availability rate drops below the threshold of automatic diagnostics reaches the value of the **DetectTimes** parameter, the automatic diagnostics feature is triggered. The automatic diagnostics feature is not triggered again within the silence period even if the availability rate stays below the threshold. If the availability rate does not return to normal after the silence period ends, the automatic diagnostics feature is triggered again.</p>
     * <br>
     * <p>Unit: seconds. Valid values: **300** to **86400**. Default value: **300**.</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The name of the origin probing task.</p>
     * <br>
     * <p>The name must be 4 to 100 characters in length, and can contain digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateApplicationMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationMonitorRequest self = new CreateApplicationMonitorRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationMonitorRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateApplicationMonitorRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public CreateApplicationMonitorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateApplicationMonitorRequest setDetectEnable(Boolean detectEnable) {
        this.detectEnable = detectEnable;
        return this;
    }
    public Boolean getDetectEnable() {
        return this.detectEnable;
    }

    public CreateApplicationMonitorRequest setDetectThreshold(Integer detectThreshold) {
        this.detectThreshold = detectThreshold;
        return this;
    }
    public Integer getDetectThreshold() {
        return this.detectThreshold;
    }

    public CreateApplicationMonitorRequest setDetectTimes(Integer detectTimes) {
        this.detectTimes = detectTimes;
        return this;
    }
    public Integer getDetectTimes() {
        return this.detectTimes;
    }

    public CreateApplicationMonitorRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public CreateApplicationMonitorRequest setOptionsJson(String optionsJson) {
        this.optionsJson = optionsJson;
        return this;
    }
    public String getOptionsJson() {
        return this.optionsJson;
    }

    public CreateApplicationMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApplicationMonitorRequest setSilenceTime(Integer silenceTime) {
        this.silenceTime = silenceTime;
        return this;
    }
    public Integer getSilenceTime() {
        return this.silenceTime;
    }

    public CreateApplicationMonitorRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
