// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RejectServiceUsageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10CM943JP0EN9D51H</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Comments")
    public String comments;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-2117508c874c41xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <strong>example:</strong>
     * <p>SharedAccount</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1563457855xxxxxx</p>
     */
    @NameInMap("UserAliUid")
    public Long userAliUid;

    public static RejectServiceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectServiceUsageRequest self = new RejectServiceUsageRequest();
        return TeaModel.build(map, self);
    }

    public RejectServiceUsageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RejectServiceUsageRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public RejectServiceUsageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public RejectServiceUsageRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public RejectServiceUsageRequest setUserAliUid(Long userAliUid) {
        this.userAliUid = userAliUid;
        return this;
    }
    public Long getUserAliUid() {
        return this.userAliUid;
    }

}
