// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDBInstanceConnectivityDiagnosisResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The detailed information.</p>
     */
    @NameInMap("Data")
    public GetDBInstanceConnectivityDiagnosisResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p>If the request was successful, <strong>Successful</strong> is returned. Otherwise, an error message such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetDBInstanceConnectivityDiagnosisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDBInstanceConnectivityDiagnosisResponseBody self = new GetDBInstanceConnectivityDiagnosisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDBInstanceConnectivityDiagnosisResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDBInstanceConnectivityDiagnosisResponseBody setData(GetDBInstanceConnectivityDiagnosisResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDBInstanceConnectivityDiagnosisResponseBodyData getData() {
        return this.data;
    }

    public GetDBInstanceConnectivityDiagnosisResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDBInstanceConnectivityDiagnosisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDBInstanceConnectivityDiagnosisResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetDBInstanceConnectivityDiagnosisResponseBodyData extends TeaModel {
        /**
         * <p>The exception detection items:</p>
         * <ul>
         * <li><strong>SRC_IP_NOT_IN_USER_WHITELIST</strong>: The source IP address is not added to the whitelist of the user.</li>
         * <li><strong>VIP_NOT_EXISTS</strong>: The Application Load Balancer (ALB) instance corresponding to the virtual IP address (VIP) does not exist.</li>
         * <li><strong>RS_NOT_EXISTS</strong>: The resource sharing (RS) is not properly mounted.</li>
         * <li><strong>VIP_TUNNEL_ID_NOT_CONSISTENT</strong>: The tunnel ID used by the VIP of the virtual private cloud (VPC) type is different from the tunnel ID of the VPC.</li>
         * <li><strong>VIP_VPC_CLOUD_INSTANCE_NOT_EXISTS</strong>: The VIP of the VPC type does not exist.</li>
         * <li><strong>VIP_IS_NOT_NGLB</strong>: The NGLB mode is disabled for the VIP.</li>
         * <li><strong>CUSTINS_NOT_ASSOCIATE_ECS_SECURITY_GROUP</strong>: No security group is associated with the instance.</li>
         * <li><strong>SRC_IP_NOT_IN_USER_WHITELIST</strong>: The source IP address is not added to the whitelist of the user.</li>
         * <li><strong>SRC_IP_NOT_IN_ADMIN_WHITELIST</strong>: The source IP address is not added to the whitelist of the instance.</li>
         * <li><strong>SRC_IP_NOT_IN_ECS_SECURITY_GROUP</strong>: The source IP address is not added to the security group that is associated with the instance.</li>
         * <li><strong>VPC_INSTANCE_IP_NOT_WORKING_STATUS</strong>: The IP address in the VPC is in an abnormal state.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SRC_IP_NOT_IN_USER_WHITELIST</p>
         */
        @NameInMap("connCheckErrorCode")
        public String connCheckErrorCode;

        /**
         * <p>The details of the exception detection.</p>
         * 
         * <strong>example:</strong>
         * <p>Src ip:47.110.180.62 not in user whitelist</p>
         */
        @NameInMap("connCheckErrorMessage")
        public String connCheckErrorMessage;

        /**
         * <p>The type of the exception:</p>
         * <ul>
         * <li><strong>0</strong>: an exception that can be handled by the user.</li>
         * <li><strong>1</strong>: an exception that can be handled by a technical engineer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("failType")
        public String failType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the connectivity test was passed:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static GetDBInstanceConnectivityDiagnosisResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDBInstanceConnectivityDiagnosisResponseBodyData self = new GetDBInstanceConnectivityDiagnosisResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDBInstanceConnectivityDiagnosisResponseBodyData setConnCheckErrorCode(String connCheckErrorCode) {
            this.connCheckErrorCode = connCheckErrorCode;
            return this;
        }
        public String getConnCheckErrorCode() {
            return this.connCheckErrorCode;
        }

        public GetDBInstanceConnectivityDiagnosisResponseBodyData setConnCheckErrorMessage(String connCheckErrorMessage) {
            this.connCheckErrorMessage = connCheckErrorMessage;
            return this;
        }
        public String getConnCheckErrorMessage() {
            return this.connCheckErrorMessage;
        }

        public GetDBInstanceConnectivityDiagnosisResponseBodyData setFailType(String failType) {
            this.failType = failType;
            return this;
        }
        public String getFailType() {
            return this.failType;
        }

        public GetDBInstanceConnectivityDiagnosisResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDBInstanceConnectivityDiagnosisResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
