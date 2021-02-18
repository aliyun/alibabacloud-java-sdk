// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstancesRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Tag")
    public java.util.List<DescribeSubscriptionInstancesRequestTag> tag;

    public static DescribeSubscriptionInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstancesRequest self = new DescribeSubscriptionInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSubscriptionInstancesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeSubscriptionInstancesRequest setSubscriptionInstanceName(String subscriptionInstanceName) {
        this.subscriptionInstanceName = subscriptionInstanceName;
        return this;
    }
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    public DescribeSubscriptionInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSubscriptionInstancesRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeSubscriptionInstancesRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeSubscriptionInstancesRequest setTag(java.util.List<DescribeSubscriptionInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSubscriptionInstancesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeSubscriptionInstancesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeSubscriptionInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSubscriptionInstancesRequestTag self = new DescribeSubscriptionInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSubscriptionInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSubscriptionInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
