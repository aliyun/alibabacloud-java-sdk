// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonInstanceResponseBody extends TeaModel {
    /**
     * <p>The configuration of the add-on.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NetworkPolicy&quot;:&quot;true&quot;}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The name of the add-on.</p>
     * 
     * <strong>example:</strong>
     * <p>terway-eniip</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The state of the add-on. Valid values:</p>
     * <ul>
     * <li>initial: The add-on is being installed.</li>
     * <li>active: The add-on is installed.</li>
     * <li>unhealthy: The add-on is in an abnormal state.</li>
     * <li>upgrading: The add-on is being upgraded.</li>
     * <li>updating: The add-on is being updated.</li>
     * <li>deleting: The add-on is being uninstalled.</li>
     * <li>deleted: The add-on is deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The version of the add-on.</p>
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
