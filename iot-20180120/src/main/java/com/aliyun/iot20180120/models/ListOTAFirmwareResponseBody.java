// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAFirmwareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("FirmwareInfo")
    public ListOTAFirmwareResponseBodyFirmwareInfo firmwareInfo;

    public static ListOTAFirmwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOTAFirmwareResponseBody self = new ListOTAFirmwareResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOTAFirmwareResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAFirmwareResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAFirmwareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAFirmwareResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAFirmwareResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListOTAFirmwareResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAFirmwareResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTAFirmwareResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAFirmwareResponseBody setFirmwareInfo(ListOTAFirmwareResponseBodyFirmwareInfo firmwareInfo) {
        this.firmwareInfo = firmwareInfo;
        return this;
    }
    public ListOTAFirmwareResponseBodyFirmwareInfo getFirmwareInfo() {
        return this.firmwareInfo;
    }

    public static class ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo extends TeaModel {
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

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("SignMethod")
        public String signMethod;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("ModuleName")
        public String moduleName;

        public static ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo self = new ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setFirmwareName(String firmwareName) {
            this.firmwareName = firmwareName;
            return this;
        }
        public String getFirmwareName() {
            return this.firmwareName;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setUtcCreate(String utcCreate) {
            this.utcCreate = utcCreate;
            return this;
        }
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setFirmwareDesc(String firmwareDesc) {
            this.firmwareDesc = firmwareDesc;
            return this;
        }
        public String getFirmwareDesc() {
            return this.firmwareDesc;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setFirmwareSign(String firmwareSign) {
            this.firmwareSign = firmwareSign;
            return this;
        }
        public String getFirmwareSign() {
            return this.firmwareSign;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setFirmwareSize(Integer firmwareSize) {
            this.firmwareSize = firmwareSize;
            return this;
        }
        public Integer getFirmwareSize() {
            return this.firmwareSize;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class ListOTAFirmwareResponseBodyFirmwareInfo extends TeaModel {
        @NameInMap("SimpleFirmwareInfo")
        public java.util.List<ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo> simpleFirmwareInfo;

        public static ListOTAFirmwareResponseBodyFirmwareInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAFirmwareResponseBodyFirmwareInfo self = new ListOTAFirmwareResponseBodyFirmwareInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAFirmwareResponseBodyFirmwareInfo setSimpleFirmwareInfo(java.util.List<ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo> simpleFirmwareInfo) {
            this.simpleFirmwareInfo = simpleFirmwareInfo;
            return this;
        }
        public java.util.List<ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo> getSimpleFirmwareInfo() {
            return this.simpleFirmwareInfo;
        }

    }

}
