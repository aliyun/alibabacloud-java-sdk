// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetUpgradeStatusResponseBody extends TeaModel {
    /**
     * <p>The error message returned during the update.</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    /**
     * <p>The ID of the precheck report.</p>
     */
    @NameInMap("precheck_report_id")
    public String precheckReportId;

    /**
     * <p>The status of the update. Valid values:</p>
     * <br>
     * <p>*   `success`: The update is successful.</p>
     * <p>*   `fail`: The update failed.</p>
     * <p>*   `pause`: The update is paused.</p>
     * <p>*   `running`: The update is in progress.</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The current phase of the update. Valid values:</p>
     * <br>
     * <p>*   `not_start`: The update is not started.</p>
     * <p>*   `prechecking`: The precheck is in progress.</p>
     * <p>*   `upgrading`: The cluster is being updated.</p>
     * <p>*   `pause`: The update is paused.</p>
     * <p>*   `success`: The update is successful.</p>
     */
    @NameInMap("upgrade_step")
    public String upgradeStep;

    /**
     * <p>The details of the update task.</p>
     */
    @NameInMap("upgrade_task")
    public GetUpgradeStatusResponseBodyUpgradeTask upgradeTask;

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

    public GetUpgradeStatusResponseBody setUpgradeTask(GetUpgradeStatusResponseBodyUpgradeTask upgradeTask) {
        this.upgradeTask = upgradeTask;
        return this;
    }
    public GetUpgradeStatusResponseBodyUpgradeTask getUpgradeTask() {
        return this.upgradeTask;
    }

    public static class GetUpgradeStatusResponseBodyUpgradeTask extends TeaModel {
        /**
         * <p>The description of the update task.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The status of the update task. Valid values:</p>
         * <br>
         * <p>*   `running`: The update task is being executed.</p>
         * <p>*   `Success`: The update task is successfully executed.</p>
         * <p>*   `Failed`: The update task failed.</p>
         */
        @NameInMap("status")
        public String status;

        public static GetUpgradeStatusResponseBodyUpgradeTask build(java.util.Map<String, ?> map) throws Exception {
            GetUpgradeStatusResponseBodyUpgradeTask self = new GetUpgradeStatusResponseBodyUpgradeTask();
            return TeaModel.build(map, self);
        }

        public GetUpgradeStatusResponseBodyUpgradeTask setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetUpgradeStatusResponseBodyUpgradeTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
