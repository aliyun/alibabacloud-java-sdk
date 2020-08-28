// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsResponse extends TeaModel {
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
    public DeleteSiteMonitorsResponseData data;

    public static DeleteSiteMonitorsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteMonitorsResponse self = new DeleteSiteMonitorsResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteSiteMonitorsResponseData extends TeaModel {
        @NameInMap("count")
        @Validation(required = true)
        public Integer count;

        public static DeleteSiteMonitorsResponseData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSiteMonitorsResponseData self = new DeleteSiteMonitorsResponseData();
            return TeaModel.build(map, self);
        }

    }

}
