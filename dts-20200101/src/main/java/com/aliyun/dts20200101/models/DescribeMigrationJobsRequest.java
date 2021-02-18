// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobsRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("MigrationJobName")
    public String migrationJobName;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("AccountId")
    public String accountId;

    @NameInMap("Tag")
    public java.util.List<DescribeMigrationJobsRequestTag> tag;

    public static DescribeMigrationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobsRequest self = new DescribeMigrationJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMigrationJobsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
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

    public DescribeMigrationJobsRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeMigrationJobsRequest setTag(java.util.List<DescribeMigrationJobsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeMigrationJobsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeMigrationJobsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

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
