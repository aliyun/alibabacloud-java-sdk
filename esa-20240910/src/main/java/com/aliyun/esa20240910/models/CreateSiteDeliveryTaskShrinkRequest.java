// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteDeliveryTaskShrinkRequest extends TeaModel {
    /**
     * <p>The business type. Valid values:</p>
     * <ul>
     * <li><p><strong>dcdn_log_access_l1</strong> (default): access log.</p>
     * </li>
     * <li><p><strong>dcdn_log_er</strong>: edge function log.</p>
     * </li>
     * <li><p><strong>dcdn_log_waf</strong>: WAF protection log.</p>
     * </li>
     * <li><p><strong>dcdn_log_ipa</strong>: Layer-4 acceleration log.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <li><p><strong>oversea</strong>: regions outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The type of the delivery destination. Valid values:</p>
     * <ul>
     * <li><p><strong>sls</strong>: Log Service.</p>
     * </li>
     * <li><p><strong>http</strong>: an HTTP service.</p>
     * </li>
     * <li><p><strong>aws3</strong>: Amazon S3.</p>
     * </li>
     * <li><p><strong>oss</strong>: Object Storage Service.</p>
     * </li>
     * <li><p><strong>kafka</strong>: a Kafka service.</p>
     * </li>
     * <li><p><strong>aws3cmpt</strong>: an Amazon S3-compatible service.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <p>The discard rate. If you do not specify this parameter, the default value 0 is used.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>The log fields for delivery. Separate multiple fields with a comma (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_agent,ip_adress,ip_port</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("FilterVer")
    public String filterVer;

    /**
     * <p>The parameters for delivering logs to an HTTP server.</p>
     */
    @NameInMap("HttpDelivery")
    public String httpDeliveryShrink;

    /**
     * <p>The parameters for delivering logs to a Kafka cluster.</p>
     */
    @NameInMap("KafkaDelivery")
    public String kafkaDeliveryShrink;

    /**
     * <p>The parameters for delivering logs to Object Storage Service (OSS).</p>
     */
    @NameInMap("OssDelivery")
    public String ossDeliveryShrink;

    /**
     * <p>The parameters for delivering logs to an Amazon S3 bucket or an S3-compatible service.</p>
     */
    @NameInMap("S3Delivery")
    public String s3DeliveryShrink;

    /**
     * <p>The ID of the site. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12312312112***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The parameters for delivering logs to Log Service.</p>
     */
    @NameInMap("SlsDelivery")
    public String slsDeliveryShrink;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn-test-task</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateSiteDeliveryTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSiteDeliveryTaskShrinkRequest self = new CreateSiteDeliveryTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSiteDeliveryTaskShrinkRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateSiteDeliveryTaskShrinkRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateSiteDeliveryTaskShrinkRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public CreateSiteDeliveryTaskShrinkRequest setDiscardRate(Float discardRate) {
        this.discardRate = discardRate;
        return this;
    }
    public Float getDiscardRate() {
        return this.discardRate;
    }

    public CreateSiteDeliveryTaskShrinkRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public CreateSiteDeliveryTaskShrinkRequest setFilterVer(String filterVer) {
        this.filterVer = filterVer;
        return this;
    }
    public String getFilterVer() {
        return this.filterVer;
    }

    public CreateSiteDeliveryTaskShrinkRequest setHttpDeliveryShrink(String httpDeliveryShrink) {
        this.httpDeliveryShrink = httpDeliveryShrink;
        return this;
    }
    public String getHttpDeliveryShrink() {
        return this.httpDeliveryShrink;
    }

    public CreateSiteDeliveryTaskShrinkRequest setKafkaDeliveryShrink(String kafkaDeliveryShrink) {
        this.kafkaDeliveryShrink = kafkaDeliveryShrink;
        return this;
    }
    public String getKafkaDeliveryShrink() {
        return this.kafkaDeliveryShrink;
    }

    public CreateSiteDeliveryTaskShrinkRequest setOssDeliveryShrink(String ossDeliveryShrink) {
        this.ossDeliveryShrink = ossDeliveryShrink;
        return this;
    }
    public String getOssDeliveryShrink() {
        return this.ossDeliveryShrink;
    }

    public CreateSiteDeliveryTaskShrinkRequest setS3DeliveryShrink(String s3DeliveryShrink) {
        this.s3DeliveryShrink = s3DeliveryShrink;
        return this;
    }
    public String getS3DeliveryShrink() {
        return this.s3DeliveryShrink;
    }

    public CreateSiteDeliveryTaskShrinkRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public CreateSiteDeliveryTaskShrinkRequest setSlsDeliveryShrink(String slsDeliveryShrink) {
        this.slsDeliveryShrink = slsDeliveryShrink;
        return this;
    }
    public String getSlsDeliveryShrink() {
        return this.slsDeliveryShrink;
    }

    public CreateSiteDeliveryTaskShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
