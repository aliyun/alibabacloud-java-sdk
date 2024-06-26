// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ResetAntChainUserCertificateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AntChainId")
    public String antChainId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Bid")
    public String bid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Operation")
    public Integer operation;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Username")
    public String username;

    public static ResetAntChainUserCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAntChainUserCertificateRequest self = new ResetAntChainUserCertificateRequest();
        return TeaModel.build(map, self);
    }

    public ResetAntChainUserCertificateRequest setAntChainId(String antChainId) {
        this.antChainId = antChainId;
        return this;
    }
    public String getAntChainId() {
        return this.antChainId;
    }

    public ResetAntChainUserCertificateRequest setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public ResetAntChainUserCertificateRequest setOperation(Integer operation) {
        this.operation = operation;
        return this;
    }
    public Integer getOperation() {
        return this.operation;
    }

    public ResetAntChainUserCertificateRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
