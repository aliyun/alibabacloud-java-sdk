// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetCheckRunResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public GetCheckRunResponseBodyResult result;

    @NameInMap("success")
    public Boolean success;

    public static GetCheckRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCheckRunResponseBody self = new GetCheckRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCheckRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetCheckRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCheckRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCheckRunResponseBody setResult(GetCheckRunResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCheckRunResponseBodyResult getResult() {
        return this.result;
    }

    public GetCheckRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCheckRunResponseBodyResultAnnotations extends TeaModel {
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

        public static GetCheckRunResponseBodyResultAnnotations build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRunResponseBodyResultAnnotations self = new GetCheckRunResponseBodyResultAnnotations();
            return TeaModel.build(map, self);
        }

        public GetCheckRunResponseBodyResultAnnotations setAnnotationLevel(String annotationLevel) {
            this.annotationLevel = annotationLevel;
            return this;
        }
        public String getAnnotationLevel() {
            return this.annotationLevel;
        }

        public GetCheckRunResponseBodyResultAnnotations setEndColumn(Long endColumn) {
            this.endColumn = endColumn;
            return this;
        }
        public Long getEndColumn() {
            return this.endColumn;
        }

        public GetCheckRunResponseBodyResultAnnotations setEndLine(Long endLine) {
            this.endLine = endLine;
            return this;
        }
        public Long getEndLine() {
            return this.endLine;
        }

        public GetCheckRunResponseBodyResultAnnotations setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCheckRunResponseBodyResultAnnotations setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetCheckRunResponseBodyResultAnnotations setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetCheckRunResponseBodyResultAnnotations setRawDetails(String rawDetails) {
            this.rawDetails = rawDetails;
            return this;
        }
        public String getRawDetails() {
            return this.rawDetails;
        }

        public GetCheckRunResponseBodyResultAnnotations setStartColumn(Long startColumn) {
            this.startColumn = startColumn;
            return this;
        }
        public Long getStartColumn() {
            return this.startColumn;
        }

        public GetCheckRunResponseBodyResultAnnotations setStartLine(Long startLine) {
            this.startLine = startLine;
            return this;
        }
        public Long getStartLine() {
            return this.startLine;
        }

        public GetCheckRunResponseBodyResultAnnotations setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetCheckRunResponseBodyResultCheckSuite extends TeaModel {
        @NameInMap("id")
        public Long id;

        public static GetCheckRunResponseBodyResultCheckSuite build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRunResponseBodyResultCheckSuite self = new GetCheckRunResponseBodyResultCheckSuite();
            return TeaModel.build(map, self);
        }

        public GetCheckRunResponseBodyResultCheckSuite setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class GetCheckRunResponseBodyResultOutputImages extends TeaModel {
        @NameInMap("alt")
        public String alt;

        @NameInMap("caption")
        public String caption;

        @NameInMap("imageUrl")
        public String imageUrl;

        public static GetCheckRunResponseBodyResultOutputImages build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRunResponseBodyResultOutputImages self = new GetCheckRunResponseBodyResultOutputImages();
            return TeaModel.build(map, self);
        }

        public GetCheckRunResponseBodyResultOutputImages setAlt(String alt) {
            this.alt = alt;
            return this;
        }
        public String getAlt() {
            return this.alt;
        }

        public GetCheckRunResponseBodyResultOutputImages setCaption(String caption) {
            this.caption = caption;
            return this;
        }
        public String getCaption() {
            return this.caption;
        }

        public GetCheckRunResponseBodyResultOutputImages setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

    }

    public static class GetCheckRunResponseBodyResultOutput extends TeaModel {
        @NameInMap("images")
        public java.util.List<GetCheckRunResponseBodyResultOutputImages> images;

        @NameInMap("summary")
        public String summary;

        @NameInMap("text")
        public String text;

        @NameInMap("title")
        public String title;

        public static GetCheckRunResponseBodyResultOutput build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRunResponseBodyResultOutput self = new GetCheckRunResponseBodyResultOutput();
            return TeaModel.build(map, self);
        }

        public GetCheckRunResponseBodyResultOutput setImages(java.util.List<GetCheckRunResponseBodyResultOutputImages> images) {
            this.images = images;
            return this;
        }
        public java.util.List<GetCheckRunResponseBodyResultOutputImages> getImages() {
            return this.images;
        }

        public GetCheckRunResponseBodyResultOutput setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public GetCheckRunResponseBodyResultOutput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetCheckRunResponseBodyResultOutput setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetCheckRunResponseBodyResultWriter extends TeaModel {
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

        public static GetCheckRunResponseBodyResultWriter build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRunResponseBodyResultWriter self = new GetCheckRunResponseBodyResultWriter();
            return TeaModel.build(map, self);
        }

        public GetCheckRunResponseBodyResultWriter setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCheckRunResponseBodyResultWriter setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }
        public String getLogoUrl() {
            return this.logoUrl;
        }

        public GetCheckRunResponseBodyResultWriter setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCheckRunResponseBodyResultWriter setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public GetCheckRunResponseBodyResultWriter setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetCheckRunResponseBodyResult extends TeaModel {
        @NameInMap("annotations")
        public java.util.List<GetCheckRunResponseBodyResultAnnotations> annotations;

        @NameInMap("checkSuite")
        public GetCheckRunResponseBodyResultCheckSuite checkSuite;

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
        public GetCheckRunResponseBodyResultOutput output;

        @NameInMap("startedAt")
        public String startedAt;

        @NameInMap("status")
        public String status;

        @NameInMap("updatedAt")
        public String updatedAt;

        @NameInMap("writer")
        public GetCheckRunResponseBodyResultWriter writer;

        public static GetCheckRunResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCheckRunResponseBodyResult self = new GetCheckRunResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCheckRunResponseBodyResult setAnnotations(java.util.List<GetCheckRunResponseBodyResultAnnotations> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.List<GetCheckRunResponseBodyResultAnnotations> getAnnotations() {
            return this.annotations;
        }

        public GetCheckRunResponseBodyResult setCheckSuite(GetCheckRunResponseBodyResultCheckSuite checkSuite) {
            this.checkSuite = checkSuite;
            return this;
        }
        public GetCheckRunResponseBodyResultCheckSuite getCheckSuite() {
            return this.checkSuite;
        }

        public GetCheckRunResponseBodyResult setCompletedAt(String completedAt) {
            this.completedAt = completedAt;
            return this;
        }
        public String getCompletedAt() {
            return this.completedAt;
        }

        public GetCheckRunResponseBodyResult setConclusion(String conclusion) {
            this.conclusion = conclusion;
            return this;
        }
        public String getConclusion() {
            return this.conclusion;
        }

        public GetCheckRunResponseBodyResult setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetCheckRunResponseBodyResult setDetailsUrl(String detailsUrl) {
            this.detailsUrl = detailsUrl;
            return this;
        }
        public String getDetailsUrl() {
            return this.detailsUrl;
        }

        public GetCheckRunResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetCheckRunResponseBodyResult setHeadSha(String headSha) {
            this.headSha = headSha;
            return this;
        }
        public String getHeadSha() {
            return this.headSha;
        }

        public GetCheckRunResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCheckRunResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCheckRunResponseBodyResult setOutput(GetCheckRunResponseBodyResultOutput output) {
            this.output = output;
            return this;
        }
        public GetCheckRunResponseBodyResultOutput getOutput() {
            return this.output;
        }

        public GetCheckRunResponseBodyResult setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetCheckRunResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCheckRunResponseBodyResult setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetCheckRunResponseBodyResult setWriter(GetCheckRunResponseBodyResultWriter writer) {
            this.writer = writer;
            return this;
        }
        public GetCheckRunResponseBodyResultWriter getWriter() {
            return this.writer;
        }

    }

}
