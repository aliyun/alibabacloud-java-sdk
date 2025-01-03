// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListHostGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("hostGroups")
    public java.util.List<ListHostGroupsResponseBodyHostGroups> hostGroups;

    /**
     * <strong>example:</strong>
     * <p>asassasassa</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListHostGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHostGroupsResponseBody self = new ListHostGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHostGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListHostGroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListHostGroupsResponseBody setHostGroups(java.util.List<ListHostGroupsResponseBodyHostGroups> hostGroups) {
        this.hostGroups = hostGroups;
        return this;
    }
    public java.util.List<ListHostGroupsResponseBodyHostGroups> getHostGroups() {
        return this.hostGroups;
    }

    public ListHostGroupsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListHostGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHostGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListHostGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListHostGroupsResponseBodyHostGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("aliyunRegion")
        public String aliyunRegion;

        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("createTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>2222222222222</p>
         */
        @NameInMap("creatorAccountId")
        public String creatorAccountId;

        /**
         * <strong>example:</strong>
         * <p>主机组</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("ecsLabelKey")
        public String ecsLabelKey;

        /**
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("ecsLabelValue")
        public String ecsLabelValue;

        /**
         * <strong>example:</strong>
         * <p>ECS_ALIYUN</p>
         */
        @NameInMap("ecsType")
        public String ecsType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("hostNum")
        public Long hostNum;

        /**
         * <p>323232</p>
         * 
         * <strong>example:</strong>
         * <p>部署组Id</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>211111111</p>
         */
        @NameInMap("modifierAccountId")
        public String modifierAccountId;

        /**
         * <strong>example:</strong>
         * <p>部署组</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1212122</p>
         */
        @NameInMap("serviceConnectionId")
        public Long serviceConnectionId;

        /**
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>1586863220000</p>
         */
        @NameInMap("updateTime")
        public Long updateTime;

        public static ListHostGroupsResponseBodyHostGroups build(java.util.Map<String, ?> map) throws Exception {
            ListHostGroupsResponseBodyHostGroups self = new ListHostGroupsResponseBodyHostGroups();
            return TeaModel.build(map, self);
        }

        public ListHostGroupsResponseBodyHostGroups setAliyunRegion(String aliyunRegion) {
            this.aliyunRegion = aliyunRegion;
            return this;
        }
        public String getAliyunRegion() {
            return this.aliyunRegion;
        }

        public ListHostGroupsResponseBodyHostGroups setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListHostGroupsResponseBodyHostGroups setCreatorAccountId(String creatorAccountId) {
            this.creatorAccountId = creatorAccountId;
            return this;
        }
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        public ListHostGroupsResponseBodyHostGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListHostGroupsResponseBodyHostGroups setEcsLabelKey(String ecsLabelKey) {
            this.ecsLabelKey = ecsLabelKey;
            return this;
        }
        public String getEcsLabelKey() {
            return this.ecsLabelKey;
        }

        public ListHostGroupsResponseBodyHostGroups setEcsLabelValue(String ecsLabelValue) {
            this.ecsLabelValue = ecsLabelValue;
            return this;
        }
        public String getEcsLabelValue() {
            return this.ecsLabelValue;
        }

        public ListHostGroupsResponseBodyHostGroups setEcsType(String ecsType) {
            this.ecsType = ecsType;
            return this;
        }
        public String getEcsType() {
            return this.ecsType;
        }

        public ListHostGroupsResponseBodyHostGroups setHostNum(Long hostNum) {
            this.hostNum = hostNum;
            return this;
        }
        public Long getHostNum() {
            return this.hostNum;
        }

        public ListHostGroupsResponseBodyHostGroups setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListHostGroupsResponseBodyHostGroups setModifierAccountId(String modifierAccountId) {
            this.modifierAccountId = modifierAccountId;
            return this;
        }
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        public ListHostGroupsResponseBodyHostGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListHostGroupsResponseBodyHostGroups setServiceConnectionId(Long serviceConnectionId) {
            this.serviceConnectionId = serviceConnectionId;
            return this;
        }
        public Long getServiceConnectionId() {
            return this.serviceConnectionId;
        }

        public ListHostGroupsResponseBodyHostGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListHostGroupsResponseBodyHostGroups setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
