// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetBatchTemplateVersionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBatchTemplateVersionsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetBatchTemplateVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBatchTemplateVersionsResponseBody self = new GetBatchTemplateVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBatchTemplateVersionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBatchTemplateVersionsResponseBody setData(GetBatchTemplateVersionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBatchTemplateVersionsResponseBodyData getData() {
        return this.data;
    }

    public GetBatchTemplateVersionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetBatchTemplateVersionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBatchTemplateVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBatchTemplateVersionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBatchTemplateVersionsResponseBodyDataTemplateVersionList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>初始化提交</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>#!/bin/bash
         * echo \&quot;hello world\&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>用于数据处理的Shell模板</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Python 3.7</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01 10:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2026-05-28 15:30:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>李四</p>
         */
        @NameInMap("Modifier")
        public String modifier;

        /**
         * <strong>example:</strong>
         * <p>100002</p>
         */
        @NameInMap("ModifierId")
        public String modifierId;

        /**
         * <strong>example:</strong>
         * <p>数据处理模板</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("OperatorType")
        public Integer operatorType;

        /**
         * <strong>example:</strong>
         * <p>张三</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        public static GetBatchTemplateVersionsResponseBodyDataTemplateVersionList build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTemplateVersionsResponseBodyDataTemplateVersionList self = new GetBatchTemplateVersionsResponseBodyDataTemplateVersionList();
            return TeaModel.build(map, self);
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setOperatorType(Integer operatorType) {
            this.operatorType = operatorType;
            return this;
        }
        public Integer getOperatorType() {
            return this.operatorType;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetBatchTemplateVersionsResponseBodyDataTemplateVersionList setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

    public static class GetBatchTemplateVersionsResponseBodyData extends TeaModel {
        @NameInMap("TemplateVersionList")
        public java.util.List<GetBatchTemplateVersionsResponseBodyDataTemplateVersionList> templateVersionList;

        public static GetBatchTemplateVersionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBatchTemplateVersionsResponseBodyData self = new GetBatchTemplateVersionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBatchTemplateVersionsResponseBodyData setTemplateVersionList(java.util.List<GetBatchTemplateVersionsResponseBodyDataTemplateVersionList> templateVersionList) {
            this.templateVersionList = templateVersionList;
            return this;
        }
        public java.util.List<GetBatchTemplateVersionsResponseBodyDataTemplateVersionList> getTemplateVersionList() {
            return this.templateVersionList;
        }

    }

}
