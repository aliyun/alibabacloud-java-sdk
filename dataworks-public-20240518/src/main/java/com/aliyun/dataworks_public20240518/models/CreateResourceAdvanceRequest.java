// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateResourceAdvanceRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the workspace configuration page to obtain the workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The file stream or Object Storage Service (OSS) download URL of the resource file.</p>
     * <blockquote>
     * <p>Notice: This field allows you to specify a file stream or an OSS download URL. If you specify an OSS download URL, make sure that the URL is publicly accessible. A pre-signed URL is recommended.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://bucketname1.oss-cn-shanghai.aliyuncs.com/example">http://bucketname1.oss-cn-shanghai.aliyuncs.com/example</a></p>
     */
    @NameInMap("ResourceFile")
    public java.io.InputStream resourceFileObject;

    /**
     * <p>The FlowSpec information that describes the resource file. For more information about the specification, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
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

    public static CreateResourceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceAdvanceRequest self = new CreateResourceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceAdvanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateResourceAdvanceRequest setResourceFileObject(java.io.InputStream resourceFileObject) {
        this.resourceFileObject = resourceFileObject;
        return this;
    }
    public java.io.InputStream getResourceFileObject() {
        return this.resourceFileObject;
    }

    public CreateResourceAdvanceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
