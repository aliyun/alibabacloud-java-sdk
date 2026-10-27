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
     * <li><code>success</code>: Upgrade succeeded.</li>
     * <li><code>fail</code>: Upgrade failed.</li>
     * <li><code>pause</code>: Upgrade paused.</li>
     * <li><code>running</code>: Upgrade in progress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The current upgrade stage of the cluster. Valid values:</p>
     * <ul>
     * <li><code>not_start</code>: Not started.</li>
     * <li><code>prechecking</code>: Prechecking.</li>
     * <li><code>upgrading</code>: Upgrading.</li>
     * <li><code>pause</code>: Paused.</li>
     * <li><code>success</code>: Upgrade succeeded.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>prechecking</p>
     */
    @NameInMap("upgrade_step")
    public String upgradeStep;

    /**
     * <p>The details of the upgrade task.</p>
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
         * <p>The status of the upgrade task. Valid values:</p>
         * <ul>
         * <li><code>running</code>: Running.</li>
         * <li><code>Success</code>: Succeeded.</li>
         * <li><code>Failed</code>: Failed.</li>
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
