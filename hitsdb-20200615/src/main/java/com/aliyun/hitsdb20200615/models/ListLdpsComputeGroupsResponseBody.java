// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class ListLdpsComputeGroupsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("GroupList")
    public java.util.List<ListLdpsComputeGroupsResponseBodyGroupList> groupList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListLdpsComputeGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLdpsComputeGroupsResponseBody self = new ListLdpsComputeGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLdpsComputeGroupsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListLdpsComputeGroupsResponseBody setGroupList(java.util.List<ListLdpsComputeGroupsResponseBodyGroupList> groupList) {
        this.groupList = groupList;
        return this;
    }
    public java.util.List<ListLdpsComputeGroupsResponseBodyGroupList> getGroupList() {
        return this.groupList;
    }

    public ListLdpsComputeGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListLdpsComputeGroupsResponseBodyGroupList extends TeaModel {
        @NameInMap("ExceptionInfo")
        public String exceptionInfo;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("Properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("RayInteractiveAccessAddr")
        public String rayInteractiveAccessAddr;

        @NameInMap("RayVpcWebUIAddr")
        public String rayVpcWebUIAddr;

        @NameInMap("State")
        public String state;

        @NameInMap("WebUI")
        public String webUI;

        public static ListLdpsComputeGroupsResponseBodyGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListLdpsComputeGroupsResponseBodyGroupList self = new ListLdpsComputeGroupsResponseBodyGroupList();
            return TeaModel.build(map, self);
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setExceptionInfo(String exceptionInfo) {
            this.exceptionInfo = exceptionInfo;
            return this;
        }
        public String getExceptionInfo() {
            return this.exceptionInfo;
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setRayInteractiveAccessAddr(String rayInteractiveAccessAddr) {
            this.rayInteractiveAccessAddr = rayInteractiveAccessAddr;
            return this;
        }
        public String getRayInteractiveAccessAddr() {
            return this.rayInteractiveAccessAddr;
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setRayVpcWebUIAddr(String rayVpcWebUIAddr) {
            this.rayVpcWebUIAddr = rayVpcWebUIAddr;
            return this;
        }
        public String getRayVpcWebUIAddr() {
            return this.rayVpcWebUIAddr;
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListLdpsComputeGroupsResponseBodyGroupList setWebUI(String webUI) {
            this.webUI = webUI;
            return this;
        }
        public String getWebUI() {
            return this.webUI;
        }

    }

}
