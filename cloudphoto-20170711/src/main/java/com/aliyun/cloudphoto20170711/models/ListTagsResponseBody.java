// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListTagsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Tags")
    public java.util.List<ListTagsResponseBodyTags> tags;

    public static ListTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagsResponseBody self = new ListTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTagsResponseBody setTags(java.util.List<ListTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListTagsResponseBodyTagsCover extends TeaModel {
        @NameInMap("Remark")
        public String remark;

        @NameInMap("State")
        public String state;

        @NameInMap("Height")
        public Long height;

        @NameInMap("FileId")
        public String fileId;

        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Mtime")
        public Long mtime;

        @NameInMap("Ctime")
        public Long ctime;

        @NameInMap("Width")
        public Long width;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("IsVideo")
        public Boolean isVideo;

        @NameInMap("Title")
        public String title;

        @NameInMap("Id")
        public Long id;

        public static ListTagsResponseBodyTagsCover build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTagsCover self = new ListTagsResponseBodyTagsCover();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTagsCover setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListTagsResponseBodyTagsCover setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTagsResponseBodyTagsCover setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public ListTagsResponseBodyTagsCover setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public ListTagsResponseBodyTagsCover setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListTagsResponseBodyTagsCover setMtime(Long mtime) {
            this.mtime = mtime;
            return this;
        }
        public Long getMtime() {
            return this.mtime;
        }

        public ListTagsResponseBodyTagsCover setCtime(Long ctime) {
            this.ctime = ctime;
            return this;
        }
        public Long getCtime() {
            return this.ctime;
        }

        public ListTagsResponseBodyTagsCover setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

        public ListTagsResponseBodyTagsCover setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListTagsResponseBodyTagsCover setIsVideo(Boolean isVideo) {
            this.isVideo = isVideo;
            return this;
        }
        public Boolean getIsVideo() {
            return this.isVideo;
        }

        public ListTagsResponseBodyTagsCover setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListTagsResponseBodyTagsCover setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListTagsResponseBodyTags extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("Cover")
        public ListTagsResponseBodyTagsCover cover;

        @NameInMap("IsSubTag")
        public Boolean isSubTag;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentTag")
        public String parentTag;

        @NameInMap("Id")
        public Long id;

        public static ListTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagsResponseBodyTags self = new ListTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListTagsResponseBodyTags setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListTagsResponseBodyTags setCover(ListTagsResponseBodyTagsCover cover) {
            this.cover = cover;
            return this;
        }
        public ListTagsResponseBodyTagsCover getCover() {
            return this.cover;
        }

        public ListTagsResponseBodyTags setIsSubTag(Boolean isSubTag) {
            this.isSubTag = isSubTag;
            return this;
        }
        public Boolean getIsSubTag() {
            return this.isSubTag;
        }

        public ListTagsResponseBodyTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTagsResponseBodyTags setParentTag(String parentTag) {
            this.parentTag = parentTag;
            return this;
        }
        public String getParentTag() {
            return this.parentTag;
        }

        public ListTagsResponseBodyTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
