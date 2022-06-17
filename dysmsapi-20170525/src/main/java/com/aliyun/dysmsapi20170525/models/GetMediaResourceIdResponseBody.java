// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetMediaResourceIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMediaResourceIdResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMediaResourceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResourceIdResponseBody self = new GetMediaResourceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaResourceIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMediaResourceIdResponseBody setData(GetMediaResourceIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMediaResourceIdResponseBodyData getData() {
        return this.data;
    }

    public GetMediaResourceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaResourceIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMediaResourceIdResponseBodyData extends TeaModel {
        @NameInMap("ResourceId")
        public Long resourceId;

        public static GetMediaResourceIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMediaResourceIdResponseBodyData self = new GetMediaResourceIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMediaResourceIdResponseBodyData setResourceId(Long resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Long getResourceId() {
            return this.resourceId;
        }

    }

}
