// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class QueryTemplateListByGroupIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TemplateList")
    public java.util.List<QueryTemplateListByGroupIdResponseBodyTemplateList> templateList;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryTemplateListByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTemplateListByGroupIdResponseBody self = new QueryTemplateListByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTemplateListByGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTemplateListByGroupIdResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public QueryTemplateListByGroupIdResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public QueryTemplateListByGroupIdResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryTemplateListByGroupIdResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryTemplateListByGroupIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTemplateListByGroupIdResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public QueryTemplateListByGroupIdResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTemplateListByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTemplateListByGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryTemplateListByGroupIdResponseBody setTemplateList(java.util.List<QueryTemplateListByGroupIdResponseBodyTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<QueryTemplateListByGroupIdResponseBodyTemplateList> getTemplateList() {
        return this.templateList;
    }

    public QueryTemplateListByGroupIdResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryTemplateListByGroupIdResponseBodyTemplateList extends TeaModel {
        @NameInMap("BasePicture")
        public String basePicture;

        @NameInMap("Brand")
        public String brand;

        @NameInMap("EslSize")
        public String eslSize;

        @NameInMap("EslType")
        public String eslType;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Layout")
        public String layout;

        @NameInMap("Relation")
        public Boolean relation;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateName")
        public String templateName;

        @NameInMap("TemplateSceneId")
        public String templateSceneId;

        @NameInMap("TemplateVersion")
        public String templateVersion;

        @NameInMap("Width")
        public Long width;

        public static QueryTemplateListByGroupIdResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            QueryTemplateListByGroupIdResponseBodyTemplateList self = new QueryTemplateListByGroupIdResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setBasePicture(String basePicture) {
            this.basePicture = basePicture;
            return this;
        }
        public String getBasePicture() {
            return this.basePicture;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public String getBrand() {
            return this.brand;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setEslSize(String eslSize) {
            this.eslSize = eslSize;
            return this;
        }
        public String getEslSize() {
            return this.eslSize;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setEslType(String eslType) {
            this.eslType = eslType;
            return this;
        }
        public String getEslType() {
            return this.eslType;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setLayout(String layout) {
            this.layout = layout;
            return this;
        }
        public String getLayout() {
            return this.layout;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setRelation(Boolean relation) {
            this.relation = relation;
            return this;
        }
        public Boolean getRelation() {
            return this.relation;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setTemplateSceneId(String templateSceneId) {
            this.templateSceneId = templateSceneId;
            return this;
        }
        public String getTemplateSceneId() {
            return this.templateSceneId;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public QueryTemplateListByGroupIdResponseBodyTemplateList setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

}
