// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageTotalRequest extends TeaModel {
    /**
     * <p>The ID of the resource ownership account. The resource ownership account is the account that actually uses the resources.</p>
     * 
     * <strong>example:</strong>
     * <p>123745698925000</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The end time of the query. Format: yyyy-MM-dd HH:mm:ss. The specified end time is excluded from the query. If this parameter is left empty, the current time is used as the end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-20 00:00:00</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    /**
     * <p>The filter parameters.</p>
     */
    @NameInMap("FilterParam")
    public DescribeSavingsPlansCoverageTotalRequestFilterParam filterParam;

    /**
     * <p>The time granularity. Valid values:</p>
     * <ul>
     * <li>MONTH: month</li>
     * <li>DAY: day</li>
     * <li>HOUR: hour</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The start time of the query. Format: yyyy-MM-dd HH:mm:ss. The specified start time is included in the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-15 00:00:00</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    public static DescribeSavingsPlansCoverageTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageTotalRequest self = new DescribeSavingsPlansCoverageTotalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageTotalRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansCoverageTotalRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansCoverageTotalRequest setFilterParam(DescribeSavingsPlansCoverageTotalRequestFilterParam filterParam) {
        this.filterParam = filterParam;
        return this;
    }
    public DescribeSavingsPlansCoverageTotalRequestFilterParam getFilterParam() {
        return this.filterParam;
    }

    public DescribeSavingsPlansCoverageTotalRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansCoverageTotalRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public static class DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions extends TeaModel {
        /**
         * <p>The dimension code.</p>
         * 
         * <strong>example:</strong>
         * <p>COMMODITY</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The selection method for dimension filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        /**
         * <p>The list of dimension filter values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions self = new DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeSavingsPlansCoverageTotalRequestFilterParamTags extends TeaModel {
        /**
         * <p>The tag code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The selection method for tag filtering.</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        /**
         * <p>The list of tag filter values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeSavingsPlansCoverageTotalRequestFilterParamTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageTotalRequestFilterParamTags self = new DescribeSavingsPlansCoverageTotalRequestFilterParamTags();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageTotalRequestFilterParamTags setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSavingsPlansCoverageTotalRequestFilterParamTags setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeSavingsPlansCoverageTotalRequestFilterParamTags setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeSavingsPlansCoverageTotalRequestFilterParam extends TeaModel {
        /**
         * <p>The list of dimension filter conditions.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions> dimensions;

        /**
         * <p>The list of tag filter conditions.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeSavingsPlansCoverageTotalRequestFilterParamTags> tags;

        public static DescribeSavingsPlansCoverageTotalRequestFilterParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageTotalRequestFilterParam self = new DescribeSavingsPlansCoverageTotalRequestFilterParam();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageTotalRequestFilterParam setDimensions(java.util.List<DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeSavingsPlansCoverageTotalRequestFilterParamDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeSavingsPlansCoverageTotalRequestFilterParam setTags(java.util.List<DescribeSavingsPlansCoverageTotalRequestFilterParamTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeSavingsPlansCoverageTotalRequestFilterParamTags> getTags() {
            return this.tags;
        }

    }

}
