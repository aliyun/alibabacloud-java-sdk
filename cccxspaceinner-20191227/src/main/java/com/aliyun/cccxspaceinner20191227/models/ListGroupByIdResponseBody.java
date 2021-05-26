// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class ListGroupByIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListGroupByIdResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListGroupByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupByIdResponseBody self = new ListGroupByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGroupByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGroupByIdResponseBody setData(java.util.List<ListGroupByIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGroupByIdResponseBodyData> getData() {
        return this.data;
    }

    public ListGroupByIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGroupByIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListGroupByIdResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("SupportCase")
        public Boolean supportCase;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("SupportIm")
        public Boolean supportIm;

        @NameInMap("SupportPhone")
        public Boolean supportPhone;

        public static ListGroupByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGroupByIdResponseBodyData self = new ListGroupByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGroupByIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListGroupByIdResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public ListGroupByIdResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public ListGroupByIdResponseBodyData setSupportCase(Boolean supportCase) {
            this.supportCase = supportCase;
            return this;
        }
        public Boolean getSupportCase() {
            return this.supportCase;
        }

        public ListGroupByIdResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGroupByIdResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListGroupByIdResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public ListGroupByIdResponseBodyData setSupportIm(Boolean supportIm) {
            this.supportIm = supportIm;
            return this;
        }
        public Boolean getSupportIm() {
            return this.supportIm;
        }

        public ListGroupByIdResponseBodyData setSupportPhone(Boolean supportPhone) {
            this.supportPhone = supportPhone;
            return this;
        }
        public Boolean getSupportPhone() {
            return this.supportPhone;
        }

    }

}
