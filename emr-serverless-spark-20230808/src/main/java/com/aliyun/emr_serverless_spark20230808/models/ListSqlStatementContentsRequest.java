// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListSqlStatementContentsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>oss://oss-<strong><strong>.cn-hangzhou.oss-dls.aliyuncs.com/w-86a9a4da</strong>*<strong>a1/spark/logs/jr-b737b</strong></strong>6164d/driver/st-afde7******bb3f</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListSqlStatementContentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSqlStatementContentsRequest self = new ListSqlStatementContentsRequest();
        return TeaModel.build(map, self);
    }

    public ListSqlStatementContentsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public ListSqlStatementContentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSqlStatementContentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
