// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListDashboardsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DashboardVos")
    @Validation(required = true)
    public java.util.List<ListDashboardsResponseDashboardVos> dashboardVos;

    public static ListDashboardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardsResponse self = new ListDashboardsResponse();
        return TeaModel.build(map, self);
    }

    public static class ListDashboardsResponseDashboardVos extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        public String id;

        @NameInMap("Uid")
        @Validation(required = true)
        public String uid;

        @NameInMap("Title")
        @Validation(required = true)
        public String title;

        @NameInMap("Time")
        @Validation(required = true)
        public String time;

        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("Exporter")
        @Validation(required = true)
        public String exporter;

        @NameInMap("IsArmsExporter")
        @Validation(required = true)
        public Boolean isArmsExporter;

        @NameInMap("Tags")
        @Validation(required = true)
        public java.util.List<String> tags;

        public static ListDashboardsResponseDashboardVos build(java.util.Map<String, ?> map) throws Exception {
            ListDashboardsResponseDashboardVos self = new ListDashboardsResponseDashboardVos();
            return TeaModel.build(map, self);
        }

    }

}
