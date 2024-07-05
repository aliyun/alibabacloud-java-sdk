// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListCustomViewsResponseBody extends TeaModel {
    @NameInMap("CustomViews")
    public ListCustomViewsResponseBodyCustomViews customViews;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>580e8ce3-3b80-44c5-9f3f-36ac3cc5bdd5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCustomViewsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomViewsResponseBody self = new ListCustomViewsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomViewsResponseBody setCustomViews(ListCustomViewsResponseBodyCustomViews customViews) {
        this.customViews = customViews;
        return this;
    }
    public ListCustomViewsResponseBodyCustomViews getCustomViews() {
        return this.customViews;
    }

    public ListCustomViewsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomViewsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomViewsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomViewsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomViewsResponseBodyCustomViewsCustomView extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CustomViewId")
        public String customViewId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        public static ListCustomViewsResponseBodyCustomViewsCustomView build(java.util.Map<String, ?> map) throws Exception {
            ListCustomViewsResponseBodyCustomViewsCustomView self = new ListCustomViewsResponseBodyCustomViewsCustomView();
            return TeaModel.build(map, self);
        }

        public ListCustomViewsResponseBodyCustomViewsCustomView setCustomViewId(String customViewId) {
            this.customViewId = customViewId;
            return this;
        }
        public String getCustomViewId() {
            return this.customViewId;
        }

        public ListCustomViewsResponseBodyCustomViewsCustomView setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class ListCustomViewsResponseBodyCustomViews extends TeaModel {
        @NameInMap("CustomView")
        public java.util.List<ListCustomViewsResponseBodyCustomViewsCustomView> customView;

        public static ListCustomViewsResponseBodyCustomViews build(java.util.Map<String, ?> map) throws Exception {
            ListCustomViewsResponseBodyCustomViews self = new ListCustomViewsResponseBodyCustomViews();
            return TeaModel.build(map, self);
        }

        public ListCustomViewsResponseBodyCustomViews setCustomView(java.util.List<ListCustomViewsResponseBodyCustomViewsCustomView> customView) {
            this.customView = customView;
            return this;
        }
        public java.util.List<ListCustomViewsResponseBodyCustomViewsCustomView> getCustomView() {
            return this.customView;
        }

    }

}
