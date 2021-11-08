// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class DescribeBotResponseBody extends TeaModel {
    @NameInMap("Avatar")
    public String avatar;

    @NameInMap("Categories")
    public java.util.List<DescribeBotResponseBodyCategories> categories;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Introduction")
    public String introduction;

    @NameInMap("LanguageCode")
    public String languageCode;

    @NameInMap("Logo")
    public String logo;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimeZone")
    public String timeZone;

    public static DescribeBotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBotResponseBody self = new DescribeBotResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBotResponseBody setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public DescribeBotResponseBody setCategories(java.util.List<DescribeBotResponseBodyCategories> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<DescribeBotResponseBodyCategories> getCategories() {
        return this.categories;
    }

    public DescribeBotResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeBotResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeBotResponseBody setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public DescribeBotResponseBody setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }

    public DescribeBotResponseBody setLogo(String logo) {
        this.logo = logo;
        return this;
    }
    public String getLogo() {
        return this.logo;
    }

    public DescribeBotResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeBotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBotResponseBody setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public static class DescribeBotResponseBodyCategories extends TeaModel {
        @NameInMap("CategoryId")
        public Long categoryId;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        public static DescribeBotResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeBotResponseBodyCategories self = new DescribeBotResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public DescribeBotResponseBodyCategories setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public DescribeBotResponseBodyCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBotResponseBodyCategories setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

}
