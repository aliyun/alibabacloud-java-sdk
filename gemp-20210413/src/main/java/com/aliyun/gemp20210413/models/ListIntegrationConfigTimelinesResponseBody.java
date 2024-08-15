// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListIntegrationConfigTimelinesResponseBody extends TeaModel {
    /**
     * <p>data</p>
     */
    @NameInMap("data")
    public java.util.List<ListIntegrationConfigTimelinesResponseBodyData> data;

    /**
     * <p>pageNumber</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>pageSize</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>601FA6A2-AC5C-4B59-BE11-378F887A6A11</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>totalCount</p>
     * 
     * <strong>example:</strong>
     * <p>103</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>2021-04-05 10:10:10</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

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
