// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class ListIndexFileDetailsRequest extends TeaModel {
    @NameInMap("DocumentName")
    public String documentName;

    /**
     * <strong>example:</strong>
     * <p>FINISH</p>
     */
    @NameInMap("DocumentStatus")
    public String documentStatus;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableNameLike")
    public String enableNameLike;

    /**
     * <strong>example:</strong>
     * <p>79c0alxxxx</p>
     */
    @NameInMap("IndexId")
    public String indexId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListIndexFileDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndexFileDetailsRequest self = new ListIndexFileDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListIndexFileDetailsRequest setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }
    public String getDocumentName() {
        return this.documentName;
    }

    public ListIndexFileDetailsRequest setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
        return this;
    }
    public String getDocumentStatus() {
        return this.documentStatus;
    }

    public ListIndexFileDetailsRequest setEnableNameLike(String enableNameLike) {
        this.enableNameLike = enableNameLike;
        return this;
    }
    public String getEnableNameLike() {
        return this.enableNameLike;
    }

    public ListIndexFileDetailsRequest setIndexId(String indexId) {
        this.indexId = indexId;
        return this;
    }
    public String getIndexId() {
        return this.indexId;
    }

    public ListIndexFileDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListIndexFileDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
