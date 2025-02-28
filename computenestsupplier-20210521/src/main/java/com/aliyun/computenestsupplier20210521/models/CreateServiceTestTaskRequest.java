// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateServiceTestTaskRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    /**
     * <p>The Task Execution Region</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("TaskRegionId")
    public String taskRegionId;

    /**
     * <p>The service test case ids.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TestCaseIds")
    public java.util.List<String> testCaseIds;

    public static CreateServiceTestTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTestTaskRequest self = new CreateServiceTestTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceTestTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateServiceTestTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateServiceTestTaskRequest setTaskRegionId(String taskRegionId) {
        this.taskRegionId = taskRegionId;
        return this;
    }
    public String getTaskRegionId() {
        return this.taskRegionId;
    }

    public CreateServiceTestTaskRequest setTestCaseIds(java.util.List<String> testCaseIds) {
        this.testCaseIds = testCaseIds;
        return this;
    }
    public java.util.List<String> getTestCaseIds() {
        return this.testCaseIds;
    }

}
