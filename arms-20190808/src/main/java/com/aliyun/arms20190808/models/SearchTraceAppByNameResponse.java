// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByNameResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TraceApps")
    @Validation(required = true)
    public java.util.List<SearchTraceAppByNameResponseTraceApps> traceApps;

    public static SearchTraceAppByNameResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByNameResponse self = new SearchTraceAppByNameResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchTraceAppByNameResponseTraceApps extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public Long appId;

        @NameInMap("Pid")
        @Validation(required = true)
        public String pid;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("UserId")
        @Validation(required = true)
        public String userId;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        public static SearchTraceAppByNameResponseTraceApps build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByNameResponseTraceApps self = new SearchTraceAppByNameResponseTraceApps();
            return TeaModel.build(map, self);
        }

    }

}
