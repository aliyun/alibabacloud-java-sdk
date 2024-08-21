// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertWarehouseRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The instance ID of the certificate application repository.</p>
     * 
     * <strong>example:</strong>
     * <p>14dcc8afc7578e1f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the certificate application repository. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of entries to return on each page. Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("ShowSize")
    public Long showSize;

    /**
     * <p>The type of the certificate application repository. Valid values:</p>
     * <ul>
     * <li><strong>ssl</strong>: certificate application repository of SSL certificates</li>
     * <li><strong>uploadPCA</strong>: certificate application repository of uploaded private certificates</li>
     * <li><strong>free</strong>: certificate application repository of free certificates, available only on the China site (aliyun.com)</li>
     * <li><strong>aliyunPCA</strong>: certificate application repository of private certificates purchased from Alibaba Cloud Private Certificate Authority (PCA), available only on the China site (aliyun.com)</li>
     * <li><strong>disable</strong>: disabled certificate application repository</li>
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
