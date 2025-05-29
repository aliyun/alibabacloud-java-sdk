// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.consolecs20160406.models;

import com.aliyun.tea.*;

public class ListConsoleProductResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListConsoleProductResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListConsoleProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListConsoleProductResponseBody self = new ListConsoleProductResponseBody();
        return TeaModel.build(map, self);
    }

    public ListConsoleProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListConsoleProductResponseBody setData(java.util.List<ListConsoleProductResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListConsoleProductResponseBodyData> getData() {
        return this.data;
    }

    public ListConsoleProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListConsoleProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListConsoleProductResponseBodyData extends TeaModel {
        @NameInMap("BelongedCategory")
        public String belongedCategory;

        @NameInMap("Categories")
        public java.util.List<String> categories;

        @NameInMap("ChannelLinks")
        public java.util.List<String> channelLinks;

        @NameInMap("DocId")
        public String docId;

        @NameInMap("Keywords")
        public java.util.List<String> keywords;

        @NameInMap("Names")
        public String names;

        @NameInMap("Pinyin")
        public String pinyin;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("RelatedConsoleAppId")
        public String relatedConsoleAppId;

        @NameInMap("RelatedPipId")
        public String relatedPipId;

        @NameInMap("ShowInNav")
        public Boolean showInNav;

        @NameInMap("SupportedAccounts")
        public java.util.List<String> supportedAccounts;

        @NameInMap("SupportedChannels")
        public java.util.List<String> supportedChannels;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("TagExpireTime")
        public String tagExpireTime;

        public static ListConsoleProductResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListConsoleProductResponseBodyData self = new ListConsoleProductResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListConsoleProductResponseBodyData setBelongedCategory(String belongedCategory) {
            this.belongedCategory = belongedCategory;
            return this;
        }
        public String getBelongedCategory() {
            return this.belongedCategory;
        }

        public ListConsoleProductResponseBodyData setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        public ListConsoleProductResponseBodyData setChannelLinks(java.util.List<String> channelLinks) {
            this.channelLinks = channelLinks;
            return this;
        }
        public java.util.List<String> getChannelLinks() {
            return this.channelLinks;
        }

        public ListConsoleProductResponseBodyData setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public ListConsoleProductResponseBodyData setKeywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }
        public java.util.List<String> getKeywords() {
            return this.keywords;
        }

        public ListConsoleProductResponseBodyData setNames(String names) {
            this.names = names;
            return this;
        }
        public String getNames() {
            return this.names;
        }

        public ListConsoleProductResponseBodyData setPinyin(String pinyin) {
            this.pinyin = pinyin;
            return this;
        }
        public String getPinyin() {
            return this.pinyin;
        }

        public ListConsoleProductResponseBodyData setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListConsoleProductResponseBodyData setRelatedConsoleAppId(String relatedConsoleAppId) {
            this.relatedConsoleAppId = relatedConsoleAppId;
            return this;
        }
        public String getRelatedConsoleAppId() {
            return this.relatedConsoleAppId;
        }

        public ListConsoleProductResponseBodyData setRelatedPipId(String relatedPipId) {
            this.relatedPipId = relatedPipId;
            return this;
        }
        public String getRelatedPipId() {
            return this.relatedPipId;
        }

        public ListConsoleProductResponseBodyData setShowInNav(Boolean showInNav) {
            this.showInNav = showInNav;
            return this;
        }
        public Boolean getShowInNav() {
            return this.showInNav;
        }

        public ListConsoleProductResponseBodyData setSupportedAccounts(java.util.List<String> supportedAccounts) {
            this.supportedAccounts = supportedAccounts;
            return this;
        }
        public java.util.List<String> getSupportedAccounts() {
            return this.supportedAccounts;
        }

        public ListConsoleProductResponseBodyData setSupportedChannels(java.util.List<String> supportedChannels) {
            this.supportedChannels = supportedChannels;
            return this;
        }
        public java.util.List<String> getSupportedChannels() {
            return this.supportedChannels;
        }

        public ListConsoleProductResponseBodyData setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListConsoleProductResponseBodyData setTagExpireTime(String tagExpireTime) {
            this.tagExpireTime = tagExpireTime;
            return this;
        }
        public String getTagExpireTime() {
            return this.tagExpireTime;
        }

    }

}
