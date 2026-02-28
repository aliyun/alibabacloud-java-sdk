// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetThingTopoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetThingTopoResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetThingTopoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetThingTopoResponseBody self = new GetThingTopoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetThingTopoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetThingTopoResponseBody setData(GetThingTopoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetThingTopoResponseBodyData getData() {
        return this.data;
    }

    public GetThingTopoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetThingTopoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetThingTopoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetThingTopoResponseBodyDataListDeviceInfo extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        public static GetThingTopoResponseBodyDataListDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetThingTopoResponseBodyDataListDeviceInfo self = new GetThingTopoResponseBodyDataListDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetThingTopoResponseBodyDataListDeviceInfo setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetThingTopoResponseBodyDataListDeviceInfo setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetThingTopoResponseBodyDataListDeviceInfo setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class GetThingTopoResponseBodyDataList extends TeaModel {
        @NameInMap("deviceInfo")
        public java.util.List<GetThingTopoResponseBodyDataListDeviceInfo> deviceInfo;

        public static GetThingTopoResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetThingTopoResponseBodyDataList self = new GetThingTopoResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetThingTopoResponseBodyDataList setDeviceInfo(java.util.List<GetThingTopoResponseBodyDataListDeviceInfo> deviceInfo) {
            this.deviceInfo = deviceInfo;
            return this;
        }
        public java.util.List<GetThingTopoResponseBodyDataListDeviceInfo> getDeviceInfo() {
            return this.deviceInfo;
        }

    }

    public static class GetThingTopoResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("List")
        public GetThingTopoResponseBodyDataList list;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static GetThingTopoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetThingTopoResponseBodyData self = new GetThingTopoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetThingTopoResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public GetThingTopoResponseBodyData setList(GetThingTopoResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public GetThingTopoResponseBodyDataList getList() {
            return this.list;
        }

        public GetThingTopoResponseBodyData setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetThingTopoResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetThingTopoResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
