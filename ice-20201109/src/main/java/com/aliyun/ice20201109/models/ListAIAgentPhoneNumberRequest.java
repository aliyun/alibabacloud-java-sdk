// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentPhoneNumberRequest extends TeaModel {
    /**
     * <p>Phone number. Specify Number to directly query the corresponding phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>139xxxxxxxxx</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>Page number. Default Value is 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>Page size, indicating the number of records displayed per page. Default Value is 50, with a maximum value of 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Status of the target phone number to query.</p>
     * <ul>
     * <li><p>1: &quot;Activation in progress&quot;.</p>
     * </li>
     * <li><p>2: &quot;Normal&quot;.</p>
     * </li>
     * <li><p>3: &quot;Deactivation in progress&quot;.</p>
     * </li>
     * <li><p>4: &quot;Deactivated&quot;.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
