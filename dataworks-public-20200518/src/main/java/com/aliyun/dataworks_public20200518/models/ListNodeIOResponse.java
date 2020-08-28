// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeIOResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListNodeIOResponseData> data;

    public static ListNodeIOResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeIOResponse self = new ListNodeIOResponse();
        return TeaModel.build(map, self);
    }

    public static class ListNodeIOResponseData extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        public static ListNodeIOResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListNodeIOResponseData self = new ListNodeIOResponseData();
            return TeaModel.build(map, self);
        }

    }

}
