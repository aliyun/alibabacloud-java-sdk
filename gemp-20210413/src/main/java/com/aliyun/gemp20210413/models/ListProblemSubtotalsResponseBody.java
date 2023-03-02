// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemSubtotalsResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListProblemSubtotalsResponseBodyData> data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListProblemSubtotalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProblemSubtotalsResponseBody self = new ListProblemSubtotalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProblemSubtotalsResponseBody setData(java.util.List<ListProblemSubtotalsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProblemSubtotalsResponseBodyData> getData() {
        return this.data;
    }

    public ListProblemSubtotalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProblemSubtotalsResponseBodyData extends TeaModel {
        @NameInMap("createRamName")
        public String createRamName;

        @NameInMap("createTime")
        public String createTime;

        @NameInMap("createUserId")
        public Long createUserId;

        @NameInMap("createUserPhone")
        public String createUserPhone;

        @NameInMap("description")
        public String description;

        public static ListProblemSubtotalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProblemSubtotalsResponseBodyData self = new ListProblemSubtotalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProblemSubtotalsResponseBodyData setCreateRamName(String createRamName) {
            this.createRamName = createRamName;
            return this;
        }
        public String getCreateRamName() {
            return this.createRamName;
        }

        public ListProblemSubtotalsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProblemSubtotalsResponseBodyData setCreateUserId(Long createUserId) {
            this.createUserId = createUserId;
            return this;
        }
        public Long getCreateUserId() {
            return this.createUserId;
        }

        public ListProblemSubtotalsResponseBodyData setCreateUserPhone(String createUserPhone) {
            this.createUserPhone = createUserPhone;
            return this;
        }
        public String getCreateUserPhone() {
            return this.createUserPhone;
        }

        public ListProblemSubtotalsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

}
