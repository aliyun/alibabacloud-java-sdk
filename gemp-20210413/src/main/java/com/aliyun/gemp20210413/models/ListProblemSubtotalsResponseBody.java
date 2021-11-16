// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemSubtotalsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListProblemSubtotalsResponseBodyData> data;

    // Id of the request
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
        // 操作人
        @NameInMap("createRamName")
        public String createRamName;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 人员id
        @NameInMap("createUserId")
        public Long createUserId;

        // 操作人手机号
        @NameInMap("createUserPhone")
        public String createUserPhone;

        // 描述
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
