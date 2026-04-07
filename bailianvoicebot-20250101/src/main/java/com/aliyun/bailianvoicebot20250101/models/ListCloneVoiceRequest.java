// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListCloneVoiceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>llm-3pptowd2olrctsvc</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

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

    /**
     * <strong>example:</strong>
     * <p>Published</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCloneVoiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCloneVoiceRequest self = new ListCloneVoiceRequest();
        return TeaModel.build(map, self);
    }

    public ListCloneVoiceRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public ListCloneVoiceRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCloneVoiceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCloneVoiceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
