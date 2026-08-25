// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class DeleteIdentityProviderResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The binding information of the external identity provider after the unbinding operation is accepted.</p>
     */
    @NameInMap("data")
    public DeleteIdentityProviderResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. An error description is returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DeleteIdentityProviderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIdentityProviderResponseBody self = new DeleteIdentityProviderResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIdentityProviderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteIdentityProviderResponseBody setData(DeleteIdentityProviderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteIdentityProviderResponseBodyData getData() {
        return this.data;
    }

    public DeleteIdentityProviderResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteIdentityProviderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteIdentityProviderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteIdentityProviderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteIdentityProviderResponseBodyData extends TeaModel {
        /**
         * <p>The type of the external identity provider. Valid values: DingTalk, Feishu.</p>
         * 
         * <strong>example:</strong>
         * <p>DingTalk</p>
         */
        @NameInMap("identityProviderType")
        public String identityProviderType;

        /**
         * <p>The status. Valid values:</p>
         * <ul>
         * <li>CONFIGURED: The configuration has been accepted and is waiting for the user pool to be provisioned.</li>
         * <li>SYNCING: Organization members are being synchronized.</li>
         * <li>SYNCED: Organization member synchronization is complete.</li>
         * <li>READY: The binding is in effect.</li>
         * <li>SYNC_FAILED: Organization member synchronization failed.</li>
         * <li>UPDATING: The configuration is being updated.</li>
         * <li>UPDATE_FAILED: Configuration update failed.</li>
         * <li>DISCONNECTING: The unbinding is in progress.</li>
         * <li>DISCONNECT_FAILED: The unbinding failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-123456</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static DeleteIdentityProviderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteIdentityProviderResponseBodyData self = new DeleteIdentityProviderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteIdentityProviderResponseBodyData setIdentityProviderType(String identityProviderType) {
            this.identityProviderType = identityProviderType;
            return this;
        }
        public String getIdentityProviderType() {
            return this.identityProviderType;
        }

        public DeleteIdentityProviderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DeleteIdentityProviderResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
