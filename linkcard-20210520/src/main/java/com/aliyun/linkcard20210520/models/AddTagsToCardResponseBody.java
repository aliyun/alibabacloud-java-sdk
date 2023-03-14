// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddTagsToCardResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<AddTagsToCardResponseBodyData> data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddTagsToCardResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTagsToCardResponseBody self = new AddTagsToCardResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTagsToCardResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddTagsToCardResponseBody setData(java.util.List<AddTagsToCardResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AddTagsToCardResponseBodyData> getData() {
        return this.data;
    }

    public AddTagsToCardResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddTagsToCardResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTagsToCardResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddTagsToCardResponseBodyData extends TeaModel {
        @NameInMap("TagId")
        public String tagId;

        @NameInMap("TagName")
        public String tagName;

        public static AddTagsToCardResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddTagsToCardResponseBodyData self = new AddTagsToCardResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddTagsToCardResponseBodyData setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public AddTagsToCardResponseBodyData setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

}
