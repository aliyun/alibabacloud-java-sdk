// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAFirmwareResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The OTA update packages returned if the call is successful. For more information, see SimpleFirmwareInfo.</p>
     */
    @NameInMap("FirmwareInfo")
    public ListOTAFirmwareResponseBodyFirmwareInfo firmwareInfo;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A01829CE-75A1-4920-B775-921146A1AB79</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of OTA update packages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListOTAFirmwareResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOTAFirmwareResponseBody self = new ListOTAFirmwareResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOTAFirmwareResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAFirmwareResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAFirmwareResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAFirmwareResponseBody setFirmwareInfo(ListOTAFirmwareResponseBodyFirmwareInfo firmwareInfo) {
        this.firmwareInfo = firmwareInfo;
        return this;
    }
    public ListOTAFirmwareResponseBodyFirmwareInfo getFirmwareInfo() {
        return this.firmwareInfo;
    }

    public ListOTAFirmwareResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTAFirmwareResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public ListOTAFirmwareResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo extends TeaModel {
        /**
         * <p>The version number of the OTA update package.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0.0</p>
         */
        @NameInMap("DestVersion")
        public String destVersion;

        /**
         * <p>The description of the OTA update package.</p>
         * 
         * <strong>example:</strong>
         * <p>firmwareDesc</p>
         */
        @NameInMap("FirmwareDesc")
        public String firmwareDesc;

        /**
         * <p>The unique ID of the OTA update package.</p>
         * 
         * <strong>example:</strong>
         * <p>UfuxnwygsuSkVE0VCN****0100</p>
         */
        @NameInMap("FirmwareId")
        public String firmwareId;

        /**
         * <p>The name of the OTA update package.</p>
         * 
         * <strong>example:</strong>
         * <p>t3q5rkNm</p>
         */
        @NameInMap("FirmwareName")
        public String firmwareName;

        /**
         * <p>The signature of the OTA update package.</p>
         * 
         * <strong>example:</strong>
         * <p>3d04ab6462633508606e5f3daac8****</p>
         */
        @NameInMap("FirmwareSign")
        public String firmwareSign;

        /**
         * <p>The size of the update package. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>924</p>
         */
        @NameInMap("FirmwareSize")
        public Integer firmwareSize;

        /**
         * <p>The name of the module.</p>
         * 
         * <strong>example:</strong>
         * <p>module1234</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The ProductKey of the product to which the OTA update package belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a19mzPZ****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        /**
         * <p>The name of the product to which the OTA update package belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>MyProduct</p>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The signature method of the OTA update package.</p>
         * 
         * <strong>example:</strong>
         * <p>MD5</p>
         */
        @NameInMap("SignMethod")
        public String signMethod;

        /**
         * <p>The version number of the original update package to be updated.</p>
         * <blockquote>
         * <p> The return value is null if you perform a full update.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>V1.0.0</p>
         */
        @NameInMap("SrcVersion")
        public String srcVersion;

        /**
         * <p>The status of the OTA update package. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unverified</li>
         * <li><strong>1</strong>: verified</li>
         * <li><strong>2</strong>: verifying</li>
         * <li><strong>3</strong>: failed to be verified</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the OTA update package. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: complete firmware</li>
         * <li><strong>1</strong>: differential firmware</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The time when the update package was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-28T02:42:22.000Z</p>
         */
        @NameInMap("UtcCreate")
        public String utcCreate;

        /**
         * <p>The time when the update task was last modified. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-28T02:42:22.000Z</p>
         */
        @NameInMap("UtcModified")
        public String utcModified;

        public static ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo self = new ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setDestVersion(String destVersion) {
            this.destVersion = destVersion;
            return this;
        }
        public String getDestVersion() {
            return this.destVersion;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setFirmwareDesc(String firmwareDesc) {
            this.firmwareDesc = firmwareDesc;
            return this;
        }
        public String getFirmwareDesc() {
            return this.firmwareDesc;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setFirmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }
        public String getFirmwareId() {
            return this.firmwareId;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setFirmwareName(String firmwareName) {
            this.firmwareName = firmwareName;
            return this;
        }
        public String getFirmwareName() {
            return this.firmwareName;
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

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setSignMethod(String signMethod) {
            this.signMethod = signMethod;
            return this;
        }
        public String getSignMethod() {
            return this.signMethod;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setSrcVersion(String srcVersion) {
            this.srcVersion = srcVersion;
            return this;
        }
        public String getSrcVersion() {
            return this.srcVersion;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListOTAFirmwareResponseBodyFirmwareInfoSimpleFirmwareInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
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
