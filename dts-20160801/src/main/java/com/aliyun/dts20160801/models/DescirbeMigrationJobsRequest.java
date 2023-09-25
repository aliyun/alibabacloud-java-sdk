// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescirbeMigrationJobsRequest extends TeaModel {
    @NameInMap("MigrationJobName")
    public String migrationJobName;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescirbeMigrationJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescirbeMigrationJobsRequest self = new DescirbeMigrationJobsRequest();
        return TeaModel.build(map, self);
    }

    public DescirbeMigrationJobsRequest setMigrationJobName(String migrationJobName) {
        this.migrationJobName = migrationJobName;
        return this;
    }
    public String getMigrationJobName() {
        return this.migrationJobName;
    }

    public DescirbeMigrationJobsRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescirbeMigrationJobsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescirbeMigrationJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
