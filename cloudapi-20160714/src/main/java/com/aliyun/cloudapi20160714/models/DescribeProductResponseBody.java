// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeProductResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("SubscribeMode")
    public String subscribeMode;

    @NameInMap("Domain")
    public Integer domain;

    @NameInMap("SubscribeNumber")
    public Integer subscribeNumber;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ModifiedTime")
    public String modifiedTime;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("Name")
    public String name;

    @NameInMap("CreatedTime")
    public String createdTime;

    @NameInMap("ProductCode")
    public String productCode;

    public static DescribeProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProductResponseBody self = new DescribeProductResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProductResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeProductResponseBody setSubscribeMode(String subscribeMode) {
        this.subscribeMode = subscribeMode;
        return this;
    }
    public String getSubscribeMode() {
        return this.subscribeMode;
    }

    public DescribeProductResponseBody setDomain(Integer domain) {
        this.domain = domain;
        return this;
    }
    public Integer getDomain() {
        return this.domain;
    }

    public DescribeProductResponseBody setSubscribeNumber(Integer subscribeNumber) {
        this.subscribeNumber = subscribeNumber;
        return this;
    }
    public Integer getSubscribeNumber() {
        return this.subscribeNumber;
    }

    public DescribeProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProductResponseBody setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public DescribeProductResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeProductResponseBody setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeProductResponseBody setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public DescribeProductResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeProductResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public DescribeProductResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
