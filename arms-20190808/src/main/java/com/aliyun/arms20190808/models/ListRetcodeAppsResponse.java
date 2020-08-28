// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("RetcodeApps")
    @Validation(required = true)
    public java.util.List<ListRetcodeAppsResponseRetcodeApps> retcodeApps;

    public static ListRetcodeAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRetcodeAppsResponse self = new ListRetcodeAppsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListRetcodeAppsResponseRetcodeApps extends TeaModel {
        @NameInMap("AppId")
        @Validation(required = true)
        public Long appId;

        @NameInMap("Pid")
        @Validation(required = true)
        public String pid;

        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        public static ListRetcodeAppsResponseRetcodeApps build(java.util.Map<String, ?> map) throws Exception {
            ListRetcodeAppsResponseRetcodeApps self = new ListRetcodeAppsResponseRetcodeApps();
            return TeaModel.build(map, self);
        }

    }

}
