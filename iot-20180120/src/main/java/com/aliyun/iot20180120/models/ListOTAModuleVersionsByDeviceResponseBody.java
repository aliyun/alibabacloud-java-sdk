// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAModuleVersionsByDeviceResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The module version information returned if the call is successful. The information was submitted by the device. For more information, see the <strong>SimpleOTAModuleInfo</strong> parameter in this table.</p>
     */
    @NameInMap("Data")
    public ListOTAModuleVersionsByDeviceResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of module versions returned on each page.</p>
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
     * <p>291438BA-6E10-4C4C-B761-243B9A0D324F</p>
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
     * <p>The total number of module versions that was submitted by the device.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListOTAModuleVersionsByDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOTAModuleVersionsByDeviceResponseBody self = new ListOTAModuleVersionsByDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOTAModuleVersionsByDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAModuleVersionsByDeviceResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAModuleVersionsByDeviceResponseBody setData(ListOTAModuleVersionsByDeviceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListOTAModuleVersionsByDeviceResponseBodyData getData() {
        return this.data;
    }

    public ListOTAModuleVersionsByDeviceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAModuleVersionsByDeviceResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTAModuleVersionsByDeviceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAModuleVersionsByDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAModuleVersionsByDeviceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAModuleVersionsByDeviceResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo extends TeaModel {
        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>newDevice</p>
         */
        @NameInMap("DeviceName")
        public String deviceName;

        /**
         * <p>The ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>QjIFT***000101</p>
         */
        @NameInMap("IotId")
        public String iotId;

        /**
         * <p>The name of the OTA module.</p>
         * 
         * <strong>example:</strong>
         * <p>barcodeScanner</p>
         */
        @NameInMap("ModuleName")
        public String moduleName;

        /**
         * <p>The module version that was submitted by the device.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ModuleVersion")
        public String moduleVersion;

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>aluctKe****</p>
         */
        @NameInMap("ProductKey")
        public String productKey;

        public static ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo self = new ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

        public ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class ListOTAModuleVersionsByDeviceResponseBodyData extends TeaModel {
        @NameInMap("SimpleOTAModuleInfo")
        public java.util.List<ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo> simpleOTAModuleInfo;

        public static ListOTAModuleVersionsByDeviceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAModuleVersionsByDeviceResponseBodyData self = new ListOTAModuleVersionsByDeviceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOTAModuleVersionsByDeviceResponseBodyData setSimpleOTAModuleInfo(java.util.List<ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo> simpleOTAModuleInfo) {
            this.simpleOTAModuleInfo = simpleOTAModuleInfo;
            return this;
        }
        public java.util.List<ListOTAModuleVersionsByDeviceResponseBodyDataSimpleOTAModuleInfo> getSimpleOTAModuleInfo() {
            return this.simpleOTAModuleInfo;
        }

    }

}
