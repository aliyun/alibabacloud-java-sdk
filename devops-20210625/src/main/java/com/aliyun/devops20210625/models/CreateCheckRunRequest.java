// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCheckRunRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>f0b1e61db5961df5975a93f9129d2513</p>
     */
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("annotations")
    public java.util.List<CreateCheckRunRequestAnnotations> annotations;

    /**
     * <strong>example:</strong>
     * <p>2023-03-15T08:00:00Z</p>
     */
    @NameInMap("completedAt")
    public String completedAt;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("conclusion")
    public String conclusion;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("detailsUrl")
    public String detailsUrl;

    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("externalId")
    public String externalId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40f4ccfe019cdd4a62d4acb0c57130106fc7e1be</p>
     */
    @NameInMap("headSha")
    public String headSha;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-check-ci</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("output")
    public CreateCheckRunRequestOutput output;

    /**
     * <strong>example:</strong>
     * <p>2023-03-15T08:00:00Z</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <strong>example:</strong>
     * <p>completed</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5ebbc0228123212b59xxxxx</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    public static CreateCheckRunRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckRunRequest self = new CreateCheckRunRequest();
        return TeaModel.build(map, self);
    }

    public CreateCheckRunRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public CreateCheckRunRequest setAnnotations(java.util.List<CreateCheckRunRequestAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<CreateCheckRunRequestAnnotations> getAnnotations() {
        return this.annotations;
    }

    public CreateCheckRunRequest setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public String getCompletedAt() {
        return this.completedAt;
    }

    public CreateCheckRunRequest setConclusion(String conclusion) {
        this.conclusion = conclusion;
        return this;
    }
    public String getConclusion() {
        return this.conclusion;
    }

    public CreateCheckRunRequest setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
        return this;
    }
    public String getDetailsUrl() {
        return this.detailsUrl;
    }

    public CreateCheckRunRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public CreateCheckRunRequest setHeadSha(String headSha) {
        this.headSha = headSha;
        return this;
    }
    public String getHeadSha() {
        return this.headSha;
    }

    public CreateCheckRunRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCheckRunRequest setOutput(CreateCheckRunRequestOutput output) {
        this.output = output;
        return this;
    }
    public CreateCheckRunRequestOutput getOutput() {
        return this.output;
    }

    public CreateCheckRunRequest setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public CreateCheckRunRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreateCheckRunRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public CreateCheckRunRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public static class CreateCheckRunRequestAnnotations extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>notice</p>
         */
        @NameInMap("annotationLevel")
        public String annotationLevel;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("endColumn")
        public Long endColumn;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("endLine")
        public Long endLine;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo/test.txt</p>
         */
        @NameInMap("path")
        public String path;

        @NameInMap("rawDetails")
        public String rawDetails;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("startColumn")
        public Long startColumn;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("startLine")
        public Long startLine;

        @NameInMap("title")
        public String title;

        public static CreateCheckRunRequestAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckRunRequestAnnotations self = new CreateCheckRunRequestAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateCheckRunRequestAnnotations setAnnotationLevel(String annotationLevel) {
            this.annotationLevel = annotationLevel;
            return this;
        }
        public String getAnnotationLevel() {
            return this.annotationLevel;
        }

        public CreateCheckRunRequestAnnotations setEndColumn(Long endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Long getEndColumn() {
            return this.endColumn;
        }

        public CreateCheckRunRequestAnnotations setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public CreateCheckRunRequestAnnotations setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateCheckRunRequestAnnotations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateCheckRunRequestAnnotations setRawDetails(String rawDetails) {
            this.rawDetails = rawDetails;
            return this;
        }
        public String getRawDetails() {
            return this.rawDetails;
        }

        public CreateCheckRunRequestAnnotations setStartColumn(Long startColumn) {
            this.startColumn = startColumn;
            return this;
        }
        public Long getStartColumn() {
            return this.startColumn;
        }

        public CreateCheckRunRequestAnnotations setStartLine(Long startLine) {
            this.startLine = startLine;
            return this;
        }
        public Long getStartLine() {
            return this.startLine;
        }

        public CreateCheckRunRequestAnnotations setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateCheckRunRequestOutputImages extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-image-alt</p>
         */
        @NameInMap("alt")
        public String alt;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("caption")
        public String caption;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("imageUrl")
        public String imageUrl;

        public static CreateCheckRunRequestOutputImages build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckRunRequestOutputImages self = new CreateCheckRunRequestOutputImages();
            return TeaModel.build(map, self);
        }

        public CreateCheckRunRequestOutputImages setAlt(String alt) {
            this.alt = alt;
            return this;
        }
        public String getAlt() {
            return this.alt;
        }

        public CreateCheckRunRequestOutputImages setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public CreateCheckRunRequestOutputImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class CreateCheckRunRequestOutput extends TeaModel {
        @NameInMap("images")
        public java.util.List<CreateCheckRunRequestOutputImages> images;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("summary")
        public String summary;

        @NameInMap("text")
        public String text;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mighty Readme report</p>
         */
        @NameInMap("title")
        public String title;

        public static CreateCheckRunRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckRunRequestOutput self = new CreateCheckRunRequestOutput();
            return TeaModel.build(map, self);
        }

        public CreateCheckRunRequestOutput setImages(java.util.List<CreateCheckRunRequestOutputImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<CreateCheckRunRequestOutputImages> getImages() {
            return this.images;
        }

        public CreateCheckRunRequestOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public CreateCheckRunRequestOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateCheckRunRequestOutput setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
