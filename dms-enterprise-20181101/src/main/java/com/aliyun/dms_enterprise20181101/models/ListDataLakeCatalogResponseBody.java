// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakeCatalogResponseBody extends TeaModel {
    @NameInMap("CataLogList")
    public ListDataLakeCatalogResponseBodyCataLogList cataLogList;

    /**
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>E76DD2E7-EBAC-5724-B163-19AAC233F8F2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataLakeCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakeCatalogResponseBody self = new ListDataLakeCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataLakeCatalogResponseBody setCataLogList(ListDataLakeCatalogResponseBodyCataLogList cataLogList) {
        this.cataLogList = cataLogList;
        return this;
    }
    public ListDataLakeCatalogResponseBodyCataLogList getCataLogList() {
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

    public static class ListDataLakeCatalogResponseBodyCataLogList extends TeaModel {
        @NameInMap("Catalog")
        public java.util.List<DLCatalog> catalog;

        public static ListDataLakeCatalogResponseBodyCataLogList build(java.util.Map<String, ?> map) throws Exception {
            ListDataLakeCatalogResponseBodyCataLogList self = new ListDataLakeCatalogResponseBodyCataLogList();
            return TeaModel.build(map, self);
        }

        public ListDataLakeCatalogResponseBodyCataLogList setCatalog(java.util.List<DLCatalog> catalog) {
            this.catalog = catalog;
            return this;
        }
        public java.util.List<DLCatalog> getCatalog() {
            return this.catalog;
        }

    }

}
