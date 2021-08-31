// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListHostGroupsResponseBody extends TeaModel {
    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    // 主机组
    @NameInMap("hostGroups")
    public java.util.List<ListHostGroupsResponseBodyHostGroups> hostGroups;

    // 总数
    @NameInMap("totalCount")
    public Long totalCount;

    // 分页token,空表示最后一页
    @NameInMap("nextToken")
    public String nextToken;

    public static ListHostGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsResponseBody self = new ListHostGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListHostGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListHostGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListHostGroupsResponseBody setHostGroups(java.util.List<ListHostGroupsResponseBodyHostGroups> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public java.util.List<ListHostGroupsResponseBodyHostGroups> getHostGroups() {
        return this.hostGroups;
    }

    public ListHostGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListHostGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListHostGroupsResponseBodyHostGroups extends TeaModel {
        // 创建人阿里云账号id
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        // 更新时间
        @NameInMap("updateTime")
        public Long updateTime;

        // 主机个数
        @NameInMap("hostNum")
        public Long hostNum;

        // 修改人阿里云账号id
        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        // 描述
        @NameInMap("description")
        public String description;

        // 类型
        @NameInMap("type")
        public String type;

        // 主机时间
        @NameInMap("createTime")
        public Long createTime;

        // 主机类型
        @NameInMap("ecsType")
        public String ecsType;

        // 阿里云区域
        @NameInMap("aliyunRegion")
        public String aliyunRegion;

        // ecs标签Key
        @NameInMap("ecsLabelKey")
        public String ecsLabelKey;

        // 部署组名称
        @NameInMap("name")
        public String name;

        // 323232
        @NameInMap("id")
        public Long id;

        // 服务连接Id
        @NameInMap("serviceConnectionId")
        public Long serviceConnectionId;

        // Ecs标签值
        @NameInMap("ecsLabelValue")
        public String ecsLabelValue;

        public static ListHostGroupsResponseBodyHostGroups build(java.util.Map<String, ?> map) throws Exception {
            ListHostGroupsResponseBodyHostGroups self = new ListHostGroupsResponseBodyHostGroups();
            return TeaModel.build(map, self);
        }

        public ListHostGroupsResponseBodyHostGroups setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public ListHostGroupsResponseBodyHostGroups setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListHostGroupsResponseBodyHostGroups setHostNum(Long hostNum) {
            this.hostNum = hostNum;
            return this;
        }
        public Long getHostNum() {
            return this.hostNum;
        }

        public ListHostGroupsResponseBodyHostGroups setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public ListHostGroupsResponseBodyHostGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHostGroupsResponseBodyHostGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHostGroupsResponseBodyHostGroups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListHostGroupsResponseBodyHostGroups setEcsType(String ecsType) {
            this.ecsType = ecsType;
            return this;
        }
        public String getEcsType() {
            return this.ecsType;
        }

        public ListHostGroupsResponseBodyHostGroups setAliyunRegion(String aliyunRegion) {
            this.aliyunRegion = aliyunRegion;
            return this;
        }
        public String getAliyunRegion() {
            return this.aliyunRegion;
        }

        public ListHostGroupsResponseBodyHostGroups setEcsLabelKey(String ecsLabelKey) {
            this.ecsLabelKey = ecsLabelKey;
            return this;
        }
        public String getEcsLabelKey() {
            return this.ecsLabelKey;
        }

        public ListHostGroupsResponseBodyHostGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHostGroupsResponseBodyHostGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListHostGroupsResponseBodyHostGroups setServiceConnectionId(Long serviceConnectionId) {
            this.serviceConnectionId = serviceConnectionId;
            return this;
        }
        public Long getServiceConnectionId() {
            return this.serviceConnectionId;
        }

        public ListHostGroupsResponseBodyHostGroups setEcsLabelValue(String ecsLabelValue) {
            this.ecsLabelValue = ecsLabelValue;
            return this;
        }
        public String getEcsLabelValue() {
            return this.ecsLabelValue;
        }

    }

}
