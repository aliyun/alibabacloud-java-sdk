// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteComputeApiRequest extends TeaModel {
    @NameInMap("AutoJobID")
    public Long autoJobID;

    @NameInMap("ExcelID")
    public Long excelID;

    @NameInMap("CutScreenRobot")
    public String cutScreenRobot;

    @NameInMap("CutScreenSheet")
    public String cutScreenSheet;

    @NameInMap("AutoTimeStrategy")
    public String autoTimeStrategy;

    @NameInMap("AutoSwitch")
    public Boolean autoSwitch;

    @NameInMap("AutoAbility")
    public java.util.List<String> autoAbility;

    @NameInMap("CutScreenEmail")
    public String cutScreenEmail;

    @NameInMap("ProjectID")
    public Long projectID;

    public static RemoteComputeApiRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoteComputeApiRequest self = new RemoteComputeApiRequest();
        return TeaModel.build(map, self);
    }

    public RemoteComputeApiRequest setAutoJobID(Long autoJobID) {
        this.autoJobID = autoJobID;
        return this;
    }
    public Long getAutoJobID() {
        return this.autoJobID;
    }

    public RemoteComputeApiRequest setExcelID(Long excelID) {
        this.excelID = excelID;
        return this;
    }
    public Long getExcelID() {
        return this.excelID;
    }

    public RemoteComputeApiRequest setCutScreenRobot(String cutScreenRobot) {
        this.cutScreenRobot = cutScreenRobot;
        return this;
    }
    public String getCutScreenRobot() {
        return this.cutScreenRobot;
    }

    public RemoteComputeApiRequest setCutScreenSheet(String cutScreenSheet) {
        this.cutScreenSheet = cutScreenSheet;
        return this;
    }
    public String getCutScreenSheet() {
        return this.cutScreenSheet;
    }

    public RemoteComputeApiRequest setAutoTimeStrategy(String autoTimeStrategy) {
        this.autoTimeStrategy = autoTimeStrategy;
        return this;
    }
    public String getAutoTimeStrategy() {
        return this.autoTimeStrategy;
    }

    public RemoteComputeApiRequest setAutoSwitch(Boolean autoSwitch) {
        this.autoSwitch = autoSwitch;
        return this;
    }
    public Boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    public RemoteComputeApiRequest setAutoAbility(java.util.List<String> autoAbility) {
        this.autoAbility = autoAbility;
        return this;
    }
    public java.util.List<String> getAutoAbility() {
        return this.autoAbility;
    }

    public RemoteComputeApiRequest setCutScreenEmail(String cutScreenEmail) {
        this.cutScreenEmail = cutScreenEmail;
        return this;
    }
    public String getCutScreenEmail() {
        return this.cutScreenEmail;
    }

    public RemoteComputeApiRequest setProjectID(Long projectID) {
        this.projectID = projectID;
        return this;
    }
    public Long getProjectID() {
        return this.projectID;
    }

}
