// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class DescribeSavingsPlansUsageDetailRequest extends TeaModel {
    /**
     * <p>The ID of the account for which you want to query usage details. If you do not set this parameter, the data of the current Alibaba Cloud account and its RAM users is queried. To query the data of a RAM user, specify the ID of the RAM user.</p>
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
    public DescribeSavingsPlansUsageDetailRequestFilterParam filterParam;

    /**
     * <p>The maximum number of entries to return. Default value: 20. Maximum value: 300.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The time granularity at which usage details are queried. Valid values: MONTH, DAY, and HOUR.</p>
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

    /**
     * <p>The token that is used to retrieve the next page of results. You do not need to set this parameter if you query usage details within a specific time range for the first time. The response returns a token that you can use to query usage details that are displayed on the next page. If a null value is returned for the NextToken parameter, no more coverage details can be queried.</p>
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
        @NameInMap("Code")
        public String code;

        @NameInMap("SelectType")
        public String selectType;

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
        @NameInMap("Code")
        public String code;

        @NameInMap("SelectType")
        public String selectType;

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
        @NameInMap("Dimensions")
        public java.util.List<DescribeSavingsPlansUsageDetailRequestFilterParamDimensions> dimensions;

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
