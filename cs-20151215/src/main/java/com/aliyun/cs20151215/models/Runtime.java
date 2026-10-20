// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class Runtime extends TeaModel {
    /**
     * <p>Specifies the container runtime. Valid values:</p>
     * <ul>
     * <li><code>containerd</code>: Recommended. Supported in version 1.20 and later.</li>
     * <li><code>Sandboxed-Container.runv</code>: Sandboxed container that provides higher isolation. Supported in version 1.16 and later.</li>
     * <li><code>docker</code>: Supported in clusters of version 1.22 and earlier.</li>
     * </ul>
     * <p>Default value: <code>containerd</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>containerd</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The container runtime version. By default, the latest version is used. For more information about the release notes, see <a href="https://help.aliyun.com/document_detail/207829.html">Container runtime release notes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>1.6.20</p>
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
