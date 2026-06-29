// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListComputeSourcesResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paginated query result.</p>
     */
    @NameInMap("PageResult")
    public ListComputeSourcesResponseBodyPageResult pageResult;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListComputeSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListComputeSourcesResponseBody self = new ListComputeSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListComputeSourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListComputeSourcesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListComputeSourcesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListComputeSourcesResponseBody setPageResult(ListComputeSourcesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListComputeSourcesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListComputeSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListComputeSourcesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListComputeSourcesResponseBodyPageResultComputeSourceList extends TeaModel {
        /**
         * <p>Indicates whether the compute source is bound to a project.</p>
         */
        @NameInMap("BindProject")
        public Boolean bindProject;

        /**
         * <p>The ID of the bound project.</p>
         * 
         * <strong>example:</strong>
         * <p>10132131111</p>
         */
        @NameInMap("BindProjectId")
        public Long bindProjectId;

        /**
         * <p>The name of the bound project.</p>
         * 
         * <strong>example:</strong>
         * <p>testPrj</p>
         */
        @NameInMap("BindProjectName")
        public String bindProjectName;

        /**
         * <p>The ID of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>30012211</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>The description of the compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name of the compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>test1011</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The time when the compute source was created, in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the compute source was last modified, in the yyyy-MM-dd HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>102111</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>test1011</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the compute source owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30012211</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The name of the compute source owner.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("OwnerName")
        public String ownerName;

        /**
         * <p>The type of the compute source.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListComputeSourcesResponseBodyPageResultComputeSourceList build(java.util.Map<String, ?> map) throws Exception {
            ListComputeSourcesResponseBodyPageResultComputeSourceList self = new ListComputeSourcesResponseBodyPageResultComputeSourceList();
            return TeaModel.build(map, self);
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setBindProject(Boolean bindProject) {
            this.bindProject = bindProject;
            return this;
        }
        public Boolean getBindProject() {
            return this.bindProject;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setBindProjectId(Long bindProjectId) {
            this.bindProjectId = bindProjectId;
            return this;
        }
        public Long getBindProjectId() {
            return this.bindProjectId;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setBindProjectName(String bindProjectName) {
            this.bindProjectName = bindProjectName;
            return this;
        }
        public String getBindProjectName() {
            return this.bindProjectName;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }
        public String getOwnerName() {
            return this.ownerName;
        }

        public ListComputeSourcesResponseBodyPageResultComputeSourceList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListComputeSourcesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The paginated list of compute sources.</p>
         */
        @NameInMap("ComputeSourceList")
        public java.util.List<ListComputeSourcesResponseBodyPageResultComputeSourceList> computeSourceList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>68</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListComputeSourcesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListComputeSourcesResponseBodyPageResult self = new ListComputeSourcesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListComputeSourcesResponseBodyPageResult setComputeSourceList(java.util.List<ListComputeSourcesResponseBodyPageResultComputeSourceList> computeSourceList) {
            this.computeSourceList = computeSourceList;
            return this;
        }
        public java.util.List<ListComputeSourcesResponseBodyPageResultComputeSourceList> getComputeSourceList() {
            return this.computeSourceList;
        }

        public ListComputeSourcesResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
