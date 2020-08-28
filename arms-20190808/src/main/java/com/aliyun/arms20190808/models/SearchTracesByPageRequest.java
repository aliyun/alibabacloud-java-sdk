// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesByPageRequest extends TeaModel {
    @NameInMap("StartTime")
    @Validation(required = true)
    public Long startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public Long endTime;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("OperationName")
    public String operationName;

    @NameInMap("MinDuration")
    public Long minDuration;

    @NameInMap("ServiceIp")
    public String serviceIp;

    @NameInMap("ExclusionFilters")
    public java.util.List<SearchTracesByPageRequestExclusionFilters> exclusionFilters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static SearchTracesByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesByPageRequest self = new SearchTracesByPageRequest();
        return TeaModel.build(map, self);
    }

    public static class SearchTracesByPageRequestExclusionFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SearchTracesByPageRequestExclusionFilters build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesByPageRequestExclusionFilters self = new SearchTracesByPageRequestExclusionFilters();
            return TeaModel.build(map, self);
        }

    }

}
