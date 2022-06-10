// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListInstanceResponseBody extends TeaModel {
    // 机器人列表信息
    @NameInMap("Instances")
    public java.util.List<ListInstanceResponseBodyInstances> instances;

    // 分页-第几页
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 分页-页面大小
    @NameInMap("PageSize")
    public Long pageSize;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 总条数
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceResponseBody self = new ListInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceResponseBody setInstances(java.util.List<ListInstanceResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstanceResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstanceResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListInstanceResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstanceResponseBodyInstances extends TeaModel {
        // 机器人头像的URL
        @NameInMap("Avatar")
        public String avatar;

        // 机器人创建的 UTC 时间
        @NameInMap("CreateTime")
        public String createTime;

        // 机器人唯一标识
        @NameInMap("InstanceId")
        public String instanceId;

        // 机器人备注
        @NameInMap("Introduction")
        public String introduction;

        // 机器人服务的语言
        @NameInMap("LanguageCode")
        public String languageCode;

        // 机器人名称
        @NameInMap("Name")
        public String name;

        // 机器人类型
        @NameInMap("RobotType")
        public String robotType;

        public static ListInstanceResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceResponseBodyInstances self = new ListInstanceResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstanceResponseBodyInstances setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public ListInstanceResponseBodyInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListInstanceResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceResponseBodyInstances setIntroduction(String introduction) {
            this.introduction = introduction;
            return this;
        }
        public String getIntroduction() {
            return this.introduction;
        }

        public ListInstanceResponseBodyInstances setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

        public ListInstanceResponseBodyInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstanceResponseBodyInstances setRobotType(String robotType) {
            this.robotType = robotType;
            return this;
        }
        public String getRobotType() {
            return this.robotType;
        }

    }

}
