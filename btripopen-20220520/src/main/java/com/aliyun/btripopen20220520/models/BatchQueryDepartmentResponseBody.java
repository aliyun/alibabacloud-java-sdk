// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class BatchQueryDepartmentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public BatchQueryDepartmentResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>B72B39C8-<strong><strong>-</strong></strong>-****-D53F11F6ADFE</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>210f079e16603757182131635d866a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static BatchQueryDepartmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryDepartmentResponseBody self = new BatchQueryDepartmentResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryDepartmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchQueryDepartmentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public BatchQueryDepartmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchQueryDepartmentResponseBody setModule(BatchQueryDepartmentResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public BatchQueryDepartmentResponseBodyModule getModule() {
        return this.module;
    }

    public BatchQueryDepartmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryDepartmentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchQueryDepartmentResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class BatchQueryDepartmentResponseBodyModuleItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>电磁继电器装配SL10线</p>
         */
        @NameInMap("dept_name")
        public String deptName;

        @NameInMap("manager_employee_id_list")
        public java.util.List<String> managerEmployeeIdList;

        /**
         * <strong>example:</strong>
         * <p>1335</p>
         */
        @NameInMap("out_dept_id")
        public String outDeptId;

        public static BatchQueryDepartmentResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryDepartmentResponseBodyModuleItems self = new BatchQueryDepartmentResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public BatchQueryDepartmentResponseBodyModuleItems setDeptName(String deptName) {
            this.deptName = deptName;
            return this;
        }
        public String getDeptName() {
            return this.deptName;
        }

        public BatchQueryDepartmentResponseBodyModuleItems setManagerEmployeeIdList(java.util.List<String> managerEmployeeIdList) {
            this.managerEmployeeIdList = managerEmployeeIdList;
            return this;
        }
        public java.util.List<String> getManagerEmployeeIdList() {
            return this.managerEmployeeIdList;
        }

        public BatchQueryDepartmentResponseBodyModuleItems setOutDeptId(String outDeptId) {
            this.outDeptId = outDeptId;
            return this;
        }
        public String getOutDeptId() {
            return this.outDeptId;
        }

    }

    public static class BatchQueryDepartmentResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("has_more")
        public Boolean hasMore;

        @NameInMap("items")
        public java.util.List<BatchQueryDepartmentResponseBodyModuleItems> items;

        /**
         * <strong>example:</strong>
         * <p>NjE1OTgwOTY</p>
         */
        @NameInMap("next_cursor_token")
        public String nextCursorToken;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total")
        public Long total;

        public static BatchQueryDepartmentResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryDepartmentResponseBodyModule self = new BatchQueryDepartmentResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public BatchQueryDepartmentResponseBodyModule setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public BatchQueryDepartmentResponseBodyModule setItems(java.util.List<BatchQueryDepartmentResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<BatchQueryDepartmentResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public BatchQueryDepartmentResponseBodyModule setNextCursorToken(String nextCursorToken) {
            this.nextCursorToken = nextCursorToken;
            return this;
        }
        public String getNextCursorToken() {
            return this.nextCursorToken;
        }

        public BatchQueryDepartmentResponseBodyModule setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
