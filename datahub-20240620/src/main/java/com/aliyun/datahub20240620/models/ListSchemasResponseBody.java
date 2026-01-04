// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class ListSchemasResponseBody extends TeaModel {
    @NameInMap("List")
    public java.util.List<ListSchemasResponseBodyList> list;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>9892074a2a89600ae4b0d5a34fb99a3f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>20250401102332e68e3d0b04ab4904</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSchemasResponseBody self = new ListSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSchemasResponseBody setList(java.util.List<ListSchemasResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListSchemasResponseBodyList> getList() {
        return this.list;
    }

    public ListSchemasResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSchemasResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSchemasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSchemasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSchemasResponseBodyList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1708171905000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1048133943212399</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>test_project</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;Type\&quot;:\&quot;STRING\&quot;,\&quot;AllowNull\&quot;:true,\&quot;Name\&quot;:\&quot;context\&quot;}]</p>
         */
        @NameInMap("RecordSchema")
        public String recordSchema;

        /**
         * <strong>example:</strong>
         * <p>test_topic</p>
         */
        @NameInMap("TopicName")
        public String topicName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VersionId")
        public Integer versionId;

        public static ListSchemasResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListSchemasResponseBodyList self = new ListSchemasResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListSchemasResponseBodyList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListSchemasResponseBodyList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListSchemasResponseBodyList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListSchemasResponseBodyList setRecordSchema(String recordSchema) {
            this.recordSchema = recordSchema;
            return this;
        }
        public String getRecordSchema() {
            return this.recordSchema;
        }

        public ListSchemasResponseBodyList setTopicName(String topicName) {
            this.topicName = topicName;
            return this;
        }
        public String getTopicName() {
            return this.topicName;
        }

        public ListSchemasResponseBodyList setVersionId(Integer versionId) {
            this.versionId = versionId;
            return this;
        }
        public Integer getVersionId() {
            return this.versionId;
        }

    }

}
