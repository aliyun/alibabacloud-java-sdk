// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingOverviewRequest extends TeaModel {
    /**
     * <p>The billing month.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-08</p>
     */
    @NameInMap("billMonth")
    public String billMonth;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("filter")
    public GetBillingOverviewRequestFilter filter;

    /**
     * <p>The time granularity.</p>
     * 
     * <strong>example:</strong>
     * <p>MONTH</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The list of grouping conditions. Currently, you must specify exactly one grouping dimension.</p>
     */
    @NameInMap("groupBy")
    public java.util.List<GetBillingOverviewRequestGroupBy> groupBy;

    /**
     * <p>The language of the response. Default value: en-US.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("locale")
    public String locale;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The query time range, which includes the start and end times. Both the start and end times are included in the query range. The time format must be consistent with the granularity, and the start time cannot be later than the end time.</p>
     */
    @NameInMap("timePeriod")
    public GetBillingOverviewRequestTimePeriod timePeriod;

    /**
     * <p>The number of groups to return. Valid values: 1 to 20. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("topNum")
    public Integer topNum;

    /**
     * <p>Specifies whether to filter out groups with an amount of 0. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("zeroFilter")
    public Boolean zeroFilter;

    public static GetBillingOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBillingOverviewRequest self = new GetBillingOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetBillingOverviewRequest setBillMonth(String billMonth) {
        this.billMonth = billMonth;
        return this;
    }
    public String getBillMonth() {
        return this.billMonth;
    }

    public GetBillingOverviewRequest setFilter(GetBillingOverviewRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public GetBillingOverviewRequestFilter getFilter() {
        return this.filter;
    }

    public GetBillingOverviewRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetBillingOverviewRequest setGroupBy(java.util.List<GetBillingOverviewRequestGroupBy> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<GetBillingOverviewRequestGroupBy> getGroupBy() {
        return this.groupBy;
    }

    public GetBillingOverviewRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public GetBillingOverviewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetBillingOverviewRequest setTimePeriod(GetBillingOverviewRequestTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }
    public GetBillingOverviewRequestTimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    public GetBillingOverviewRequest setTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }
    public Integer getTopNum() {
        return this.topNum;
    }

    public GetBillingOverviewRequest setZeroFilter(Boolean zeroFilter) {
        this.zeroFilter = zeroFilter;
        return this;
    }
    public Boolean getZeroFilter() {
        return this.zeroFilter;
    }

    public static class GetBillingOverviewRequestFilterDimensions extends TeaModel {
        /**
         * <p>The filter field. For more information, see the &quot;Additional notes&quot; section below.</p>
         * 
         * <strong>example:</strong>
         * <p>CHARGE_TYPE</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The filter type.</p>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("selectType")
        public String selectType;

        /**
         * <p>The list of filter values.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static GetBillingOverviewRequestFilterDimensions build(java.util.Map<String, ?> map) throws Exception {
            GetBillingOverviewRequestFilterDimensions self = new GetBillingOverviewRequestFilterDimensions();
            return TeaModel.build(map, self);
        }

        public GetBillingOverviewRequestFilterDimensions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetBillingOverviewRequestFilterDimensions setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public GetBillingOverviewRequestFilterDimensions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetBillingOverviewRequestFilter extends TeaModel {
        /**
         * <p>The list of dimension filters.</p>
         */
        @NameInMap("dimensions")
        public java.util.List<GetBillingOverviewRequestFilterDimensions> dimensions;

        public static GetBillingOverviewRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetBillingOverviewRequestFilter self = new GetBillingOverviewRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetBillingOverviewRequestFilter setDimensions(java.util.List<GetBillingOverviewRequestFilterDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<GetBillingOverviewRequestFilterDimensions> getDimensions() {
            return this.dimensions;
        }

    }

    public static class GetBillingOverviewRequestGroupBy extends TeaModel {
        /**
         * <p>The code of the grouping dimension. For more information, see the &quot;Additional notes&quot; section below.</p>
         * 
         * <strong>example:</strong>
         * <p>BASE_MODEL</p>
         */
        @NameInMap("code")
        public String code;

        public static GetBillingOverviewRequestGroupBy build(java.util.Map<String, ?> map) throws Exception {
            GetBillingOverviewRequestGroupBy self = new GetBillingOverviewRequestGroupBy();
            return TeaModel.build(map, self);
        }

        public GetBillingOverviewRequestGroupBy setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class GetBillingOverviewRequestTimePeriod extends TeaModel {
        /**
         * <p>The end time of the query. This time point is included in the query range. The format is determined by granularity.</p>
         * 
         * <strong>example:</strong>
         * <p>202609</p>
         */
        @NameInMap("end")
        public String end;

        /**
         * <p>The start time of the query. This time point is included in the query range. The format is determined by granularity.</p>
         * 
         * <strong>example:</strong>
         * <p>202609</p>
         */
        @NameInMap("start")
        public String start;

        public static GetBillingOverviewRequestTimePeriod build(java.util.Map<String, ?> map) throws Exception {
            GetBillingOverviewRequestTimePeriod self = new GetBillingOverviewRequestTimePeriod();
            return TeaModel.build(map, self);
        }

        public GetBillingOverviewRequestTimePeriod setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public GetBillingOverviewRequestTimePeriod setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
