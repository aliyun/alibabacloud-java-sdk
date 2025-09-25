// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeSmartStatisticsPageListResponseBody extends TeaModel {
    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Returned data list.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeSmartStatisticsPageListResponseBodyItems> items;

    /**
     * <p>Number of items displayed per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>ID of this request.</p>
     * 
     * <strong>example:</strong>
     * <p>96943***4E39F805</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count.</p>
     * 
     * <strong>example:</strong>
     * <p>29</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Total number of pages.</p>
     * 
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
         * <p>Date. Format: <i>month/day</i></p>
         * 
         * <strong>example:</strong>
         * <p>11/8</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>Pass rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("PassRate")
        public String passRate;

        /**
         * <p>Product solution Code, please refer to the Enhanced Real Person Help Documentation.</p>
         * 
         * <strong>example:</strong>
         * <p>SMART_VERIFY</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>Scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20**40</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>Scene name.</p>
         * 
         * <strong>example:</strong>
         * <p>****实名认证</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>Number of successful calls.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>Total count.</p>
         * 
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
