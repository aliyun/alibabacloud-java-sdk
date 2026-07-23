// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateUserDeliveryTaskShrinkRequest extends TeaModel {
    /**
     * <p>The real-time log type. Valid values:</p>
     * <ul>
     * <li><strong>dcdn_log_access_l1 (default)</strong>: access logs.</li>
     * <li><strong>dcdn_log_er</strong>: edge function logs.</li>
     * <li><strong>dcdn_log_waf</strong>: security protection logs.</li>
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
     * <li><strong>cn</strong>: Chinese mainland.</li>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DeliveryType")
    public String deliveryType;

    @NameInMap("Details")
    public String details;

    /**
     * <p>The discard rate. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DiscardRate")
    public Float discardRate;

    /**
     * <p>The fields to be selected, separated by commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>user_agent,ip_address,ip_port</p>
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
     * <p>The OSS delivery configuration parameters.</p>
     */
    @NameInMap("OssDelivery")
    public String ossDeliveryShrink;

    /**
     * <p>The S3 or S3-compatible delivery configuration parameters.</p>
     */
    @NameInMap("S3Delivery")
    public String s3DeliveryShrink;

    /**
     * <p>The SLS delivery configuration.</p>
     */
    @NameInMap("SlsDelivery")
    public String slsDeliveryShrink;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_project</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static CreateUserDeliveryTaskShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserDeliveryTaskShrinkRequest self = new CreateUserDeliveryTaskShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserDeliveryTaskShrinkRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateUserDeliveryTaskShrinkRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateUserDeliveryTaskShrinkRequest setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
        return this;
    }
    public String getDeliveryType() {
        return this.deliveryType;
    }

    public CreateUserDeliveryTaskShrinkRequest setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getDetails() {
        return this.details;
    }

    public CreateUserDeliveryTaskShrinkRequest setDiscardRate(Float discardRate) {
        this.discardRate = discardRate;
        return this;
    }
    public Float getDiscardRate() {
        return this.discardRate;
    }

    public CreateUserDeliveryTaskShrinkRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public CreateUserDeliveryTaskShrinkRequest setFilterVer(String filterVer) {
        this.filterVer = filterVer;
        return this;
    }
    public String getFilterVer() {
        return this.filterVer;
    }

    public CreateUserDeliveryTaskShrinkRequest setHttpDeliveryShrink(String httpDeliveryShrink) {
        this.httpDeliveryShrink = httpDeliveryShrink;
        return this;
    }
    public String getHttpDeliveryShrink() {
        return this.httpDeliveryShrink;
    }

    public CreateUserDeliveryTaskShrinkRequest setKafkaDeliveryShrink(String kafkaDeliveryShrink) {
        this.kafkaDeliveryShrink = kafkaDeliveryShrink;
        return this;
    }
    public String getKafkaDeliveryShrink() {
        return this.kafkaDeliveryShrink;
    }

    public CreateUserDeliveryTaskShrinkRequest setOssDeliveryShrink(String ossDeliveryShrink) {
        this.ossDeliveryShrink = ossDeliveryShrink;
        return this;
    }
    public String getOssDeliveryShrink() {
        return this.ossDeliveryShrink;
    }

    public CreateUserDeliveryTaskShrinkRequest setS3DeliveryShrink(String s3DeliveryShrink) {
        this.s3DeliveryShrink = s3DeliveryShrink;
        return this;
    }
    public String getS3DeliveryShrink() {
        return this.s3DeliveryShrink;
    }

    public CreateUserDeliveryTaskShrinkRequest setSlsDeliveryShrink(String slsDeliveryShrink) {
        this.slsDeliveryShrink = slsDeliveryShrink;
        return this;
    }
    public String getSlsDeliveryShrink() {
        return this.slsDeliveryShrink;
    }

    public CreateUserDeliveryTaskShrinkRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
