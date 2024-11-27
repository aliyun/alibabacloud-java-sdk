// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataLakeCatalogResponseBody extends TeaModel {
    @NameInMap("Catalog")
    public DLCatalog catalog;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>code: 404, can not find catalog, name : hiv request id: 6090E571-E5B1-1E6D-BF44-F9E10E8B7EB1</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>FE8EE2F1-4880-46BC-A704-5CF63EAF9A04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataLakeCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataLakeCatalogResponseBody self = new GetDataLakeCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataLakeCatalogResponseBody setCatalog(DLCatalog catalog) {
        this.catalog = catalog;
        return this;
    }
    public DLCatalog getCatalog() {
        return this.catalog;
    }

    public GetDataLakeCatalogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataLakeCatalogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataLakeCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataLakeCatalogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
