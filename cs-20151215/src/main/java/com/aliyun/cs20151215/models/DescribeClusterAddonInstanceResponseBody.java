// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonInstanceResponseBody extends TeaModel {
    /**
     * <p>The add-on configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NetworkPolicy&quot;:&quot;true&quot;}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The add-on name.</p>
     * 
     * <strong>example:</strong>
     * <p>terway-eniip</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The add-on state. Valid values:</p>
     * <ul>
     * <li>initial: Installing.</li>
     * <li>active: Installed.</li>
     * <li>unhealthy: Abnormal.</li>
     * <li>upgrading: Upgrading.</li>
     * <li>updating: Updating.</li>
     * <li>deleting: Uninstalling.</li>
     * <li>deleted: Deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The add-on version.</p>
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
