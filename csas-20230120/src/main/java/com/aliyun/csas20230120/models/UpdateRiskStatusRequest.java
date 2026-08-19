// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateRiskStatusRequest extends TeaModel {
    /**
     * <p>The manually confirmed risk conclusion. This parameter is required when <code>Status</code> is set to <code>Processed</code>. Do not specify this parameter when <code>Status</code> is set to <code>Unprocess</code> or <code>Processing</code>. Valid values:</p>
     * <ul>
     * <li><code>Risk</code>: Confirmed as risky.</li>
     * <li><code>Ignore</code>: Confirmed as not risky.</li>
     * <li><code>Invalid</code>: Confirmed as a false positive.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Risk</p>
     */
    @NameInMap("RiskConfirm")
    public String riskConfirm;

    /**
     * <p>The description of the risk event processing decision. The value must be 1 to 128 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>After verification, this risk event is a real risk</p>
     */
    @NameInMap("RiskConfirmDesc")
    public String riskConfirmDesc;

    /**
     * <p>The risk event ID. You can obtain the value from the following operation:</p>
     * <ul>
     * <li><code>ListRiskItems</code>: Queries the list of risk events.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>69ef648034cf53d7bac7a9c9c912****</p>
     */
    @NameInMap("RiskId")
    public String riskId;

    /**
     * <p>The risk scenario. This parameter is optional. If not specified, the system automatically populates it based on RiskId. Valid values:</p>
     * <ul>
     * <li>account_share: Account sharing.</li>
     * <li>account_stolen: Account stolen.</li>
     * <li>device_share: Device sharing.</li>
     * <li>remote_logon: Remote logon.</li>
     * <li>sensitive_data_leakage: Sensitive data leakage.</li>
     * <li><code>compressed_archive_exfil</code>: Internal network data compression and exfiltration.</li>
     * <li>lateral_scanning: Lateral scanning.</li>
     * <li>ai_skill_malware: Malicious skill.</li>
     * <li>ai_config_check: AI configuration check.</li>
     * <li>openclaw_vulnerability: OpenClaw vulnerability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>account_stolen</p>
     */
    @NameInMap("RiskScene")
    public String riskScene;

    /**
     * <p>The processing status of the risk event. Valid values:</p>
     * <ul>
     * <li><code>Unprocess</code>: Unprocessed.</li>
     * <li><code>Processing</code>: Being processed.</li>
     * <li><code>Processed</code>: Processed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Processed</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateRiskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRiskStatusRequest self = new UpdateRiskStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRiskStatusRequest setRiskConfirm(String riskConfirm) {
        this.riskConfirm = riskConfirm;
        return this;
    }
    public String getRiskConfirm() {
        return this.riskConfirm;
    }

    public UpdateRiskStatusRequest setRiskConfirmDesc(String riskConfirmDesc) {
        this.riskConfirmDesc = riskConfirmDesc;
        return this;
    }
    public String getRiskConfirmDesc() {
        return this.riskConfirmDesc;
    }

    public UpdateRiskStatusRequest setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

    public UpdateRiskStatusRequest setRiskScene(String riskScene) {
        this.riskScene = riskScene;
        return this;
    }
    public String getRiskScene() {
        return this.riskScene;
    }

    public UpdateRiskStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
