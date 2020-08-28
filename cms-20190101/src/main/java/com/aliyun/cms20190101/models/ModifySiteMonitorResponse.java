// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifySiteMonitorResponse extends TeaModel {
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
    public ModifySiteMonitorResponseData data;

    public static ModifySiteMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySiteMonitorResponse self = new ModifySiteMonitorResponse();
        return TeaModel.build(map, self);
    }

    public static class ModifySiteMonitorResponseData extends TeaModel {
        @NameInMap("count")
        @Validation(required = true)
        public Integer count;

        public static ModifySiteMonitorResponseData build(java.util.Map<String, ?> map) throws Exception {
            ModifySiteMonitorResponseData self = new ModifySiteMonitorResponseData();
            return TeaModel.build(map, self);
        }

    }

}
