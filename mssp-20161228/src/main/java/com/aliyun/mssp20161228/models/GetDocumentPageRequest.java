// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetDocumentPageRequest extends TeaModel {
    /**
     * <p>Current page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Delivered by.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("DeliveredBy")
    public String deliveredBy;

    /**
     * <p>Document name.</p>
     * 
     * <strong>example:</strong>
     * <p>季度报告</p>
     */
    @NameInMap("DocumentName")
    public String documentName;

    /**
     * <p>Document type.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DocumentType")
    public String documentType;

    /**
     * <p>Page size.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Report type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReportType")
    public String reportType;

    public static GetDocumentPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentPageRequest self = new GetDocumentPageRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentPageRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetDocumentPageRequest setDeliveredBy(String deliveredBy) {
        this.deliveredBy = deliveredBy;
        return this;
    }
    public String getDeliveredBy() {
        return this.deliveredBy;
    }

    public GetDocumentPageRequest setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public GetDocumentPageRequest setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public GetDocumentPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetDocumentPageRequest setReportType(String reportType) {
        this.reportType = reportType;
        return this;
    }
    public String getReportType() {
        return this.reportType;
    }

}
