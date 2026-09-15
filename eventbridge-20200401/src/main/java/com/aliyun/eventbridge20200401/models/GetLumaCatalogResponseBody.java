// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetLumaCatalogResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. A specific error code is returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the data catalog bound to the Agent.</p>
     */
    @NameInMap("Data")
    public Catalog data;

    /**
     * <p>The message returned by the operation. The value is Operation success when the call succeeds, or a specific error description when the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and ticket submission.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLumaCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLumaCatalogResponseBody self = new GetLumaCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLumaCatalogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetLumaCatalogResponseBody setData(Catalog data) {
        this.data = data;
        return this;
    }
    public Catalog getData() {
        return this.data;
    }

    public GetLumaCatalogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLumaCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLumaCatalogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
