// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCensRequest extends TeaModel {
    /**
     * <p>The key of the tag.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeCensRequestFilter> filter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The value of the filter condition.</p>
     * <br>
     * <p>This parameter sets the value of a filter **key**. You can specify multiple values for a filter **key**. The logical operator among multiple filter values is **OR**. If a CEN instance matches one or more of the values that you specify, the CEN instance matches the filter condition.</p>
     * <br>
     * <p>You can specify at most five values in each filter condition.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of entries to return on each page. Valid values: **1** to **50**. Default value: **10**.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeCensRequestTag> tag;

    public static DescribeCensRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCensRequest self = new DescribeCensRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCensRequest setFilter(java.util.List<DescribeCensRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeCensRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeCensRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeCensRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCensRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCensRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCensRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeCensRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeCensRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeCensRequest setTag(java.util.List<DescribeCensRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeCensRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeCensRequestFilter extends TeaModel {
        /**
         * <p>The name of the CEN instance.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The time when the CEN instance was created.</p>
         * <br>
         * <p>The time follows the ISO8601 standard in the `YYYY-MM-DDThh:mmZ` format. The time is displayed in UTC.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static DescribeCensRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensRequestFilter self = new DescribeCensRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeCensRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCensRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

    public static class DescribeCensRequestTag extends TeaModel {
        /**
         * <p>The list of the filter conditions.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The description of the CEN instance.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeCensRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeCensRequestTag self = new DescribeCensRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeCensRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeCensRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
