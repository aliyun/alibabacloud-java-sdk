// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Runtime extends TeaModel {
    /**
     * <p>The name of a container runtime. The following types of runtime are supported by Container Service for Kubernetes (ACK).</p>
     * <ul>
     * <li><code>containerd</code>: supports all Kubernetes versions. We recommend that you set the parameter to this value.</li>
     * <li><code>Sandboxed-Container.runv</code>: Sandboxed container provides enhanced isolation and supports Kubernetes 1.24 and earlier.</li>
     * <li><code>docker</code>: supports Kubernetes 1.22 and earlier.</li>
     * </ul>
     * <p>Default value: <code>containerd</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>docker</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The version of the container runtime. By default, the latest version is used.</p>
     * <p>For more information about the changes to Sandboxed-Container, see <a href="https://help.aliyun.com/document_detail/160312.html">Sandboxed-Container release notes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>19.03.5</p>
     */
    @NameInMap("version")
    public String version;

    public static Runtime build(java.util.Map<String, ?> map) throws Exception {
        Runtime self = new Runtime();
        return TeaModel.build(map, self);
    }

    public Runtime setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Runtime setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
