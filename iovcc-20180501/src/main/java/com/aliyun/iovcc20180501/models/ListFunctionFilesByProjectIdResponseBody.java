// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListFunctionFilesByProjectIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Files")
    public java.util.List<ListFunctionFilesByProjectIdResponseBodyFiles> files;

    public static ListFunctionFilesByProjectIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionFilesByProjectIdResponseBody self = new ListFunctionFilesByProjectIdResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFunctionFilesByProjectIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFunctionFilesByProjectIdResponseBody setFiles(java.util.List<ListFunctionFilesByProjectIdResponseBodyFiles> files) {
        this.files = files;
        return this;
    }
    public java.util.List<ListFunctionFilesByProjectIdResponseBodyFiles> getFiles() {
        return this.files;
    }

    public static class ListFunctionFilesByProjectIdResponseBodyFiles extends TeaModel {
        @NameInMap("Type")
        public Integer type;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ContentId")
        public Long contentId;

        public static ListFunctionFilesByProjectIdResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            ListFunctionFilesByProjectIdResponseBodyFiles self = new ListFunctionFilesByProjectIdResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public ListFunctionFilesByProjectIdResponseBodyFiles setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListFunctionFilesByProjectIdResponseBodyFiles setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListFunctionFilesByProjectIdResponseBodyFiles setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListFunctionFilesByProjectIdResponseBodyFiles setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListFunctionFilesByProjectIdResponseBodyFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListFunctionFilesByProjectIdResponseBodyFiles setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListFunctionFilesByProjectIdResponseBodyFiles setContentId(Long contentId) {
            this.contentId = contentId;
            return this;
        }
        public Long getContentId() {
            return this.contentId;
        }

    }

}
