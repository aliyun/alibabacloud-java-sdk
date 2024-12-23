// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreatePackageRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     * &quot;name&quot;: &quot;test_packege&quot;, 
     *     &quot;resourceList&quot;: { 
     *         &quot;table&quot;: [
     *             {
     *                 &quot;name&quot;: &quot;table_name&quot;,
     *                 &quot;actions&quot;: [
     *                     &quot;Describe&quot;,
     *                     &quot;Select&quot;
     *                 ]
     *             },
     *             {
     *                 &quot;name&quot;: &quot;table_name&quot;,
     *                 &quot;actions&quot;: [
     *                     &quot;Describe&quot;,
     *                     &quot;Select&quot;
     *                 ]
     *             }
     *         ],
     *         &quot;resource&quot;: [
     *             {
     *                 &quot;name&quot;: &quot;&quot;,
     *                 &quot;actions&quot;: []
     *             },
     *             {
     *                 &quot;name&quot;: &quot;&quot;,
     *                 &quot;actions&quot;: []
     *             }
     *         ],
     *         &quot;function&quot;: [
     *             {
     *                 &quot;name&quot;: &quot;&quot;,
     *                 &quot;actions&quot;: []
     *             },
     *             {
     *                 &quot;name&quot;: &quot;&quot;,
     *                 &quot;actions&quot;: []
     *             }
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("body")
    public String body;

    /**
     * <p>Specifies whether to install the package.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isInstall")
    public Boolean isInstall;

    public static CreatePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePackageRequest self = new CreatePackageRequest();
        return TeaModel.build(map, self);
    }

    public CreatePackageRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public CreatePackageRequest setIsInstall(Boolean isInstall) {
        this.isInstall = isInstall;
        return this;
    }
    public Boolean getIsInstall() {
        return this.isInstall;
    }

}
