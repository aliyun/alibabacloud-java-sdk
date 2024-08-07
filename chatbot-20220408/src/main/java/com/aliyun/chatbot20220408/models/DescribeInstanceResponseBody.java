// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>/alimefe/meebot/robot/0.0.5/img/xxx-90-97.png</p>
     */
    @NameInMap("Avatar")
    public String avatar;

    @NameInMap("Categories")
    public java.util.List<DescribeInstanceResponseBodyCategories> categories;

    /**
     * <strong>example:</strong>
     * <p>2021-08-12T16:00:01Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>PUBLISHED</p>
     */
    @NameInMap("EditStatus")
    public String editStatus;

    /**
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>用于C端问答的机器人</p>
     */
    @NameInMap("Introduction")
    public String introduction;

    /**
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("LanguageCode")
    public String languageCode;

    /**
     * <strong>example:</strong>
     * <p>智能客服-小C</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>907AA5F2-0521-49AB-80AB-1ADEFAB2B901</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>scenario_im</p>
     */
    @NameInMap("RobotType")
    public String robotType;

    /**
     * <strong>example:</strong>
     * <p>Asia/Chongqing</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>30000066832</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <strong>example:</strong>
         * <p>杭州市防疫政策</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>-1</p>
         */
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
