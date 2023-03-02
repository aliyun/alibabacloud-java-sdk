// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class QueryPublicModelEngineRequest extends TeaModel {
    /**
     * <p>The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://account.alibabacloud.com/login/login.htm) and go to the Workspace Management page to view the workspace ID.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The FML statement that is used to query information about the data modeling engine. For more information, see [Use FML statements to configure and manage data tables](~~298128#task-2091320~~ "After a data table is created, you can execute fast modeling language (FML) statements in the code editor of the table to configure fields and partitions for the table. This topic describes how to use FML statements to configure a data table.").</p>
     * <br>
     * <p>Only SHOW statements are supported.</p>
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
