// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateJobMonitorRuleRequest extends TeaModel {
    /**
     * <p>The threshold that triggers an alert.</p>
     * <ul>
     * <li><p>If <strong>Type</strong> is set to <strong>delay</strong>, the unit is seconds and the value must be an integer. You can set the threshold based on your business requirements. We recommend that you set the threshold to 10 seconds or more to prevent alerts triggered by latency fluctuations caused by network conditions or database loads.</p>
     * </li>
     * <li><p>If <strong>Type</strong> is set to <strong>full_timeout</strong>, the unit is hours and the value must be an integer.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must specify this parameter when <strong>Type</strong> is set to <strong>delay</strong> or <strong>full_timeout</strong> and <strong>State</strong> is set to <strong>Y</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i03e3zty16i****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The alert threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NoticeValue")
    public Integer noticeValue;

    /**
     * <p>The statistical period of the incremental data verification task. Unit: minutes.</p>
     * <blockquote>
     * <p>Valid values: 1, 5, 10, and 30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The mobile phone numbers of the contacts to receive alert notifications. Separate multiple mobile phone numbers with commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is supported only on the Alibaba Cloud China site. Only mobile phone numbers in the Chinese mainland are supported, and you can specify up to 10 mobile phone numbers.</li>
     * <li>The Alibaba Cloud International site does not support mobile phone alerts. You can only <a href="https://help.aliyun.com/document_detail/175876.html">configure alert rules for DTS tasks by using CloudMonitor</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The region where the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: Enables the alert rule.</li>
     * <li><strong>N</strong>: Disables the alert rule.</li>
     * </ul>
     * <p>Default value: <strong>Y</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The number of periods for the incremental data verification task.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Times")
    public Integer times;

    /**
     * <p>The type of the monitoring metric. Valid values:</p>
     * <ul>
     * <li><strong>delay</strong>: <strong>Latency</strong>.</li>
     * <li><strong>error</strong>: <strong>Migration status</strong>.</li>
     * <li><strong>full_timeout</strong>: <strong>Full run duration</strong>.</li>
     * </ul>
     * <p>Default value: <strong>error</strong>. You must manually specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>delay</p>
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
