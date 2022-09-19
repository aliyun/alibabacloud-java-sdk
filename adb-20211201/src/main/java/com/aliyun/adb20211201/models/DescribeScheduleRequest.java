// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeScheduleRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("ProcessCode")
    public Long processCode;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleRequest self = new DescribeScheduleRequest();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeScheduleRequest setProcessCode(Long processCode) {
        this.processCode = processCode;
        return this;
    }
    public Long getProcessCode() {
        return this.processCode;
    }

    public DescribeScheduleRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public DescribeScheduleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
