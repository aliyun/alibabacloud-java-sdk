// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateCheckRunRequest extends TeaModel {
    @NameInMap("accessToken")
    public String accessToken;

    @NameInMap("annotations")
    public java.util.List<UpdateCheckRunRequestAnnotations> annotations;

    @NameInMap("completedAt")
    public String completedAt;

    @NameInMap("conclusion")
    public String conclusion;

    @NameInMap("detailsUrl")
    public String detailsUrl;

    @NameInMap("externalId")
    public String externalId;

    @NameInMap("name")
    public String name;

    @NameInMap("output")
    public UpdateCheckRunRequestOutput output;

    @NameInMap("startedAt")
    public String startedAt;

    @NameInMap("status")
    public String status;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("checkRunId")
    public Long checkRunId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("organizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("repositoryIdentity")
    public String repositoryIdentity;

    public static UpdateCheckRunRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckRunRequest self = new UpdateCheckRunRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCheckRunRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

    public UpdateCheckRunRequest setAnnotations(java.util.List<UpdateCheckRunRequestAnnotations> annotations) {
        this.annotations = annotations;
        return this;
    }
    public java.util.List<UpdateCheckRunRequestAnnotations> getAnnotations() {
        return this.annotations;
    }

    public UpdateCheckRunRequest setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public String getCompletedAt() {
        return this.completedAt;
    }

    public UpdateCheckRunRequest setConclusion(String conclusion) {
        this.conclusion = conclusion;
        return this;
    }
    public String getConclusion() {
        return this.conclusion;
    }

    public UpdateCheckRunRequest setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
        return this;
    }
    public String getDetailsUrl() {
        return this.detailsUrl;
    }

    public UpdateCheckRunRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

    public UpdateCheckRunRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCheckRunRequest setOutput(UpdateCheckRunRequestOutput output) {
        this.output = output;
        return this;
    }
    public UpdateCheckRunRequestOutput getOutput() {
        return this.output;
    }

    public UpdateCheckRunRequest setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public UpdateCheckRunRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateCheckRunRequest setCheckRunId(Long checkRunId) {
        this.checkRunId = checkRunId;
        return this;
    }
    public Long getCheckRunId() {
        return this.checkRunId;
    }

    public UpdateCheckRunRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public UpdateCheckRunRequest setRepositoryIdentity(String repositoryIdentity) {
        this.repositoryIdentity = repositoryIdentity;
        return this;
    }
    public String getRepositoryIdentity() {
        return this.repositoryIdentity;
    }

    public static class UpdateCheckRunRequestAnnotations extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("annotationLevel")
        public String annotationLevel;

        @NameInMap("endColumn")
        public Long endColumn;

        /**
         * <p>This parameter is required.</p>
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
         */
        @NameInMap("path")
        public String path;

        @NameInMap("rawDetails")
        public String rawDetails;

        @NameInMap("startColumn")
        public Long startColumn;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("startLine")
        public Long startLine;

        @NameInMap("title")
        public String title;

        public static UpdateCheckRunRequestAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckRunRequestAnnotations self = new UpdateCheckRunRequestAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateCheckRunRequestAnnotations setAnnotationLevel(String annotationLevel) {
            this.annotationLevel = annotationLevel;
            return this;
        }
        public String getAnnotationLevel() {
            return this.annotationLevel;
        }

        public UpdateCheckRunRequestAnnotations setEndColumn(Long endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Long getEndColumn() {
            return this.endColumn;
        }

        public UpdateCheckRunRequestAnnotations setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public UpdateCheckRunRequestAnnotations setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateCheckRunRequestAnnotations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateCheckRunRequestAnnotations setRawDetails(String rawDetails) {
            this.rawDetails = rawDetails;
            return this;
        }
        public String getRawDetails() {
            return this.rawDetails;
        }

        public UpdateCheckRunRequestAnnotations setStartColumn(Long startColumn) {
            this.startColumn = startColumn;
            return this;
        }
        public Long getStartColumn() {
            return this.startColumn;
        }

        public UpdateCheckRunRequestAnnotations setStartLine(Long startLine) {
            this.startLine = startLine;
            return this;
        }
        public Long getStartLine() {
            return this.startLine;
        }

        public UpdateCheckRunRequestAnnotations setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateCheckRunRequestOutputImages extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("alt")
        public String alt;

        @NameInMap("caption")
        public String caption;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("imageUrl")
        public String imageUrl;

        public static UpdateCheckRunRequestOutputImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckRunRequestOutputImages self = new UpdateCheckRunRequestOutputImages();
            return TeaModel.build(map, self);
        }

        public UpdateCheckRunRequestOutputImages setAlt(String alt) {
            this.alt = alt;
            return this;
        }
        public String getAlt() {
            return this.alt;
        }

        public UpdateCheckRunRequestOutputImages setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public UpdateCheckRunRequestOutputImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class UpdateCheckRunRequestOutput extends TeaModel {
        @NameInMap("images")
        public java.util.List<UpdateCheckRunRequestOutputImages> images;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("summary")
        public String summary;

        @NameInMap("text")
        public String text;

        @NameInMap("title")
        public String title;

        public static UpdateCheckRunRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckRunRequestOutput self = new UpdateCheckRunRequestOutput();
            return TeaModel.build(map, self);
        }

        public UpdateCheckRunRequestOutput setImages(java.util.List<UpdateCheckRunRequestOutputImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<UpdateCheckRunRequestOutputImages> getImages() {
            return this.images;
        }

        public UpdateCheckRunRequestOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public UpdateCheckRunRequestOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public UpdateCheckRunRequestOutput setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
