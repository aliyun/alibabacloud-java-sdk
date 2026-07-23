// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterQueryEventsRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Body")
    public EventCenterQueryEventsRequestBody body;

    /**
     * <p>The name of the event bus.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("BusName")
    public String busName;

    /**
     * <p>The maximum number of results to return. Valid values: 0 to 10,000. The default value is 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static EventCenterQueryEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        EventCenterQueryEventsRequest self = new EventCenterQueryEventsRequest();
        return TeaModel.build(map, self);
    }

    public EventCenterQueryEventsRequest setBody(EventCenterQueryEventsRequestBody body) {
        this.body = body;
        return this;
    }
    public EventCenterQueryEventsRequestBody getBody() {
        return this.body;
    }

    public EventCenterQueryEventsRequest setBusName(String busName) {
        this.busName = busName;
        return this;
    }
    public String getBusName() {
        return this.busName;
    }

    public EventCenterQueryEventsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EventCenterQueryEventsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class EventCenterQueryEventsRequestBodyParametersCalculations extends TeaModel {
        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>source</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>COUNT_DISTINCT</p>
         */
        @NameInMap("Op")
        public String op;

        public static EventCenterQueryEventsRequestBodyParametersCalculations build(java.util.Map<String, ?> map) throws Exception {
            EventCenterQueryEventsRequestBodyParametersCalculations self = new EventCenterQueryEventsRequestBodyParametersCalculations();
            return TeaModel.build(map, self);
        }

        public EventCenterQueryEventsRequestBodyParametersCalculations setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public EventCenterQueryEventsRequestBodyParametersCalculations setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

    }

    public static class EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters extends TeaModel {
        /**
         * <p>The column name.</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The operator.</p>
         */
        @NameInMap("Op")
        public String op;

        /**
         * <p>A list of values to use with the operator.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters build(java.util.Map<String, ?> map) throws Exception {
            EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters self = new EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters();
            return TeaModel.build(map, self);
        }

        public EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class EventCenterQueryEventsRequestBodyParametersFilters extends TeaModel {
        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>source</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>The logical operator for combining nested filters.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("NestedFilterCombination")
        public String nestedFilterCombination;

        /**
         * <p>A list of nested filters.</p>
         */
        @NameInMap("NestedFilters")
        public java.util.List<EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters> nestedFilters;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>=</p>
         */
        @NameInMap("Op")
        public String op;

        /**
         * <p>The values to use with the operator.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static EventCenterQueryEventsRequestBodyParametersFilters build(java.util.Map<String, ?> map) throws Exception {
            EventCenterQueryEventsRequestBodyParametersFilters self = new EventCenterQueryEventsRequestBodyParametersFilters();
            return TeaModel.build(map, self);
        }

        public EventCenterQueryEventsRequestBodyParametersFilters setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public EventCenterQueryEventsRequestBodyParametersFilters setNestedFilterCombination(String nestedFilterCombination) {
            this.nestedFilterCombination = nestedFilterCombination;
            return this;
        }
        public String getNestedFilterCombination() {
            return this.nestedFilterCombination;
        }

        public EventCenterQueryEventsRequestBodyParametersFilters setNestedFilters(java.util.List<EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters> nestedFilters) {
            this.nestedFilters = nestedFilters;
            return this;
        }
        public java.util.List<EventCenterQueryEventsRequestBodyParametersFiltersNestedFilters> getNestedFilters() {
            return this.nestedFilters;
        }

        public EventCenterQueryEventsRequestBodyParametersFilters setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public EventCenterQueryEventsRequestBodyParametersFilters setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class EventCenterQueryEventsRequestBodyParametersOrders extends TeaModel {
        /**
         * <p>The column name.</p>
         * 
         * <strong>example:</strong>
         * <p>source</p>
         */
        @NameInMap("Column")
        public String column;

        /**
         * <p>Specifies whether to sort the results in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Desc")
        public Boolean desc;

        /**
         * <p>The operator.</p>
         * 
         * <strong>example:</strong>
         * <p>AVG</p>
         */
        @NameInMap("Op")
        public String op;

        public static EventCenterQueryEventsRequestBodyParametersOrders build(java.util.Map<String, ?> map) throws Exception {
            EventCenterQueryEventsRequestBodyParametersOrders self = new EventCenterQueryEventsRequestBodyParametersOrders();
            return TeaModel.build(map, self);
        }

        public EventCenterQueryEventsRequestBodyParametersOrders setColumn(String column) {
            this.column = column;
            return this;
        }
        public String getColumn() {
            return this.column;
        }

        public EventCenterQueryEventsRequestBodyParametersOrders setDesc(Boolean desc) {
            this.desc = desc;
            return this;
        }
        public Boolean getDesc() {
            return this.desc;
        }

        public EventCenterQueryEventsRequestBodyParametersOrders setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

    }

    public static class EventCenterQueryEventsRequestBodyParameters extends TeaModel {
        /**
         * <p>An array of column names to use as dimensions for splitting the dataset.</p>
         */
        @NameInMap("Breakdowns")
        public java.util.List<String> breakdowns;

        /**
         * <p>The calculations to perform on specified columns.</p>
         */
        @NameInMap("Calculations")
        public java.util.List<EventCenterQueryEventsRequestBodyParametersCalculations> calculations;

        /**
         * <p>The end timestamp for the event query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687861201814</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The logical operator for combining filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("FilterCombination")
        public String filterCombination;

        /**
         * <p>A list of filter conditions.</p>
         */
        @NameInMap("Filters")
        public java.util.List<EventCenterQueryEventsRequestBodyParametersFilters> filters;

        /**
         * <p>The time granularity, in seconds, for querying time series data. The minimum value is 1. This is a suggested value; the actual granularity is returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Granularity")
        public Integer granularity;

        /**
         * <p>The maximum number of events to query. Valid values: 1 to 10,000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The starting position of the query. The count starts from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The sort order for the query results. This parameter applies only when QueryType is set to table.</p>
         */
        @NameInMap("Orders")
        public java.util.List<EventCenterQueryEventsRequestBodyParametersOrders> orders;

        /**
         * <p>The start timestamp for the event query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687860901814</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The time range. Unit: milliseconds. The minimum value is 1,000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("TimeRange")
        public Long timeRange;

        public static EventCenterQueryEventsRequestBodyParameters build(java.util.Map<String, ?> map) throws Exception {
            EventCenterQueryEventsRequestBodyParameters self = new EventCenterQueryEventsRequestBodyParameters();
            return TeaModel.build(map, self);
        }

        public EventCenterQueryEventsRequestBodyParameters setBreakdowns(java.util.List<String> breakdowns) {
            this.breakdowns = breakdowns;
            return this;
        }
        public java.util.List<String> getBreakdowns() {
            return this.breakdowns;
        }

        public EventCenterQueryEventsRequestBodyParameters setCalculations(java.util.List<EventCenterQueryEventsRequestBodyParametersCalculations> calculations) {
            this.calculations = calculations;
            return this;
        }
        public java.util.List<EventCenterQueryEventsRequestBodyParametersCalculations> getCalculations() {
            return this.calculations;
        }

        public EventCenterQueryEventsRequestBodyParameters setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public EventCenterQueryEventsRequestBodyParameters setFilterCombination(String filterCombination) {
            this.filterCombination = filterCombination;
            return this;
        }
        public String getFilterCombination() {
            return this.filterCombination;
        }

        public EventCenterQueryEventsRequestBodyParameters setFilters(java.util.List<EventCenterQueryEventsRequestBodyParametersFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<EventCenterQueryEventsRequestBodyParametersFilters> getFilters() {
            return this.filters;
        }

        public EventCenterQueryEventsRequestBodyParameters setGranularity(Integer granularity) {
            this.granularity = granularity;
            return this;
        }
        public Integer getGranularity() {
            return this.granularity;
        }

        public EventCenterQueryEventsRequestBodyParameters setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }
        public Integer getLimit() {
            return this.limit;
        }

        public EventCenterQueryEventsRequestBodyParameters setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public EventCenterQueryEventsRequestBodyParameters setOrders(java.util.List<EventCenterQueryEventsRequestBodyParametersOrders> orders) {
            this.orders = orders;
            return this;
        }
        public java.util.List<EventCenterQueryEventsRequestBodyParametersOrders> getOrders() {
            return this.orders;
        }

        public EventCenterQueryEventsRequestBodyParameters setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public EventCenterQueryEventsRequestBodyParameters setTimeRange(Long timeRange) {
            this.timeRange = timeRange;
            return this;
        }
        public Long getTimeRange() {
            return this.timeRange;
        }

    }

    public static class EventCenterQueryEventsRequestBody extends TeaModel {
        /**
         * <p>The query parameters.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Parameters")
        public EventCenterQueryEventsRequestBodyParameters parameters;

        /**
         * <p>The query type. Valid values:</p>
         * <ul>
         * <li><p><strong>timeseries</strong>: queries time series data.</p>
         * </li>
         * <li><p><strong>table</strong>: queries table data.</p>
         * </li>
         * <li><p><strong>timeseries_and_table</strong>: queries both time series data and table data.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>timeseries_and_table</p>
         */
        @NameInMap("QueryType")
        public String queryType;

        /**
         * <p>The schema ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs:GeneralSchema</p>
         */
        @NameInMap("SchemaId")
        public String schemaId;

        public static EventCenterQueryEventsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            EventCenterQueryEventsRequestBody self = new EventCenterQueryEventsRequestBody();
            return TeaModel.build(map, self);
        }

        public EventCenterQueryEventsRequestBody setParameters(EventCenterQueryEventsRequestBodyParameters parameters) {
            this.parameters = parameters;
            return this;
        }
        public EventCenterQueryEventsRequestBodyParameters getParameters() {
            return this.parameters;
        }

        public EventCenterQueryEventsRequestBody setQueryType(String queryType) {
            this.queryType = queryType;
            return this;
        }
        public String getQueryType() {
            return this.queryType;
        }

        public EventCenterQueryEventsRequestBody setSchemaId(String schemaId) {
            this.schemaId = schemaId;
            return this;
        }
        public String getSchemaId() {
            return this.schemaId;
        }

    }

}
