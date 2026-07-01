// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBatchTemplatesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
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
     * <p>The backend exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paged query result.</p>
     */
    @NameInMap("PageResult")
    public ListBatchTemplatesResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
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

    public static ListBatchTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTemplatesResponseBody self = new ListBatchTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBatchTemplatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBatchTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBatchTemplatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBatchTemplatesResponseBody setPageResult(ListBatchTemplatesResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListBatchTemplatesResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListBatchTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBatchTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBatchTemplatesResponseBodyPageResultTemplateList extends TeaModel {
        /**
         * <p>The template submission comment.</p>
         * 
         * <strong>example:</strong>
         * <p>初始化提交</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The template content.</p>
         * 
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * echo \&quot;hello world\&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The current latest version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentVersion")
        public Long currentVersion;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>用于数据处理的Shell模板</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The compute engine version. Currently supported Python versions: Python 2.7 and Python 3.7.</p>
         * 
         * <strong>example:</strong>
         * <p>Python 3.7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The template creation time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The template update time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-28 15:30:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The template ID, which is the same as the menu tree node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The last modifier of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <p>The ID of the last modifier of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>100002</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>数据处理模板</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The node type. Valid values: 10 (Shell) and 21 (Python).</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OperatorType")
        public Integer operatorType;

        /**
         * <p>The template owner.</p>
         * 
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The template owner ID.</p>
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <p>The template status. Valid values: 0 (draft), 2 (submitted), and 100 (in development).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListBatchTemplatesResponseBodyPageResultTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTemplatesResponseBodyPageResultTemplateList self = new ListBatchTemplatesResponseBodyPageResultTemplateList();
            return TeaModel.build(map, self);
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setCurrentVersion(Long currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }
        public Long getCurrentVersion() {
            return this.currentVersion;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setOperatorType(Integer operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public Integer getOperatorType() {
            return this.operatorType;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListBatchTemplatesResponseBodyPageResultTemplateList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListBatchTemplatesResponseBodyPageResult extends TeaModel {
        /**
         * <p>The list of template records.</p>
         */
        @NameInMap("TemplateList")
        public java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateList> templateList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBatchTemplatesResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTemplatesResponseBodyPageResult self = new ListBatchTemplatesResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListBatchTemplatesResponseBodyPageResult setTemplateList(java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateList> templateList) {
            this.templateList = templateList;
            return this;
        }
        public java.util.List<ListBatchTemplatesResponseBodyPageResultTemplateList> getTemplateList() {
            return this.templateList;
        }

        public ListBatchTemplatesResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
