// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ListServiceInstanceDeployDetailsRequest extends TeaModel {
    /**
     * <p>The time zone.</p>
     * <p>Reference Format: &quot;+08:00&quot;</p>
     * <p>Valid Range: &quot;-12:59&quot; to &quot;+13:00&quot;</p>
     * 
     * <strong>example:</strong>
     * <p>+08:00</p>
     */
    @NameInMap("CycleTimeZone")
    public String cycleTimeZone;

    /**
     * <p>Determines the time period over which data is aggregated. If no aggregation dimension is specified, the query defaults to providing detailed, unaggregated results.</p>
     * <p>Optional Values:</p>
     * <ul>
     * <li>Year</li>
     * <li>Month</li>
     * <li>Day</li>
     * <li>All</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <p>The dimension names. (Equivalent to SQL\&quot;s GROUP BY Clause)
     * Optional Values:</p>
     * <ul>
     * <li>UserId</li>
     * <li>ServiceId</li>
     * <li>ServiceVersion</li>
     * <li>ServiceInstanceId</li>
     * <li>DeploySucceeded</li>
     * <li>ErrorType</li>
     * <li>ErrorCode</li>
     * </ul>
     */
    @NameInMap("Dimension")
    public java.util.List<String> dimension;

    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-31T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The filter.</p>
     */
    @NameInMap("Filter")
    public java.util.List<ListServiceInstanceDeployDetailsRequestFilter> filter;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAZbOYA+x9UgM6xrgcMqFUjk=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-25T02:23:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListServiceInstanceDeployDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceDeployDetailsRequest self = new ListServiceInstanceDeployDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceDeployDetailsRequest setCycleTimeZone(String cycleTimeZone) {
        this.cycleTimeZone = cycleTimeZone;
        return this;
    }
    public String getCycleTimeZone() {
        return this.cycleTimeZone;
    }

    public ListServiceInstanceDeployDetailsRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public ListServiceInstanceDeployDetailsRequest setDimension(java.util.List<String> dimension) {
        this.dimension = dimension;
        return this;
    }
    public java.util.List<String> getDimension() {
        return this.dimension;
    }

    public ListServiceInstanceDeployDetailsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListServiceInstanceDeployDetailsRequest setFilter(java.util.List<ListServiceInstanceDeployDetailsRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<ListServiceInstanceDeployDetailsRequestFilter> getFilter() {
        return this.filter;
    }

    public ListServiceInstanceDeployDetailsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceInstanceDeployDetailsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceInstanceDeployDetailsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListServiceInstanceDeployDetailsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public static class ListServiceInstanceDeployDetailsRequestFilter extends TeaModel {
        /**
         * <p>Filter Value Names (Equivalent to SQL\&quot;s WHERE Clause)</p>
         * <p>Available Options:</p>
         * <ul>
         * <li>UserId</li>
         * <li>ServiceId</li>
         * <li>ServiceVersion</li>
         * <li>ServiceInstanceId</li>
         * <li>DeploySucceeded (Accepts True or False and case-insensitive)</li>
         * <li>ErrorType</li>
         * <li>ErrorCode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ServiceId</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>A value of the filter condition.</p>
         */
        @NameInMap("Value")
        public java.util.List<String> value;

        public static ListServiceInstanceDeployDetailsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            ListServiceInstanceDeployDetailsRequestFilter self = new ListServiceInstanceDeployDetailsRequestFilter();
            return TeaModel.build(map, self);
        }

        public ListServiceInstanceDeployDetailsRequestFilter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListServiceInstanceDeployDetailsRequestFilter setValue(java.util.List<String> value) {
            this.value = value;
            return this;
        }
        public java.util.List<String> getValue() {
            return this.value;
        }

    }

}
