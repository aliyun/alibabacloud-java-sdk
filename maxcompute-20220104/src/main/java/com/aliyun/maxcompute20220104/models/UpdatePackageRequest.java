// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdatePackageRequest extends TeaModel {
    /**
     * <p>The request body parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;add&quot;: {
     *         &quot;allowedProjectList&quot;: [
     *             {
     *                 &quot;label&quot;: &quot;2&quot;,
     *                 &quot;project&quot;: &quot;project_name&quot;
     *             }
     *         ],
     *         &quot;resourceList&quot;: {
     *             &quot;table&quot;: [
     *                 {
     *                     &quot;name&quot;: &quot;table_name&quot;,
     *                     &quot;actions&quot;: [
     *                         &quot;Describe&quot;,
     *                         &quot;Select&quot;
     *                     ]
     *                 },
     *                 {
     *                     &quot;name&quot;: &quot;table_name&quot;,
     *                     &quot;actions&quot;: [
     *                         &quot;Describe&quot;,
     *                         &quot;Select&quot;
     *                     ]
     *                 }
     *             ],
     *             &quot;resource&quot;: [
     *                 {
     *                     &quot;name&quot;: &quot;&quot;,
     *                     &quot;actions&quot;: []
     *                 },
     *                 {
     *                     &quot;name&quot;: &quot;&quot;,
     *                     &quot;actions&quot;: []
     *                 }
     *             ],
     *             &quot;function&quot;: [
     *                 {
     *                     &quot;name&quot;: &quot;&quot;,
     *                     &quot;actions&quot;: []
     *                 },
     *                 {
     *                     &quot;name&quot;: &quot;&quot;,
     *                     &quot;actions&quot;: []
     *                 }
     *             ]
     *         }
     *     },
     *     &quot;remove&quot;: {
     *         &quot;allowedProjectList&quot;: [
     *             {
     *                 &quot;project&quot;: &quot;project_name&quot;
     *             },
     *             {
     *                 &quot;project&quot;: &quot;project_2&quot;
     *             }
     *         ],
     *         &quot;resourceList&quot;: {
     *             &quot;table&quot;: [
     *                 {
     *                     &quot;name&quot;: &quot;table_name&quot;
     *                 },
     *                 {
     *                     &quot;name&quot;: &quot;table_name&quot;
     *                 }
     *             ],
     *             &quot;resource&quot;: [
     *                 {
     *                     &quot;name&quot;: &quot;&quot;
     *                 },
     *                 {
     *                     &quot;name&quot;: &quot;&quot;
     *                 }
     *             ],
     *             &quot;function&quot;: [
     *                 {
     *                     &quot;name&quot;: &quot;&quot;
     *                 },
     *                 {
     *                     &quot;name&quot;: &quot;&quot;
     *                 }
     *             ]
     *         }
     *     }
     * }</p>
     */
    @NameInMap("body")
    public String body;

    public static UpdatePackageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePackageRequest self = new UpdatePackageRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePackageRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
