// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class QueryDatasetRequest extends TeaModel {
    @NameInMap("DatasetId")
    @Validation(required = true)
    public Long datasetId;

    @NameInMap("IntervalInSec")
    @Validation(required = true)
    public Integer intervalInSec;

    @NameInMap("DateStr")
    public String dateStr;

    @NameInMap("MinTime")
    @Validation(required = true)
    public Long minTime;

    @NameInMap("MaxTime")
    @Validation(required = true)
    public Long maxTime;

    @NameInMap("IsDrillDown")
    public Boolean isDrillDown;

    @NameInMap("OrderByKey")
    public String orderByKey;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("ReduceTail")
    public Boolean reduceTail;

    @NameInMap("HungryMode")
    public Boolean hungryMode;

    @NameInMap("Measures")
    public java.util.List<String> measures;

    @NameInMap("Dimensions")
    public java.util.List<QueryDatasetRequestDimensions> dimensions;

    @NameInMap("RequiredDims")
    public java.util.List<QueryDatasetRequestRequiredDims> requiredDims;

    @NameInMap("OptionalDims")
    public java.util.List<QueryDatasetRequestOptionalDims> optionalDims;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    public static QueryDatasetRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDatasetRequest self = new QueryDatasetRequest();
        return TeaModel.build(map, self);
    }

    public static class QueryDatasetRequestDimensions extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Type")
        public String type;

        public static QueryDatasetRequestDimensions build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetRequestDimensions self = new QueryDatasetRequestDimensions();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryDatasetRequestRequiredDims extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Type")
        public String type;

        public static QueryDatasetRequestRequiredDims build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetRequestRequiredDims self = new QueryDatasetRequestRequiredDims();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryDatasetRequestOptionalDims extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        @NameInMap("Type")
        public String type;

        public static QueryDatasetRequestOptionalDims build(java.util.Map<String, ?> map) throws Exception {
            QueryDatasetRequestOptionalDims self = new QueryDatasetRequestOptionalDims();
            return TeaModel.build(map, self);
        }

    }

}
