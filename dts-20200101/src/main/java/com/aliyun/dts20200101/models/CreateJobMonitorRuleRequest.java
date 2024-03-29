// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateJobMonitorRuleRequest extends TeaModel {
    /**
     * <p>The threshold for triggering latency alerts.</p>
     * <br>
     * <p>*   If the **Type** parameter is set to **delay**, the threshold must be an integer. You can set the threshold based on your requirements. To prevent jitters caused by network and database overloads, we recommend that you set the threshold to more than 10 seconds. Unit: seconds.</p>
     * <p>*   If the **Type** parameter is set to **full_timeout**, the threshold must be an integer. Unit: hours.</p>
     * <br>
     * <p>>  This parameter is required if the **Type** parameter is set to **delay** or **full_timeout** and the **State** parameter is set to **Y**.</p>
     */
    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The alert threshold.</p>
     */
    @NameInMap("NoticeValue")
    public Integer noticeValue;

    /**
     * <p>The statistical period of the incremental data verification task. Unit: minutes.</p>
     * <br>
     * <p>>  Valid values: 1, 3, 5, and 30.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The mobile numbers that receive alert notifications. Separate multiple mobile numbers with commas (,).</p>
     * <br>
     * <p>> </p>
     * <p>*   This parameter is available only for users of the China site (aliyun.com). Only mobile numbers in the Chinese mainland are supported. You can specify up to 10 mobile numbers.</p>
     * <p>*   Users of the international site (alibabacloud.com) cannot receive alerts by using mobile phones, but can [configure alert rules for DTS tasks in the CloudMonitor console](~~175876~~).</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <br>
     * <p>*   **Y**: enables the alert rule.</p>
     * <p>*   **N**: disables the alert rule.</p>
     * <br>
     * <p>Default value: **Y**.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The number of statistical periods of the incremental data verification task.</p>
     */
    @NameInMap("Times")
    public Integer times;

    /**
     * <p>The metric that is used to monitor the task. Valid values:</p>
     * <br>
     * <p>*   **delay**: the **Latency** metric.</p>
     * <p>*   **error**: the **Status** metric.</p>
     * <p>*   **full_timeout**: the **Full Timeout** metric.</p>
     * <br>
     * <p>Default value: **error**. You must manually set this value.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateJobMonitorRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateJobMonitorRuleRequest self = new CreateJobMonitorRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateJobMonitorRuleRequest setDelayRuleTime(Long delayRuleTime) {
        this.delayRuleTime = delayRuleTime;
        return this;
    }
    public Long getDelayRuleTime() {
        return this.delayRuleTime;
    }

    public CreateJobMonitorRuleRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public CreateJobMonitorRuleRequest setNoticeValue(Integer noticeValue) {
        this.noticeValue = noticeValue;
        return this;
    }
    public Integer getNoticeValue() {
        return this.noticeValue;
    }

    public CreateJobMonitorRuleRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateJobMonitorRuleRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public CreateJobMonitorRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateJobMonitorRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateJobMonitorRuleRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public CreateJobMonitorRuleRequest setTimes(Integer times) {
        this.times = times;
        return this;
    }
    public Integer getTimes() {
        return this.times;
    }

    public CreateJobMonitorRuleRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
