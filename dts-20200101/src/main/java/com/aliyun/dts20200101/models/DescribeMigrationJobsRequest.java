// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobsRequest extends TeaModel {
    /**
     * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
     */
    @NameInMap("AccountId")
    public String accountId;

    /**
     * <p>The name of the data migration task.</p>
     * <br>
     * <p>>  Fuzzy match is supported.</p>
     */
    @NameInMap("MigrationJobName")
    public String migrationJobName;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than **0** and does not exceed the maximum value of the Integer data type. Default value: **1**.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: **30**, **50**, and **100**. Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the region where the data migration instances reside. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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

    public DescribeMigrationJobsRequest setTag(java.util.List<DescribeMigrationJobsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeMigrationJobsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeMigrationJobsRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can call the [ListTagResources](~~191187~~) operation to query the tag key.</p>
         * <br>
         * <p>> </p>
         * <p>*   N specifies the serial number of the tag. For example, Tag.1.Key specifies the key of the first tag and Tag.2.Key specifies the key of the second tag. You can specify 1 to 20 tag keys at a time.</p>
         * <p>*   This parameter cannot be an empty string.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. You can call the [ListTagResources](~~191187~~) operation to query the tag value.</p>
         * <br>
         * <p>> </p>
         * <p>*   N specifies the serial number of the tag. For example, Tag.1.Value specifies the value of the first tag and Tag.2.Value specifies the value of the second tag. You can specify 1 to 20 tag values at a time.</p>
         * <p>*   This parameter can be an empty string.</p>
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
