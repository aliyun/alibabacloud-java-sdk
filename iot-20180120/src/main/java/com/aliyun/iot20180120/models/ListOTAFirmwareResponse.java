// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAFirmwareResponse extends TeaModel {
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

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("FirmwareInfo")
    @Validation(required = true)
    public ListOTAFirmwareResponseFirmwareInfo firmwareInfo;

    public static ListOTAFirmwareResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAFirmwareResponse self = new ListOTAFirmwareResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAFirmwareResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAFirmwareResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAFirmwareResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAFirmwareResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAFirmwareResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListOTAFirmwareResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAFirmwareResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTAFirmwareResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAFirmwareResponse setFirmwareInfo(ListOTAFirmwareResponseFirmwareInfo firmwareInfo) {
        this.firmwareInfo = firmwareInfo;
        return this;
    }
    public ListOTAFirmwareResponseFirmwareInfo getFirmwareInfo() {
        return this.firmwareInfo;
    }

    public static class ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo extends TeaModel {
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

        @NameInMap("ModuleName")
        @Validation(required = true)
        public String moduleName;

        public static ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo self = new ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setFirmwareName(String firmwareName) {
            this.firmwareName = firmwareName;
            return this;
        }
        public String getFirmwareName() {
            return this.firmwareName;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setFirmwareDesc(String firmwareDesc) {
            this.firmwareDesc = firmwareDesc;
            return this;
        }
        public String getFirmwareDesc() {
            return this.firmwareDesc;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setFirmwareSign(String firmwareSign) {
            this.firmwareSign = firmwareSign;
            return this;
        }
        public String getFirmwareSign() {
            return this.firmwareSign;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setFirmwareSize(Integer firmwareSize) {
            this.firmwareSize = firmwareSize;
            return this;
        }
        public Integer getFirmwareSize() {
            return this.firmwareSize;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class ListOTAFirmwareResponseFirmwareInfo extends TeaModel {
        @NameInMap("SimpleFirmwareInfo")
        @Validation(required = true)
        public java.util.List<ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo> simpleFirmwareInfo;

        public static ListOTAFirmwareResponseFirmwareInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAFirmwareResponseFirmwareInfo self = new ListOTAFirmwareResponseFirmwareInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAFirmwareResponseFirmwareInfo setSimpleFirmwareInfo(java.util.List<ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo> simpleFirmwareInfo) {
            this.simpleFirmwareInfo = simpleFirmwareInfo;
            return this;
        }
        public java.util.List<ListOTAFirmwareResponseFirmwareInfoSimpleFirmwareInfo> getSimpleFirmwareInfo() {
            return this.simpleFirmwareInfo;
        }

    }

}
