// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteComputeApiShrinkRequest extends TeaModel {
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
    public String autoAbilityShrink;

    @NameInMap("CutScreenEmail")
    public String cutScreenEmail;

    @NameInMap("ProjectID")
    public Long projectID;

    public static RemoteComputeApiShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoteComputeApiShrinkRequest self = new RemoteComputeApiShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoteComputeApiShrinkRequest setAutoJobID(Long autoJobID) {
        this.autoJobID = autoJobID;
        return this;
    }
    public Long getAutoJobID() {
        return this.autoJobID;
    }

    public RemoteComputeApiShrinkRequest setExcelID(Long excelID) {
        this.excelID = excelID;
        return this;
    }
    public Long getExcelID() {
        return this.excelID;
    }

    public RemoteComputeApiShrinkRequest setCutScreenRobot(String cutScreenRobot) {
        this.cutScreenRobot = cutScreenRobot;
        return this;
    }
    public String getCutScreenRobot() {
        return this.cutScreenRobot;
    }

    public RemoteComputeApiShrinkRequest setCutScreenSheet(String cutScreenSheet) {
        this.cutScreenSheet = cutScreenSheet;
        return this;
    }
    public String getCutScreenSheet() {
        return this.cutScreenSheet;
    }

    public RemoteComputeApiShrinkRequest setAutoTimeStrategy(String autoTimeStrategy) {
        this.autoTimeStrategy = autoTimeStrategy;
        return this;
    }
    public String getAutoTimeStrategy() {
        return this.autoTimeStrategy;
    }

    public RemoteComputeApiShrinkRequest setAutoSwitch(Boolean autoSwitch) {
        this.autoSwitch = autoSwitch;
        return this;
    }
    public Boolean getAutoSwitch() {
        return this.autoSwitch;
    }

    public RemoteComputeApiShrinkRequest setAutoAbilityShrink(String autoAbilityShrink) {
        this.autoAbilityShrink = autoAbilityShrink;
        return this;
    }
    public String getAutoAbilityShrink() {
        return this.autoAbilityShrink;
    }

    public RemoteComputeApiShrinkRequest setCutScreenEmail(String cutScreenEmail) {
        this.cutScreenEmail = cutScreenEmail;
        return this;
    }
    public String getCutScreenEmail() {
        return this.cutScreenEmail;
    }

    public RemoteComputeApiShrinkRequest setProjectID(Long projectID) {
        this.projectID = projectID;
        return this;
    }
    public Long getProjectID() {
        return this.projectID;
    }

}
