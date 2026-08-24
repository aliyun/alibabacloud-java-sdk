// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kvcachestore20260617.models;

import com.aliyun.tea.*;

public class UpdateKVCacheStoreRequest extends TeaModel {
    /**
     * <p>The new storage capacity in GiB. The value must be a multiple of 300 TiB and greater than the current capacity.</p>
     * 
     * <strong>example:</strong>
     * <p>4096</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>YOUR_CLIENT_TOKEN</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new KVCacheStore description. The description must be 2 to 256 characters in length and can contain English and Chinese characters. The description cannot start with http:// or https://. Default value: empty.</p>
     * 
     * <strong>example:</strong>
     * <p>project name pass the check</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The KVCacheStore instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kvcs-your-id</p>
     */
    @NameInMap("KvcsId")
    public String kvcsId;

    /**
     * <p>The new KVCacheStore name. The name must be 2 to 128 characters in length and can contain characters that are categorized as letter in Unicode (including English and Chinese characters) and digits. The name can contain colons (:), underscores (_), periods (.), and hyphens (-). If this parameter is not specified, the default value is the KVCacheStore ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1633730290118313-HD-m3u8</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID, such as cn-hangzhou.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The list of resource tag key-value pairs. A maximum of 20 tags are supported.</p>
     */
    @NameInMap("Tag")
    public java.util.List<UpdateKVCacheStoreRequestTag> tag;

    public static UpdateKVCacheStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKVCacheStoreRequest self = new UpdateKVCacheStoreRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKVCacheStoreRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public UpdateKVCacheStoreRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateKVCacheStoreRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateKVCacheStoreRequest setKvcsId(String kvcsId) {
        this.kvcsId = kvcsId;
        return this;
    }
    public String getKvcsId() {
        return this.kvcsId;
    }

    public UpdateKVCacheStoreRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateKVCacheStoreRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateKVCacheStoreRequest setTag(java.util.List<UpdateKVCacheStoreRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<UpdateKVCacheStoreRequestTag> getTag() {
        return this.tag;
    }

    public static class UpdateKVCacheStoreRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>projectId</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>projectName</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static UpdateKVCacheStoreRequestTag build(java.util.Map<String, ?> map) throws Exception {
            UpdateKVCacheStoreRequestTag self = new UpdateKVCacheStoreRequestTag();
            return TeaModel.build(map, self);
        }

        public UpdateKVCacheStoreRequestTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public UpdateKVCacheStoreRequestTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
