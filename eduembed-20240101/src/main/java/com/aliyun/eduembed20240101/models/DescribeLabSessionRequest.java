// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class DescribeLabSessionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AccountId")
    public Long accountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LabSessionId")
    public String labSessionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("RamAccountId")
    public Long ramAccountId;

    public static DescribeLabSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLabSessionRequest self = new DescribeLabSessionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLabSessionRequest setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public DescribeLabSessionRequest setLabSessionId(String labSessionId) {
        this.labSessionId = labSessionId;
        return this;
    }
    public String getLabSessionId() {
        return this.labSessionId;
    }

    public DescribeLabSessionRequest setRamAccountId(Long ramAccountId) {
        this.ramAccountId = ramAccountId;
        return this;
    }
    public Long getRamAccountId() {
        return this.ramAccountId;
    }

}
