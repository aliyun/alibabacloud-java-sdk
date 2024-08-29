// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetPotentialFailZonesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The zones where the current disaster recovery service can be switched.</p>
     */
    @NameInMap("Data")
    public java.util.List<String> data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified ResourceIds are not found in our records.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BFB7F5C8-FE7A-06CA-9F87-ABBF6B848F0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetPotentialFailZonesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPotentialFailZonesResponseBody self = new GetPotentialFailZonesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPotentialFailZonesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPotentialFailZonesResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public GetPotentialFailZonesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPotentialFailZonesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
