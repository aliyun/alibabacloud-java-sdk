// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonInstanceResponseBody extends TeaModel {
    /**
     * <p>The component configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NetworkPolicy&quot;:&quot;true&quot;}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The component name.</p>
     * 
     * <strong>example:</strong>
     * <p>terway-eniip</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The component status. Valid values:</p>
     * <ul>
     * <li>initial: installing</li>
     * <li>active: installed</li>
     * <li>unhealthy: abnormal</li>
     * <li>upgrading: upgrading</li>
     * <li>updating: updating</li>
     * <li>deleting: uninstalling</li>
     * <li>deleted: deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The component version.</p>
     * 
     * <strong>example:</strong>
     * <p>v1.4.3</p>
     */
    @NameInMap("version")
    public String version;

    public static DescribeClusterAddonInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAddonInstanceResponseBody self = new DescribeClusterAddonInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAddonInstanceResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeClusterAddonInstanceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeClusterAddonInstanceResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeClusterAddonInstanceResponseBody setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
