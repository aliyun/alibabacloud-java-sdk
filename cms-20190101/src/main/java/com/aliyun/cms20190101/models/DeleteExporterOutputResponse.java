// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteExporterOutputResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static DeleteExporterOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExporterOutputResponse self = new DeleteExporterOutputResponse();
        return TeaModel.build(map, self);
    }

}
