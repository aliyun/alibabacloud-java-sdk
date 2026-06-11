// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class ListDataLakeCatalogResponseBody extends TeaModel {
    /**
     * <p>A list of data catalogs.</p>
     */
    @NameInMap("CataLogList")
    public java.util.List<DLCatalog> cataLogList;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID, used for log tracing and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>E76DD2E7-EBAC-5724-B163-19AAC233****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p>****<strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataLakeCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeCatalogResponseBody self = new ListDataLakeCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataLakeCatalogResponseBody setCataLogList(java.util.List<DLCatalog> cataLogList) {
        this.cataLogList = cataLogList;
        return this;
    }
    public java.util.List<DLCatalog> getCataLogList() {
        return this.cataLogList;
    }

    public ListDataLakeCatalogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataLakeCatalogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataLakeCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataLakeCatalogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
