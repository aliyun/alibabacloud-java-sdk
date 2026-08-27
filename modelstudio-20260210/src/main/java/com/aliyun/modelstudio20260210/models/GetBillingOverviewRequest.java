// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class GetBillingOverviewRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-08</p>
     */
    @NameInMap("billMonth")
    public String billMonth;

    @NameInMap("filter")
    public GetBillingOverviewRequestFilter filter;

    @NameInMap("groupBy")
    public java.util.List<GetBillingOverviewRequestGroupBy> groupBy;

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

}
