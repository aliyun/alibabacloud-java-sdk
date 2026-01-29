// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageTotalRequest extends TeaModel {
    /**
     * <p>The ID of the account for which you want to query usage summary. If you do not set this parameter, the data of the current Alibaba Cloud account and its RAM users is queried. To query the data of a RAM user, specify the ID of the RAM user.</p>
     * 
     * <strong>example:</strong>
     * <p>123745698925000</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The end of the time range to query. The end is excluded from the time range. If you do not set this parameter, the end time is the current time. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-02 00:00:00</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    @NameInMap("FilterParam")
    public DescribeSavingsPlansUsageTotalRequestFilterParam filterParam;

    /**
     * <p>The time granularity at which usage summary are queried. Valid values: MONTH, DAY, and HOUR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The beginning of the time range to query. The beginning is included in the time range. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-01 00:00:00</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    public static DescribeSavingsPlansUsageTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansUsageTotalRequest self = new DescribeSavingsPlansUsageTotalRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansUsageTotalRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansUsageTotalRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansUsageTotalRequest setFilterParam(DescribeSavingsPlansUsageTotalRequestFilterParam filterParam) {
        this.filterParam = filterParam;
        return this;
    }
    public DescribeSavingsPlansUsageTotalRequestFilterParam getFilterParam() {
        return this.filterParam;
    }

    public DescribeSavingsPlansUsageTotalRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansUsageTotalRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public static class DescribeSavingsPlansUsageTotalRequestFilterParamDimensions extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("SelectType")
        public String selectType;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeSavingsPlansUsageTotalRequestFilterParamDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageTotalRequestFilterParamDimensions self = new DescribeSavingsPlansUsageTotalRequestFilterParamDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageTotalRequestFilterParamDimensions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSavingsPlansUsageTotalRequestFilterParamDimensions setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeSavingsPlansUsageTotalRequestFilterParamDimensions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeSavingsPlansUsageTotalRequestFilterParamTags extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("SelectType")
        public String selectType;

        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeSavingsPlansUsageTotalRequestFilterParamTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageTotalRequestFilterParamTags self = new DescribeSavingsPlansUsageTotalRequestFilterParamTags();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageTotalRequestFilterParamTags setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSavingsPlansUsageTotalRequestFilterParamTags setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeSavingsPlansUsageTotalRequestFilterParamTags setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeSavingsPlansUsageTotalRequestFilterParam extends TeaModel {
        @NameInMap("Dimensions")
        public java.util.List<DescribeSavingsPlansUsageTotalRequestFilterParamDimensions> dimensions;

        @NameInMap("Tags")
        public java.util.List<DescribeSavingsPlansUsageTotalRequestFilterParamTags> tags;

        public static DescribeSavingsPlansUsageTotalRequestFilterParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageTotalRequestFilterParam self = new DescribeSavingsPlansUsageTotalRequestFilterParam();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageTotalRequestFilterParam setDimensions(java.util.List<DescribeSavingsPlansUsageTotalRequestFilterParamDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeSavingsPlansUsageTotalRequestFilterParamDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeSavingsPlansUsageTotalRequestFilterParam setTags(java.util.List<DescribeSavingsPlansUsageTotalRequestFilterParamTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeSavingsPlansUsageTotalRequestFilterParamTags> getTags() {
            return this.tags;
        }

    }

}
