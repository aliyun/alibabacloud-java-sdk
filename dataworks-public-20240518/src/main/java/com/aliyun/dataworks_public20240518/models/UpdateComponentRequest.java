// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateComponentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>568780096083*******</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <p>The ID of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The FlowSpec information for this UDF function. For more information, see <a href="https://github.com/aliyun/dataworks-spec/blob/master/README_zh_CN.md">FlowSpec</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;kind&quot;: &quot;Component&quot;,
     *     &quot;version&quot;: &quot;1.1.2&quot;,
     *     &quot;spec&quot;: {
     *         &quot;components&quot;: [
     *             {
     *                 &quot;id&quot;: &quot;568780096083*******&quot;,
     *                 &quot;script&quot;: {
     *                     &quot;content&quot;: &quot;select \&quot;@@{para1}\&quot;, \&quot;@@{para2}\&quot;&quot;
     *                 }
     *             }
     *         ]
     *     }
     * }</p>
     */
    @NameInMap("Spec")
    public String spec;

    public static UpdateComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateComponentRequest self = new UpdateComponentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateComponentRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public UpdateComponentRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateComponentRequest setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
