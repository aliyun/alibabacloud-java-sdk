// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.buss20220822.models;

import com.aliyun.tea.*;

public class CreateUserInvestigationInfoQueryTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dataType")
    public String dataType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("employeeId")
    public String employeeId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ossFileName")
    public String ossFileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("userId")
    public String userId;

    public static CreateUserInvestigationInfoQueryTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUserInvestigationInfoQueryTaskRequest self = new CreateUserInvestigationInfoQueryTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateUserInvestigationInfoQueryTaskRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public CreateUserInvestigationInfoQueryTaskRequest setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }
    public String getEmployeeId() {
        return this.employeeId;
    }

    public CreateUserInvestigationInfoQueryTaskRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateUserInvestigationInfoQueryTaskRequest setOssFileName(String ossFileName) {
        this.ossFileName = ossFileName;
        return this;
    }
    public String getOssFileName() {
        return this.ossFileName;
    }

    public CreateUserInvestigationInfoQueryTaskRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateUserInvestigationInfoQueryTaskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
