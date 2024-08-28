// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enter development mode.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Develop")
    public String develop;

    /**
     * <p>The custom label.</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The request body. For more information about the key request parameters, see <strong>Table 1. Request body parameters</strong> and <strong>Table 2. Metadata parameters</strong>. For more information about all related parameters, see <a href="https://help.aliyun.com/document_detail/450525.html">Parameters of model services</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Service deployment by using an image:
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
     * AI-Web application deployment by using an image:
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
     * Service deployment by using models and processors:
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

    public static CreateServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRequest self = new CreateServiceRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRequest setDevelop(String develop) {
        this.develop = develop;
        return this;
    }
    public String getDevelop() {
        return this.develop;
    }

    public CreateServiceRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public CreateServiceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateServiceRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

}
