// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ListMediasResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Medias")
    public ListMediasResponseBodyMedias medias;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ListMediasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediasResponseBody self = new ListMediasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediasResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMediasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediasResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMediasResponseBody setMedias(ListMediasResponseBodyMedias medias) {
        this.medias = medias;
        return this;
    }
    public ListMediasResponseBodyMedias getMedias() {
        return this.medias;
    }

    public ListMediasResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMediasResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMediasResponseBodyMediasListMedia extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Type")
        public String type;

        @NameInMap("FilePath")
        public String filePath;

        @NameInMap("Instance")
        public String instance;

        @NameInMap("Description")
        public String description;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Content")
        public String content;

        @NameInMap("OssFileName")
        public String ossFileName;

        public static ListMediasResponseBodyMediasListMedia build(java.util.Map<String, ?> map) throws Exception {
            ListMediasResponseBodyMediasListMedia self = new ListMediasResponseBodyMediasListMedia();
            return TeaModel.build(map, self);
        }

        public ListMediasResponseBodyMediasListMedia setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMediasResponseBodyMediasListMedia setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMediasResponseBodyMediasListMedia setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListMediasResponseBodyMediasListMedia setInstance(String instance) {
            this.instance = instance;
            return this;
        }
        public String getInstance() {
            return this.instance;
        }

        public ListMediasResponseBodyMediasListMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMediasResponseBodyMediasListMedia setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListMediasResponseBodyMediasListMedia setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediasResponseBodyMediasListMedia setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListMediasResponseBodyMediasListMedia setOssFileName(String ossFileName) {
            this.ossFileName = ossFileName;
            return this;
        }
        public String getOssFileName() {
            return this.ossFileName;
        }

    }

    public static class ListMediasResponseBodyMediasList extends TeaModel {
        @NameInMap("Media")
        public java.util.List<ListMediasResponseBodyMediasListMedia> media;

        public static ListMediasResponseBodyMediasList build(java.util.Map<String, ?> map) throws Exception {
            ListMediasResponseBodyMediasList self = new ListMediasResponseBodyMediasList();
            return TeaModel.build(map, self);
        }

        public ListMediasResponseBodyMediasList setMedia(java.util.List<ListMediasResponseBodyMediasListMedia> media) {
            this.media = media;
            return this;
        }
        public java.util.List<ListMediasResponseBodyMediasListMedia> getMedia() {
            return this.media;
        }

    }

    public static class ListMediasResponseBodyMedias extends TeaModel {
        @NameInMap("List")
        public ListMediasResponseBodyMediasList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMediasResponseBodyMedias build(java.util.Map<String, ?> map) throws Exception {
            ListMediasResponseBodyMedias self = new ListMediasResponseBodyMedias();
            return TeaModel.build(map, self);
        }

        public ListMediasResponseBodyMedias setList(ListMediasResponseBodyMediasList list) {
            this.list = list;
            return this;
        }
        public ListMediasResponseBodyMediasList getList() {
            return this.list;
        }

        public ListMediasResponseBodyMedias setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListMediasResponseBodyMedias setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMediasResponseBodyMedias setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
