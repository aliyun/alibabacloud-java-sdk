// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class ListTagResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<ListTagResponseBodyTags> tags;

    public static ListTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTagResponseBody self = new ListTagResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTagResponseBody setTags(java.util.List<ListTagResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTagResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class ListTagResponseBodyTags extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Count")
        public Integer count;

        public static ListTagResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            ListTagResponseBodyTags self = new ListTagResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public ListTagResponseBodyTags setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListTagResponseBodyTags setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTagResponseBodyTags setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListTagResponseBodyTags setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
