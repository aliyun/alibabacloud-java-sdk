// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeCensRequest extends TeaModel {
    /**
     * <p>The filter conditions.</p>
     * <p>You can specify up to 5 filter conditions at a time.</p>
     */
    @NameInMap("Filter")
    public java.util.List<DescribeCensRequestFilter> filter;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number to query. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page for a paged query. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>10</strong>.</p>
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
     * <p>The tag information.</p>
     * <p>You can specify up to 20 tags at a time.</p>
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
         * <p>The filter condition. Valid values:</p>
         * <ul>
         * <li><strong>CenId</strong>: the CEN instance ID.</li>
         * <li><strong>Name</strong>: the CEN instance name.</li>
         * </ul>
         * <p>The relationship between multiple filter conditions is <strong>AND</strong>, which means that a record must match all filter conditions to be returned.</p>
         * <p>You can specify up to 5 filter conditions at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>CenId</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * <p>Specify filter values based on the <strong>Key</strong> parameter. You can specify multiple filter values for a single <strong>Key</strong>. The relationship between multiple filter values is <strong>OR</strong>, which means that a record is returned if it matches any of the filter values.</p>
         * <p>You can specify up to 5 filter values for each filter condition.</p>
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
         * <p>You can specify up to 20 tag keys at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>The tag value can be an empty string or up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * <p>Each tag key corresponds to one tag value. You can specify up to 20 tag values at a time.</p>
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
