// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListConfigurationVariateResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("ConfigurationVariate")
    public java.util.List<ListConfigurationVariateResponseBodyConfigurationVariate> configurationVariate;

    // 本次读取的最大数据量
    @NameInMap("MaxResults")
    public Long maxResults;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListConfigurationVariateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConfigurationVariateResponseBody self = new ListConfigurationVariateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConfigurationVariateResponseBody setConfigurationVariate(java.util.List<ListConfigurationVariateResponseBodyConfigurationVariate> configurationVariate) {
        this.configurationVariate = configurationVariate;
        return this;
    }
    public java.util.List<ListConfigurationVariateResponseBodyConfigurationVariate> getConfigurationVariate() {
        return this.configurationVariate;
    }

    public ListConfigurationVariateResponseBody setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ListConfigurationVariateResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListConfigurationVariateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConfigurationVariateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListConfigurationVariateResponseBodyConfigurationVariate extends TeaModel {
        // 配置变量描述
        @NameInMap("Comment")
        public String comment;

        // 配置变量id
        @NameInMap("ConfigurationVariateId")
        public String configurationVariateId;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 配置变量转换函数
        @NameInMap("FormatFunction")
        public String formatFunction;

        // 更新时间
        @NameInMap("UpdateTime")
        public String updateTime;

        // 配置变量名称
        @NameInMap("VariateName")
        public String variateName;

        public static ListConfigurationVariateResponseBodyConfigurationVariate build(java.util.Map<String, ?> map) throws Exception {
            ListConfigurationVariateResponseBodyConfigurationVariate self = new ListConfigurationVariateResponseBodyConfigurationVariate();
            return TeaModel.build(map, self);
        }

        public ListConfigurationVariateResponseBodyConfigurationVariate setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListConfigurationVariateResponseBodyConfigurationVariate setConfigurationVariateId(String configurationVariateId) {
            this.configurationVariateId = configurationVariateId;
            return this;
        }
        public String getConfigurationVariateId() {
            return this.configurationVariateId;
        }

        public ListConfigurationVariateResponseBodyConfigurationVariate setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListConfigurationVariateResponseBodyConfigurationVariate setFormatFunction(String formatFunction) {
            this.formatFunction = formatFunction;
            return this;
        }
        public String getFormatFunction() {
            return this.formatFunction;
        }

        public ListConfigurationVariateResponseBodyConfigurationVariate setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListConfigurationVariateResponseBodyConfigurationVariate setVariateName(String variateName) {
            this.variateName = variateName;
            return this;
        }
        public String getVariateName() {
            return this.variateName;
        }

    }

}
