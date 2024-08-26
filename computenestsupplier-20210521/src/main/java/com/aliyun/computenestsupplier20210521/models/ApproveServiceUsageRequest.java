// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class ApproveServiceUsageRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>10CM943JP0EN9D51H</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Approval comments.</p>
     * 
     * <strong>example:</strong>
     * <p>Welcome to TuGraph. Your application has been approved. Should you have any questions, please feel free to email us at <a href="mailto:tugraph@service.alipay.com">tugraph@service.alipay.com</a> or call our contact number 400-903-0809. Contact person: Yuansu.</p>
     */
    @NameInMap("Comments")
    public String comments;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>service-39f4f251e94843xxxxxx</p>
     */
    @NameInMap("ServiceId")
    public String serviceId;

    /**
     * <p>ServiceSharedAccountType，</p>
     * 
     * <strong>example:</strong>
     * <p>SharedAccount</p>
     */
    @NameInMap("Type")
    public Integer type;

    /**
     * <p>User ali uid.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>127383705958xxxx</p>
     */
    @NameInMap("UserAliUid")
    public Long userAliUid;

    public static ApproveServiceUsageRequest build(java.util.Map<String, ?> map) throws Exception {
        ApproveServiceUsageRequest self = new ApproveServiceUsageRequest();
        return TeaModel.build(map, self);
    }

    public ApproveServiceUsageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ApproveServiceUsageRequest setComments(String comments) {
        this.comments = comments;
        return this;
    }
    public String getComments() {
        return this.comments;
    }

    public ApproveServiceUsageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApproveServiceUsageRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public ApproveServiceUsageRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

    public ApproveServiceUsageRequest setUserAliUid(Long userAliUid) {
        this.userAliUid = userAliUid;
        return this;
    }
    public Long getUserAliUid() {
        return this.userAliUid;
    }

}
