// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class ListAnchorResponseBody extends TeaModel {
    /**
     * <p>code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Deduct.DeductTaskAlreadySuccess</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>Failed to proxy flink ui request, message: An error occurred: Invalid UUID string: jobsn</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("list")
    public java.util.List<AnchorResponse> list;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>5389BE87-571B-573C-90ED-F07C5E68760B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAnchorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnchorResponseBody self = new ListAnchorResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnchorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAnchorResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAnchorResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAnchorResponseBody setList(java.util.List<AnchorResponse> list) {
        this.list = list;
        return this;
    }
    public java.util.List<AnchorResponse> getList() {
        return this.list;
    }

    public ListAnchorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnchorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAnchorResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
