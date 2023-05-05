// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetAppshowResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetAppshowResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetAppshowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAppshowResponseBody self = new GetAppshowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAppshowResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAppshowResponseBody setData(GetAppshowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAppshowResponseBodyData getData() {
        return this.data;
    }

    public GetAppshowResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAppshowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAppshowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAppshowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAppshowResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public Integer id;

        @NameInMap("IsShow")
        public Integer isShow;

        @NameInMap("TenantId")
        public Long tenantId;

        public static GetAppshowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAppshowResponseBodyData self = new GetAppshowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAppshowResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetAppshowResponseBodyData setIsShow(Integer isShow) {
            this.isShow = isShow;
            return this;
        }
        public Integer getIsShow() {
            return this.isShow;
        }

        public GetAppshowResponseBodyData setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
