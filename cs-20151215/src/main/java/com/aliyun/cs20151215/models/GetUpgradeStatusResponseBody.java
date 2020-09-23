// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetUpgradeStatusResponseBody extends TeaModel {
    // 错误信息描述。
    @NameInMap("error_message")
    public String errorMessage;

    // 预检查返回ID。
    @NameInMap("precheck_report_id")
    public String precheckReportId;

    // 升级状态。
    @NameInMap("status")
    public String status;

    // 升级任务执行到哪一步了。
    @NameInMap("upgrade_step")
    public String upgradeStep;

    public static GetUpgradeStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUpgradeStatusResponseBody self = new GetUpgradeStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUpgradeStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetUpgradeStatusResponseBody setPrecheckReportId(String precheckReportId) {
        this.precheckReportId = precheckReportId;
        return this;
    }
    public String getPrecheckReportId() {
        return this.precheckReportId;
    }

    public GetUpgradeStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetUpgradeStatusResponseBody setUpgradeStep(String upgradeStep) {
        this.upgradeStep = upgradeStep;
        return this;
    }
    public String getUpgradeStep() {
        return this.upgradeStep;
    }

}
