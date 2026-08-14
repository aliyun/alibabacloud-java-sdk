// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateJobMonitorRuleRequest extends TeaModel {
    /**
     * <p>The threshold for triggering an alert.</p>
     * <ul>
     * <li><p>If <strong>Type</strong> is set to <strong>delay</strong>, the unit is seconds and the value must be an integer. Set the threshold based on your business requirements. A value of 10 or greater is recommended to avoid alert fluctuations caused by network issues or database loads.</p>
     * </li>
     * <li><p>If <strong>Type</strong> is set to <strong>full_timeout</strong>, the unit is hours and the value must be an integer.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <strong>Type</strong> is set to <strong>delay</strong> or <strong>full_timeout</strong> and <strong>State</strong> is set to <strong>Y</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("DelayRuleTime")
    public Long delayRuleTime;

    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to obtain the task ID.</p>
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
     * <p>The statistical period of the incremental verification task. Unit: minutes.</p>
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
     * <p>The mobile phone numbers of alert contacts, separated by commas (,).</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is supported only on the China site (aliyun.com) and only for the Chinese mainland mobile phone numbers. A maximum of 10 mobile phone numbers can be specified.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>The international site does not support SMS-based alerting. You can only <a href="https://help.aliyun.com/document_detail/175876.html">set alert rules for DTS tasks through the CloudMonitor monitoring platform</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("Phone")
    public String phone;

    /**
     * <p>The region in which the DTS instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Specifies whether to enable the alert rule. Valid values:</p>
     * <ul>
     * <li><strong>Y</strong>: Enable the alert rule.</li>
     * <li><strong>N</strong>: Disable the alert rule.</li>
     * </ul>
     * <p>Default value: <strong>Y</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The number of statistical periods for the incremental verification task.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Times")
    public Integer times;

    /**
     * <p>The type of the alert metric. Valid values:</p>
     * <ul>
     * <li><strong>delay</strong>: the <strong>Latency</strong> metric.</li>
     * <li><strong>error</strong>: the <strong>Migration Status</strong> metric.</li>
     * <li><strong>full_timeout</strong>: the <strong>Full Migration Duration</strong> metric.</li>
     * </ul>
     * <p>Default value: <strong>error</strong>. This parameter must be manually specified.</p>
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
