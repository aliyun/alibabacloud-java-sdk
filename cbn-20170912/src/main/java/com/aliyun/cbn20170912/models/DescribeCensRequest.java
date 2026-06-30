// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCensRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     * <p>You can specify up to five filter conditions.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeCensRequestFilter> filter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the resource group to which the CEN instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3unpnuw****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags.</p>
     * <p>You can specify up to 20 tags.</p>
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
         * <p>The filter key. Valid values:</p>
         * <ul>
         * <li><p><strong>CenId</strong>: The ID of the CEN instance.</p>
         * </li>
         * <li><p><strong>Name</strong>: The name of the CEN instance.</p>
         * </li>
         * </ul>
         * <p>The logical relationship among multiple filter conditions is <strong>AND</strong>. All filter conditions must be met.</p>
         * <p>You can specify up to five filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>CenId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The filter value.</p>
         * <p>Specify the filter value based on the <strong>Key</strong>. You can specify multiple values for a key. The logical relationship among the values is <strong>OR</strong>. A resource is a match if it meets any of the specified values.</p>
         * <p>You can specify up to five filter values for a filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-0xyeagctz5sfg9****</p>
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
         * <p>The tag key of the resource.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>The tag value can be an empty string or a string of up to 128 characters. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key must have a corresponding tag value. You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
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
