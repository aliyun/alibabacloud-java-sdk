// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingTopoResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public GetThingTopoResponseData data;

    public static GetThingTopoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetThingTopoResponse self = new GetThingTopoResponse();
        return TeaModel.build(map, self);
    }

    public GetThingTopoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingTopoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetThingTopoResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingTopoResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingTopoResponse setData(GetThingTopoResponseData data) {
        this.data = data;
        return this;
    }
    public GetThingTopoResponseData getData() {
        return this.data;
    }

    public static class GetThingTopoResponseDataListDeviceInfo extends TeaModel {
        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("ProductKey")
        @Validation(required = true)
        public String productKey;

        @NameInMap("DeviceName")
        @Validation(required = true)
        public String deviceName;

        public static GetThingTopoResponseDataListDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetThingTopoResponseDataListDeviceInfo self = new GetThingTopoResponseDataListDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetThingTopoResponseDataListDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetThingTopoResponseDataListDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public GetThingTopoResponseDataListDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

    }

    public static class GetThingTopoResponseDataList extends TeaModel {
        @NameInMap("deviceInfo")
        @Validation(required = true)
        public java.util.List<GetThingTopoResponseDataListDeviceInfo> deviceInfo;

        public static GetThingTopoResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            GetThingTopoResponseDataList self = new GetThingTopoResponseDataList();
            return TeaModel.build(map, self);
        }

        public GetThingTopoResponseDataList setDeviceInfo(java.util.List<GetThingTopoResponseDataListDeviceInfo> deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }
        public java.util.List<GetThingTopoResponseDataListDeviceInfo> getDeviceInfo() {
            return this.deviceInfo;
        }

    }

    public static class GetThingTopoResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Long total;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Long pageCount;

        @NameInMap("List")
        @Validation(required = true)
        public GetThingTopoResponseDataList list;

        public static GetThingTopoResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetThingTopoResponseData self = new GetThingTopoResponseData();
            return TeaModel.build(map, self);
        }

        public GetThingTopoResponseData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public GetThingTopoResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetThingTopoResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetThingTopoResponseData setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetThingTopoResponseData setList(GetThingTopoResponseDataList list) {
            this.list = list;
            return this;
        }
        public GetThingTopoResponseDataList getList() {
            return this.list;
        }

    }

}
