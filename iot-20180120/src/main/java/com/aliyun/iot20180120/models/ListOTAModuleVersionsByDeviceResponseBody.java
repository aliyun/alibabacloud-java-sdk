// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAModuleVersionsByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public ListOTAModuleVersionsByDeviceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ModuleName")
        public String moduleName;

        @NameInMap("ModuleVersion")
        public String moduleVersion;

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
