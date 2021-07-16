// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListProblemSubtotalsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<ListProblemSubtotalsResponseBodyData> data;

    public static ListProblemSubtotalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProblemSubtotalsResponseBody self = new ListProblemSubtotalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProblemSubtotalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProblemSubtotalsResponseBody setData(java.util.List<ListProblemSubtotalsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProblemSubtotalsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListProblemSubtotalsResponseBodyData extends TeaModel {
        // 描述
        @NameInMap("description")
        public String description;

        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 操作人
        @NameInMap("createRamName")
        public String createRamName;

        public static ListProblemSubtotalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProblemSubtotalsResponseBodyData self = new ListProblemSubtotalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProblemSubtotalsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProblemSubtotalsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProblemSubtotalsResponseBodyData setCreateRamName(String createRamName) {
            this.createRamName = createRamName;
            return this;
        }
        public String getCreateRamName() {
            return this.createRamName;
        }

    }

}
