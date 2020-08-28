// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTraceAppsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("TraceApps")
    @Validation(required = true)
    public java.util.List<ListTraceAppsResponseTraceApps> traceApps;

    public static ListTraceAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTraceAppsResponse self = new ListTraceAppsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListTraceAppsResponseTraceApps extends TeaModel {
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

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        public static ListTraceAppsResponseTraceApps build(java.util.Map<String, ?> map) throws Exception {
            ListTraceAppsResponseTraceApps self = new ListTraceAppsResponseTraceApps();
            return TeaModel.build(map, self);
        }

    }

}
