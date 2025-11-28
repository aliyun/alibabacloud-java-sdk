// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class ListEdgeDeviceGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListEdgeDeviceGroupResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListEdgeDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEdgeDeviceGroupResponseBody self = new ListEdgeDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEdgeDeviceGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEdgeDeviceGroupResponseBody setData(ListEdgeDeviceGroupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListEdgeDeviceGroupResponseBodyData getData() {
        return this.data;
    }

    public ListEdgeDeviceGroupResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListEdgeDeviceGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEdgeDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEdgeDeviceGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListEdgeDeviceGroupResponseBodyDataPageData extends TeaModel {
        @NameInMap("AuthorizedCount")
        public Integer authorizedCount;

        @NameInMap("CurrentUser")
        public Boolean currentUser;

        @NameInMap("DeviceCount")
        public Long deviceCount;

        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("EdgeName")
        public String edgeName;

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

        public static ListEdgeDeviceGroupResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeDeviceGroupResponseBodyDataPageData self = new ListEdgeDeviceGroupResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setAuthorizedCount(Integer authorizedCount) {
            this.authorizedCount = authorizedCount;
            return this;
        }
        public Integer getAuthorizedCount() {
            return this.authorizedCount;
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setCurrentUser(Boolean currentUser) {
            this.currentUser = currentUser;
            return this;
        }
        public Boolean getCurrentUser() {
            return this.currentUser;
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setEdgeName(String edgeName) {
            this.edgeName = edgeName;
            return this;
        }
        public String getEdgeName() {
            return this.edgeName;
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListEdgeDeviceGroupResponseBodyDataPageData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListEdgeDeviceGroupResponseBodyData extends TeaModel {
        @NameInMap("Num")
        public Integer num;

        @NameInMap("PageData")
        public java.util.List<ListEdgeDeviceGroupResponseBodyDataPageData> pageData;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("Total")
        public Integer total;

        public static ListEdgeDeviceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListEdgeDeviceGroupResponseBodyData self = new ListEdgeDeviceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListEdgeDeviceGroupResponseBodyData setNum(Integer num) {
            this.num = num;
            return this;
        }
        public Integer getNum() {
            return this.num;
        }

        public ListEdgeDeviceGroupResponseBodyData setPageData(java.util.List<ListEdgeDeviceGroupResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<ListEdgeDeviceGroupResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public ListEdgeDeviceGroupResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListEdgeDeviceGroupResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
