// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class ErrorResponse extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>404</p>
     */
    @NameInMap("code")
    public Integer code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Resource not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The name of the resource involved in the error.</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>The type of the resource involved in the error.</p>
     * 
     * <strong>example:</strong>
     * <p>table</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static ErrorResponse build(java.util.Map<String, ?> map) throws Exception {
        ErrorResponse self = new ErrorResponse();
        return TeaModel.build(map, self);
    }

    public ErrorResponse setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ErrorResponse setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public ErrorResponse setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
