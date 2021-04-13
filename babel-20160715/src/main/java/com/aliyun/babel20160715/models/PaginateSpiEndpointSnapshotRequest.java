// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class PaginateSpiEndpointSnapshotRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ActionMethodRegionId")
    public String actionMethodRegionId;

    @NameInMap("ApiType")
    public String apiType;

    @NameInMap("CurrentVersionStamp")
    public String currentVersionStamp;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static PaginateSpiEndpointSnapshotRequest build(java.util.Map<String, ?> map) throws Exception {
        PaginateSpiEndpointSnapshotRequest self = new PaginateSpiEndpointSnapshotRequest();
        return TeaModel.build(map, self);
    }

    public PaginateSpiEndpointSnapshotRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public PaginateSpiEndpointSnapshotRequest setActionMethodRegionId(String actionMethodRegionId) {
        this.actionMethodRegionId = actionMethodRegionId;
        return this;
    }
    public String getActionMethodRegionId() {
        return this.actionMethodRegionId;
    }

    public PaginateSpiEndpointSnapshotRequest setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public PaginateSpiEndpointSnapshotRequest setCurrentVersionStamp(String currentVersionStamp) {
        this.currentVersionStamp = currentVersionStamp;
        return this;
    }
    public String getCurrentVersionStamp() {
        return this.currentVersionStamp;
    }

    public PaginateSpiEndpointSnapshotRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public PaginateSpiEndpointSnapshotRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
