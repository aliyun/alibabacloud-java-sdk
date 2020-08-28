// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesRequest extends TeaModel {
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

    @NameInMap("Tag")
    public java.util.List<SearchTracesRequestTag> tag;

    @NameInMap("ServiceIp")
    public String serviceIp;

    @NameInMap("ExclusionFilters")
    public java.util.List<SearchTracesRequestExclusionFilters> exclusionFilters;

    public static SearchTracesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesRequest self = new SearchTracesRequest();
        return TeaModel.build(map, self);
    }

    public static class SearchTracesRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SearchTracesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesRequestTag self = new SearchTracesRequestTag();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchTracesRequestExclusionFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SearchTracesRequestExclusionFilters build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesRequestExclusionFilters self = new SearchTracesRequestExclusionFilters();
            return TeaModel.build(map, self);
        }

    }

}
