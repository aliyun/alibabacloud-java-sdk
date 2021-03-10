// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAFirmwareResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("FirmwareInfo")
    @Validation(required = true)
    public QueryOTAFirmwareResponseFirmwareInfo firmwareInfo;

    public static QueryOTAFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAFirmwareResponse self = new QueryOTAFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public QueryOTAFirmwareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOTAFirmwareResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryOTAFirmwareResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryOTAFirmwareResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryOTAFirmwareResponse setFirmwareInfo(QueryOTAFirmwareResponseFirmwareInfo firmwareInfo) {
        this.firmwareInfo = firmwareInfo;
        return this;
    }
    public QueryOTAFirmwareResponseFirmwareInfo getFirmwareInfo() {
        return this.firmwareInfo;
    }

    public static class QueryOTAFirmwareResponseFirmwareInfo extends TeaModel {
        @NameInMap("FirmwareName")
        @Validation(required = true)
        public String firmwareName;

        @NameInMap("FirmwareId")
        @Validation(required = true)
        public String firmwareId;

        @NameInMap("SrcVersion")
        @Validation(required = true)
        public String srcVersion;

        @NameInMap("DestVersion")
        @Validation(required = true)
        public String destVersion;

        @NameInMap("UtcCreate")
        @Validation(required = true)
        public String utcCreate;

        @NameInMap("UtcModified")
        @Validation(required = true)
        public String utcModified;

        @NameInMap("Status")
        @Validation(required = true)
        public Integer status;

        @NameInMap("FirmwareDesc")
        @Validation(required = true)
        public String firmwareDesc;

        @NameInMap("FirmwareSign")
        @Validation(required = true)
        public String firmwareSign;

        @NameInMap("FirmwareSize")
        @Validation(required = true)
        public Integer firmwareSize;

        @NameInMap("FirmwareUrl")
        @Validation(required = true)
        public String firmwareUrl;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("SignMethod")
        @Validation(required = true)
        public String signMethod;

        @NameInMap("ProductName")
        @Validation(required = true)
        public String productName;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("VerifyProgress")
        @Validation(required = true)
        public Integer verifyProgress;

        @NameInMap("ModuleName")
        @Validation(required = true)
        public String moduleName;

        public static QueryOTAFirmwareResponseFirmwareInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryOTAFirmwareResponseFirmwareInfo self = new QueryOTAFirmwareResponseFirmwareInfo();
            return TeaModel.build(map, self);
        }

        public QueryOTAFirmwareResponseFirmwareInfo setFirmwareName(String firmwareName) {
            this.firmwareName = firmwareName;
            return this;
        }
        public String getFirmwareName() {
            return this.firmwareName;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setFirmwareDesc(String firmwareDesc) {
            this.firmwareDesc = firmwareDesc;
            return this;
        }
        public String getFirmwareDesc() {
            return this.firmwareDesc;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setFirmwareSign(String firmwareSign) {
            this.firmwareSign = firmwareSign;
            return this;
        }
        public String getFirmwareSign() {
            return this.firmwareSign;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setFirmwareSize(Integer firmwareSize) {
            this.firmwareSize = firmwareSize;
            return this;
        }
        public Integer getFirmwareSize() {
            return this.firmwareSize;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setFirmwareUrl(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setVerifyProgress(Integer verifyProgress) {
            this.verifyProgress = verifyProgress;
            return this;
        }
        public Integer getVerifyProgress() {
            return this.verifyProgress;
        }

        public QueryOTAFirmwareResponseFirmwareInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

}
