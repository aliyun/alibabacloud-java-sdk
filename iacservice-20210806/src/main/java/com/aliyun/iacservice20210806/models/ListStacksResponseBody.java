// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListStacksResponseBody extends TeaModel {
    /**
     * <p>The maximum number of results returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. This parameter is empty if no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>LC4NJL3Ru2bIiRdnbADPQp4dD+2BRJj42DLT6GrZysw=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3E49127A-BB65-5CCD-AB93-0EC0A43E5446</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of stacks.</p>
     */
    @NameInMap("stacks")
    public java.util.List<ListStacksResponseBodyStacks> stacks;

    /**
     * <p>The total number of entries.</p>
     * 
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
         * <p>The creation time in UTC. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05-07T02:21:28Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The description of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>description of stack</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The stack name.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The creation source. Valid values:</p>
         * <ul>
         * <li>OSS: a template stored in Object Storage Service (OSS).</li>
         * <li>IAC_SERVICE_MODULE: a template created in the automation service console.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The path value of the configuration source. The value cannot exceed 1000 characters.</p>
         * <ul>
         * <li>If the source is OSS, the value is in the format oss::<file link> and must be a zip file. Example: oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></li>
         * <li>If the source is IAC_SERVICE_MODULE, the value is a template ID. Example: mod-xxxxx</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss::<a href="https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip">https://terraform-pipeline.oss-eu-central-1.aliyuncs.com/code.zip</a></p>
         */
        @NameInMap("sourcePath")
        public String sourcePath;

        /**
         * <p>The description of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>description of stack</p>
         */
        @NameInMap("stackDescription")
        public String stackDescription;

        /**
         * <p>The stack ID, which is the unique identifier generated after the stack is created.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-as1d4vld898ppnqxxxxxx</p>
         */
        @NameInMap("stackId")
        public String stackId;

        /**
         * <p>The stack name (deprecated). Use name instead.</p>
         * 
         * <strong>example:</strong>
         * <p>stack-test</p>
         */
        @NameInMap("stackName")
        public String stackName;

        /**
         * <p>The stack status.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Name</th>
         * <th>Description</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>Creating</td>
         * <td>Being created.</td>
         * </tr>
         * <tr>
         * <td>Created</td>
         * <td>Created.</td>
         * </tr>
         * <tr>
         * <td>Waiting</td>
         * <td>Waiting for deployment.</td>
         * </tr>
         * <tr>
         * <td>Deploying</td>
         * <td>Being deployed.</td>
         * </tr>
         * <tr>
         * <td>Deployed</td>
         * <td>Deployed.</td>
         * </tr>
         * <tr>
         * <td>Errored</td>
         * <td>Deployment failed.</td>
         * </tr>
         * <tr>
         * <td>Deleting</td>
         * <td>Being deleted.</td>
         * </tr>
         * <tr>
         * <td>Deleted</td>
         * <td>Deleted.</td>
         * </tr>
         * <tr>
         * <td>DeleteFailed</td>
         * <td>Deletion failed.</td>
         * </tr>
         * </tbody></table>
         * 
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
