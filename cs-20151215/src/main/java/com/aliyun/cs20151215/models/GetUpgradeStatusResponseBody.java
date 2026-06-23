// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetUpgradeStatusResponseBody extends TeaModel {
    /**
     * <p>The error message during the cluster upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>subject to actual return</p>
     */
    @NameInMap("error_message")
    public String errorMessage;

    /**
     * <p>The ID of the precheck report.</p>
     * 
     * <strong>example:</strong>
     * <p>be4c8eb72de94d459ea7ace7c811d119</p>
     */
    @NameInMap("precheck_report_id")
    public String precheckReportId;

    /**
     * <p>The current upgrade status of the cluster. Valid values:</p>
     * <ul>
     * <li><code>success</code>: The upgrade is successful.</li>
     * <li><code>fail</code>: The upgrade has failed.</li>
     * <li><code>pause</code>: The upgrade is paused.</li>
     * <li><code>running</code>: The upgrade is in progress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The current upgrade phase of the cluster. Valid values:</p>
     * <ul>
     * <li><code>not_start</code>: Not started.</li>
     * <li><code>prechecking</code>: Prechecking is in progress.</li>
     * <li><code>upgrading</code>: The upgrade is in progress.</li>
     * <li><code>pause</code>: The upgrade is paused.</li>
     * <li><code>success</code>: The upgrade is successful.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>prechecking</p>
     */
    @NameInMap("upgrade_step")
    public String upgradeStep;

    /**
     * <p>The upgrade task details.</p>
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
         * <p>The description of the upgrade task.</p>
         * 
         * <strong>example:</strong>
         * <p>subject to actual return</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The upgrade task status. Valid values:</p>
         * <ul>
         * <li><code>running</code>: The task is running.</li>
         * <li><code>Success</code>: The task is successful.</li>
         * <li><code>Failed</code>: The task has failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
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
