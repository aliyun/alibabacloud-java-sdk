// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertWarehouseRequest extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The repository instance.</p>
     * 
     * <strong>example:</strong>
     * <p>14dcc8afc7578e1f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The repository name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries per page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The repository type. Valid values:</p>
     * <ul>
     * <li><strong>uploadCA</strong>: an uploaded CA certificate that contains a complete certificate chain.</li>
     * <li><strong>uploadPCA</strong>: an uploaded certificate, including a self-signed certificate, a certificate issued by a third party, or a certificate issued by Alibaba Cloud.</li>
     * <li><strong>aliyunPCA</strong>: an Alibaba Cloud PCA certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aliyunPCA</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListCertWarehouseRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCertWarehouseRequest self = new ListCertWarehouseRequest();
        return TeaModel.build(map, self);
    }

    public ListCertWarehouseRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListCertWarehouseRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCertWarehouseRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCertWarehouseRequest setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListCertWarehouseRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
