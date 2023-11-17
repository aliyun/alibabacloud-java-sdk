// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class GetSubDeviceListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSubDeviceListResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetSubDeviceListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSubDeviceListResponseBody self = new GetSubDeviceListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSubDeviceListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSubDeviceListResponseBody setData(GetSubDeviceListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSubDeviceListResponseBodyData getData() {
        return this.data;
    }

    public GetSubDeviceListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetSubDeviceListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSubDeviceListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSubDeviceListResponseBodyDataSubDeviceList extends TeaModel {
        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("ProductKey")
        public String productKey;

        public static GetSubDeviceListResponseBodyDataSubDeviceList build(java.util.Map<String, ?> map) throws Exception {
            GetSubDeviceListResponseBodyDataSubDeviceList self = new GetSubDeviceListResponseBodyDataSubDeviceList();
            return TeaModel.build(map, self);
        }

        public GetSubDeviceListResponseBodyDataSubDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public GetSubDeviceListResponseBodyDataSubDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public GetSubDeviceListResponseBodyDataSubDeviceList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class GetSubDeviceListResponseBodyData extends TeaModel {
        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("SubDeviceList")
        public java.util.List<GetSubDeviceListResponseBodyDataSubDeviceList> subDeviceList;

        @NameInMap("Total")
        public Long total;

        public static GetSubDeviceListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSubDeviceListResponseBodyData self = new GetSubDeviceListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSubDeviceListResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public GetSubDeviceListResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetSubDeviceListResponseBodyData setSubDeviceList(java.util.List<GetSubDeviceListResponseBodyDataSubDeviceList> subDeviceList) {
            this.subDeviceList = subDeviceList;
            return this;
        }
        public java.util.List<GetSubDeviceListResponseBodyDataSubDeviceList> getSubDeviceList() {
            return this.subDeviceList;
        }

        public GetSubDeviceListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
