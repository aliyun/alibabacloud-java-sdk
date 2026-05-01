// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListModelTemplateResourceGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListModelTemplateResourceGroupResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListModelTemplateResourceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListModelTemplateResourceGroupResponseBody self = new ListModelTemplateResourceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListModelTemplateResourceGroupResponseBody setData(java.util.List<ListModelTemplateResourceGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListModelTemplateResourceGroupResponseBodyData> getData() {
        return this.data;
    }

    public ListModelTemplateResourceGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelTemplateResourceGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelTemplateResourceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListModelTemplateResourceGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListModelTemplateResourceGroupResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>rg-xxxxx</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        public static ListModelTemplateResourceGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListModelTemplateResourceGroupResponseBodyData self = new ListModelTemplateResourceGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListModelTemplateResourceGroupResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

    }

}
