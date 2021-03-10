// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDeviceDistributeJobRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("TargetUid")
    public String targetUid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public Integer status;

    public static ListDeviceDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceDistributeJobRequest self = new ListDeviceDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceDistributeJobRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public ListDeviceDistributeJobRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public ListDeviceDistributeJobRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

    public ListDeviceDistributeJobRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListDeviceDistributeJobRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeviceDistributeJobRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
