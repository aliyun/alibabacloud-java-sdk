// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCensRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     * <br>
     * <p>You can specify at most five filter conditions in each call.</p>
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
     * <p>The number of entries to return on each page. Valid values: **1** to **50**. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group to which the CEN instance belongs.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     * <br>
     * <p>You can specify at most 20 tags in each call.</p>
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
         * <p>The key of the filter. Valid values:</p>
         * <br>
         * <p>*   **CenId**: the ID of a CEN instance.</p>
         * <p>*   **Name**: the name of a CEN instance.</p>
         * <br>
         * <p>By default, the logical operator among filter conditions is **AND**. Information about a CEN instance is returned only if the CEN instance matches all filter conditions.</p>
         * <br>
         * <p>You can specify at most five filter conditions in each call.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * <br>
         * <p>Specify a filter value based on the **Key** parameter. You can specify multiple values for a filter **key**. The logical operator among multiple filter values is **OR**. If a CEN instance matches one or more of the values that you specify, the CEN instance matches the filter condition.</p>
         * <br>
         * <p>You can specify at most five values in each filter condition.</p>
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
         * <p>The tag keys.</p>
         * <br>
         * <p>The tag keys cannot be an empty string. The tag keys can be up to 64 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>You can specify at most 20 tag keys.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag values.</p>
         * <br>
         * <p>The tag values can be 0 to 128 characters in length, and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.</p>
         * <br>
         * <p>Each tag key must have a unique tag value. You can specify at most 20 tag values in each call.</p>
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
