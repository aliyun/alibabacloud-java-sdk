// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListDeviceGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListDeviceGroupResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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

    public ListDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceGroupResponseBody setData(ListDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public ListDeviceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        @NameInMap("CurrentUser")
        public Boolean currentUser;

        @NameInMap("DeviceCount")
        public Long deviceCount;

        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Name")
        public String name;

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

        public ListDeviceGroupResponseBodyDataPageData setCurrentUser(Boolean currentUser) {
            this.currentUser = currentUser;
            return this;
        }
        public Boolean getCurrentUser() {
            return this.currentUser;
        }

        public ListDeviceGroupResponseBodyDataPageData setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

        public ListDeviceGroupResponseBodyDataPageData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public ListDeviceGroupResponseBodyDataPageData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListDeviceGroupResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
