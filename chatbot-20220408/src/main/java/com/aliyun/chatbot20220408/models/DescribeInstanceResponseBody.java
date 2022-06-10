// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    // 机器人头像的URL
    @NameInMap("Avatar")
    public String avatar;

    // 类目列表
    @NameInMap("Categories")
    public java.util.List<DescribeInstanceResponseBodyCategories> categories;

    // 机器人创建的 UTC 时间
    @NameInMap("CreateTime")
    public String createTime;

    // 机器人状态： EDITING(编辑中)、 PUBLISHED(已发布)
    @NameInMap("EditStatus")
    public String editStatus;

    // 机器人唯一标识
    @NameInMap("InstanceId")
    public String instanceId;

    // 机器人备注
    @NameInMap("Introduction")
    public String introduction;

    // 机器人服务的语言，如zh-cn、en-us
    @NameInMap("LanguageCode")
    public String languageCode;

    // 机器人名称
    @NameInMap("Name")
    public String name;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 机器人类型
    @NameInMap("RobotType")
    public String robotType;

    // 机器人的时区，参考《公共-时区码》
    @NameInMap("TimeZone")
    public String timeZone;

    public static DescribeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceResponseBody self = new DescribeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceResponseBody setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
    public String getAvatar() {
        return this.avatar;
    }

    public DescribeInstanceResponseBody setCategories(java.util.List<DescribeInstanceResponseBodyCategories> categories) {
        this.categories = categories;
        return this;
    }
    public java.util.List<DescribeInstanceResponseBodyCategories> getCategories() {
        return this.categories;
    }

    public DescribeInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeInstanceResponseBody setEditStatus(String editStatus) {
        this.editStatus = editStatus;
        return this;
    }
    public String getEditStatus() {
        return this.editStatus;
    }

    public DescribeInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceResponseBody setIntroduction(String introduction) {
        this.introduction = introduction;
        return this;
    }
    public String getIntroduction() {
        return this.introduction;
    }

    public DescribeInstanceResponseBody setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
    public String getLanguageCode() {
        return this.languageCode;
    }

    public DescribeInstanceResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceResponseBody setRobotType(String robotType) {
        this.robotType = robotType;
        return this;
    }
    public String getRobotType() {
        return this.robotType;
    }

    public DescribeInstanceResponseBody setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public static class DescribeInstanceResponseBodyCategories extends TeaModel {
        // 类目id
        @NameInMap("CategoryId")
        public Long categoryId;

        // 类目名称
        @NameInMap("Name")
        public String name;

        // 父类目id，-1表示根目录
        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        public static DescribeInstanceResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyCategories self = new DescribeInstanceResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyCategories setCategoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public Long getCategoryId() {
            return this.categoryId;
        }

        public DescribeInstanceResponseBodyCategories setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstanceResponseBodyCategories setParentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

    }

}
