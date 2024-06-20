// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainContractContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>C407F102-062A-44B3-BBDC-E3B2718F633D</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>R6XMn59e</p>
         */
        @NameInMap("ContentId")
        public String contentId;

        /**
         * <strong>example:</strong>
         * <p>newFile</p>
         */
        @NameInMap("ContentName")
        public String contentName;

        /**
         * <strong>example:</strong>
         * <p>1564024964404</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDirectory")
        public Boolean isDirectory;

        /**
         * <strong>example:</strong>
         * <p>R38DYDop</p>
         */
        @NameInMap("ParentContentId")
        public String parentContentId;

        /**
         * <strong>example:</strong>
         * <p>bDXK1b8Z</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>1564024964404</p>
         */
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
