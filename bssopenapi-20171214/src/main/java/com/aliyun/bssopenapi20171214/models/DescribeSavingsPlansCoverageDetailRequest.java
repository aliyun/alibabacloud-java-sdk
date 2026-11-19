// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansCoverageDetailRequest extends TeaModel {
    /**
     * <p>The ID of the account with resource ownership. The account with resource ownership is the account that actually uses the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>123745698925000</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The end time of the time range to query. The end time is not included in the time range. If you do not specify this parameter, the end time is the current time. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-01 00:00:00</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    /**
     * <p>The filter parameters.</p>
     */
    @NameInMap("FilterParam")
    public DescribeSavingsPlansCoverageDetailRequestFilterParam filterParam;

    /**
     * <p>The maximum number of results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The time granularity for querying the usage summary. Valid values: MONTH, DAY, and HOUR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The start time of the time range to query. The start time is included in the time range. Specify the time in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-01 00:00:00</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    /**
     * <p>The pagination token. Leave this parameter empty when you query the first page. The token for the next page is returned in the response. An empty token indicates that all results have been retrieved.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeSavingsPlansCoverageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansCoverageDetailRequest self = new DescribeSavingsPlansCoverageDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansCoverageDetailRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansCoverageDetailRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansCoverageDetailRequest setFilterParam(DescribeSavingsPlansCoverageDetailRequestFilterParam filterParam) {
        this.filterParam = filterParam;
        return this;
    }
    public DescribeSavingsPlansCoverageDetailRequestFilterParam getFilterParam() {
        return this.filterParam;
    }

    public DescribeSavingsPlansCoverageDetailRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSavingsPlansCoverageDetailRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansCoverageDetailRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public DescribeSavingsPlansCoverageDetailRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions extends TeaModel {
        /**
         * <p>The dimension code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The selection method for dimension filtering.</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        /**
         * <p>The list of dimension filter values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions self = new DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeSavingsPlansCoverageDetailRequestFilterParamTags extends TeaModel {
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

        public static DescribeSavingsPlansCoverageDetailRequestFilterParamTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageDetailRequestFilterParamTags self = new DescribeSavingsPlansCoverageDetailRequestFilterParamTags();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageDetailRequestFilterParamTags setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSavingsPlansCoverageDetailRequestFilterParamTags setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeSavingsPlansCoverageDetailRequestFilterParamTags setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeSavingsPlansCoverageDetailRequestFilterParam extends TeaModel {
        /**
         * <p>The list of dimension filter conditions.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions> dimensions;

        /**
         * <p>The list of tag filter conditions.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeSavingsPlansCoverageDetailRequestFilterParamTags> tags;

        public static DescribeSavingsPlansCoverageDetailRequestFilterParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansCoverageDetailRequestFilterParam self = new DescribeSavingsPlansCoverageDetailRequestFilterParam();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansCoverageDetailRequestFilterParam setDimensions(java.util.List<DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeSavingsPlansCoverageDetailRequestFilterParamDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeSavingsPlansCoverageDetailRequestFilterParam setTags(java.util.List<DescribeSavingsPlansCoverageDetailRequestFilterParamTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeSavingsPlansCoverageDetailRequestFilterParamTags> getTags() {
            return this.tags;
        }

    }

}
