// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListOTAModuleVersionsByDeviceResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public ListOTAModuleVersionsByDeviceResponseData data;

    public static ListOTAModuleVersionsByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOTAModuleVersionsByDeviceResponse self = new ListOTAModuleVersionsByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListOTAModuleVersionsByDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOTAModuleVersionsByDeviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOTAModuleVersionsByDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOTAModuleVersionsByDeviceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListOTAModuleVersionsByDeviceResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListOTAModuleVersionsByDeviceResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOTAModuleVersionsByDeviceResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public ListOTAModuleVersionsByDeviceResponse setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOTAModuleVersionsByDeviceResponse setData(ListOTAModuleVersionsByDeviceResponseData data) {
        this.data = data;
        return this;
    }
    public ListOTAModuleVersionsByDeviceResponseData getData() {
        return this.data;
    }

    public static class ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo extends TeaModel {
        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("ModuleVersion")
        @Validation(required = true)
        public String moduleVersion;

        @NameInMap("ModuleName")
        @Validation(required = true)
        public String moduleName;

        public static ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo build(java.util.Map<String, ?> map) throws Exception {
            ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo self = new ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo();
            return TeaModel.build(map, self);
        }

        public ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo setModuleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }
        public String getModuleName() {
            return this.moduleName;
        }

    }

    public static class ListOTAModuleVersionsByDeviceResponseData extends TeaModel {
        @NameInMap("SimpleOTAModuleInfo")
        @Validation(required = true)
        public java.util.List<ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo> simpleOTAModuleInfo;

        public static ListOTAModuleVersionsByDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListOTAModuleVersionsByDeviceResponseData self = new ListOTAModuleVersionsByDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public ListOTAModuleVersionsByDeviceResponseData setSimpleOTAModuleInfo(java.util.List<ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo> simpleOTAModuleInfo) {
            this.simpleOTAModuleInfo = simpleOTAModuleInfo;
            return this;
        }
        public java.util.List<ListOTAModuleVersionsByDeviceResponseDataSimpleOTAModuleInfo> getSimpleOTAModuleInfo() {
            return this.simpleOTAModuleInfo;
        }

    }

}
