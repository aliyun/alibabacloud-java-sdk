// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumOcuStatisticDataRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1687849260000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter condition. Three types of filter conditions are provided:</p>
     * <ul>
     * <li>Application name: pid (Note that the application name is displayed, but the application ID is actually specified)</li>
     * <li>Application type: siteType</li>
     * <li>Data type: dataType</li>
     * </ul>
     */
    @NameInMap("Filter")
    public java.util.List<GetRumOcuStatisticDataRequestFilter> filter;

    /**
     * <p>The grouping fields. Valid values:</p>
     * <ul>
     * <li>siteType: The total number of OCUs is grouped by application type.</li>
     * <li>dataType: The total number of OCUs is grouped by data type.</li>
     * <li>pid: The total number of OCUs is grouped by application ID.</li>
     * <li>appName: The total number of OCUs is grouped by application name.</li>
     * <li>startTime: The total number of OCUs is grouped by start time.</li>
     * </ul>
     */
    @NameInMap("Group")
    public java.util.List<String> group;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The type of the query. To query non-time series data, set the value to INSTANT. To query time series data, set the value to TIME_SERIES.</p>
     * 
     * <strong>example:</strong>
     * <p>TIME_SERIES</p>
     */
    @NameInMap("QueryType")
    public String queryType;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1600063200000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static GetRumOcuStatisticDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumOcuStatisticDataRequest self = new GetRumOcuStatisticDataRequest();
        return TeaModel.build(map, self);
    }

    public GetRumOcuStatisticDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetRumOcuStatisticDataRequest setFilter(java.util.List<GetRumOcuStatisticDataRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<GetRumOcuStatisticDataRequestFilter> getFilter() {
        return this.filter;
    }

    public GetRumOcuStatisticDataRequest setGroup(java.util.List<String> group) {
        this.group = group;
        return this;
    }
    public java.util.List<String> getGroup() {
        return this.group;
    }

    public GetRumOcuStatisticDataRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetRumOcuStatisticDataRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRumOcuStatisticDataRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public GetRumOcuStatisticDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRumOcuStatisticDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class GetRumOcuStatisticDataRequestFilter extends TeaModel {
        /**
         * <p>The key of the filter condition. Three types of filter conditions are provided:</p>
         * <ul>
         * <li>Application name: pid (Note that the application name is displayed, but the application ID is actually specified)</li>
         * <li>Application type: siteType</li>
         * <li>Data type: dataType</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pid</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The type of the operator. Valid value: in.</p>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("OpType")
        public String opType;

        /**
         * <p>The value of the filter condition. The value is a JSON array of strings.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;b590xxxxx@2dcbxxxxx9&quot;, &quot;b590xxxxx@2dcbxxxxx8&quot;]</p>
         */
        @NameInMap("Value")
        public Object value;

        public static GetRumOcuStatisticDataRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetRumOcuStatisticDataRequestFilter self = new GetRumOcuStatisticDataRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetRumOcuStatisticDataRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetRumOcuStatisticDataRequestFilter setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

        public GetRumOcuStatisticDataRequestFilter setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

}
