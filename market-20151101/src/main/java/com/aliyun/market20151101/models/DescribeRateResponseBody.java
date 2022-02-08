// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeRateResponseBody extends TeaModel {
    @NameInMap("AdditionalContent")
    public String additionalContent;

    @NameInMap("AdditionalExplaintion")
    public String additionalExplaintion;

    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("Content")
    public String content;

    @NameInMap("CustomerLabels")
    public String customerLabels;

    @NameInMap("Explaintion")
    public String explaintion;

    @NameInMap("GmtAdditional")
    public Long gmtAdditional;

    @NameInMap("GmtAdditionalExplaintion")
    public Long gmtAdditionalExplaintion;

    @NameInMap("GmtCreated")
    public Long gmtCreated;

    @NameInMap("GmtExplaintion")
    public Long gmtExplaintion;

    @NameInMap("Id")
    public Long id;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("PackageVersion")
    public String packageVersion;

    @NameInMap("ProductId")
    public String productId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Score")
    public String score;

    @NameInMap("Type")
    public String type;

    public static DescribeRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRateResponseBody self = new DescribeRateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRateResponseBody setAdditionalContent(String additionalContent) {
        this.additionalContent = additionalContent;
        return this;
    }
    public String getAdditionalContent() {
        return this.additionalContent;
    }

    public DescribeRateResponseBody setAdditionalExplaintion(String additionalExplaintion) {
        this.additionalExplaintion = additionalExplaintion;
        return this;
    }
    public String getAdditionalExplaintion() {
        return this.additionalExplaintion;
    }

    public DescribeRateResponseBody setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public DescribeRateResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeRateResponseBody setCustomerLabels(String customerLabels) {
        this.customerLabels = customerLabels;
        return this;
    }
    public String getCustomerLabels() {
        return this.customerLabels;
    }

    public DescribeRateResponseBody setExplaintion(String explaintion) {
        this.explaintion = explaintion;
        return this;
    }
    public String getExplaintion() {
        return this.explaintion;
    }

    public DescribeRateResponseBody setGmtAdditional(Long gmtAdditional) {
        this.gmtAdditional = gmtAdditional;
        return this;
    }
    public Long getGmtAdditional() {
        return this.gmtAdditional;
    }

    public DescribeRateResponseBody setGmtAdditionalExplaintion(Long gmtAdditionalExplaintion) {
        this.gmtAdditionalExplaintion = gmtAdditionalExplaintion;
        return this;
    }
    public Long getGmtAdditionalExplaintion() {
        return this.gmtAdditionalExplaintion;
    }

    public DescribeRateResponseBody setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public DescribeRateResponseBody setGmtExplaintion(Long gmtExplaintion) {
        this.gmtExplaintion = gmtExplaintion;
        return this;
    }
    public Long getGmtExplaintion() {
        return this.gmtExplaintion;
    }

    public DescribeRateResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DescribeRateResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRateResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public DescribeRateResponseBody setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }
    public String getPackageVersion() {
        return this.packageVersion;
    }

    public DescribeRateResponseBody setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public DescribeRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRateResponseBody setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

    public DescribeRateResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
