// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListStacksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>LC4NJL3Ru2bIiRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>3E49127A-BB65-5CCD-AB93-0EC0A43E5446</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("stacks")
    public java.util.List<ListStacksResponseBodyStacks> stacks;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListStacksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListStacksResponseBody self = new ListStacksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListStacksResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListStacksResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListStacksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListStacksResponseBody setStacks(java.util.List<ListStacksResponseBodyStacks> stacks) {
        this.stacks = stacks;
        return this;
    }
    public java.util.List<ListStacksResponseBodyStacks> getStacks() {
        return this.stacks;
    }

    public ListStacksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListStacksResponseBodyStacks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-05-07T02:21:28Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>description of stack</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>stack-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <strong>example:</strong>
         * <p>description of stack</p>
         */
        @NameInMap("stackDescription")
        public String stackDescription;

        /**
         * <strong>example:</strong>
         * <p>stack-as1d4vld898ppnqxxxxxx</p>
         */
        @NameInMap("stackId")
        public String stackId;

        /**
         * <strong>example:</strong>
         * <p>stack-test</p>
         */
        @NameInMap("stackName")
        public String stackName;

        /**
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        @NameInMap("status")
        public String status;

        public static ListStacksResponseBodyStacks build(java.util.Map<String, ?> map) throws Exception {
            ListStacksResponseBodyStacks self = new ListStacksResponseBodyStacks();
            return TeaModel.build(map, self);
        }

        public ListStacksResponseBodyStacks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListStacksResponseBodyStacks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListStacksResponseBodyStacks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListStacksResponseBodyStacks setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListStacksResponseBodyStacks setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public ListStacksResponseBodyStacks setStackDescription(String stackDescription) {
            this.stackDescription = stackDescription;
            return this;
        }
        public String getStackDescription() {
            return this.stackDescription;
        }

        public ListStacksResponseBodyStacks setStackId(String stackId) {
            this.stackId = stackId;
            return this;
        }
        public String getStackId() {
            return this.stackId;
        }

        public ListStacksResponseBodyStacks setStackName(String stackName) {
            this.stackName = stackName;
            return this;
        }
        public String getStackName() {
            return this.stackName;
        }

        public ListStacksResponseBodyStacks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
