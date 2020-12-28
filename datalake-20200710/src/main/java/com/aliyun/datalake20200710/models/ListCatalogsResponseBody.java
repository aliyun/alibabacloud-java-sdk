// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListCatalogsResponseBody extends TeaModel {
    // Catalogs
    @NameInMap("Catalogs")
    public java.util.List<Catalog> catalogs;

    // Code
    @NameInMap("Code")
    public String code;

    // Message
    @NameInMap("Message")
    public String message;

    // NextPageToken
    @NameInMap("NextPageToken")
    public String nextPageToken;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static ListCatalogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsResponseBody self = new ListCatalogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCatalogsResponseBody setCatalogs(java.util.List<Catalog> catalogs) {
        this.catalogs = catalogs;
        return this;
    }
    public java.util.List<Catalog> getCatalogs() {
        return this.catalogs;
    }

    public ListCatalogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCatalogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCatalogsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListCatalogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCatalogsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
