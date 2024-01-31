// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListCheckRunsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<ListCheckRunsResponseBodyResult> result;

    @NameInMap("success")
    public Boolean success;

    public static ListCheckRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCheckRunsResponseBody self = new ListCheckRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCheckRunsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListCheckRunsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListCheckRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCheckRunsResponseBody setResult(java.util.List<ListCheckRunsResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListCheckRunsResponseBodyResult> getResult() {
        return this.result;
    }

    public ListCheckRunsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCheckRunsResponseBodyResultAnnotations extends TeaModel {
        @NameInMap("annotationLevel")
        public String annotationLevel;

        @NameInMap("endColumn")
        public Long endColumn;

        @NameInMap("endLine")
        public Long endLine;

        @NameInMap("id")
        public Long id;

        @NameInMap("message")
        public String message;

        @NameInMap("path")
        public String path;

        @NameInMap("rawDetails")
        public String rawDetails;

        @NameInMap("startColumn")
        public Long startColumn;

        @NameInMap("startLine")
        public Long startLine;

        @NameInMap("title")
        public String title;

        public static ListCheckRunsResponseBodyResultAnnotations build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRunsResponseBodyResultAnnotations self = new ListCheckRunsResponseBodyResultAnnotations();
            return TeaModel.build(map, self);
        }

        public ListCheckRunsResponseBodyResultAnnotations setAnnotationLevel(String annotationLevel) {
            this.annotationLevel = annotationLevel;
            return this;
        }
        public String getAnnotationLevel() {
            return this.annotationLevel;
        }

        public ListCheckRunsResponseBodyResultAnnotations setEndColumn(Long endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Long getEndColumn() {
            return this.endColumn;
        }

        public ListCheckRunsResponseBodyResultAnnotations setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public ListCheckRunsResponseBodyResultAnnotations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCheckRunsResponseBodyResultAnnotations setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListCheckRunsResponseBodyResultAnnotations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListCheckRunsResponseBodyResultAnnotations setRawDetails(String rawDetails) {
            this.rawDetails = rawDetails;
            return this;
        }
        public String getRawDetails() {
            return this.rawDetails;
        }

        public ListCheckRunsResponseBodyResultAnnotations setStartColumn(Long startColumn) {
            this.startColumn = startColumn;
            return this;
        }
        public Long getStartColumn() {
            return this.startColumn;
        }

        public ListCheckRunsResponseBodyResultAnnotations setStartLine(Long startLine) {
            this.startLine = startLine;
            return this;
        }
        public Long getStartLine() {
            return this.startLine;
        }

        public ListCheckRunsResponseBodyResultAnnotations setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListCheckRunsResponseBodyResultCheckSuite extends TeaModel {
        @NameInMap("id")
        public Long id;

        public static ListCheckRunsResponseBodyResultCheckSuite build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRunsResponseBodyResultCheckSuite self = new ListCheckRunsResponseBodyResultCheckSuite();
            return TeaModel.build(map, self);
        }

        public ListCheckRunsResponseBodyResultCheckSuite setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListCheckRunsResponseBodyResultOutputImages extends TeaModel {
        @NameInMap("alt")
        public String alt;

        @NameInMap("caption")
        public String caption;

        @NameInMap("imageUrl")
        public String imageUrl;

        public static ListCheckRunsResponseBodyResultOutputImages build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRunsResponseBodyResultOutputImages self = new ListCheckRunsResponseBodyResultOutputImages();
            return TeaModel.build(map, self);
        }

        public ListCheckRunsResponseBodyResultOutputImages setAlt(String alt) {
            this.alt = alt;
            return this;
        }
        public String getAlt() {
            return this.alt;
        }

        public ListCheckRunsResponseBodyResultOutputImages setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public ListCheckRunsResponseBodyResultOutputImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class ListCheckRunsResponseBodyResultOutput extends TeaModel {
        @NameInMap("images")
        public java.util.List<ListCheckRunsResponseBodyResultOutputImages> images;

        @NameInMap("summary")
        public String summary;

        @NameInMap("text")
        public String text;

        @NameInMap("title")
        public String title;

        public static ListCheckRunsResponseBodyResultOutput build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRunsResponseBodyResultOutput self = new ListCheckRunsResponseBodyResultOutput();
            return TeaModel.build(map, self);
        }

        public ListCheckRunsResponseBodyResultOutput setImages(java.util.List<ListCheckRunsResponseBodyResultOutputImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<ListCheckRunsResponseBodyResultOutputImages> getImages() {
            return this.images;
        }

        public ListCheckRunsResponseBodyResultOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListCheckRunsResponseBodyResultOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListCheckRunsResponseBodyResultOutput setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListCheckRunsResponseBodyResultWriter extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("logoUrl")
        public String logoUrl;

        @NameInMap("name")
        public String name;

        @NameInMap("slug")
        public String slug;

        @NameInMap("type")
        public String type;

        public static ListCheckRunsResponseBodyResultWriter build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRunsResponseBodyResultWriter self = new ListCheckRunsResponseBodyResultWriter();
            return TeaModel.build(map, self);
        }

        public ListCheckRunsResponseBodyResultWriter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCheckRunsResponseBodyResultWriter setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public ListCheckRunsResponseBodyResultWriter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCheckRunsResponseBodyResultWriter setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public ListCheckRunsResponseBodyResultWriter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListCheckRunsResponseBodyResult extends TeaModel {
        @NameInMap("annotations")
        public java.util.List<ListCheckRunsResponseBodyResultAnnotations> annotations;

        @NameInMap("checkSuite")
        public ListCheckRunsResponseBodyResultCheckSuite checkSuite;

        @NameInMap("completedAt")
        public String completedAt;

        @NameInMap("conclusion")
        public String conclusion;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("detailsUrl")
        public String detailsUrl;

        @NameInMap("externalId")
        public String externalId;

        @NameInMap("headSha")
        public String headSha;

        @NameInMap("id")
        public Long id;

        @NameInMap("name")
        public String name;

        @NameInMap("output")
        public ListCheckRunsResponseBodyResultOutput output;

        @NameInMap("startedAt")
        public String startedAt;

        @NameInMap("status")
        public String status;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("writer")
        public ListCheckRunsResponseBodyResultWriter writer;

        public static ListCheckRunsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCheckRunsResponseBodyResult self = new ListCheckRunsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCheckRunsResponseBodyResult setAnnotations(java.util.List<ListCheckRunsResponseBodyResultAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<ListCheckRunsResponseBodyResultAnnotations> getAnnotations() {
            return this.annotations;
        }

        public ListCheckRunsResponseBodyResult setCheckSuite(ListCheckRunsResponseBodyResultCheckSuite checkSuite) {
            this.checkSuite = checkSuite;
            return this;
        }
        public ListCheckRunsResponseBodyResultCheckSuite getCheckSuite() {
            return this.checkSuite;
        }

        public ListCheckRunsResponseBodyResult setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public ListCheckRunsResponseBodyResult setConclusion(String conclusion) {
            this.conclusion = conclusion;
            return this;
        }
        public String getConclusion() {
            return this.conclusion;
        }

        public ListCheckRunsResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListCheckRunsResponseBodyResult setDetailsUrl(String detailsUrl) {
            this.detailsUrl = detailsUrl;
            return this;
        }
        public String getDetailsUrl() {
            return this.detailsUrl;
        }

        public ListCheckRunsResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public ListCheckRunsResponseBodyResult setHeadSha(String headSha) {
            this.headSha = headSha;
            return this;
        }
        public String getHeadSha() {
            return this.headSha;
        }

        public ListCheckRunsResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCheckRunsResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCheckRunsResponseBodyResult setOutput(ListCheckRunsResponseBodyResultOutput output) {
            this.output = output;
            return this;
        }
        public ListCheckRunsResponseBodyResultOutput getOutput() {
            return this.output;
        }

        public ListCheckRunsResponseBodyResult setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public ListCheckRunsResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCheckRunsResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListCheckRunsResponseBodyResult setWriter(ListCheckRunsResponseBodyResultWriter writer) {
            this.writer = writer;
            return this;
        }
        public ListCheckRunsResponseBodyResultWriter getWriter() {
            return this.writer;
        }

    }

}
