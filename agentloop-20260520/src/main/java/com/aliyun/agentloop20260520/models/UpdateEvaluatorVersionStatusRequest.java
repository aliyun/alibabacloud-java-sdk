// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class UpdateEvaluatorVersionStatusRequest extends TeaModel {
    /**
     * <p>The expected current status. Valid values: DRAFT, PUBLISHED, and OFFLINE. If the specified value does not match the actual status, the API operation returns a 409 error.</p>
     * 
     * <strong>example:</strong>
     * <p>DRAFT</p>
     */
    @NameInMap("expectedStatus")
    public String expectedStatus;

    /**
     * <p>The target status. PUBLISHED indicates publishing a draft for the first time or bringing an offline version back online. OFFLINE indicates taking a published version offline.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLISHED</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The version number to update. The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>v3</p>
     */
    @NameInMap("version")
    public String version;

    /**
     * <p>The version description that you can provide when publishing a draft for the first time. The maximum length is 256 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Added scoring rules for answer accuracy</p>
     */
    @NameInMap("versionDescription")
    public String versionDescription;

    public static UpdateEvaluatorVersionStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEvaluatorVersionStatusRequest self = new UpdateEvaluatorVersionStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEvaluatorVersionStatusRequest setExpectedStatus(String expectedStatus) {
        this.expectedStatus = expectedStatus;
        return this;
    }
    public String getExpectedStatus() {
        return this.expectedStatus;
    }

    public UpdateEvaluatorVersionStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateEvaluatorVersionStatusRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public UpdateEvaluatorVersionStatusRequest setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }
    public String getVersionDescription() {
        return this.versionDescription;
    }

}
