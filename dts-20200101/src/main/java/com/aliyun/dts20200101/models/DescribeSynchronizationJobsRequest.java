// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobsRequest extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The tag value. You can call the [ListTagResources](~~191187~~) operation to query the tag value.</p>
     * <br>
     * <p>> </p>
     * <p>*   N specifies the serial number of the tag. For example, Tag.1.Value specifies the value of the first tag and Tag.2.Value specifies the value of the second tag. You can specify 1 to 20 tag values at a time.</p>
     * <p>*   This parameter can be an empty string.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The **ClientToken** value can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The name of the data synchronization task.</p>
     * <br>
     * <p>>  Fuzzy matching is supported.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tag key. You can call the [ListTagResources](~~191187~~) operation to query the tag key.</p>
     * <br>
     * <p>> </p>
     * <p>*   N specifies the serial number of the tag. For example, Tag.1.Key specifies the key of the first tag and Tag.2.Key specifies the key of the second tag. You can specify 1 to 20 tag keys at a time.</p>
     * <p>*   This parameter cannot be an empty string.</p>
     */
    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    @NameInMap("Tag")
    public java.util.List<DescribeSynchronizationJobsRequestTag> tag;

    public static DescribeSynchronizationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobsRequest self = new DescribeSynchronizationJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeSynchronizationJobsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeSynchronizationJobsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeSynchronizationJobsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeSynchronizationJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSynchronizationJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSynchronizationJobsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeSynchronizationJobsRequest setSynchronizationJobName(String synchronizationJobName) {
        this.synchronizationJobName = synchronizationJobName;
        return this;
    }
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public DescribeSynchronizationJobsRequest setTag(java.util.List<DescribeSynchronizationJobsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeSynchronizationJobsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeSynchronizationJobsRequestTag extends TeaModel {
        /**
         * <p>The ID of the request.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The maximum number of entries that can be displayed on the current page.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeSynchronizationJobsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeSynchronizationJobsRequestTag self = new DescribeSynchronizationJobsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeSynchronizationJobsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeSynchronizationJobsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
