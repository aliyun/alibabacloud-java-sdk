// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.governance20210120.models;

import com.aliyun.tea.*;

public class GetGovernanceServiceStatusResponseBody extends TeaModel {
    /**
     * <p>业务失败原因码。EnableFailed 或 DisableFailed 时返回；其他状态可省略。Enabling 自动补偿期间可返回最近一次补偿异常码，但仍属于进行中状态。</p>
     * 
     * <strong>example:</strong>
     * <p>Governance.DisableFailed</p>
     */
    @NameInMap("FailureCode")
    public String failureCode;

    /**
     * <p>可供调用方理解和处理的安全业务失败原因。EnableFailed 或 DisableFailed 时返回；其他状态可省略。Enabling 自动补偿期间可返回最近一次补偿异常说明。</p>
     * 
     * <strong>example:</strong>
     * <p>The service could not be disabled. Query the service status before retrying. If the problem persists, submit a ticket.</p>
     */
    @NameInMap("FailureMessage")
    public String failureMessage;

    /**
     * <strong>example:</strong>
     * <p>60D54503-F1F6-51B6-B6FA-A70CBDA2A68C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>AI 云治理中心服务状态。Enabled：AI 云治理中心和治理成熟度检测均开通成功；Disabled：从未开通或已正常关闭；EnableFailed：开通失败且已自动清理本次开通部分，可重新完整开通；DisableFailed：关闭失败，可能存在部分已关闭状态，可重试关闭，不能直接开通；Enabling：开通或失败后的自动补偿进行中，补偿失败仍保留该状态并继续补偿；Disabling：关闭进行中。Enabling/Disabling 需继续轮询，其他四态为结果状态。既有开通记录保持原有兼容口径；本次 API 新发起开通严格在两项均成功后返回 Enabled。</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("ServiceStatus")
    public String serviceStatus;

    public static GetGovernanceServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGovernanceServiceStatusResponseBody self = new GetGovernanceServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGovernanceServiceStatusResponseBody setFailureCode(String failureCode) {
        this.failureCode = failureCode;
        return this;
    }
    public String getFailureCode() {
        return this.failureCode;
    }

    public GetGovernanceServiceStatusResponseBody setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
        return this;
    }
    public String getFailureMessage() {
        return this.failureMessage;
    }

    public GetGovernanceServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGovernanceServiceStatusResponseBody setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
        return this;
    }
    public String getServiceStatus() {
        return this.serviceStatus;
    }

}
