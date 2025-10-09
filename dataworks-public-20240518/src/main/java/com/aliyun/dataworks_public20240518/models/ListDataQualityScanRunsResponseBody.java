// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataQualityScanRunsResponseBody extends TeaModel {
    /**
     * <p>The page information.</p>
     */
    @NameInMap("PageInfo")
    public ListDataQualityScanRunsResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc14115***159376359</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListDataQualityScanRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataQualityScanRunsResponseBody self = new ListDataQualityScanRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataQualityScanRunsResponseBody setPageInfo(ListDataQualityScanRunsResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListDataQualityScanRunsResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListDataQualityScanRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRunsParameters extends TeaModel {
        /**
         * <p>The parameter name.</p>
         * 
         * <strong>example:</strong>
         * <p>dt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parameter value. You can use a scheduling time expression.</p>
         * 
         * <strong>example:</strong>
         * <p>$[yyyy-mm-dd-1]</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRunsParameters build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRunsParameters self = new ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRunsParameters();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRunsParameters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRunsParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns extends TeaModel {
        /**
         * <p>The time when the data quality monitor starts running.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the data quality monitor stops.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("FinishTime")
        public Long finishTime;

        /**
         * <p>The ID of the data quality monitor running record.</p>
         * 
         * <strong>example:</strong>
         * <p>3155</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The parameters configured for the instance.</p>
         */
        @NameInMap("Parameters")
        public java.util.List<ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRunsParameters> parameters;

        /**
         * <p>The status of the instance.</p>
         * <ul>
         * <li>Pass</li>
         * <li>Running</li>
         * <li>Error</li>
         * <li>Warn</li>
         * <li>Fail</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Fail</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns self = new ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns setParameters(java.util.List<ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRunsParameters> parameters) {
            this.parameters = parameters;
            return this;
        }
        public java.util.List<ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRunsParameters> getParameters() {
            return this.parameters;
        }

        public ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListDataQualityScanRunsResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The list of data quality monitor run records.</p>
         */
        @NameInMap("DataQualityScanRuns")
        public java.util.List<ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns> dataQualityScanRuns;

        /**
         * <p>The page number of the results. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records returned.</p>
         * 
         * <strong>example:</strong>
         * <p>324</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDataQualityScanRunsResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDataQualityScanRunsResponseBodyPageInfo self = new ListDataQualityScanRunsResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListDataQualityScanRunsResponseBodyPageInfo setDataQualityScanRuns(java.util.List<ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns> dataQualityScanRuns) {
            this.dataQualityScanRuns = dataQualityScanRuns;
            return this;
        }
        public java.util.List<ListDataQualityScanRunsResponseBodyPageInfoDataQualityScanRuns> getDataQualityScanRuns() {
            return this.dataQualityScanRuns;
        }

        public ListDataQualityScanRunsResponseBodyPageInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListDataQualityScanRunsResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataQualityScanRunsResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
