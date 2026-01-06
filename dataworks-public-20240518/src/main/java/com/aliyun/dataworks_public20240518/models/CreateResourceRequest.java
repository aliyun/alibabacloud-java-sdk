// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. To obtain the workspace ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The specific file stream or OSS download link contained in the resource.</p>
     * <blockquote>
     * <p> This field allows users to provide a file stream or an OSS download link. When providing an OSS download link, ensure that the OSS link is publicly accessible. A presigned URL is recommended.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://bucketname1.oss-cn-shanghai.aliyuncs.com/example">http://bucketname1.oss-cn-shanghai.aliyuncs.com/example</a></p>
     */
    @NameInMap("ResourceFile")
    public String resourceFile;

    /**
     * <p>The ID of the DataWorks workspace. To obtain the workspace ID, log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and navigate to the workspace configuration page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;version&quot;: &quot;1.1.0&quot;,
     *     &quot;kind&quot;: &quot;Resource&quot;,
     *     &quot;spec&quot;: {
     *         &quot;fileResources&quot;: [
     *             {
     *                 &quot;name&quot;: &quot;OpenAPITestResource.py&quot;,
     *                 &quot;script&quot;: {
     *                     &quot;content&quot;: &quot;&quot;,
     *                     &quot;path&quot;: &quot;XX/OpenAPITest/ResourcesTest/OpenAPITestResource.py&quot;,
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

    public static CreateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRequest self = new CreateResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateResourceRequest setResourceFile(String resourceFile) {
        this.resourceFile = resourceFile;
        return this;
    }
    public String getResourceFile() {
        return this.resourceFile;
    }

    public CreateResourceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
