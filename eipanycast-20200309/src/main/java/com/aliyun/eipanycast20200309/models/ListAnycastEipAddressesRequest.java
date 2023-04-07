// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ListAnycastEipAddressesRequest extends TeaModel {
    @NameInMap("AnycastEipAddress")
    public String anycastEipAddress;

    @NameInMap("AnycastId")
    public String anycastId;

    @NameInMap("AnycastIds")
    public java.util.List<String> anycastIds;

    @NameInMap("BindInstanceIds")
    public java.util.List<String> bindInstanceIds;

    @NameInMap("BusinessStatus")
    public String businessStatus;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("InternetChargeType")
    public String internetChargeType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Name")
    public String name;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ServiceLocation")
    public String serviceLocation;

    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<ListAnycastEipAddressesRequestTags> tags;

    public static ListAnycastEipAddressesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAnycastEipAddressesRequest self = new ListAnycastEipAddressesRequest();
        return TeaModel.build(map, self);
    }

    public ListAnycastEipAddressesRequest setAnycastEipAddress(String anycastEipAddress) {
        this.anycastEipAddress = anycastEipAddress;
        return this;
    }
    public String getAnycastEipAddress() {
        return this.anycastEipAddress;
    }

    public ListAnycastEipAddressesRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public ListAnycastEipAddressesRequest setAnycastIds(java.util.List<String> anycastIds) {
        this.anycastIds = anycastIds;
        return this;
    }
    public java.util.List<String> getAnycastIds() {
        return this.anycastIds;
    }

    public ListAnycastEipAddressesRequest setBindInstanceIds(java.util.List<String> bindInstanceIds) {
        this.bindInstanceIds = bindInstanceIds;
        return this;
    }
    public java.util.List<String> getBindInstanceIds() {
        return this.bindInstanceIds;
    }

    public ListAnycastEipAddressesRequest setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
        return this;
    }
    public String getBusinessStatus() {
        return this.businessStatus;
    }

    public ListAnycastEipAddressesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ListAnycastEipAddressesRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public ListAnycastEipAddressesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAnycastEipAddressesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAnycastEipAddressesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAnycastEipAddressesRequest setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
        return this;
    }
    public String getServiceLocation() {
        return this.serviceLocation;
    }

    public ListAnycastEipAddressesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListAnycastEipAddressesRequest setTags(java.util.List<ListAnycastEipAddressesRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListAnycastEipAddressesRequestTags> getTags() {
        return this.tags;
    }

    public static class ListAnycastEipAddressesRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListAnycastEipAddressesRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListAnycastEipAddressesRequestTags self = new ListAnycastEipAddressesRequestTags();
            return TeaModel.build(map, self);
        }

        public ListAnycastEipAddressesRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListAnycastEipAddressesRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
