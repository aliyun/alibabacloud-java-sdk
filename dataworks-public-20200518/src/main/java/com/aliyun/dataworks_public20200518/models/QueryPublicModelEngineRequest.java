// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryPublicModelEngineRequest extends TeaModel {
    /**
     * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The FML statement that is used to query information about objects that are created in Data Modeling. For more information, see <a href="https://help.aliyun.com/document_detail/298128.html">Use FML statements to configure and manage data tables</a>. Only SHOW statements are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>show dim tables</p>
     */
    @NameInMap("Text")
    public String text;

    public static QueryPublicModelEngineRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPublicModelEngineRequest self = new QueryPublicModelEngineRequest();
        return TeaModel.build(map, self);
    }

    public QueryPublicModelEngineRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryPublicModelEngineRequest setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

}
