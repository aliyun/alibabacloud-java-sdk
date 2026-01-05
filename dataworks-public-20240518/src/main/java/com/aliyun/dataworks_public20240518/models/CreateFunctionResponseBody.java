// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateFunctionResponseBody extends TeaModel {
    /**
     * <p>The unique identifier of the UDF.</p>
     * <blockquote>
     * <p> This field is of the Long type in SDK versions prior to 8.0.0, and of the String type in SDK versions 8.0.0 and later. This change does not affect normal SDK usage; the parameter will still be returned according to the type defined in the SDK. However, compilation failures may occur due to the type change only when upgrading the SDK across version 8.0.0. In this case, you must manually update the data type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>580667964888595XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The request ID. You can locate logs and troubleshoot issues based on the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE49C88D-5BEE-5ADD-8B8C-C4BBC0D7XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionResponseBody self = new CreateFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFunctionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
