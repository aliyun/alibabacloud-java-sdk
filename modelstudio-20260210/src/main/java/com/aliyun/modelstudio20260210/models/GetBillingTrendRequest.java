// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingTrendRequest extends TeaModel {
    /**
     * <p>The dimension filter conditions.</p>
     */
    @NameInMap("filter")
    public GetBillingTrendRequestFilter filter;

    /**
     * <p>The query granularity. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>The grouping conditions. This parameter must contain one and only one element.</p>
     */
    @NameInMap("groupBy")
    public java.util.List<GetBillingTrendRequestGroupBy> groupBy;

    /**
     * <p>The response language. Default value: en-US.</p>
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
     * <p>The query time range, including the start time and end time. This parameter is required.</p>
     */
    @NameInMap("timePeriod")
    public GetBillingTrendRequestTimePeriod timePeriod;

    /**
     * <p>The number of groups to return. Valid values: 1 to 20. Default value: 20. The remaining groups are merged into &quot;Others&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("topNum")
    public Integer topNum;

    /**
     * <p>Specifies whether to filter out groups with a zero amount. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("zeroFilter")
    public Boolean zeroFilter;

    public static GetBillingTrendRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBillingTrendRequest self = new GetBillingTrendRequest();
        return TeaModel.build(map, self);
    }

    public GetBillingTrendRequest setFilter(GetBillingTrendRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public GetBillingTrendRequestFilter getFilter() {
        return this.filter;
    }

    public GetBillingTrendRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetBillingTrendRequest setGroupBy(java.util.List<GetBillingTrendRequestGroupBy> groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public java.util.List<GetBillingTrendRequestGroupBy> getGroupBy() {
        return this.groupBy;
    }

    public GetBillingTrendRequest setLocale(String locale) {
        this.locale = locale;
        return this;
    }
    public String getLocale() {
        return this.locale;
    }

    public GetBillingTrendRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetBillingTrendRequest setTimePeriod(GetBillingTrendRequestTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }
    public GetBillingTrendRequestTimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    public GetBillingTrendRequest setTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }
    public Integer getTopNum() {
        return this.topNum;
    }

    public GetBillingTrendRequest setZeroFilter(Boolean zeroFilter) {
        this.zeroFilter = zeroFilter;
        return this;
    }
    public Boolean getZeroFilter() {
        return this.zeroFilter;
    }

    public static class GetBillingTrendRequestFilterDimensions extends TeaModel {
        /**
         * <p>The filter dimension code. For more information, see the &quot;Additional information&quot; section below.</p>
         * 
         * <strong>example:</strong>
         * <p>CHARGE_TYPE</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The filter method.</p>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("selectType")
        public String selectType;

        /**
         * <p>The filter value list.</p>
         */
        @NameInMap("values")
        public java.util.List<String> values;

        public static GetBillingTrendRequestFilterDimensions build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendRequestFilterDimensions self = new GetBillingTrendRequestFilterDimensions();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendRequestFilterDimensions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetBillingTrendRequestFilterDimensions setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public GetBillingTrendRequestFilterDimensions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class GetBillingTrendRequestFilter extends TeaModel {
        /**
         * <p>The dimension filter list.</p>
         */
        @NameInMap("dimensions")
        public java.util.List<GetBillingTrendRequestFilterDimensions> dimensions;

        public static GetBillingTrendRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendRequestFilter self = new GetBillingTrendRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendRequestFilter setDimensions(java.util.List<GetBillingTrendRequestFilterDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<GetBillingTrendRequestFilterDimensions> getDimensions() {
            return this.dimensions;
        }

    }

    public static class GetBillingTrendRequestGroupBy extends TeaModel {
        /**
         * <p>The grouping dimension code. For more information, see the &quot;Additional information&quot; section below.</p>
         * 
         * <strong>example:</strong>
         * <p>BASE_MODEL</p>
         */
        @NameInMap("code")
        public String code;

        public static GetBillingTrendRequestGroupBy build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendRequestGroupBy self = new GetBillingTrendRequestGroupBy();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendRequestGroupBy setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

    }

    public static class GetBillingTrendRequestTimePeriod extends TeaModel {
        /**
         * <p>The end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-25</p>
         */
        @NameInMap("end")
        public String end;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-01</p>
         */
        @NameInMap("start")
        public String start;

        public static GetBillingTrendRequestTimePeriod build(java.util.Map<String, ?> map) throws Exception {
            GetBillingTrendRequestTimePeriod self = new GetBillingTrendRequestTimePeriod();
            return TeaModel.build(map, self);
        }

        public GetBillingTrendRequestTimePeriod setEnd(String end) {
            this.end = end;
            return this;
        }
        public String getEnd() {
            return this.end;
        }

        public GetBillingTrendRequestTimePeriod setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

}
