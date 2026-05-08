// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeRegionsRequest extends TeaModel {
    /**
     * <p>The language in which the results are returned.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>zh-CN</li>
     * <li>en-US</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("acceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The type of the cluster.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ExternalKubernetes: registered clusters.</li>
     * <li>ManagedKubernetes: managed clusters.</li>
     * <li>Kubernetes: dedicated clusters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ManagedKubernetes</p>
     */
    @NameInMap("clusterType")
    public String clusterType;

    /**
     * <p>The subtype of the managed cluster.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Lingjun: ACK Lingjun clusters.</li>
     * <li>Serverless: ACK serverless clusters.</li>
     * <li>Default: ACK managed clusters.</li>
     * <li>Edge: ACK Edge clusters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Default</p>
     */
    @NameInMap("profile")
    public String profile;

    public static DescribeRegionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsRequest self = new DescribeRegionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeRegionsRequest setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public DescribeRegionsRequest setProfile(String profile) {
        this.profile = profile;
        return this;
    }
    public String getProfile() {
        return this.profile;
    }

}
