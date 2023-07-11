// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDBInstanceConnectivityDiagnosisResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDBInstanceConnectivityDiagnosisResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("connCheckErrorCode")
        public String connCheckErrorCode;

        @NameInMap("connCheckErrorMessage")
        public String connCheckErrorMessage;

        @NameInMap("failType")
        public String failType;

        @NameInMap("instanceId")
        public String instanceId;

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
