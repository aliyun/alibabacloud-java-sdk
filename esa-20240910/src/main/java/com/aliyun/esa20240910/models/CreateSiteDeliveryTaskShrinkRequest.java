// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteDeliveryTaskShrinkRequest extends TeaModel {
    /**
     * <p>The business type. Valid values:</p>
     * <ul>
     * <li><strong>dcdn_log_access_l1</strong> (default): Access logs.</li>
     * <li><strong>dcdn_log_er</strong>: Edge Routine logs.</li>
     * <li><strong>dcdn_log_waf</strong>: Security protection logs.</li>
     * <li><strong>dcdn_log_ipa</strong>: Layer 4 acceleration logs.</li>
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
     * <li><strong>cn</strong>: The Chinese mainland.</li>
     * <li><strong>oversea</strong>: Outside the Chinese mainland.</li>
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
     * <li><strong>sls</strong>: Simple Log Service.</li>
     * <li><strong>http</strong>: HTTP service.</li>
     * <li><strong>aws3</strong>: Amazon S3.</li>
     * <li><strong>oss</strong>: Object Storage Service (OSS).</li>
     * <li><strong>kafka</strong>: Kafka service.</li>
     * <li><strong>aws3cmpt</strong>: Amazon S3-compatible service.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <p>The discard rate. If you do not specify this parameter, the default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>The log fields to be delivered, separated by commas (,).</p>
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
     * <p>The HTTP delivery configuration parameters.</p>
     */
    @NameInMap("HttpDelivery")
    public String httpDeliveryShrink;

    /**
     * <p>The Kafka delivery configuration parameters.</p>
     */
    @NameInMap("KafkaDelivery")
    public String kafkaDeliveryShrink;

    /**
     * <p>The OSS delivery configuration.</p>
     */
    @NameInMap("OssDelivery")
    public String ossDeliveryShrink;

    /**
     * <p>The configuration parameters for S3 or S3-compatible delivery.</p>
     */
    @NameInMap("S3Delivery")
    public String s3DeliveryShrink;

    /**
     * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to query the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12312312112***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>The Simple Log Service delivery configuration.</p>
     */
    @NameInMap("SlsDelivery")
    public String slsDeliveryShrink;

    /**
     * <p>The name of the task.</p>
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
