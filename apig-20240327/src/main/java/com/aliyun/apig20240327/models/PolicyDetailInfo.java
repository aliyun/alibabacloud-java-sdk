// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class PolicyDetailInfo extends TeaModel {
    /**
     * <p>The policy class ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cls-xxx</p>
     */
    @NameInMap("classId")
    public String classId;

    /**
     * <p>The policy type name.</p>
     * 
     * <strong>example:</strong>
     * <p>RateLimit</p>
     */
    @NameInMap("className")
    public String className;

    /**
     * <p>The policy configuration content (JSON string).</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rate&quot;:100,&quot;burst&quot;:50}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The policy description.</p>
     * 
     * <strong>example:</strong>
     * <p>每秒限流100次</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-rate-limit</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The policy ID.</p>
     * 
     * <strong>example:</strong>
     * <p>plc-xxx</p>
     */
    @NameInMap("policyId")
    public String policyId;

    public static PolicyDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        PolicyDetailInfo self = new PolicyDetailInfo();
        return TeaModel.build(map, self);
    }

    public PolicyDetailInfo setClassId(String classId) {
        this.classId = classId;
        return this;
    }
    public String getClassId() {
        return this.classId;
    }

    public PolicyDetailInfo setClassName(String className) {
        this.className = className;
        return this;
    }
    public String getClassName() {
        return this.className;
    }

    public PolicyDetailInfo setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public PolicyDetailInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PolicyDetailInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PolicyDetailInfo setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
