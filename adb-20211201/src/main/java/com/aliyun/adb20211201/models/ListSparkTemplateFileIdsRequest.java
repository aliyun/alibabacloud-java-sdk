// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkTemplateFileIdsRequest extends TeaModel {
    /**
     * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp11q28kvl688****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    public static ListSparkTemplateFileIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSparkTemplateFileIdsRequest self = new ListSparkTemplateFileIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListSparkTemplateFileIdsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

}
