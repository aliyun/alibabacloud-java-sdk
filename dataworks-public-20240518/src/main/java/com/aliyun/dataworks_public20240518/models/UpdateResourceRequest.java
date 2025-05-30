// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateResourceRequest extends TeaModel {
    /**
     * <p>The ID of the file resource.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>543217824470354XXXX</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ResourceFile")
    public String resourceFile;

    /**
     * <p>The FlowSpec field information about the file resource. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;version&quot;: &quot;1.1.0&quot;,
     *     &quot;kind&quot;: &quot;Resource&quot;,
     *     &quot;spec&quot;: {
     *         &quot;fileResources&quot;: [
     *             {
     *                 &quot;name&quot;: &quot;OpenAPI_Test_Resource.py&quot;,
     *                 &quot;script&quot;: {
     *                     &quot;content&quot;: &quot;&quot;,
     *                     &quot;path&quot;: &quot;XX/OpenAPI_Test/Resources_Test/OpenAPI_Test_Resource.py&quot;,
     *                     &quot;runtime&quot;: {
     *                         &quot;command&quot;: &quot;ODPS_PYTHON&quot;
     *                     }
     *                 },
     *                 &quot;type&quot;: &quot;python&quot;,
     *                 &quot;file&quot;: {
     *                     &quot;storage&quot;: {}
     *                 },
     *                 &quot;datasource&quot;: {
     *                     &quot;name&quot;: &quot;odps_first&quot;,
     *                     &quot;type&quot;: &quot;odps&quot;
     *                 }
     *             }
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static UpdateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceRequest self = new UpdateResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateResourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateResourceRequest setResourceFile(String resourceFile) {
        this.resourceFile = resourceFile;
        return this;
    }
    public String getResourceFile() {
        return this.resourceFile;
    }

    public UpdateResourceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
