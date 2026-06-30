// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateApplicationMonitorRequest extends TeaModel {
    /**
     * <p>The instance ID of the Alibaba Cloud Global Accelerator (GA) instance to be probed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ga-bp1odcab8tmno0hdq****</p>
     */
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    /**
     * <p>The URL or IP address to be probed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <p>The client token that is used to ensure the idempotence of a request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enable the automatic diagnostics feature. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong></p>
     * </li>
     * <li><p><strong>false</strong> (default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DetectEnable")
    public Boolean detectEnable;

    /**
     * <p>The threshold that triggers automatic diagnostics. Unit: %.</p>
     * <p>Valid values: <strong>0</strong> to <strong>100</strong>.</p>
     * <p>Default value: <strong>0</strong>, which indicates that automatic diagnostics is not triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DetectThreshold")
    public Integer detectThreshold;

    /**
     * <p>The number of times that the threshold must be reached to trigger automatic diagnostics.</p>
     * <p>Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DetectTimes")
    public Integer detectTimes;

    /**
     * <p>The instance ID of the listener to be probed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The advanced extension options for the listener protocol type of the origin probing task. Different listener protocol types correspond to different extension options.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;http_method&quot;: &quot;get&quot;,&quot;header&quot;: &quot;key:asd&quot;,&quot;acceptable_response_code&quot;: &quot;500&quot;,&quot;cert_verify&quot;: true }</p>
     */
    @NameInMap("OptionsJson")
    public String optionsJson;

    /**
     * <p>The region ID of the Alibaba Cloud Global Accelerator (GA) instance. Set the value to <strong>cn-hangzhou</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The silence period for automatic diagnostics. This parameter specifies the interval between two consecutive automatic diagnostics when the availability does not recover to normal after automatic diagnostics is triggered.</p>
     * <p>When the availability is consecutively below the automatic diagnostics threshold for the specified number of times (the value of <strong>DetectTimes</strong>), automatic diagnostics is triggered. If the availability remains below the threshold during the silence period, automatic diagnostics is not triggered again within the silence period. If the availability has not recovered after the silence period, automatic diagnostics is triggered again.</p>
     * <p>Unit: seconds. Valid values: <strong>300</strong> to <strong>86400</strong>. Default value: <strong>300</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("SilenceTime")
    public Integer silenceTime;

    /**
     * <p>The name of the origin probing task.</p>
     * <p>The name must be 1 to 128 characters in length and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>task1</p>
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
