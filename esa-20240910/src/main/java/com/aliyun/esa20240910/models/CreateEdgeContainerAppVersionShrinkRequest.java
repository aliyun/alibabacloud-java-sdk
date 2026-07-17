// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateEdgeContainerAppVersionShrinkRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.</p>
     * <blockquote>
     * <p>Notice: 1) Your account must have an ESA plan with the Edge Container feature enabled. 2) Call CreateEdgeContainerApp first to create an application and obtain the AppId. 3) Complete call chain example: CreateEdgeContainerApp → ListEdgeContainerApps → CreateEdgeContainerAppVersion.</notice></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The container group to be deployed for this version, including specific image information. The image information consists of the image address, startup command, parameters, environment variables, and probe rules. Multiple images are supported in a JSON array structure.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *       {
     *             &quot;Name&quot;: &quot;container1&quot;,
     *             &quot;Image&quot;: &quot;image1&quot;,
     *             &quot;Spec&quot;: &quot;1C2G&quot;,
     *             &quot;Command&quot;: &quot;/bin/sh&quot;,
     *             &quot;Args&quot;: &quot;-c hello&quot;,
     *             &quot;ProbeType&quot;: &quot;tcpSocket&quot;,
     *             &quot;ProbeContent&quot;: &quot;{\&quot;Port\&quot;:8080}&quot;
     *       },
     *       {
     *             &quot;Name&quot;: &quot;container2&quot;,
     *             &quot;Image&quot;: &quot;image2&quot;,
     *             &quot;Spec&quot;: &quot;2C4G&quot;,
     *             &quot;ProbeType&quot;: &quot;httpGet&quot;,
     *             &quot;ProbeContent&quot;: &quot;{\&quot;Path\&quot;:\&quot;/\&quot;,\&quot;Port\&quot;:80,\&quot;InitialDelaySeconds\&quot;:10}&quot;
     *       }
     * ]</p>
     */
    @NameInMap("Containers")
    public String containersShrink;

    /**
     * <p>The version name. The name must be <strong>6 to 128</strong> characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>verson1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>test app</p>
     */
    @NameInMap("Remarks")
    public String remarks;

    public static CreateEdgeContainerAppVersionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeContainerAppVersionShrinkRequest self = new CreateEdgeContainerAppVersionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateEdgeContainerAppVersionShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public CreateEdgeContainerAppVersionShrinkRequest setContainersShrink(String containersShrink) {
        this.containersShrink = containersShrink;
        return this;
    }
    public String getContainersShrink() {
        return this.containersShrink;
    }

    public CreateEdgeContainerAppVersionShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateEdgeContainerAppVersionShrinkRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

}
