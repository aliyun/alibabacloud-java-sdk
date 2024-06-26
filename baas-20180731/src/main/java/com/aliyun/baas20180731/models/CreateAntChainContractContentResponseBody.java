// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainContractContentResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateAntChainContractContentResponseBodyResult result;

    public static CreateAntChainContractContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainContractContentResponseBody self = new CreateAntChainContractContentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAntChainContractContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAntChainContractContentResponseBody setResult(CreateAntChainContractContentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateAntChainContractContentResponseBodyResult getResult() {
        return this.result;
    }

    public static class CreateAntChainContractContentResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentId")
        public String contentId;

        @NameInMap("ContentName")
        public String contentName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("IsDirectory")
        public Boolean isDirectory;

        @NameInMap("ParentContentId")
        public String parentContentId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static CreateAntChainContractContentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateAntChainContractContentResponseBodyResult self = new CreateAntChainContractContentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateAntChainContractContentResponseBodyResult setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateAntChainContractContentResponseBodyResult setContentId(String contentId) {
            this.contentId = contentId;
            return this;
        }
        public String getContentId() {
            return this.contentId;
        }

        public CreateAntChainContractContentResponseBodyResult setContentName(String contentName) {
            this.contentName = contentName;
            return this;
        }
        public String getContentName() {
            return this.contentName;
        }

        public CreateAntChainContractContentResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateAntChainContractContentResponseBodyResult setIsDirectory(Boolean isDirectory) {
            this.isDirectory = isDirectory;
            return this;
        }
        public Boolean getIsDirectory() {
            return this.isDirectory;
        }

        public CreateAntChainContractContentResponseBodyResult setParentContentId(String parentContentId) {
            this.parentContentId = parentContentId;
            return this;
        }
        public String getParentContentId() {
            return this.parentContentId;
        }

        public CreateAntChainContractContentResponseBodyResult setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateAntChainContractContentResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
