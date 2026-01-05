// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateResourceAdvanceRequest extends TeaModel {
    /**
     * <p>The unique identifier of the Data Studio file resource.</p>
     * <blockquote>
     * <p> This field is of type Long in SDK versions prior to 8.0.0, and of type String in SDK version 8.0.0 and later. This change does not affect the normal use of the SDK; parameters are still returned according to the type defined in the SDK. Compilation failures due to the type change may occur only when upgrading the SDK across version 8.0.0, in which case users need to manually correct the data type.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>543217824470354XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
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
    public java.io.InputStream resourceFileObject;

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

    public static UpdateResourceAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceAdvanceRequest self = new UpdateResourceAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceAdvanceRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateResourceAdvanceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateResourceAdvanceRequest setResourceFileObject(java.io.InputStream resourceFileObject) {
        this.resourceFileObject = resourceFileObject;
        return this;
    }
    public java.io.InputStream getResourceFileObject() {
        return this.resourceFileObject;
    }

    public UpdateResourceAdvanceRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
