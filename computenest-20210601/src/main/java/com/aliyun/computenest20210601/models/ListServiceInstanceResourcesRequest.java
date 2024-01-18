// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class ListServiceInstanceResourcesRequest extends TeaModel {
    @NameInMap("ExpireTimeEnd")
    public String expireTimeEnd;

    @NameInMap("ExpireTimeStart")
    public String expireTimeStart;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PayType")
    public String payType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceARN")
    public java.util.List<String> resourceARN;

    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    @NameInMap("ServiceInstanceResourceType")
    public String serviceInstanceResourceType;

    @NameInMap("Tag")
    public java.util.List<ListServiceInstanceResourcesRequestTag> tag;

    public static ListServiceInstanceResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceResourcesRequest self = new ListServiceInstanceResourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceResourcesRequest setExpireTimeEnd(String expireTimeEnd) {
        this.expireTimeEnd = expireTimeEnd;
        return this;
    }
    public String getExpireTimeEnd() {
        return this.expireTimeEnd;
    }

    public ListServiceInstanceResourcesRequest setExpireTimeStart(String expireTimeStart) {
        this.expireTimeStart = expireTimeStart;
        return this;
    }
    public String getExpireTimeStart() {
        return this.expireTimeStart;
    }

    public ListServiceInstanceResourcesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceResourcesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceResourcesRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ListServiceInstanceResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceInstanceResourcesRequest setResourceARN(java.util.List<String> resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }
    public java.util.List<String> getResourceARN() {
        return this.resourceARN;
    }

    public ListServiceInstanceResourcesRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public ListServiceInstanceResourcesRequest setServiceInstanceResourceType(String serviceInstanceResourceType) {
        this.serviceInstanceResourceType = serviceInstanceResourceType;
        return this;
    }
    public String getServiceInstanceResourceType() {
        return this.serviceInstanceResourceType;
    }

    public ListServiceInstanceResourcesRequest setTag(java.util.List<ListServiceInstanceResourcesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListServiceInstanceResourcesRequestTag> getTag() {
        return this.tag;
    }

    public static class ListServiceInstanceResourcesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListServiceInstanceResourcesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceResourcesRequestTag self = new ListServiceInstanceResourcesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceResourcesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListServiceInstanceResourcesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
