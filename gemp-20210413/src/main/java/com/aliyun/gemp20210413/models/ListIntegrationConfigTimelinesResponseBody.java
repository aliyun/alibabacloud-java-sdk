// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigTimelinesResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListIntegrationConfigTimelinesResponseBodyData> data;

    // pageNumber
    @NameInMap("pageNumber")
    public Long pageNumber;

    // pageSize
    @NameInMap("pageSize")
    public Long pageSize;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    // totalCount
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListIntegrationConfigTimelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationConfigTimelinesResponseBody self = new ListIntegrationConfigTimelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIntegrationConfigTimelinesResponseBody setData(java.util.List<ListIntegrationConfigTimelinesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListIntegrationConfigTimelinesResponseBodyData> getData() {
        return this.data;
    }

    public ListIntegrationConfigTimelinesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListIntegrationConfigTimelinesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListIntegrationConfigTimelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIntegrationConfigTimelinesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListIntegrationConfigTimelinesResponseBodyData extends TeaModel {
        // 创建时间
        @NameInMap("createTime")
        public String createTime;

        // 描述
        @NameInMap("description")
        public String description;

        // 主题
        @NameInMap("title")
        public String title;

        public static ListIntegrationConfigTimelinesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIntegrationConfigTimelinesResponseBodyData self = new ListIntegrationConfigTimelinesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIntegrationConfigTimelinesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListIntegrationConfigTimelinesResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIntegrationConfigTimelinesResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
