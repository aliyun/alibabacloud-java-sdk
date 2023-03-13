// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetCatalogResponseBody extends TeaModel {
    @NameInMap("Catalog")
    public Catalog catalog;

    /**
     * <p>Code</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Message</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestId</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogResponseBody self = new GetCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCatalogResponseBody setCatalog(Catalog catalog) {
        this.catalog = catalog;
        return this;
    }
    public Catalog getCatalog() {
        return this.catalog;
    }

    public GetCatalogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCatalogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCatalogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
