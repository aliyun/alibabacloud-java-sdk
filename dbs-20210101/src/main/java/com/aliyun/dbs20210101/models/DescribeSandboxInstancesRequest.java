// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeSandboxInstancesRequest extends TeaModel {
    // The ID of the backup schedule. You can call the [DescribeBackupPlanList](~~437215~~) operation to obtain the ID of the backup schedule.
    // 
    // >  If your instance is an ApsaraDB RDS for MySQL instance, you can configure [automatic access to the instance](~~193091~~) to automatically add the instance to DBS and obtain the ID of the backup schedule.
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    // The ID of the sandbox instance. You can call the [CreateSandboxInstance](~~437252~~) parameter to obtain the ID of the sandbox instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The number of the page to return. The value must be an integer that is greater than 0. Default value: 1.
    @NameInMap("PageNumber")
    public String pageNumber;

    // The number of entries to return on each page. Valid values:
    // 
    // *   30 (default value)
    // *   50
    // *   100
    @NameInMap("PageSize")
    public String pageSize;

    public static DescribeSandboxInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxInstancesRequest self = new DescribeSandboxInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxInstancesRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeSandboxInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSandboxInstancesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSandboxInstancesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
