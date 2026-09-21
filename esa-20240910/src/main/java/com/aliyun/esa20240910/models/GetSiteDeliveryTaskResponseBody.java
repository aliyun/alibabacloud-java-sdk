// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteDeliveryTaskResponseBody extends TeaModel {
    /**
     * <p>The real-time log type. Valid values:</p>
     * <ul>
     * <li><strong>dcdn_log_access_l1 (default)</strong>: access log.</li>
     * <li><strong>dcdn_log_er</strong>: Edge Routine function log.</li>
     * <li><strong>dcdn_log_waf</strong>: security protection log.</li>
     * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration log.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The data center. Valid values:</p>
     * <ul>
     * <li><strong>cn</strong>: the Chinese mainland.</li>
     * <li><strong>sg</strong>: global (excluding the Chinese mainland).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The delivery type. Valid values:</p>
     * <ul>
     * <li><strong>sls</strong>: Alibaba Cloud Simple Log Service.</li>
     * <li><strong>http</strong>: HTTP service.</li>
     * <li><strong>aws3</strong>: Amazon S3 service.</li>
     * <li><strong>oss</strong>: Alibaba Cloud Object Storage Service.</li>
     * <li><strong>kafka</strong>: Kafka service.</li>
     * <li><strong>aws3cmpt</strong>: Amazon S3-compatible service.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <p>The discard rate.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>The list of delivery fields.</p>
     * 
     * <strong>example:</strong>
     * <p>Client,UserAgent</p>
     */
    @NameInMap("FieldList")
    public String fieldList;

    /**
     * <p>The filter rules.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("FilterRules")
    public String filterRules;

    /**
     * <p>The version of the filter rules.</p>
     * <blockquote>
     * <p>For backward compatibility with legacy filter rules, the default value is v1. Newly created tasks use v2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("FilterVer")
    public String filterVer;

    /**
     * <p>The filter rules for the delivery task.</p>
     * <blockquote>
     * <p>The new version of delivery filter rules.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;where&quot;: {
     *     &quot;or&quot;: [
     *       {
     *         &quot;and&quot;: [
     *           { &quot;key&quot;: &quot;site&quot;, &quot;operator&quot;: &quot;eq&quot;, &quot;value&quot;: &quot;example.com&quot; },
     *           { &quot;key&quot;: &quot;status_code&quot;, &quot;operator&quot;: &quot;in&quot;, &quot;value&quot;: [&quot;200&quot;, &quot;304&quot;] }
     *         ]
     *       }
     *     ]
     *   }
     * }</p>
     */
    @NameInMap("RawRule")
    public String rawRule;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The delivery configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Region\&quot;: \&quot;cn-hangzhou\&quot;, \&quot;Endpoint\&quot;: \&quot;https://***.oss-cn-hangzhou.aliyuncs.com\&quot;, \&quot;BucketPath\&quot;: \&quot;hjy-test002/online-logs\&quot;}</p>
     */
    @NameInMap("SinkConfig")
    public Object sinkConfig;

    /**
     * <p>The site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456****</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The site name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.***.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li><p><strong>online</strong>: pushing.</p>
     * </li>
     * <li><p><strong>offline</strong>: push paused.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>cdn-test-task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static GetSiteDeliveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSiteDeliveryTaskResponseBody self = new GetSiteDeliveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSiteDeliveryTaskResponseBody setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetSiteDeliveryTaskResponseBody setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public GetSiteDeliveryTaskResponseBody setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public GetSiteDeliveryTaskResponseBody setDiscardRate(Float discardRate) {
        this.discardRate = discardRate;
        return this;
    }
    public Float getDiscardRate() {
        return this.discardRate;
    }

    public GetSiteDeliveryTaskResponseBody setFieldList(String fieldList) {
        this.fieldList = fieldList;
        return this;
    }
    public String getFieldList() {
        return this.fieldList;
    }

    public GetSiteDeliveryTaskResponseBody setFilterRules(String filterRules) {
        this.filterRules = filterRules;
        return this;
    }
    public String getFilterRules() {
        return this.filterRules;
    }

    public GetSiteDeliveryTaskResponseBody setFilterVer(String filterVer) {
        this.filterVer = filterVer;
        return this;
    }
    public String getFilterVer() {
        return this.filterVer;
    }

    public GetSiteDeliveryTaskResponseBody setRawRule(String rawRule) {
        this.rawRule = rawRule;
        return this;
    }
    public String getRawRule() {
        return this.rawRule;
    }

    public GetSiteDeliveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSiteDeliveryTaskResponseBody setSinkConfig(Object sinkConfig) {
        this.sinkConfig = sinkConfig;
        return this;
    }
    public Object getSinkConfig() {
        return this.sinkConfig;
    }

    public GetSiteDeliveryTaskResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetSiteDeliveryTaskResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public GetSiteDeliveryTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSiteDeliveryTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
