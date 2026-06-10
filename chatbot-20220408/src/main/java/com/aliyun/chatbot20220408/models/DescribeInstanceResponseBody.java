// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class DescribeInstanceResponseBody extends TeaModel {
    /**
     * <p>The URL of the robot\&quot;s avatar.</p>
     * 
     * <strong>example:</strong>
     * <p>/alimefe/meebot/robot/0.0.5/img/xxx-90-97.png</p>
     */
    @NameInMap("Avatar")
    public String avatar;

    /**
     * <p>A list of categories.</p>
     */
    @NameInMap("Categories")
    public java.util.List<DescribeInstanceResponseBodyCategories> categories;

    /**
     * <p>The UTC time when the robot was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-08-12T16:00:01Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The status of the robot.</p>
     * 
     * <strong>example:</strong>
     * <p>PUBLISHED</p>
     */
    @NameInMap("EditStatus")
    public String editStatus;

    /**
     * <p>The unique identifier of the robot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The robot\&quot;s introduction.</p>
     * 
     * <strong>example:</strong>
     * <p>用于C端问答的机器人</p>
     */
    @NameInMap("Introduction")
    public String introduction;

    /**
     * <p>The language of the robot, such as zh-cn and en-us.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-cn</p>
     */
    @NameInMap("LanguageCode")
    public String languageCode;

    /**
     * <p>The robot name.</p>
     * 
     * <strong>example:</strong>
     * <p>智能客服-小C</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>907AA5F2-0521-49AB-80AB-1ADEFAB2B901</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The robot type.</p>
     * 
     * <strong>example:</strong>
     * <p>scenario_im</p>
     */
    @NameInMap("RobotType")
    public String robotType;

    /**
     * <p>The time zone of the robot. For more information, see Time zone codes.</p>
     * 
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
         * <p>The ability type of the category, such as FAQ or MRC.</p>
         * 
         * <strong>example:</strong>
         * <p>FAQ</p>
         */
        @NameInMap("AbilityType")
        public String abilityType;

        /**
         * <p>The category ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000066832</p>
         */
        @NameInMap("CategoryId")
        public Long categoryId;

        /**
         * <p>The category name.</p>
         * 
         * <strong>example:</strong>
         * <p>杭州市防疫政策</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The parent category ID. A value of -1 indicates the root directory.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ParentCategoryId")
        public Long parentCategoryId;

        public static DescribeInstanceResponseBodyCategories build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceResponseBodyCategories self = new DescribeInstanceResponseBodyCategories();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceResponseBodyCategories setAbilityType(String abilityType) {
            this.abilityType = abilityType;
            return this;
        }
        public String getAbilityType() {
            return this.abilityType;
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
