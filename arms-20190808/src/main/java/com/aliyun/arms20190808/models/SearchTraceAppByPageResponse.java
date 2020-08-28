// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTraceAppByPageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageBean")
    @Validation(required = true)
    public SearchTraceAppByPageResponsePageBean pageBean;

    public static SearchTraceAppByPageResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchTraceAppByPageResponse self = new SearchTraceAppByPageResponse();
        return TeaModel.build(map, self);
    }

    public static class SearchTraceAppByPageResponsePageBeanTraceApps extends TeaModel {
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

        public static SearchTraceAppByPageResponsePageBeanTraceApps build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByPageResponsePageBeanTraceApps self = new SearchTraceAppByPageResponsePageBeanTraceApps();
            return TeaModel.build(map, self);
        }

    }

    public static class SearchTraceAppByPageResponsePageBean extends TeaModel {
        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TraceApps")
        @Validation(required = true)
        public java.util.List<SearchTraceAppByPageResponsePageBeanTraceApps> traceApps;

        public static SearchTraceAppByPageResponsePageBean build(java.util.Map<String, ?> map) throws Exception {
            SearchTraceAppByPageResponsePageBean self = new SearchTraceAppByPageResponsePageBean();
            return TeaModel.build(map, self);
        }

    }

}
