// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetSiteDeliveryTaskResponseBody extends TeaModel {
    /**
     * <p>The type of real-time log for Dynamic Route for CDN (DCDN). Valid values:</p>
     * <ul>
     * <li><p><strong>dcdn_log_access_l1</strong> (default): access log.</p>
     * </li>
     * <li><p><strong>dcdn_log_er</strong>: edge function log.</p>
     * </li>
     * <li><p><strong>dcdn_log_waf</strong>: WAF log.</p>
     * </li>
     * <li><p><strong>dcdn_log_ipa</strong>: layer 4 acceleration log.</p>
     * </li>
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
     * <li><p><strong>cn</strong>: Chinese mainland.</p>
     * </li>
     * <li><p><strong>sg</strong>: Global (excluding Chinese mainland). Note that the value for this region is &quot;sg&quot;.</p>
     * </li>
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
     * <li><p><strong>sls</strong>: Log Service.</p>
     * </li>
     * <li><p><strong>http</strong>: HTTP service.</p>
     * </li>
     * <li><p><strong>aws3</strong>: Amazon S3.</p>
     * </li>
     * <li><p><strong>oss</strong>: Object Storage Service.</p>
     * </li>
     * <li><p><strong>kafka</strong>: Kafka service.</p>
     * </li>
     * <li><p><strong>aws3cmpt</strong>: Amazon S3-compatible service.</p>
     * </li>
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
     * <p>A comma-separated list of log fields to deliver.</p>
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

    @NameInMap("FilterVer")
    public String filterVer;

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
     * <p>The status of the task. Valid values:</p>
     * <ul>
     * <li><p><strong>online</strong>: The task is delivering logs.</p>
     * </li>
     * <li><p><strong>offline</strong>: The task is paused.</p>
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
