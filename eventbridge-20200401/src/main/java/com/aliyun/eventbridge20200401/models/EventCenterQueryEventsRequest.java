// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class EventCenterQueryEventsRequest extends TeaModel {
    /**
     * <p>The parameters in the request body.</p>
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
     * <p>The number of entries per page. Valid values: 0 to 10000. Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>用来标记当前开始读取的位置。置空表示从头开始。</p>
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
        @NameInMap("Column")
        public String column;

        @NameInMap("Op")
        public String op;

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
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("NestedFilterCombination")
        public String nestedFilterCombination;

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
         * <p>The values that are used together with the operator.</p>
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
         * <p>Specifies whether to sort the query results in descending order.</p>
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
         * <p>Specifies whether to further split the data set based on the column name.</p>
         */
        @NameInMap("Breakdowns")
        public java.util.List<String> breakdowns;

        /**
         * <p>The operator that is used to calculate the specified column.</p>
         */
        @NameInMap("Calculations")
        public java.util.List<EventCenterQueryEventsRequestBodyParametersCalculations> calculations;

        /**
         * <p>The timestamp that specifies the end of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687861201814</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The logic used to filter the combination of conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("FilterCombination")
        public String filterCombination;

        /**
         * <p>The filter conditions.</p>
         */
        @NameInMap("Filters")
        public java.util.List<EventCenterQueryEventsRequestBodyParametersFilters> filters;

        /**
         * <p>The minimum time unit for querying time series data. Minimum value: 1. Unit: seconds. The value of this parameter is a recommended value. The actual value returned shall prevail.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Granularity")
        public Integer granularity;

        /**
         * <p>The maximum number of events to query. Valid values: 1 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Limit")
        public Integer limit;

        /**
         * <p>The offset of the start position for this query. The offset starts from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The order of the query results. This parameter is valid only if you set QueryType to table.</p>
         */
        @NameInMap("Orders")
        public java.util.List<EventCenterQueryEventsRequestBodyParametersOrders> orders;

        /**
         * <p>The timestamp that specifies the beginning of the time range to query. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1687860901814</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The time range during which events are queried. Unit: milliseconds. Minimum value: 1000.</p>
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
         * <li><strong>timeseries</strong>: queries time series data.</li>
         * <li><strong>table</strong>: queries table data.</li>
         * <li><strong>timeseries_and_table</strong>: queries time series data and table data at the same time.</li>
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
