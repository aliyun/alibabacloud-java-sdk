// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class ListDeviceGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListDeviceGroupResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupResponseBody self = new ListDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListDeviceGroupResponseBody setData(ListDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public ListDeviceGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDeviceGroupResponseBodyDataPageData extends TeaModel {
        @NameInMap("AuthorizeType")
        public String authorizeType;

        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("OwnerName")
        public String ownerName;

        @NameInMap("OwnerUid")
        public String ownerUid;

        @NameInMap("ProductKey")
        public String productKey;

        @NameInMap("Remark")
        public String remark;

        @NameInMap("Status")
        public String status;

        public static ListDeviceGroupResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceGroupResponseBodyDataPageData self = new ListDeviceGroupResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListDeviceGroupResponseBodyDataPageData setAuthorizeType(String authorizeType) {
            this.authorizeType = authorizeType;
            return this;
        }
        public String getAuthorizeType() {
            return this.authorizeType;
        }

        public ListDeviceGroupResponseBodyDataPageData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public ListDeviceGroupResponseBodyDataPageData setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListDeviceGroupResponseBodyDataPageData setOwnerUid(String ownerUid) {
            this.ownerUid = ownerUid;
            return this;
        }
        public String getOwnerUid() {
            return this.ownerUid;
        }

        public ListDeviceGroupResponseBodyDataPageData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListDeviceGroupResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListDeviceGroupResponseBodyDataPageData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListDeviceGroupResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceGroupResponseBodyData self = new ListDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDeviceGroupResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListDeviceGroupResponseBodyData setPageData(java.util.List<ListDeviceGroupResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListDeviceGroupResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListDeviceGroupResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListDeviceGroupResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
