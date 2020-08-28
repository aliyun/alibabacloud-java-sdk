// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DisableSiteMonitorsResponse extends TeaModel {
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
    public DisableSiteMonitorsResponseData data;

    public static DisableSiteMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSiteMonitorsResponse self = new DisableSiteMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public static class DisableSiteMonitorsResponseData extends TeaModel {
        @NameInMap("count")
        @Validation(required = true)
        public Integer count;

        public static DisableSiteMonitorsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DisableSiteMonitorsResponseData self = new DisableSiteMonitorsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
