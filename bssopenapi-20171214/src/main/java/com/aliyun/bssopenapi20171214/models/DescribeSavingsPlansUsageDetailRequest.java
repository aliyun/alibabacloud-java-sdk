// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageDetailRequest extends TeaModel {
    /**
     * <p>The ID of the account whose data you want to query. If this parameter is left empty, the data of the current account and its trusteeship linked accounts is queried. You can specify the ID of a trusteeship linked account to query only the data of that account.</p>
     * 
     * <strong>example:</strong>
     * <p>123745698925000</p>
     */
    @NameInMap("BillOwnerId")
    public Long billOwnerId;

    /**
     * <p>The end time of the query. Format: yyyy-MM-dd HH:mm:ss. The specified time is excluded from the query. If this parameter is left empty, the current time is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-02 00:00:00</p>
     */
    @NameInMap("EndPeriod")
    public String endPeriod;

    /**
     * <p>The filter parameters.</p>
     */
    @NameInMap("FilterParam")
    public DescribeSavingsPlansUsageDetailRequestFilterParam filterParam;

    /**
     * <p>The maximum number of data records to return in the current request. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The time granularity for querying the usage summary. Valid values:</p>
     * <ul>
     * <li>MONTH: monthly</li>
     * <li>DAY: daily</li>
     * <li>HOUR: hourly</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HOUR</p>
     */
    @NameInMap("PeriodType")
    public String periodType;

    /**
     * <p>The start time of the query. Format: yyyy-MM-dd HH:mm:ss. The specified time is included in the query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-01 00:00:00</p>
     */
    @NameInMap("StartPeriod")
    public String startPeriod;

    /**
     * <p>The pagination token. Leave this parameter empty when you query the first page. The token for the next page is returned in the response. If the returned token is empty, all results are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeSavingsPlansUsageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSavingsPlansUsageDetailRequest self = new DescribeSavingsPlansUsageDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSavingsPlansUsageDetailRequest setBillOwnerId(Long billOwnerId) {
        this.billOwnerId = billOwnerId;
        return this;
    }
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    public DescribeSavingsPlansUsageDetailRequest setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
        return this;
    }
    public String getEndPeriod() {
        return this.endPeriod;
    }

    public DescribeSavingsPlansUsageDetailRequest setFilterParam(DescribeSavingsPlansUsageDetailRequestFilterParam filterParam) {
        this.filterParam = filterParam;
        return this;
    }
    public DescribeSavingsPlansUsageDetailRequestFilterParam getFilterParam() {
        return this.filterParam;
    }

    public DescribeSavingsPlansUsageDetailRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSavingsPlansUsageDetailRequest setPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }
    public String getPeriodType() {
        return this.periodType;
    }

    public DescribeSavingsPlansUsageDetailRequest setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public DescribeSavingsPlansUsageDetailRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class DescribeSavingsPlansUsageDetailRequestFilterParamDimensions extends TeaModel {
        /**
         * <p>The dimension code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The selection method for the dimension filter.</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        /**
         * <p>The list of dimension filter values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeSavingsPlansUsageDetailRequestFilterParamDimensions build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageDetailRequestFilterParamDimensions self = new DescribeSavingsPlansUsageDetailRequestFilterParamDimensions();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageDetailRequestFilterParamDimensions setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSavingsPlansUsageDetailRequestFilterParamDimensions setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeSavingsPlansUsageDetailRequestFilterParamDimensions setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeSavingsPlansUsageDetailRequestFilterParamTags extends TeaModel {
        /**
         * <p>The tag code.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The selection method for the tag filter.</p>
         */
        @NameInMap("SelectType")
        public String selectType;

        /**
         * <p>The list of tag filter values.</p>
         */
        @NameInMap("Values")
        public java.util.List<String> values;

        public static DescribeSavingsPlansUsageDetailRequestFilterParamTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageDetailRequestFilterParamTags self = new DescribeSavingsPlansUsageDetailRequestFilterParamTags();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageDetailRequestFilterParamTags setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeSavingsPlansUsageDetailRequestFilterParamTags setSelectType(String selectType) {
            this.selectType = selectType;
            return this;
        }
        public String getSelectType() {
            return this.selectType;
        }

        public DescribeSavingsPlansUsageDetailRequestFilterParamTags setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }
        public java.util.List<String> getValues() {
            return this.values;
        }

    }

    public static class DescribeSavingsPlansUsageDetailRequestFilterParam extends TeaModel {
        /**
         * <p>The list of dimension filter conditions.</p>
         */
        @NameInMap("Dimensions")
        public java.util.List<DescribeSavingsPlansUsageDetailRequestFilterParamDimensions> dimensions;

        /**
         * <p>The list of tag filter conditions.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeSavingsPlansUsageDetailRequestFilterParamTags> tags;

        public static DescribeSavingsPlansUsageDetailRequestFilterParam build(java.util.Map<String, ?> map) throws Exception {
            DescribeSavingsPlansUsageDetailRequestFilterParam self = new DescribeSavingsPlansUsageDetailRequestFilterParam();
            return TeaModel.build(map, self);
        }

        public DescribeSavingsPlansUsageDetailRequestFilterParam setDimensions(java.util.List<DescribeSavingsPlansUsageDetailRequestFilterParamDimensions> dimensions) {
            this.dimensions = dimensions;
            return this;
        }
        public java.util.List<DescribeSavingsPlansUsageDetailRequestFilterParamDimensions> getDimensions() {
            return this.dimensions;
        }

        public DescribeSavingsPlansUsageDetailRequestFilterParam setTags(java.util.List<DescribeSavingsPlansUsageDetailRequestFilterParamTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeSavingsPlansUsageDetailRequestFilterParamTags> getTags() {
            return this.tags;
        }

    }

}
