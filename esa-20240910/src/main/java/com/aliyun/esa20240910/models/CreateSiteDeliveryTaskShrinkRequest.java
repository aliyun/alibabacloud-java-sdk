// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateSiteDeliveryTaskShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    /**
     * <strong>example:</strong>
     * <p>0.0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_agent,ip_adress,ip_port</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("HttpDelivery")
    public String httpDeliveryShrink;

    @NameInMap("KafkaDelivery")
    public String kafkaDeliveryShrink;

    @NameInMap("OssDelivery")
    public String ossDeliveryShrink;

    @NameInMap("S3Delivery")
    public String s3DeliveryShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12312312112***</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    @NameInMap("SlsDelivery")
    public String slsDeliveryShrink;

    /**
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
