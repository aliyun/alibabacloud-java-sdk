// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetNamespaceInfosResponseBody extends TeaModel {
    @NameInMap("total")
    public Long total;

    @NameInMap("code")
    public String code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public java.util.List<GetNamespaceInfosResponseBodyData> data;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("ip")
    public String ip;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("message")
    public String message;

    @NameInMap("currentPage")
    public Integer currentPage;

    @NameInMap("httpCode")
    public Integer httpCode;

    public static GetNamespaceInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceInfosResponseBody self = new GetNamespaceInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNamespaceInfosResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetNamespaceInfosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNamespaceInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNamespaceInfosResponseBody setData(java.util.List<GetNamespaceInfosResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNamespaceInfosResponseBodyData> getData() {
        return this.data;
    }

    public GetNamespaceInfosResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetNamespaceInfosResponseBody setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public GetNamespaceInfosResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetNamespaceInfosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNamespaceInfosResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetNamespaceInfosResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public static class GetNamespaceInfosResponseBodyData extends TeaModel {
        // 命名空间创建时间
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        // 命名空间ID
        @NameInMap("mshaTenantId")
        public String mshaTenantId;

        // 命名空间名称
        @NameInMap("mshaTenantName")
        public String mshaTenantName;

        // 业务类型唯一标识
        @NameInMap("unitType")
        public String unitType;

        public static GetNamespaceInfosResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNamespaceInfosResponseBodyData self = new GetNamespaceInfosResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNamespaceInfosResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetNamespaceInfosResponseBodyData setMshaTenantId(String mshaTenantId) {
            this.mshaTenantId = mshaTenantId;
            return this;
        }
        public String getMshaTenantId() {
            return this.mshaTenantId;
        }

        public GetNamespaceInfosResponseBodyData setMshaTenantName(String mshaTenantName) {
            this.mshaTenantName = mshaTenantName;
            return this;
        }
        public String getMshaTenantName() {
            return this.mshaTenantName;
        }

        public GetNamespaceInfosResponseBodyData setUnitType(String unitType) {
            this.unitType = unitType;
            return this;
        }
        public String getUnitType() {
            return this.unitType;
        }

    }

}
