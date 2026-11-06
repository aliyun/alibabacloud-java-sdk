// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteAgenticVpcEndpointResponseBody extends TeaModel {
    /**
     * <p>The deletion acceptance result. For duplicate requests, downstream errors are retained and idempotence is not guaranteed.</p>
     */
    @NameInMap("Data")
    public DeleteAgenticVpcEndpointResponseBodyData data;

    /**
     * <p>The error code returned when a request exception occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>67E910F2-4B62-5B0C-ACA3-7547695C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request is successful.</li>
     * <li><strong>false</strong>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteAgenticVpcEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticVpcEndpointResponseBody self = new DeleteAgenticVpcEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticVpcEndpointResponseBody setData(DeleteAgenticVpcEndpointResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteAgenticVpcEndpointResponseBodyData getData() {
        return this.data;
    }

    public DeleteAgenticVpcEndpointResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteAgenticVpcEndpointResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DeleteAgenticVpcEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAgenticVpcEndpointResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteAgenticVpcEndpointResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the endpoint accepted for deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-7xvra4ad6619266ba43d</p>
         */
        @NameInMap("EndpointId")
        public String endpointId;

        /**
         * <p>The deletion status. A value of DELETING only indicates that the asynchronous deletion request is accepted, not that the deletion in the cloud is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>RELEASED</p>
         */
        @NameInMap("Status")
        public String status;

        public static DeleteAgenticVpcEndpointResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteAgenticVpcEndpointResponseBodyData self = new DeleteAgenticVpcEndpointResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteAgenticVpcEndpointResponseBodyData setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DeleteAgenticVpcEndpointResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
