// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateApplicationAccessPointRequest extends TeaModel {
    /**
     * <p>The authentication method. Currently, only ClientKey is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ClientKey</p>
     */
    @NameInMap("AuthenticationMethod")
    public String authenticationMethod;

    /**
     * <p>The description of the AAP.</p>
     * 
     * <strong>example:</strong>
     * <p>aap description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the AAP.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aap_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The permission policy.</p>
     * <blockquote>
     * <p>You can bind up to three permission policies to each AAP.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;kst-hzz62ee817bvyyr5x****.efkd&quot;,&quot;kst-hzz62ee817bvyyr5x****.eyyp&quot;]</p>
     */
    @NameInMap("Policies")
    public String policies;

    public static CreateApplicationAccessPointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationAccessPointRequest self = new CreateApplicationAccessPointRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationAccessPointRequest setAuthenticationMethod(String authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
        return this;
    }
    public String getAuthenticationMethod() {
        return this.authenticationMethod;
    }

    public CreateApplicationAccessPointRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationAccessPointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationAccessPointRequest setPolicies(String policies) {
        this.policies = policies;
        return this;
    }
    public String getPolicies() {
        return this.policies;
    }

}
