// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class ListSelectedTablesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoAuth</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>NoAuth</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>FB11F719-9AC8-5C99-AB0A-4709D437FCFC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListSelectedTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSelectedTablesResponseBody self = new ListSelectedTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSelectedTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSelectedTablesResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public ListSelectedTablesResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListSelectedTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSelectedTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
