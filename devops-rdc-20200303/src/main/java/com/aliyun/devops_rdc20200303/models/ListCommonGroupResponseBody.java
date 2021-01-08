// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListCommonGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public java.util.List<ListCommonGroupResponseBodyObject> object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static ListCommonGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCommonGroupResponseBody self = new ListCommonGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCommonGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCommonGroupResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListCommonGroupResponseBody setObject(java.util.List<ListCommonGroupResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<ListCommonGroupResponseBodyObject> getObject() {
        return this.object;
    }

    public ListCommonGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListCommonGroupResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class ListCommonGroupResponseBodyObject extends TeaModel {
        @NameInMap("ResourceCount")
        public Integer resourceCount;

        @NameInMap("SmartGroupId")
        public String smartGroupId;

        @NameInMap("Pos")
        public Integer pos;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("IsRoot")
        public Boolean isRoot;

        @NameInMap("Pinyin")
        public String pinyin;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Name")
        public String name;

        @NameInMap("id")
        public String id;

        public static ListCommonGroupResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListCommonGroupResponseBodyObject self = new ListCommonGroupResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListCommonGroupResponseBodyObject setResourceCount(Integer resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public Integer getResourceCount() {
            return this.resourceCount;
        }

        public ListCommonGroupResponseBodyObject setSmartGroupId(String smartGroupId) {
            this.smartGroupId = smartGroupId;
            return this;
        }
        public String getSmartGroupId() {
            return this.smartGroupId;
        }

        public ListCommonGroupResponseBodyObject setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public ListCommonGroupResponseBodyObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListCommonGroupResponseBodyObject setIsRoot(Boolean isRoot) {
            this.isRoot = isRoot;
            return this;
        }
        public Boolean getIsRoot() {
            return this.isRoot;
        }

        public ListCommonGroupResponseBodyObject setPinyin(String pinyin) {
            this.pinyin = pinyin;
            return this;
        }
        public String getPinyin() {
            return this.pinyin;
        }

        public ListCommonGroupResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListCommonGroupResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCommonGroupResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
