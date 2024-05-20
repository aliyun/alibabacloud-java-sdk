// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeDocResponseBody extends TeaModel {
    @NameInMap("BizCode")
    public String bizCode;

    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("Config")
    public String config;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateUserId")
    public Long createUserId;

    @NameInMap("CreateUserName")
    public String createUserName;

    @NameInMap("DocInfo")
    public DescribeDocResponseBodyDocInfo docInfo;

    @NameInMap("DocName")
    public String docName;

    @NameInMap("DocTags")
    public java.util.List<DescribeDocResponseBodyDocTags> docTags;

    @NameInMap("EffectStatus")
    public Integer effectStatus;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("KnowledgeId")
    public Long knowledgeId;

    @NameInMap("Meta")
    public String meta;

    @NameInMap("ModifyTime")
    public String modifyTime;

    @NameInMap("ModifyUserId")
    public Long modifyUserId;

    @NameInMap("ModifyUserName")
    public String modifyUserName;

    @NameInMap("ProcessCanRetry")
    public Boolean processCanRetry;

    @NameInMap("ProcessMessage")
    public String processMessage;

    @NameInMap("ProcessStatus")
    public Integer processStatus;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("Title")
    public String title;

    @NameInMap("Url")
    public String url;

    public static DescribeDocResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDocResponseBody self = new DescribeDocResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDocResponseBody setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public DescribeDocResponseBody setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public DescribeDocResponseBody setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public DescribeDocResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeDocResponseBody setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public Long getCreateUserId() {
        return this.createUserId;
    }

    public DescribeDocResponseBody setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
        return this;
    }
    public String getCreateUserName() {
        return this.createUserName;
    }

    public DescribeDocResponseBody setDocInfo(DescribeDocResponseBodyDocInfo docInfo) {
        this.docInfo = docInfo;
        return this;
    }
    public DescribeDocResponseBodyDocInfo getDocInfo() {
        return this.docInfo;
    }

    public DescribeDocResponseBody setDocName(String docName) {
        this.docName = docName;
        return this;
    }
    public String getDocName() {
        return this.docName;
    }

    public DescribeDocResponseBody setDocTags(java.util.List<DescribeDocResponseBodyDocTags> docTags) {
        this.docTags = docTags;
        return this;
    }
    public java.util.List<DescribeDocResponseBodyDocTags> getDocTags() {
        return this.docTags;
    }

    public DescribeDocResponseBody setEffectStatus(Integer effectStatus) {
        this.effectStatus = effectStatus;
        return this;
    }
    public Integer getEffectStatus() {
        return this.effectStatus;
    }

    public DescribeDocResponseBody setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeDocResponseBody setKnowledgeId(Long knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public Long getKnowledgeId() {
        return this.knowledgeId;
    }

    public DescribeDocResponseBody setMeta(String meta) {
        this.meta = meta;
        return this;
    }
    public String getMeta() {
        return this.meta;
    }

    public DescribeDocResponseBody setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public DescribeDocResponseBody setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
        return this;
    }
    public Long getModifyUserId() {
        return this.modifyUserId;
    }

    public DescribeDocResponseBody setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
        return this;
    }
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    public DescribeDocResponseBody setProcessCanRetry(Boolean processCanRetry) {
        this.processCanRetry = processCanRetry;
        return this;
    }
    public Boolean getProcessCanRetry() {
        return this.processCanRetry;
    }

    public DescribeDocResponseBody setProcessMessage(String processMessage) {
        this.processMessage = processMessage;
        return this;
    }
    public String getProcessMessage() {
        return this.processMessage;
    }

    public DescribeDocResponseBody setProcessStatus(Integer processStatus) {
        this.processStatus = processStatus;
        return this;
    }
    public Integer getProcessStatus() {
        return this.processStatus;
    }

    public DescribeDocResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDocResponseBody setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribeDocResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeDocResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DescribeDocResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public static class DescribeDocResponseBodyDocInfoDocParas extends TeaModel {
        @NameInMap("ParaLevel")
        public Integer paraLevel;

        @NameInMap("ParaNo")
        public Integer paraNo;

        @NameInMap("ParaText")
        public String paraText;

        @NameInMap("ParaType")
        public String paraType;

        public static DescribeDocResponseBodyDocInfoDocParas build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocResponseBodyDocInfoDocParas self = new DescribeDocResponseBodyDocInfoDocParas();
            return TeaModel.build(map, self);
        }

        public DescribeDocResponseBodyDocInfoDocParas setParaLevel(Integer paraLevel) {
            this.paraLevel = paraLevel;
            return this;
        }
        public Integer getParaLevel() {
            return this.paraLevel;
        }

        public DescribeDocResponseBodyDocInfoDocParas setParaNo(Integer paraNo) {
            this.paraNo = paraNo;
            return this;
        }
        public Integer getParaNo() {
            return this.paraNo;
        }

        public DescribeDocResponseBodyDocInfoDocParas setParaText(String paraText) {
            this.paraText = paraText;
            return this;
        }
        public String getParaText() {
            return this.paraText;
        }

        public DescribeDocResponseBodyDocInfoDocParas setParaType(String paraType) {
            this.paraType = paraType;
            return this;
        }
        public String getParaType() {
            return this.paraType;
        }

    }

    public static class DescribeDocResponseBodyDocInfo extends TeaModel {
        @NameInMap("DocParas")
        public java.util.List<DescribeDocResponseBodyDocInfoDocParas> docParas;

        public static DescribeDocResponseBodyDocInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocResponseBodyDocInfo self = new DescribeDocResponseBodyDocInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDocResponseBodyDocInfo setDocParas(java.util.List<DescribeDocResponseBodyDocInfoDocParas> docParas) {
            this.docParas = docParas;
            return this;
        }
        public java.util.List<DescribeDocResponseBodyDocInfoDocParas> getDocParas() {
            return this.docParas;
        }

    }

    public static class DescribeDocResponseBodyDocTags extends TeaModel {
        @NameInMap("DefaultTag")
        public Boolean defaultTag;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("TagId")
        public Long tagId;

        @NameInMap("TagName")
        public String tagName;

        public static DescribeDocResponseBodyDocTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeDocResponseBodyDocTags self = new DescribeDocResponseBodyDocTags();
            return TeaModel.build(map, self);
        }

        public DescribeDocResponseBodyDocTags setDefaultTag(Boolean defaultTag) {
            this.defaultTag = defaultTag;
            return this;
        }
        public Boolean getDefaultTag() {
            return this.defaultTag;
        }

        public DescribeDocResponseBodyDocTags setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeDocResponseBodyDocTags setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeDocResponseBodyDocTags setTagId(Long tagId) {
            this.tagId = tagId;
            return this;
        }
        public Long getTagId() {
            return this.tagId;
        }

        public DescribeDocResponseBodyDocTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
