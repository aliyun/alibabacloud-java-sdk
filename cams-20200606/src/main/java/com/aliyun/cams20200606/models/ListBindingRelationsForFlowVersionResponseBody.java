// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListBindingRelationsForFlowVersionResponseBody extends TeaModel {
    /**
     * <p>Access denied details.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Error code. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error Codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Returned data list.</p>
     */
    @NameInMap("Data")
    public java.util.List<java.util.Map<String, ?>> data;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A94866411B2O</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Values:</p>
     * <ul>
     * <li><p>true: Success.</p>
     * </li>
     * <li><p>false: Failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListBindingRelationsForFlowVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBindingRelationsForFlowVersionResponseBody self = new ListBindingRelationsForFlowVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBindingRelationsForFlowVersionResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListBindingRelationsForFlowVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBindingRelationsForFlowVersionResponseBody setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public ListBindingRelationsForFlowVersionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBindingRelationsForFlowVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBindingRelationsForFlowVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
