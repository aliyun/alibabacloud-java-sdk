// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class ListBindingDeviceByAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListBindingDeviceByAccountResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBindingDeviceByAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindingDeviceByAccountResponseBody self = new ListBindingDeviceByAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindingDeviceByAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBindingDeviceByAccountResponseBody setData(ListBindingDeviceByAccountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBindingDeviceByAccountResponseBodyData getData() {
        return this.data;
    }

    public ListBindingDeviceByAccountResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListBindingDeviceByAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBindingDeviceByAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBindingDeviceByAccountResponseBodyDataDeviceList extends TeaModel {
        @NameInMap("BindTime")
        public Long bindTime;

        @NameInMap("DeviceName")
        public String deviceName;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Owned")
        public Integer owned;

        @NameInMap("ProductKey")
        public String productKey;

        public static ListBindingDeviceByAccountResponseBodyDataDeviceList build(java.util.Map<String, ?> map) throws Exception {
            ListBindingDeviceByAccountResponseBodyDataDeviceList self = new ListBindingDeviceByAccountResponseBodyDataDeviceList();
            return TeaModel.build(map, self);
        }

        public ListBindingDeviceByAccountResponseBodyDataDeviceList setBindTime(Long bindTime) {
            this.bindTime = bindTime;
            return this;
        }
        public Long getBindTime() {
            return this.bindTime;
        }

        public ListBindingDeviceByAccountResponseBodyDataDeviceList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public ListBindingDeviceByAccountResponseBodyDataDeviceList setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public ListBindingDeviceByAccountResponseBodyDataDeviceList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public ListBindingDeviceByAccountResponseBodyDataDeviceList setOwned(Integer owned) {
            this.owned = owned;
            return this;
        }
        public Integer getOwned() {
            return this.owned;
        }

        public ListBindingDeviceByAccountResponseBodyDataDeviceList setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

    }

    public static class ListBindingDeviceByAccountResponseBodyData extends TeaModel {
        @NameInMap("DeviceList")
        public java.util.List<ListBindingDeviceByAccountResponseBodyDataDeviceList> deviceList;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageNo")
        public Integer pageNo;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListBindingDeviceByAccountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBindingDeviceByAccountResponseBodyData self = new ListBindingDeviceByAccountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBindingDeviceByAccountResponseBodyData setDeviceList(java.util.List<ListBindingDeviceByAccountResponseBodyDataDeviceList> deviceList) {
            this.deviceList = deviceList;
            return this;
        }
        public java.util.List<ListBindingDeviceByAccountResponseBodyDataDeviceList> getDeviceList() {
            return this.deviceList;
        }

        public ListBindingDeviceByAccountResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListBindingDeviceByAccountResponseBodyData setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListBindingDeviceByAccountResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBindingDeviceByAccountResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
