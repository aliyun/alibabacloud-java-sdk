// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateYaoChiAgentConfirmResponseBody extends TeaModel {
    /**
     * <p>The confirmation decision submitted in this request, which is the same as the Approved request parameter. A value of true indicates that the execution is approved, and false indicates that the execution is rejected. This does not indicate whether the tool operation is executed successfully.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Approved")
    public Boolean approved;

    /**
     * <p>The identifier of the operation for which the confirmation is submitted, which is the same as the ConfirmationId request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-42d3-a456-426614174000</p>
     */
    @NameInMap("ConfirmationId")
    public String confirmationId;

    /**
     * <p>The unique identifier of the request, which is used for troubleshooting and log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B23456</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status string. The example value success refers to the outer success status of the downstream confirmation callback response and is provided only for format demonstration. It does not mean that the Status field of the current operation actually returns this value. In the current version, this field may be empty or not returned. Do not rely on this field to determine whether the execution is approved or whether the tool is executed successfully.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Specifies whether custom tool parameters are received. A value of true indicates that non-null parameters are provided, and false indicates that no parameters are provided. This does not indicate that the parameters are applied or that the tool is executed successfully. In the current version, omit the ToolArgs request parameter, and this field normally returns false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ToolArgsReceived")
    public Boolean toolArgsReceived;

    public static CreateYaoChiAgentConfirmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateYaoChiAgentConfirmResponseBody self = new CreateYaoChiAgentConfirmResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateYaoChiAgentConfirmResponseBody setApproved(Boolean approved) {
        this.approved = approved;
        return this;
    }
    public Boolean getApproved() {
        return this.approved;
    }

    public CreateYaoChiAgentConfirmResponseBody setConfirmationId(String confirmationId) {
        this.confirmationId = confirmationId;
        return this;
    }
    public String getConfirmationId() {
        return this.confirmationId;
    }

    public CreateYaoChiAgentConfirmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateYaoChiAgentConfirmResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateYaoChiAgentConfirmResponseBody setToolArgsReceived(Boolean toolArgsReceived) {
        this.toolArgsReceived = toolArgsReceived;
        return this;
    }
    public Boolean getToolArgsReceived() {
        return this.toolArgsReceived;
    }

}
