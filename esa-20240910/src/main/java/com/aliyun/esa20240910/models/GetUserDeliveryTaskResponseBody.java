// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserDeliveryTaskResponseBody extends TeaModel {
    /**
     * <p>The business type. Valid values:</p>
     * <ul>
     * <li><p><strong>dcdn_log_access_l1</strong> (default): access log.</p>
     * </li>
     * <li><p><strong>dcdn_log_er</strong>: edge function log.</p>
     * </li>
     * <li><p><strong>dcdn_log_waf</strong>: WAF log.</p>
     * </li>
     * <li><p><strong>dcdn_log_ipa</strong>: Layer 4 acceleration log.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_er</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The data center. Valid values:</p>
     * <ul>
     * <li><p><strong>cn</strong>: Chinese mainland</p>
     * </li>
     * <li><p><strong>sg</strong>: Global (excluding the Chinese mainland)</p>
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
     * <li><p><strong>sls</strong>: Log Service</p>
     * </li>
     * <li><p><strong>http</strong>: HTTP service</p>
     * </li>
     * <li><p><strong>aws3</strong>: Amazon S3</p>
     * </li>
     * <li><p><strong>oss</strong>: OSS</p>
     * </li>
     * <li><p><strong>kafka</strong>: Kafka service</p>
     * </li>
     * <li><p><strong>aws3cmpt</strong>: Amazon S3-compatible service</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    @NameInMap("Details")
    public String details;

    /**
     * <p>The discard rate.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>A comma-separated list of fields.</p>
     * 
     * <strong>example:</strong>
     * <p>ClientRequestID,ClientRequestHost</p>
     */
    @NameInMap("FieldList")
    public String fieldList;

    /**
     * <p>The filter rules.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ClientSSLProtocol&quot;: {&quot;equals&quot;: [&quot;TLSv1.3&quot;]}}]</p>
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
     * <p>7072132a-bd3c-46a6-9e81-aba3e0e3f861</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The delivery configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Project\&quot;: \&quot;er-online-hjy-pro\&quot;, \&quot;Logstore\&quot;: \&quot;er-online-hjy-log\&quot;, \&quot;Region\&quot;: \&quot;cn-hangzhou\&quot;, \&quot;Endpoint\&quot;: \&quot;cn-hangzhou.log.aliyuncs.com\&quot;, \&quot;Aliuid\&quot;: \&quot;1077912128805410\&quot;}</p>
     */
    @NameInMap("SinkConfig")
    public Object sinkConfig;

    /**
     * <p>The task status.</p>
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
     * <p>testoss11</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static GetUserDeliveryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeliveryTaskResponseBody self = new GetUserDeliveryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserDeliveryTaskResponseBody setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GetUserDeliveryTaskResponseBody setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public GetUserDeliveryTaskResponseBody setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public GetUserDeliveryTaskResponseBody setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public GetUserDeliveryTaskResponseBody setDiscardRate(Float discardRate) {
        this.discardRate = discardRate;
        return this;
    }
    public Float getDiscardRate() {
        return this.discardRate;
    }

    public GetUserDeliveryTaskResponseBody setFieldList(String fieldList) {
        this.fieldList = fieldList;
        return this;
    }
    public String getFieldList() {
        return this.fieldList;
    }

    public GetUserDeliveryTaskResponseBody setFilterRules(String filterRules) {
        this.filterRules = filterRules;
        return this;
    }
    public String getFilterRules() {
        return this.filterRules;
    }

    public GetUserDeliveryTaskResponseBody setFilterVer(String filterVer) {
        this.filterVer = filterVer;
        return this;
    }
    public String getFilterVer() {
        return this.filterVer;
    }

    public GetUserDeliveryTaskResponseBody setRawRule(String rawRule) {
        this.rawRule = rawRule;
        return this;
    }
    public String getRawRule() {
        return this.rawRule;
    }

    public GetUserDeliveryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserDeliveryTaskResponseBody setSinkConfig(Object sinkConfig) {
        this.sinkConfig = sinkConfig;
        return this;
    }
    public Object getSinkConfig() {
        return this.sinkConfig;
    }

    public GetUserDeliveryTaskResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetUserDeliveryTaskResponseBody setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
