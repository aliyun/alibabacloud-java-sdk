// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAFirmwareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("FirmwareInfo")
    public QueryOTAFirmwareResponseBodyFirmwareInfo firmwareInfo;

    public static QueryOTAFirmwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAFirmwareResponseBody self = new QueryOTAFirmwareResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOTAFirmwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOTAFirmwareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOTAFirmwareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOTAFirmwareResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryOTAFirmwareResponseBody setFirmwareInfo(QueryOTAFirmwareResponseBodyFirmwareInfo firmwareInfo) {
        this.firmwareInfo = firmwareInfo;
        return this;
    }
    public QueryOTAFirmwareResponseBodyFirmwareInfo getFirmwareInfo() {
        return this.firmwareInfo;
    }

    public static class QueryOTAFirmwareResponseBodyFirmwareInfo extends TeaModel {
        @NameInMap("FirmwareName")
        public String firmwareName;

        @NameInMap("FirmwareId")
        public String firmwareId;

        @NameInMap("SrcVersion")
        public String srcVersion;

        @NameInMap("DestVersion")
        public String destVersion;

        @NameInMap("UtcCreate")
        public String utcCreate;

        @NameInMap("UtcModified")
        public String utcModified;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("FirmwareDesc")
        public String firmwareDesc;

        @NameInMap("FirmwareSign")
        public String firmwareSign;

        @NameInMap("FirmwareSize")
        public Integer firmwareSize;

        @NameInMap("FirmwareUrl")
        public String firmwareUrl;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("SignMethod")
        public String signMethod;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("VerifyProgress")
        public Integer verifyProgress;

        @NameInMap("ModuleName")
        public String moduleName;

        public static QueryOTAFirmwareResponseBodyFirmwareInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAFirmwareResponseBodyFirmwareInfo self = new QueryOTAFirmwareResponseBodyFirmwareInfo();
            return TeaModel.build(map, self);
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareName(String firmwareName) {
            this.firmwareName = firmwareName;
            return this;
        }
        public String getFirmwareName() {
            return this.firmwareName;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareDesc(String firmwareDesc) {
            this.firmwareDesc = firmwareDesc;
            return this;
        }
        public String getFirmwareDesc() {
            return this.firmwareDesc;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareSign(String firmwareSign) {
            this.firmwareSign = firmwareSign;
            return this;
        }
        public String getFirmwareSign() {
            return this.firmwareSign;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareSize(Integer firmwareSize) {
            this.firmwareSize = firmwareSize;
            return this;
        }
        public Integer getFirmwareSize() {
            return this.firmwareSize;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setFirmwareUrl(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setVerifyProgress(Integer verifyProgress) {
            this.verifyProgress = verifyProgress;
            return this;
        }
        public Integer getVerifyProgress() {
            return this.verifyProgress;
        }

        public QueryOTAFirmwareResponseBodyFirmwareInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

}
