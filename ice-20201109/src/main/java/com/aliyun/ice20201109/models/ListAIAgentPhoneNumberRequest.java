// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListAIAgentPhoneNumberRequest extends TeaModel {
    /**
     * <p>The phone number. Specify this parameter to directly query the corresponding number.</p>
     * 
     * <strong>example:</strong>
     * <p>139xxxxxxxxx</p>
     */
    @NameInMap("Number")
    public String number;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 50. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The status of the target phone number. Valid values:</p>
     * <ul>
     * <li><p>1: Activation in progress.</p>
     * </li>
     * <li><p>2: Normal.</p>
     * </li>
     * <li><p>3: Unregistering.</p>
     * </li>
     * <li><p>4: Unregistered.</p>
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
