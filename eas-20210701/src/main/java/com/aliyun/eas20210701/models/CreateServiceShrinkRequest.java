// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5db780a0-9d3e-4f35-a84a-xxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to enter development mode.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Develop")
    public String develop;

    /**
     * <p>Specifies whether to only perform a dry run for this request.</p>
     * <ul>
     * <li><p>true: A check request is sent, and no actual operation is performed. If the check fails, the corresponding error is returned. If the check succeeds, the error code DryRunOperation is returned.</p>
     * </li>
     * <li><p>false (default): A normal request is sent.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The user-defined labels.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Labels")
    public String labelsShrink;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The request body. For instructions on key request parameter settings, see <strong>Table 1. Request body parameters</strong> and <strong>Table 2. Metadata parameters</strong> below. For more details about parameter settings, see <a href="https://help.aliyun.com/document_detail/450525.html">All related metric description for service models</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Service deployed by using an image:
     * {
     *   &quot;name&quot;: &quot;foo&quot;,
     *   &quot;metadata&quot;: {
     *     &quot;instance&quot;: 2,
     *     &quot;memory&quot;: 7000,
     *     &quot;cpu&quot;: 4
     *     },
     *   &quot;containers&quot;: [
     *     {
     *       &quot;image&quot;: &quot;<strong><strong>&quot;,
     *       &quot;script&quot;: &quot;</strong></strong> --listen=0.0.0.0 --server_port=8000 --headless&quot;,
     *       &quot;port&quot;: 8000
     *     }
     *   ],
     *   &quot;storage&quot;: [
     *     {
     *       &quot;oss&quot;: {
     *         &quot;path&quot;: &quot;oss://examplebuket/data111/&quot;,
     *         &quot;readOnly&quot;: false
     *       },
     *       &quot;properties&quot;: {
     *         &quot;resource_type&quot;: &quot;model&quot;
     *       },
     *       &quot;mount_path&quot;: &quot;/data&quot;
     *     }
     *   ]
     * }
     * AI-Web application deployed by using an image:
     * {
     *   &quot;name&quot;: &quot;foo&quot;,
     *   &quot;metadata&quot;: {
     *     &quot;instance&quot;: 1,
     *     &quot;memory&quot;: 7000,
     *     &quot;cpu&quot;: 4,
     *     &quot;enable_webservice&quot;: true
     *   },
     *   &quot;containers&quot;: [
     *     {
     *       &quot;image&quot;: &quot;<strong><strong>&quot;,
     *       &quot;script&quot;: &quot;</strong></strong> --listen=0.0.0.0 --server_port=8000 --headless&quot;,
     *       &quot;port&quot;: 8000
     *     }
     *   ],
     *   &quot;storage&quot;: [
     *     {
     *       &quot;oss&quot;: {
     *         &quot;path&quot;: &quot;oss://examplebucket/data111/&quot;,
     *         &quot;readOnly&quot;: false
     *       },
     *       &quot;properties&quot;: {
     *       &quot;resource_type&quot;: &quot;model&quot;
     *       },
     *       &quot;mount_path&quot;: &quot;/data&quot;
     *     }
     *   ]
     * }
     * Service deployed by using a model and a processor:
     * {
     *   &quot;metadata&quot;: {
     *     &quot;instance&quot;: 1,
     *     &quot;memory&quot;: 7000,
     *     &quot;cpu&quot;: 4
     *   },
     *   &quot;name&quot;: &quot;foo&quot;,
     *   &quot;model_config&quot;: {},
     *   &quot;processor_type&quot;: &quot;python&quot;,
     *   &quot;processor_path&quot;: &quot;oss://<strong><strong>&quot;,
     *   &quot;processor_entry&quot;: &quot;a.py&quot;,
     *   &quot;model_path&quot;: &quot;oss://</strong></strong>&quot;
     * }</p>
     */
    @NameInMap("body")
    public String body;

    public static CreateServiceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceShrinkRequest self = new CreateServiceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateServiceShrinkRequest setDevelop(String develop) {
        this.develop = develop;
        return this;
    }
    public String getDevelop() {
        return this.develop;
    }

    public CreateServiceShrinkRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateServiceShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public CreateServiceShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateServiceShrinkRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
