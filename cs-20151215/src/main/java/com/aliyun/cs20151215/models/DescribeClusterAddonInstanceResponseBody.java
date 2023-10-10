// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterAddonInstanceResponseBody extends TeaModel {
    /**
     * <p>The configuration of the component.</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The name of the component.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The status of the component. Valid values:</p>
     * <br>
     * <p>*   initial: The component is being installed.</p>
     * <p>*   active: The component is installed.</p>
     * <p>*   unhealthy: The component is in an abnormal state.</p>
     * <p>*   upgrading: The component is being updated.</p>
     * <p>*   updating: The component is being modified.</p>
     * <p>*   deleting: The component is being uninstalled.</p>
     * <p>*   deleted: The component is deleted.</p>
     */
    @NameInMap("state")
    public String state;

    /**
     * <p>The version of the component.</p>
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
