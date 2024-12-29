// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsDatasourcesResponseBody extends TeaModel {
    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("ApsDatasources")
    public java.util.List<DescribeApsDatasourcesResponseBodyApsDatasources> apsDatasources;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>-5213-</strong></strong></strong>-B608-******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeApsDatasourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsDatasourcesResponseBody self = new DescribeApsDatasourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApsDatasourcesResponseBody setApsDatasources(java.util.List<DescribeApsDatasourcesResponseBodyApsDatasources> apsDatasources) {
        this.apsDatasources = apsDatasources;
        return this;
    }
    public java.util.List<DescribeApsDatasourcesResponseBodyApsDatasources> getApsDatasources() {
        return this.apsDatasources;
    }

    public DescribeApsDatasourcesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApsDatasourcesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeApsDatasourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApsDatasourcesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeApsDatasourcesResponseBodyApsDatasources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-01-10 14:44:33</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatasourceDescription")
        public String datasourceDescription;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatasourceId")
        public Long datasourceId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DatasourceName")
        public String datasourceName;

        /**
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        @NameInMap("DatasourceType")
        public String datasourceType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasJob")
        public Boolean hasJob;

        public static DescribeApsDatasourcesResponseBodyApsDatasources build(java.util.Map<String, ?> map) throws Exception {
            DescribeApsDatasourcesResponseBodyApsDatasources self = new DescribeApsDatasourcesResponseBodyApsDatasources();
            return TeaModel.build(map, self);
        }

        public DescribeApsDatasourcesResponseBodyApsDatasources setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeApsDatasourcesResponseBodyApsDatasources setDatasourceDescription(String datasourceDescription) {
            this.datasourceDescription = datasourceDescription;
            return this;
        }
        public String getDatasourceDescription() {
            return this.datasourceDescription;
        }

        public DescribeApsDatasourcesResponseBodyApsDatasources setDatasourceId(Long datasourceId) {
            this.datasourceId = datasourceId;
            return this;
        }
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        public DescribeApsDatasourcesResponseBodyApsDatasources setDatasourceName(String datasourceName) {
            this.datasourceName = datasourceName;
            return this;
        }
        public String getDatasourceName() {
            return this.datasourceName;
        }

        public DescribeApsDatasourcesResponseBodyApsDatasources setDatasourceType(String datasourceType) {
            this.datasourceType = datasourceType;
            return this;
        }
        public String getDatasourceType() {
            return this.datasourceType;
        }

        public DescribeApsDatasourcesResponseBodyApsDatasources setHasJob(Boolean hasJob) {
            this.hasJob = hasJob;
            return this;
        }
        public Boolean getHasJob() {
            return this.hasJob;
        }

    }

}
