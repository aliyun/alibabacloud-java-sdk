// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetDivisionListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RegionMap")
    public java.util.Map<String, ?> regionMap;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDivisionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDivisionListResponseBody self = new GetDivisionListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDivisionListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetDivisionListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDivisionListResponseBody setRegionMap(java.util.Map<String, ?> regionMap) {
        this.regionMap = regionMap;
        return this;
    }
    public java.util.Map<String, ?> getRegionMap() {
        return this.regionMap;
    }

    public GetDivisionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDivisionListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
