// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribeApplicationAccessPointResponseBody extends TeaModel {
    /**
     * <p>The ARN of the AAP.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:kms:cn-hangzhou:119285303511****:applicationaccesspoint/aap_test</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The authentication method.</p>
     * 
     * <strong>example:</strong>
     * <p>ClientKey</p>
     */
    @NameInMap("AuthenticationMethod")
    public String authenticationMethod;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>aap description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the AAP.</p>
     * 
     * <strong>example:</strong>
     * <p>aap_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The permission policy that is bound to the AAP.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;kst-hzz62ee817bvyyr5x****.efkd&quot;,&quot;kst-hzz62ee817bvyyr5x****.eyyp&quot;]</p>
     */
    @NameInMap("Policies")
    public String policies;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>bcfefe15-46f0-44a3-bd96-3d422474b71a</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeApplicationAccessPointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationAccessPointResponseBody self = new DescribeApplicationAccessPointResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationAccessPointResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public DescribeApplicationAccessPointResponseBody setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }
    public String getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    public DescribeApplicationAccessPointResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApplicationAccessPointResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeApplicationAccessPointResponseBody setPolicies(String policies) {
        this.policies = policies;
        return this;
    }
    public String getPolicies() {
        return this.policies;
    }

    public DescribeApplicationAccessPointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
