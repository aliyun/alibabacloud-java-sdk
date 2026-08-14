// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobsRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter will be deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>12323344****</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The name of the migration instance.</p>
     * <blockquote>
     * <p>Fuzzy match is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>MySQL迁移</p>
     */
    @NameInMap("MigrationJobName")
    public String migrationJobName;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The page number. The value must be greater than <strong>0</strong> and must not exceed the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of data migration instances to display per page. Valid values: <strong>10</strong>, <strong>20</strong>, and <strong>30</strong>. Default value: <strong>30</strong>. Maximum value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the data migration instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags of the data migration instance, used as filter conditions. When this parameter is not empty, only instance tasks that have the specified tags are returned.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeMigrationJobsRequestTag> tag;

    public static DescribeMigrationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobsRequest self = new DescribeMigrationJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeMigrationJobsRequest setMigrationJobName(String migrationJobName) {
        this.migrationJobName = migrationJobName;
        return this;
    }
    public String getMigrationJobName() {
        return this.migrationJobName;
    }

    public DescribeMigrationJobsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeMigrationJobsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeMigrationJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMigrationJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMigrationJobsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeMigrationJobsRequest setTag(java.util.List<DescribeMigrationJobsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeMigrationJobsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeMigrationJobsRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can call the <a href="https://help.aliyun.com/document_detail/191187.html">ListTagResources</a> operation to query tag keys.</p>
         * <blockquote>
         * <ul>
         * <li>N specifies the serial number of the tag key. For example, Tag.1.Key specifies the key of the first tag, and Tag.2.Key specifies the key of the second tag. You can specify 1 to 20 tag keys at a time.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter cannot be set to an empty string.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can call the <a href="https://help.aliyun.com/document_detail/191187.html">ListTagResources</a> operation to query tag values.</p>
         * <blockquote>
         * <ul>
         * <li>N specifies the serial number of the tag value. For example, Tag.1.Value specifies the value of the first tag, and Tag.2.Value specifies the value of the second tag. You can specify 1 to 20 tag values at a time.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>An empty string is allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeMigrationJobsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMigrationJobsRequestTag self = new DescribeMigrationJobsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeMigrationJobsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMigrationJobsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
