// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateDataQualityTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the custom rule template.</p>
     * 
     * <strong>example:</strong>
     * <p>USER_DEFINED:2001</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The account ID of the owner.</p>
     * 
     * <strong>example:</strong>
     * <p>95279527****</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>100001</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>Detailed configuration Spec code of the rule template. For more information, see <a href="~2963394~">Data quality Spec configuration description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;assertion&quot;: &quot;anomaly detection fro id_not_null_cnt&quot;,
     *     &quot;id_not_null_cnt&quot;: {
     *         &quot;query&quot;: &quot;SELECT COUNT(*) AS cnt FROM ${tableName} WHERE dt = \&quot;$[yyyymmdd-1]\&quot;;&quot;
     *     },
     *     &quot;identity&quot;: &quot;819cf1f8-29be-4f94-a9d0-c5c06c0c3d2a&quot;
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static UpdateDataQualityTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataQualityTemplateRequest self = new UpdateDataQualityTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataQualityTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateDataQualityTemplateRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateDataQualityTemplateRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateDataQualityTemplateRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
