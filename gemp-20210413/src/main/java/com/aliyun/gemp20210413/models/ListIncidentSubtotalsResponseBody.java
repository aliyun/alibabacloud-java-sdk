// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIncidentSubtotalsResponseBody extends TeaModel {
    // data
    @NameInMap("data")
    public java.util.List<ListIncidentSubtotalsResponseBodyData> data;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListIncidentSubtotalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIncidentSubtotalsResponseBody self = new ListIncidentSubtotalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIncidentSubtotalsResponseBody setData(java.util.List<ListIncidentSubtotalsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIncidentSubtotalsResponseBodyData> getData() {
        return this.data;
    }

    public ListIncidentSubtotalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListIncidentSubtotalsResponseBodyData extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("createUserId")
        public Long createUserId;

        @NameInMap("createUserName")
        public String createUserName;

        @NameInMap("createUserPhone")
        public String createUserPhone;

        @NameInMap("description")
        public String description;

        public static ListIncidentSubtotalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIncidentSubtotalsResponseBodyData self = new ListIncidentSubtotalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIncidentSubtotalsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIncidentSubtotalsResponseBodyData setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListIncidentSubtotalsResponseBodyData setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListIncidentSubtotalsResponseBodyData setCreateUserPhone(String createUserPhone) {
            this.createUserPhone = createUserPhone;
            return this;
        }
        public String getCreateUserPhone() {
            return this.createUserPhone;
        }

        public ListIncidentSubtotalsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
