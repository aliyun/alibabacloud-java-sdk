// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("ShowSize")
    public Long showSize;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("Status")
    public String status;

    @NameInMap("WarehouseId")
    public Long warehouseId;

    public static ListCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCertRequest self = new ListCertRequest();
        return TeaModel.build(map, self);
    }

    public ListCertRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public ListCertRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public ListCertRequest setShowSize(Long showSize) {
        this.showSize = showSize;
        return this;
    }
    public Long getShowSize() {
        return this.showSize;
    }

    public ListCertRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListCertRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListCertRequest setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
    public Long getWarehouseId() {
        return this.warehouseId;
    }

}
