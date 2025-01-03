// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateCheckRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SYSTEM_UNKNOWN_ERROR</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public UpdateCheckRunResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateCheckRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCheckRunResponseBody self = new UpdateCheckRunResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCheckRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateCheckRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateCheckRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCheckRunResponseBody setResult(UpdateCheckRunResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateCheckRunResponseBodyResult getResult() {
        return this.result;
    }

    public UpdateCheckRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateCheckRunResponseBodyResultAnnotations extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>warning</p>
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
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("endLine")
        public Long endLine;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        @NameInMap("message")
        public String message;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("startLine")
        public Long startLine;

        @NameInMap("title")
        public String title;

        public static UpdateCheckRunResponseBodyResultAnnotations build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckRunResponseBodyResultAnnotations self = new UpdateCheckRunResponseBodyResultAnnotations();
            return TeaModel.build(map, self);
        }

        public UpdateCheckRunResponseBodyResultAnnotations setAnnotationLevel(String annotationLevel) {
            this.annotationLevel = annotationLevel;
            return this;
        }
        public String getAnnotationLevel() {
            return this.annotationLevel;
        }

        public UpdateCheckRunResponseBodyResultAnnotations setEndColumn(Long endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Long getEndColumn() {
            return this.endColumn;
        }

        public UpdateCheckRunResponseBodyResultAnnotations setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public UpdateCheckRunResponseBodyResultAnnotations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateCheckRunResponseBodyResultAnnotations setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public UpdateCheckRunResponseBodyResultAnnotations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateCheckRunResponseBodyResultAnnotations setRawDetails(String rawDetails) {
            this.rawDetails = rawDetails;
            return this;
        }
        public String getRawDetails() {
            return this.rawDetails;
        }

        public UpdateCheckRunResponseBodyResultAnnotations setStartColumn(Long startColumn) {
            this.startColumn = startColumn;
            return this;
        }
        public Long getStartColumn() {
            return this.startColumn;
        }

        public UpdateCheckRunResponseBodyResultAnnotations setStartLine(Long startLine) {
            this.startLine = startLine;
            return this;
        }
        public Long getStartLine() {
            return this.startLine;
        }

        public UpdateCheckRunResponseBodyResultAnnotations setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateCheckRunResponseBodyResultCheckSuite extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        public static UpdateCheckRunResponseBodyResultCheckSuite build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckRunResponseBodyResultCheckSuite self = new UpdateCheckRunResponseBodyResultCheckSuite();
            return TeaModel.build(map, self);
        }

        public UpdateCheckRunResponseBodyResultCheckSuite setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class UpdateCheckRunResponseBodyResultOutputImages extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("imageUrl")
        public String imageUrl;

        public static UpdateCheckRunResponseBodyResultOutputImages build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckRunResponseBodyResultOutputImages self = new UpdateCheckRunResponseBodyResultOutputImages();
            return TeaModel.build(map, self);
        }

        public UpdateCheckRunResponseBodyResultOutputImages setAlt(String alt) {
            this.alt = alt;
            return this;
        }
        public String getAlt() {
            return this.alt;
        }

        public UpdateCheckRunResponseBodyResultOutputImages setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public UpdateCheckRunResponseBodyResultOutputImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class UpdateCheckRunResponseBodyResultOutput extends TeaModel {
        @NameInMap("images")
        public java.util.List<UpdateCheckRunResponseBodyResultOutputImages> images;

        @NameInMap("summary")
        public String summary;

        @NameInMap("text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>Mighty Readme report</p>
         */
        @NameInMap("title")
        public String title;

        public static UpdateCheckRunResponseBodyResultOutput build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckRunResponseBodyResultOutput self = new UpdateCheckRunResponseBodyResultOutput();
            return TeaModel.build(map, self);
        }

        public UpdateCheckRunResponseBodyResultOutput setImages(java.util.List<UpdateCheckRunResponseBodyResultOutputImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<UpdateCheckRunResponseBodyResultOutputImages> getImages() {
            return this.images;
        }

        public UpdateCheckRunResponseBodyResultOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public UpdateCheckRunResponseBodyResultOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public UpdateCheckRunResponseBodyResultOutput setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class UpdateCheckRunResponseBodyResultWriter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("logoUrl")
        public String logoUrl;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>test-codeup</p>
         */
        @NameInMap("slug")
        public String slug;

        /**
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateCheckRunResponseBodyResultWriter build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckRunResponseBodyResultWriter self = new UpdateCheckRunResponseBodyResultWriter();
            return TeaModel.build(map, self);
        }

        public UpdateCheckRunResponseBodyResultWriter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateCheckRunResponseBodyResultWriter setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public UpdateCheckRunResponseBodyResultWriter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCheckRunResponseBodyResultWriter setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public UpdateCheckRunResponseBodyResultWriter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateCheckRunResponseBodyResult extends TeaModel {
        @NameInMap("annotations")
        public java.util.List<UpdateCheckRunResponseBodyResultAnnotations> annotations;

        @NameInMap("checkSuite")
        public UpdateCheckRunResponseBodyResultCheckSuite checkSuite;

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
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

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
         * <strong>example:</strong>
         * <p>40f4ccfe019cdd4a62d4acb0c57130106fc7e1be</p>
         */
        @NameInMap("headSha")
        public String headSha;

        /**
         * <strong>example:</strong>
         * <p>524836</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>my-check-ci</p>
         */
        @NameInMap("name")
        public String name;

        @NameInMap("output")
        public UpdateCheckRunResponseBodyResultOutput output;

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
         * <strong>example:</strong>
         * <p>2022-01-14T21:08:26+08:00</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("writer")
        public UpdateCheckRunResponseBodyResultWriter writer;

        public static UpdateCheckRunResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateCheckRunResponseBodyResult self = new UpdateCheckRunResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateCheckRunResponseBodyResult setAnnotations(java.util.List<UpdateCheckRunResponseBodyResultAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<UpdateCheckRunResponseBodyResultAnnotations> getAnnotations() {
            return this.annotations;
        }

        public UpdateCheckRunResponseBodyResult setCheckSuite(UpdateCheckRunResponseBodyResultCheckSuite checkSuite) {
            this.checkSuite = checkSuite;
            return this;
        }
        public UpdateCheckRunResponseBodyResultCheckSuite getCheckSuite() {
            return this.checkSuite;
        }

        public UpdateCheckRunResponseBodyResult setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public UpdateCheckRunResponseBodyResult setConclusion(String conclusion) {
            this.conclusion = conclusion;
            return this;
        }
        public String getConclusion() {
            return this.conclusion;
        }

        public UpdateCheckRunResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateCheckRunResponseBodyResult setDetailsUrl(String detailsUrl) {
            this.detailsUrl = detailsUrl;
            return this;
        }
        public String getDetailsUrl() {
            return this.detailsUrl;
        }

        public UpdateCheckRunResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public UpdateCheckRunResponseBodyResult setHeadSha(String headSha) {
            this.headSha = headSha;
            return this;
        }
        public String getHeadSha() {
            return this.headSha;
        }

        public UpdateCheckRunResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public UpdateCheckRunResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateCheckRunResponseBodyResult setOutput(UpdateCheckRunResponseBodyResultOutput output) {
            this.output = output;
            return this;
        }
        public UpdateCheckRunResponseBodyResultOutput getOutput() {
            return this.output;
        }

        public UpdateCheckRunResponseBodyResult setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public UpdateCheckRunResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateCheckRunResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateCheckRunResponseBodyResult setWriter(UpdateCheckRunResponseBodyResultWriter writer) {
            this.writer = writer;
            return this;
        }
        public UpdateCheckRunResponseBodyResultWriter getWriter() {
            return this.writer;
        }

    }

}
