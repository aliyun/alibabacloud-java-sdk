// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ListOfficeConversionTaskRequest extends TeaModel {
    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // 最大结果数
    @NameInMap("MaxResults")
    public Long maxResults;

    // 下一条记录开始标记
    @NameInMap("NextToken")
    public String nextToken;

    public static ListOfficeConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOfficeConversionTaskRequest self = new ListOfficeConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListOfficeConversionTaskRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public ListOfficeConversionTaskRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListOfficeConversionTaskRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
