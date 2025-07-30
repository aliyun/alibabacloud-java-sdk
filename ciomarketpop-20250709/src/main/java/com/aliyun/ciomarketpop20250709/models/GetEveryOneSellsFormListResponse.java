// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ciomarketpop20250709.models;

import com.aliyun.tea.*;

public class GetEveryOneSellsFormListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<GetEveryOneSellsFormListResponseBody> body;

    public static GetEveryOneSellsFormListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEveryOneSellsFormListResponse self = new GetEveryOneSellsFormListResponse();
        return TeaModel.build(map, self);
    }

    public GetEveryOneSellsFormListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEveryOneSellsFormListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEveryOneSellsFormListResponse setBody(java.util.List<GetEveryOneSellsFormListResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<GetEveryOneSellsFormListResponseBody> getBody() {
        return this.body;
    }

    public static class GetEveryOneSellsFormListResponseBody extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>virtualMainDepartment</p>
         */
        @NameInMap("VirtualMainDepartment")
        public String virtualMainDepartment;

        /**
         * <strong>example:</strong>
         * <p>virtualDepartmentName</p>
         */
        @NameInMap("VirtualDepartmentName")
        public String virtualDepartmentName;

        /**
         * <strong>example:</strong>
         * <p>virtualDepartmentCode</p>
         */
        @NameInMap("VirtualDepartmentCode")
        public String virtualDepartmentCode;

        /**
         * <strong>example:</strong>
         * <p>virtualParentDepartment</p>
         */
        @NameInMap("VirtualParentDepartment")
        public String virtualParentDepartment;

        /**
         * <strong>example:</strong>
         * <p>virtualDepartmentStatus</p>
         */
        @NameInMap("VirtualDepartmentStatus")
        public String virtualDepartmentStatus;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("DingId")
        public String dingId;

        /**
         * <strong>example:</strong>
         * <p>work</p>
         */
        @NameInMap("EmpStatus")
        public String empStatus;

        public static GetEveryOneSellsFormListResponseBody build(java.util.Map<String, ?> map) throws Exception {
            GetEveryOneSellsFormListResponseBody self = new GetEveryOneSellsFormListResponseBody();
            return TeaModel.build(map, self);
        }

        public GetEveryOneSellsFormListResponseBody setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetEveryOneSellsFormListResponseBody setVirtualMainDepartment(String virtualMainDepartment) {
            this.virtualMainDepartment = virtualMainDepartment;
            return this;
        }
        public String getVirtualMainDepartment() {
            return this.virtualMainDepartment;
        }

        public GetEveryOneSellsFormListResponseBody setVirtualDepartmentName(String virtualDepartmentName) {
            this.virtualDepartmentName = virtualDepartmentName;
            return this;
        }
        public String getVirtualDepartmentName() {
            return this.virtualDepartmentName;
        }

        public GetEveryOneSellsFormListResponseBody setVirtualDepartmentCode(String virtualDepartmentCode) {
            this.virtualDepartmentCode = virtualDepartmentCode;
            return this;
        }
        public String getVirtualDepartmentCode() {
            return this.virtualDepartmentCode;
        }

        public GetEveryOneSellsFormListResponseBody setVirtualParentDepartment(String virtualParentDepartment) {
            this.virtualParentDepartment = virtualParentDepartment;
            return this;
        }
        public String getVirtualParentDepartment() {
            return this.virtualParentDepartment;
        }

        public GetEveryOneSellsFormListResponseBody setVirtualDepartmentStatus(String virtualDepartmentStatus) {
            this.virtualDepartmentStatus = virtualDepartmentStatus;
            return this;
        }
        public String getVirtualDepartmentStatus() {
            return this.virtualDepartmentStatus;
        }

        public GetEveryOneSellsFormListResponseBody setDingId(String dingId) {
            this.dingId = dingId;
            return this;
        }
        public String getDingId() {
            return this.dingId;
        }

        public GetEveryOneSellsFormListResponseBody setEmpStatus(String empStatus) {
            this.empStatus = empStatus;
            return this;
        }
        public String getEmpStatus() {
            return this.empStatus;
        }

    }

}
