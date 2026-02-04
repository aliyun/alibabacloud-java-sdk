// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetAuthCodeRequest extends TeaModel {
    @NameInMap("AutoCreateUser")
    public Boolean autoCreateUser;

    /**
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <strong>example:</strong>
     * <p>{
     *       &quot;Version&quot;: &quot;1&quot;,
     *       &quot;Resource&quot;: {
     *             &quot;Type&quot;: &quot;AppInstanceGroup&quot;,
     *             &quot;Id&quot;: &quot;aig-9ciijz60n4xsv****&quot;
     *       }
     * }</p>
     */
    @NameInMap("Policy")
    public String policy;

    public static GetAuthCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthCodeRequest self = new GetAuthCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthCodeRequest setAutoCreateUser(Boolean autoCreateUser) {
        this.autoCreateUser = autoCreateUser;
        return this;
    }
    public Boolean getAutoCreateUser() {
        return this.autoCreateUser;
    }

    public GetAuthCodeRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetAuthCodeRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public GetAuthCodeRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

}
