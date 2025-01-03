// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCheckRunResponseBody extends TeaModel {
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
    public CreateCheckRunResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateCheckRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCheckRunResponseBody self = new CreateCheckRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCheckRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateCheckRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateCheckRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCheckRunResponseBody setResult(CreateCheckRunResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateCheckRunResponseBodyResult getResult() {
        return this.result;
    }

    public CreateCheckRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCheckRunResponseBodyResultAnnotations extends TeaModel {
        /**
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
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("endLine")
        public Long endLine;

        /**
         * <strong>example:</strong>
         * <p>2</p>
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

        public static CreateCheckRunResponseBodyResultAnnotations build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckRunResponseBodyResultAnnotations self = new CreateCheckRunResponseBodyResultAnnotations();
            return TeaModel.build(map, self);
        }

        public CreateCheckRunResponseBodyResultAnnotations setAnnotationLevel(String annotationLevel) {
            this.annotationLevel = annotationLevel;
            return this;
        }
        public String getAnnotationLevel() {
            return this.annotationLevel;
        }

        public CreateCheckRunResponseBodyResultAnnotations setEndColumn(Long endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Long getEndColumn() {
            return this.endColumn;
        }

        public CreateCheckRunResponseBodyResultAnnotations setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public CreateCheckRunResponseBodyResultAnnotations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateCheckRunResponseBodyResultAnnotations setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateCheckRunResponseBodyResultAnnotations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateCheckRunResponseBodyResultAnnotations setRawDetails(String rawDetails) {
            this.rawDetails = rawDetails;
            return this;
        }
        public String getRawDetails() {
            return this.rawDetails;
        }

        public CreateCheckRunResponseBodyResultAnnotations setStartColumn(Long startColumn) {
            this.startColumn = startColumn;
            return this;
        }
        public Long getStartColumn() {
            return this.startColumn;
        }

        public CreateCheckRunResponseBodyResultAnnotations setStartLine(Long startLine) {
            this.startLine = startLine;
            return this;
        }
        public Long getStartLine() {
            return this.startLine;
        }

        public CreateCheckRunResponseBodyResultAnnotations setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateCheckRunResponseBodyResultCheckSuite extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        public static CreateCheckRunResponseBodyResultCheckSuite build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckRunResponseBodyResultCheckSuite self = new CreateCheckRunResponseBodyResultCheckSuite();
            return TeaModel.build(map, self);
        }

        public CreateCheckRunResponseBodyResultCheckSuite setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class CreateCheckRunResponseBodyResultOutputImages extends TeaModel {
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

        public static CreateCheckRunResponseBodyResultOutputImages build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckRunResponseBodyResultOutputImages self = new CreateCheckRunResponseBodyResultOutputImages();
            return TeaModel.build(map, self);
        }

        public CreateCheckRunResponseBodyResultOutputImages setAlt(String alt) {
            this.alt = alt;
            return this;
        }
        public String getAlt() {
            return this.alt;
        }

        public CreateCheckRunResponseBodyResultOutputImages setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public CreateCheckRunResponseBodyResultOutputImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class CreateCheckRunResponseBodyResultOutput extends TeaModel {
        @NameInMap("images")
        public java.util.List<CreateCheckRunResponseBodyResultOutputImages> images;

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

        public static CreateCheckRunResponseBodyResultOutput build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckRunResponseBodyResultOutput self = new CreateCheckRunResponseBodyResultOutput();
            return TeaModel.build(map, self);
        }

        public CreateCheckRunResponseBodyResultOutput setImages(java.util.List<CreateCheckRunResponseBodyResultOutputImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<CreateCheckRunResponseBodyResultOutputImages> getImages() {
            return this.images;
        }

        public CreateCheckRunResponseBodyResultOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public CreateCheckRunResponseBodyResultOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateCheckRunResponseBodyResultOutput setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateCheckRunResponseBodyResultWriter extends TeaModel {
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

        public static CreateCheckRunResponseBodyResultWriter build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckRunResponseBodyResultWriter self = new CreateCheckRunResponseBodyResultWriter();
            return TeaModel.build(map, self);
        }

        public CreateCheckRunResponseBodyResultWriter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateCheckRunResponseBodyResultWriter setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public CreateCheckRunResponseBodyResultWriter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCheckRunResponseBodyResultWriter setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public CreateCheckRunResponseBodyResultWriter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateCheckRunResponseBodyResult extends TeaModel {
        @NameInMap("annotations")
        public java.util.List<CreateCheckRunResponseBodyResultAnnotations> annotations;

        @NameInMap("checkSuite")
        public CreateCheckRunResponseBodyResultCheckSuite checkSuite;

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
        public CreateCheckRunResponseBodyResultOutput output;

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
        public CreateCheckRunResponseBodyResultWriter writer;

        public static CreateCheckRunResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateCheckRunResponseBodyResult self = new CreateCheckRunResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateCheckRunResponseBodyResult setAnnotations(java.util.List<CreateCheckRunResponseBodyResultAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<CreateCheckRunResponseBodyResultAnnotations> getAnnotations() {
            return this.annotations;
        }

        public CreateCheckRunResponseBodyResult setCheckSuite(CreateCheckRunResponseBodyResultCheckSuite checkSuite) {
            this.checkSuite = checkSuite;
            return this;
        }
        public CreateCheckRunResponseBodyResultCheckSuite getCheckSuite() {
            return this.checkSuite;
        }

        public CreateCheckRunResponseBodyResult setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public CreateCheckRunResponseBodyResult setConclusion(String conclusion) {
            this.conclusion = conclusion;
            return this;
        }
        public String getConclusion() {
            return this.conclusion;
        }

        public CreateCheckRunResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateCheckRunResponseBodyResult setDetailsUrl(String detailsUrl) {
            this.detailsUrl = detailsUrl;
            return this;
        }
        public String getDetailsUrl() {
            return this.detailsUrl;
        }

        public CreateCheckRunResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public CreateCheckRunResponseBodyResult setHeadSha(String headSha) {
            this.headSha = headSha;
            return this;
        }
        public String getHeadSha() {
            return this.headSha;
        }

        public CreateCheckRunResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateCheckRunResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateCheckRunResponseBodyResult setOutput(CreateCheckRunResponseBodyResultOutput output) {
            this.output = output;
            return this;
        }
        public CreateCheckRunResponseBodyResultOutput getOutput() {
            return this.output;
        }

        public CreateCheckRunResponseBodyResult setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public CreateCheckRunResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateCheckRunResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateCheckRunResponseBodyResult setWriter(CreateCheckRunResponseBodyResultWriter writer) {
            this.writer = writer;
            return this;
        }
        public CreateCheckRunResponseBodyResultWriter getWriter() {
            return this.writer;
        }

    }

}
