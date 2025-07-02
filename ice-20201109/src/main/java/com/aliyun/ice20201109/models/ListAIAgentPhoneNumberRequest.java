// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentPhoneNumberRequest extends TeaModel {
    @NameInMap("Number")
    public String number;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Status")
    public Integer status;

    public static ListAIAgentPhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAIAgentPhoneNumberRequest self = new ListAIAgentPhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public ListAIAgentPhoneNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public ListAIAgentPhoneNumberRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListAIAgentPhoneNumberRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListAIAgentPhoneNumberRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
