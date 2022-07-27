// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class LogVMDeployMachineResponseBody extends TeaModel {
    @NameInMap("deployMachineLog")
    public LogVMDeployMachineResponseBodyDeployMachineLog deployMachineLog;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static LogVMDeployMachineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LogVMDeployMachineResponseBody self = new LogVMDeployMachineResponseBody();
        return TeaModel.build(map, self);
    }

    public LogVMDeployMachineResponseBody setDeployMachineLog(LogVMDeployMachineResponseBodyDeployMachineLog deployMachineLog) {
        this.deployMachineLog = deployMachineLog;
        return this;
    }
    public LogVMDeployMachineResponseBodyDeployMachineLog getDeployMachineLog() {
        return this.deployMachineLog;
    }

    public LogVMDeployMachineResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public LogVMDeployMachineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public LogVMDeployMachineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LogVMDeployMachineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LogVMDeployMachineResponseBodyDeployMachineLog extends TeaModel {
        @NameInMap("aliyunRegion")
        public String aliyunRegion;

        @NameInMap("deployBeginTime")
        public Long deployBeginTime;

        @NameInMap("deployEndTime")
        public Long deployEndTime;

        @NameInMap("deployLog")
        public String deployLog;

        @NameInMap("deployLogPath")
        public String deployLogPath;

        public static LogVMDeployMachineResponseBodyDeployMachineLog build(java.util.Map<String, ?> map) throws Exception {
            LogVMDeployMachineResponseBodyDeployMachineLog self = new LogVMDeployMachineResponseBodyDeployMachineLog();
            return TeaModel.build(map, self);
        }

        public LogVMDeployMachineResponseBodyDeployMachineLog setAliyunRegion(String aliyunRegion) {
            this.aliyunRegion = aliyunRegion;
            return this;
        }
        public String getAliyunRegion() {
            return this.aliyunRegion;
        }

        public LogVMDeployMachineResponseBodyDeployMachineLog setDeployBeginTime(Long deployBeginTime) {
            this.deployBeginTime = deployBeginTime;
            return this;
        }
        public Long getDeployBeginTime() {
            return this.deployBeginTime;
        }

        public LogVMDeployMachineResponseBodyDeployMachineLog setDeployEndTime(Long deployEndTime) {
            this.deployEndTime = deployEndTime;
            return this;
        }
        public Long getDeployEndTime() {
            return this.deployEndTime;
        }

        public LogVMDeployMachineResponseBodyDeployMachineLog setDeployLog(String deployLog) {
            this.deployLog = deployLog;
            return this;
        }
        public String getDeployLog() {
            return this.deployLog;
        }

        public LogVMDeployMachineResponseBodyDeployMachineLog setDeployLogPath(String deployLogPath) {
            this.deployLogPath = deployLogPath;
            return this;
        }
        public String getDeployLogPath() {
            return this.deployLogPath;
        }

    }

}
