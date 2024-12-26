// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetUserDeliveryTaskResponseBody extends TeaModel {
    /**
     * <p>The log category. Valid values:</p>
     * <ul>
     * <li><strong>dcdn_log_access_l1</strong> (default): access logs.</li>
     * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
     * <li><strong>dcdn_log_waf</strong>: firewall logs.</li>
     * <li><strong>dcdn_log_ipa</strong>: TCP/UDP proxy logs.</li>
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
     * <li>cn: the Chinese mainland.</li>
     * <li>sg: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The destination of the delivery. Valid values:</p>
     * <ul>
     * <li>sls: Alibaba Cloud Simple Log Service (SLS).</li>
     * <li>http: HTTP server.</li>
     * <li>aws3: Amazon Simple Storage Service (S3).</li>
     * <li>oss: Alibaba Cloud Object Storage Service (OSS).</li>
     * <li>kafka: Kafka.</li>
     * <li>aws3cmpt: S3-compatible storage service.</li>
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
     * <p>The fields.</p>
     * 
     * <strong>example:</strong>
     * <p>ClientRequestID,ClientRequestHost</p>
     */
    @NameInMap("FieldList")
    public String fieldList;

    /**
     * <p>The filtering rules.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;ClientSSLProtocol&quot;: {&quot;equals&quot;: [&quot;TLSv1.3&quot;]}}]</p>
     */
    @NameInMap("FilterRules")
    public String filterRules;

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
     * <p>The status of the delivery task.</p>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name of the delivery task.</p>
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
