// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListSysTemplatesResponseBody extends TeaModel {
    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Integer totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Templates")
    public java.util.List<ListSysTemplatesResponseBodyTemplates> templates;

    public static ListSysTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSysTemplatesResponseBody self = new ListSysTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSysTemplatesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListSysTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSysTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSysTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSysTemplatesResponseBody setTemplates(java.util.List<ListSysTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<ListSysTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class ListSysTemplatesResponseBodyTemplates extends TeaModel {
        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        @NameInMap("Config")
        public String config;

        public static ListSysTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListSysTemplatesResponseBodyTemplates self = new ListSysTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public ListSysTemplatesResponseBodyTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListSysTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSysTemplatesResponseBodyTemplates setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListSysTemplatesResponseBodyTemplates setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

    }

}
