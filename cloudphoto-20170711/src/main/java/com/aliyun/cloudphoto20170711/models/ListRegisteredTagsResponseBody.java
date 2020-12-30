// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class ListRegisteredTagsResponseBody extends TeaModel {
    @NameInMap("Action")
    public String action;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegisteredTags")
    public java.util.List<ListRegisteredTagsResponseBodyRegisteredTags> registeredTags;

    @NameInMap("Code")
    public String code;

    public static ListRegisteredTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRegisteredTagsResponseBody self = new ListRegisteredTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRegisteredTagsResponseBody setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListRegisteredTagsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRegisteredTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRegisteredTagsResponseBody setRegisteredTags(java.util.List<ListRegisteredTagsResponseBodyRegisteredTags> registeredTags) {
        this.registeredTags = registeredTags;
        return this;
    }
    public java.util.List<ListRegisteredTagsResponseBodyRegisteredTags> getRegisteredTags() {
        return this.registeredTags;
    }

    public ListRegisteredTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class ListRegisteredTagsResponseBodyRegisteredTagsTagValues extends TeaModel {
        @NameInMap("Lang")
        public String lang;

        @NameInMap("Text")
        public String text;

        public static ListRegisteredTagsResponseBodyRegisteredTagsTagValues build(java.util.Map<String, ?> map) throws Exception {
            ListRegisteredTagsResponseBodyRegisteredTagsTagValues self = new ListRegisteredTagsResponseBodyRegisteredTagsTagValues();
            return TeaModel.build(map, self);
        }

        public ListRegisteredTagsResponseBodyRegisteredTagsTagValues setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListRegisteredTagsResponseBodyRegisteredTagsTagValues setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListRegisteredTagsResponseBodyRegisteredTags extends TeaModel {
        @NameInMap("TagValues")
        public java.util.List<ListRegisteredTagsResponseBodyRegisteredTagsTagValues> tagValues;

        @NameInMap("TagKey")
        public String tagKey;

        public static ListRegisteredTagsResponseBodyRegisteredTags build(java.util.Map<String, ?> map) throws Exception {
            ListRegisteredTagsResponseBodyRegisteredTags self = new ListRegisteredTagsResponseBodyRegisteredTags();
            return TeaModel.build(map, self);
        }

        public ListRegisteredTagsResponseBodyRegisteredTags setTagValues(java.util.List<ListRegisteredTagsResponseBodyRegisteredTagsTagValues> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<ListRegisteredTagsResponseBodyRegisteredTagsTagValues> getTagValues() {
            return this.tagValues;
        }

        public ListRegisteredTagsResponseBodyRegisteredTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

    }

}
