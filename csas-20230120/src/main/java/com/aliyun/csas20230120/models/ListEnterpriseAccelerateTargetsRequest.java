// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListEnterpriseAccelerateTargetsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>eap-424ba3f47660425c</p>
     */
    @NameInMap("EapId")
    public String eapId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>googleapis.com</p>
     */
    @NameInMap("Target")
    public String target;

    public static ListEnterpriseAccelerateTargetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseAccelerateTargetsRequest self = new ListEnterpriseAccelerateTargetsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseAccelerateTargetsRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListEnterpriseAccelerateTargetsRequest setEapId(String eapId) {
        this.eapId = eapId;
        return this;
    }
    public String getEapId() {
        return this.eapId;
    }

    public ListEnterpriseAccelerateTargetsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListEnterpriseAccelerateTargetsRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
