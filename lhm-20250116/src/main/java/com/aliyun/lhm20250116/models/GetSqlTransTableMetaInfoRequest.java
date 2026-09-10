// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetSqlTransTableMetaInfoRequest extends TeaModel {
    /**
     * <p>The source SQL dialect type.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("sourceDialect")
    public String sourceDialect;

    /**
     * <p>The source script content. You must Base64-encode the script before passing it in. The server decodes the content before parsing.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * FROM t;</p>
     */
    @NameInMap("sourceSqlScript")
    public String sourceSqlScript;

    /**
     * <p>The target SQL dialect type.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("targetDialect")
    public String targetDialect;

    public static GetSqlTransTableMetaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSqlTransTableMetaInfoRequest self = new GetSqlTransTableMetaInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetSqlTransTableMetaInfoRequest setSourceDialect(String sourceDialect) {
        this.sourceDialect = sourceDialect;
        return this;
    }
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    public GetSqlTransTableMetaInfoRequest setSourceSqlScript(String sourceSqlScript) {
        this.sourceSqlScript = sourceSqlScript;
        return this;
    }
    public String getSourceSqlScript() {
        return this.sourceSqlScript;
    }

    public GetSqlTransTableMetaInfoRequest setTargetDialect(String targetDialect) {
        this.targetDialect = targetDialect;
        return this;
    }
    public String getTargetDialect() {
        return this.targetDialect;
    }

}
