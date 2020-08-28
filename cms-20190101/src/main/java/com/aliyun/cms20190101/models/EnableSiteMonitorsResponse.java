// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableSiteMonitorsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public EnableSiteMonitorsResponseData data;

    public static EnableSiteMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSiteMonitorsResponse self = new EnableSiteMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public static class EnableSiteMonitorsResponseData extends TeaModel {
        @NameInMap("count")
        @Validation(required = true)
        public Integer count;

        public static EnableSiteMonitorsResponseData build(java.util.Map<String, ?> map) throws Exception {
            EnableSiteMonitorsResponseData self = new EnableSiteMonitorsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
