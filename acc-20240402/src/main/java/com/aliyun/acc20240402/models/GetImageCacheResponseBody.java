// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acc20240402.models;

import com.aliyun.tea.*;

public class GetImageCacheResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2025-**-**T07:55:25Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Events")
    public java.util.List<GetImageCacheResponseBodyEvents> events;

    /**
     * <strong>example:</strong>
     * <p>imc-bp1dj*****</p>
     */
    @NameInMap("ImageCacheId")
    public String imageCacheId;

    /**
     * <strong>example:</strong>
     * <p>my-imc</p>
     */
    @NameInMap("ImageCacheName")
    public String imageCacheName;

    @NameInMap("Images")
    public java.util.List<String> images;

    @NameInMap("NetworkConfig")
    public GetImageCacheResponseBodyNetworkConfig networkConfig;

    /**
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>2025-**-**T07:58:25Z</p>
     */
    @NameInMap("ReadyTime")
    public String readyTime;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>0E234675-3465-4CC3-9D0F-9A864BC*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rg-aekzh43v*****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tags")
    public java.util.List<GetImageCacheResponseBodyTags> tags;

    public static GetImageCacheResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageCacheResponseBody self = new GetImageCacheResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageCacheResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetImageCacheResponseBody setEvents(java.util.List<GetImageCacheResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<GetImageCacheResponseBodyEvents> getEvents() {
        return this.events;
    }

    public GetImageCacheResponseBody setImageCacheId(String imageCacheId) {
        this.imageCacheId = imageCacheId;
        return this;
    }
    public String getImageCacheId() {
        return this.imageCacheId;
    }

    public GetImageCacheResponseBody setImageCacheName(String imageCacheName) {
        this.imageCacheName = imageCacheName;
        return this;
    }
    public String getImageCacheName() {
        return this.imageCacheName;
    }

    public GetImageCacheResponseBody setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public GetImageCacheResponseBody setNetworkConfig(GetImageCacheResponseBodyNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public GetImageCacheResponseBodyNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public GetImageCacheResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public GetImageCacheResponseBody setReadyTime(String readyTime) {
        this.readyTime = readyTime;
        return this;
    }
    public String getReadyTime() {
        return this.readyTime;
    }

    public GetImageCacheResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetImageCacheResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageCacheResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetImageCacheResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public GetImageCacheResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetImageCacheResponseBody setTags(java.util.List<GetImageCacheResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetImageCacheResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetImageCacheResponseBodyEvents extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>2025-**-**T02:24:48Z</p>
         */
        @NameInMap("FirstTimestamp")
        public String firstTimestamp;

        /**
         * <strong>example:</strong>
         * <p>2025-**-**T02:24:48Z</p>
         */
        @NameInMap("LastTimestamp")
        public String lastTimestamp;

        /**
         * <strong>example:</strong>
         * <p>Image cache [my-imc] has been created successfully</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>imagetest.1661f31f851*****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>ImageCacheCreated</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetImageCacheResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            GetImageCacheResponseBodyEvents self = new GetImageCacheResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public GetImageCacheResponseBodyEvents setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetImageCacheResponseBodyEvents setFirstTimestamp(String firstTimestamp) {
            this.firstTimestamp = firstTimestamp;
            return this;
        }
        public String getFirstTimestamp() {
            return this.firstTimestamp;
        }

        public GetImageCacheResponseBodyEvents setLastTimestamp(String lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public String getLastTimestamp() {
            return this.lastTimestamp;
        }

        public GetImageCacheResponseBodyEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetImageCacheResponseBodyEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetImageCacheResponseBodyEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetImageCacheResponseBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetImageCacheResponseBodyNetworkConfigEipInstance extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoCreate")
        public Boolean autoCreate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <strong>example:</strong>
         * <p>eip-0jl0bx3fnpnjc9i4*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static GetImageCacheResponseBodyNetworkConfigEipInstance build(java.util.Map<String, ?> map) throws Exception {
            GetImageCacheResponseBodyNetworkConfigEipInstance self = new GetImageCacheResponseBodyNetworkConfigEipInstance();
            return TeaModel.build(map, self);
        }

        public GetImageCacheResponseBodyNetworkConfigEipInstance setAutoCreate(Boolean autoCreate) {
            this.autoCreate = autoCreate;
            return this;
        }
        public Boolean getAutoCreate() {
            return this.autoCreate;
        }

        public GetImageCacheResponseBodyNetworkConfigEipInstance setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public GetImageCacheResponseBodyNetworkConfigEipInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetImageCacheResponseBodyNetworkConfig extends TeaModel {
        @NameInMap("EipInstance")
        public GetImageCacheResponseBodyNetworkConfigEipInstance eipInstance;

        /**
         * <strong>example:</strong>
         * <p>sg-0jlgektkddwa42n*****</p>
         */
        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static GetImageCacheResponseBodyNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            GetImageCacheResponseBodyNetworkConfig self = new GetImageCacheResponseBodyNetworkConfig();
            return TeaModel.build(map, self);
        }

        public GetImageCacheResponseBodyNetworkConfig setEipInstance(GetImageCacheResponseBodyNetworkConfigEipInstance eipInstance) {
            this.eipInstance = eipInstance;
            return this;
        }
        public GetImageCacheResponseBodyNetworkConfigEipInstance getEipInstance() {
            return this.eipInstance;
        }

        public GetImageCacheResponseBodyNetworkConfig setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetImageCacheResponseBodyNetworkConfig setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

    public static class GetImageCacheResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>imc</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetImageCacheResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetImageCacheResponseBodyTags self = new GetImageCacheResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetImageCacheResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetImageCacheResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
