// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeHistoryTasksStatResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeHistoryTasksStatResponseBodyItems> items;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHistoryTasksStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryTasksStatResponseBody self = new DescribeHistoryTasksStatResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryTasksStatResponseBody setItems(java.util.List<DescribeHistoryTasksStatResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeHistoryTasksStatResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeHistoryTasksStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHistoryTasksStatResponseBodyItems extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeHistoryTasksStatResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeHistoryTasksStatResponseBodyItems self = new DescribeHistoryTasksStatResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeHistoryTasksStatResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeHistoryTasksStatResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
