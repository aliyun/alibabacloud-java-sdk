// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListPhotoTagsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Tags")
    public java.util.List<ListPhotoTagsResponseBodyTags> tags;

    public static ListPhotoTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhotoTagsResponseBody self = new ListPhotoTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhotoTagsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListPhotoTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPhotoTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPhotoTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPhotoTagsResponseBody setTags(java.util.List<ListPhotoTagsResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListPhotoTagsResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListPhotoTagsResponseBodyTags extends TeaModel {
        @NameInMap("IdStr")
        public String idStr;

        @NameInMap("IsSubTag")
        public Boolean isSubTag;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentTag")
        public String parentTag;

        @NameInMap("Id")
        public Long id;

        public static ListPhotoTagsResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListPhotoTagsResponseBodyTags self = new ListPhotoTagsResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListPhotoTagsResponseBodyTags setIdStr(String idStr) {
            this.idStr = idStr;
            return this;
        }
        public String getIdStr() {
            return this.idStr;
        }

        public ListPhotoTagsResponseBodyTags setIsSubTag(Boolean isSubTag) {
            this.isSubTag = isSubTag;
            return this;
        }
        public Boolean getIsSubTag() {
            return this.isSubTag;
        }

        public ListPhotoTagsResponseBodyTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPhotoTagsResponseBodyTags setParentTag(String parentTag) {
            this.parentTag = parentTag;
            return this;
        }
        public String getParentTag() {
            return this.parentTag;
        }

        public ListPhotoTagsResponseBodyTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

}
