// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class PostInnerConvertRequest extends TeaModel {
    /**
     * <p>SQL node type mapping, where the key is the source node type and the value is the target node type. If not empty, it will be assembled into <code>workflow.converter.sqlNodeTypeMapping</code> in <code>innerConvertConfig</code> and written via the task configuration update interface after creating the scheduling transformation task.</p>
     */
    @NameInMap("sqlConvertMap")
    public java.util.Map<String, ?> sqlConvertMap;

    /**
     * <p>Source data source name, i.e., the name of the scheduling data source at the source end of the transformation task.</p>
     * 
     * <strong>example:</strong>
     * <p>SourceDS1</p>
     */
    @NameInMap("srcDataSourceName")
    public String srcDataSourceName;

    /**
     * <p>Target data source name, i.e., the name of the scheduling data source at the target end of the transformation task.</p>
     * 
     * <strong>example:</strong>
     * <p>TargetDS1</p>
     */
    @NameInMap("tgtDataSourceName")
    public String tgtDataSourceName;

    public static PostInnerConvertRequest build(java.util.Map<String, ?> map) throws Exception {
        PostInnerConvertRequest self = new PostInnerConvertRequest();
        return TeaModel.build(map, self);
    }

    public PostInnerConvertRequest setSqlConvertMap(java.util.Map<String, ?> sqlConvertMap) {
        this.sqlConvertMap = sqlConvertMap;
        return this;
    }
    public java.util.Map<String, ?> getSqlConvertMap() {
        return this.sqlConvertMap;
    }

    public PostInnerConvertRequest setSrcDataSourceName(String srcDataSourceName) {
        this.srcDataSourceName = srcDataSourceName;
        return this;
    }
    public String getSrcDataSourceName() {
        return this.srcDataSourceName;
    }

    public PostInnerConvertRequest setTgtDataSourceName(String tgtDataSourceName) {
        this.tgtDataSourceName = tgtDataSourceName;
        return this;
    }
    public String getTgtDataSourceName() {
        return this.tgtDataSourceName;
    }

}
