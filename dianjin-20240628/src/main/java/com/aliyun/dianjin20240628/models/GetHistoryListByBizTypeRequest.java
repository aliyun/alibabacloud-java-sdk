// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetHistoryListByBizTypeRequest extends TeaModel {
    /**
     * <p>Unique business identifier. When bizType is LibraryChat, bizId is the document library ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GysYBsxx</p>
     */
    @NameInMap("bizId")
    public String bizId;

    /**
     * <p>Business type. Supported values are LlmChat and LibraryChat.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LibraryChat</p>
     */
    @NameInMap("bizType")
    public String bizType;

    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Number of records per page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static GetHistoryListByBizTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryListByBizTypeRequest self = new GetHistoryListByBizTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoryListByBizTypeRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public GetHistoryListByBizTypeRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GetHistoryListByBizTypeRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public GetHistoryListByBizTypeRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
