// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessInstanceTasksRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProcessInstanceId")
    public Long processInstanceId;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeProcessInstanceTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessInstanceTasksRequest self = new DescribeProcessInstanceTasksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessInstanceTasksRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeProcessInstanceTasksRequest setProcessInstanceId(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public Long getProcessInstanceId() {
        return this.processInstanceId;
    }

    public DescribeProcessInstanceTasksRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public DescribeProcessInstanceTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
