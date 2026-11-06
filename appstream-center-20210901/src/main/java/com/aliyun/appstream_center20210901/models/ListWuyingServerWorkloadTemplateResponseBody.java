// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListWuyingServerWorkloadTemplateResponseBody extends TeaModel {
    /**
     * <p>A compatibility field. The current version does not use this field to indicate the number of returned entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A compatibility field. The current version does not generate a next page token.</p>
     * 
     * <strong>example:</strong>
     * <p>unused</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of workload templates. Up to 100 templates are returned, sorted by template configuration order.</p>
     */
    @NameInMap("WorkloadTemplates")
    public java.util.List<ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates> workloadTemplates;

    public static ListWuyingServerWorkloadTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWuyingServerWorkloadTemplateResponseBody self = new ListWuyingServerWorkloadTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWuyingServerWorkloadTemplateResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWuyingServerWorkloadTemplateResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWuyingServerWorkloadTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWuyingServerWorkloadTemplateResponseBody setWorkloadTemplates(java.util.List<ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates> workloadTemplates) {
        this.workloadTemplates = workloadTemplates;
        return this;
    }
    public java.util.List<ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates> getWorkloadTemplates() {
        return this.workloadTemplates;
    }

    public static class ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates extends TeaModel {
        /**
         * <p>The rendered template content. The original text is Base64-encoded after being encoded in UTF-8. You must decode the Base64 string before use.</p>
         * 
         * <strong>example:</strong>
         * <p>IyB3b3JrbG9hZCB0ZW1wbGF0ZQo=</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The description of the workload template.</p>
         * 
         * <strong>example:</strong>
         * <p>Used to submit general-purpose computing workloads</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the workload template.</p>
         * 
         * <strong>example:</strong>
         * <p>General-purpose computing task template</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates build(java.util.Map<String, ?> map) throws Exception {
            ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates self = new ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates();
            return TeaModel.build(map, self);
        }

        public ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListWuyingServerWorkloadTemplateResponseBodyWorkloadTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
