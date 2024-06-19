// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeSmartStatisticsPageListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeSmartStatisticsPageListResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>96943***4E39F805</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>29</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeSmartStatisticsPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartStatisticsPageListResponseBody self = new DescribeSmartStatisticsPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartStatisticsPageListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSmartStatisticsPageListResponseBody setItems(java.util.List<DescribeSmartStatisticsPageListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeSmartStatisticsPageListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeSmartStatisticsPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSmartStatisticsPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartStatisticsPageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSmartStatisticsPageListResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeSmartStatisticsPageListResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11/8</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("PassRate")
        public String passRate;

        /**
         * <strong>example:</strong>
         * <p>SMART_VERIFY</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <strong>example:</strong>
         * <p>20**40</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSmartStatisticsPageListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartStatisticsPageListResponseBodyItems self = new DescribeSmartStatisticsPageListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeSmartStatisticsPageListResponseBodyItems setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public DescribeSmartStatisticsPageListResponseBodyItems setPassRate(String passRate) {
            this.passRate = passRate;
            return this;
        }
        public String getPassRate() {
            return this.passRate;
        }

        public DescribeSmartStatisticsPageListResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeSmartStatisticsPageListResponseBodyItems setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public DescribeSmartStatisticsPageListResponseBodyItems setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribeSmartStatisticsPageListResponseBodyItems setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public DescribeSmartStatisticsPageListResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
