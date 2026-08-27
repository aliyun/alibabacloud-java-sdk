// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingTrendRequest extends TeaModel {
    @NameInMap("filter")
    public GetBillingTrendRequestFilter filter;

    /**
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("granularity")
    public String granularity;

    @NameInMap("groupBy")
    public java.util.List<GetBillingTrendRequestGroupBy> groupBy;

    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("locale")
    public String locale;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("regionId")
    public String regionId;

    @NameInMap("timePeriod")
    public GetBillingTrendRequestTimePeriod timePeriod;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("topNum")
    public Integer topNum;

    /**
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
         * <strong>example:</strong>
         * <p>CHARGE_TYPE</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("selectType")
        public String selectType;

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
         * <strong>example:</strong>
         * <p>2026-08-25</p>
         */
        @NameInMap("end")
        public String end;

        /**
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
