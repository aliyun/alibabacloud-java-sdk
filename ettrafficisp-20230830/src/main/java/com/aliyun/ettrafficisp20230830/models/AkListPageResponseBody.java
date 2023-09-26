// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkListPageResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public AkListPageResponseBodyData data;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    public static AkListPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AkListPageResponseBody self = new AkListPageResponseBody();
        return TeaModel.build(map, self);
    }

    public AkListPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AkListPageResponseBody setData(AkListPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AkListPageResponseBodyData getData() {
        return this.data;
    }

    public AkListPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AkListPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AkListPageResponseBodyDataDataListPermissions extends TeaModel {
        @NameInMap("authTime")
        public String authTime;

        @NameInMap("description")
        public String description;

        @NameInMap("group")
        public String group;

        @NameInMap("permissionCode")
        public String permissionCode;

        @NameInMap("permissionName")
        public String permissionName;

        public static AkListPageResponseBodyDataDataListPermissions build(java.util.Map<String, ?> map) throws Exception {
            AkListPageResponseBodyDataDataListPermissions self = new AkListPageResponseBodyDataDataListPermissions();
            return TeaModel.build(map, self);
        }

        public AkListPageResponseBodyDataDataListPermissions setAuthTime(String authTime) {
            this.authTime = authTime;
            return this;
        }
        public String getAuthTime() {
            return this.authTime;
        }

        public AkListPageResponseBodyDataDataListPermissions setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public AkListPageResponseBodyDataDataListPermissions setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public AkListPageResponseBodyDataDataListPermissions setPermissionCode(String permissionCode) {
            this.permissionCode = permissionCode;
            return this;
        }
        public String getPermissionCode() {
            return this.permissionCode;
        }

        public AkListPageResponseBodyDataDataListPermissions setPermissionName(String permissionName) {
            this.permissionName = permissionName;
            return this;
        }
        public String getPermissionName() {
            return this.permissionName;
        }

    }

    public static class AkListPageResponseBodyDataDataList extends TeaModel {
        @NameInMap("accessKeyId")
        public String accessKeyId;

        @NameInMap("accessKeyName")
        public String accessKeyName;

        @NameInMap("accessKeySecret")
        public String accessKeySecret;

        @NameInMap("active")
        public Integer active;

        @NameInMap("gmtCreate")
        public String gmtCreate;

        @NameInMap("gmtModify")
        public String gmtModify;

        @NameInMap("lastCallTime")
        public String lastCallTime;

        @NameInMap("permissions")
        public java.util.List<AkListPageResponseBodyDataDataListPermissions> permissions;

        public static AkListPageResponseBodyDataDataList build(java.util.Map<String, ?> map) throws Exception {
            AkListPageResponseBodyDataDataList self = new AkListPageResponseBodyDataDataList();
            return TeaModel.build(map, self);
        }

        public AkListPageResponseBodyDataDataList setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public AkListPageResponseBodyDataDataList setAccessKeyName(String accessKeyName) {
            this.accessKeyName = accessKeyName;
            return this;
        }
        public String getAccessKeyName() {
            return this.accessKeyName;
        }

        public AkListPageResponseBodyDataDataList setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public AkListPageResponseBodyDataDataList setActive(Integer active) {
            this.active = active;
            return this;
        }
        public Integer getActive() {
            return this.active;
        }

        public AkListPageResponseBodyDataDataList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public AkListPageResponseBodyDataDataList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public AkListPageResponseBodyDataDataList setLastCallTime(String lastCallTime) {
            this.lastCallTime = lastCallTime;
            return this;
        }
        public String getLastCallTime() {
            return this.lastCallTime;
        }

        public AkListPageResponseBodyDataDataList setPermissions(java.util.List<AkListPageResponseBodyDataDataListPermissions> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<AkListPageResponseBodyDataDataListPermissions> getPermissions() {
            return this.permissions;
        }

    }

    public static class AkListPageResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Integer count;

        @NameInMap("currentPage")
        public Integer currentPage;

        @NameInMap("dataList")
        public java.util.List<AkListPageResponseBodyDataDataList> dataList;

        @NameInMap("totalPage")
        public Integer totalPage;

        public static AkListPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AkListPageResponseBodyData self = new AkListPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AkListPageResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public AkListPageResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public AkListPageResponseBodyData setDataList(java.util.List<AkListPageResponseBodyDataDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<AkListPageResponseBodyDataDataList> getDataList() {
            return this.dataList;
        }

        public AkListPageResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
