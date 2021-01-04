// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DescribeFlexBackupGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PromptInfo")
    public java.util.Map<String, ?> promptInfo;

    @NameInMap("AllBackupGroups")
    public DescribeFlexBackupGroupsResponseBodyAllBackupGroups allBackupGroups;

    public static DescribeFlexBackupGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlexBackupGroupsResponseBody self = new DescribeFlexBackupGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFlexBackupGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeFlexBackupGroupsResponseBody setPromptInfo(java.util.Map<String, ?> promptInfo) {
        this.promptInfo = promptInfo;
        return this;
    }
    public java.util.Map<String, ?> getPromptInfo() {
        return this.promptInfo;
    }

    public DescribeFlexBackupGroupsResponseBody setAllBackupGroups(DescribeFlexBackupGroupsResponseBodyAllBackupGroups allBackupGroups) {
        this.allBackupGroups = allBackupGroups;
        return this;
    }
    public DescribeFlexBackupGroupsResponseBodyAllBackupGroups getAllBackupGroups() {
        return this.allBackupGroups;
    }

    public static class DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("SpecDesc")
        public String specDesc;

        public static DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups self = new DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups();
            return TeaModel.build(map, self);
        }

        public DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups setSpecDesc(String specDesc) {
            this.specDesc = specDesc;
            return this;
        }
        public String getSpecDesc() {
            return this.specDesc;
        }

    }

    public static class DescribeFlexBackupGroupsResponseBodyAllBackupGroupsBackupGroups extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("GroupId")
        public String groupId;

        public static DescribeFlexBackupGroupsResponseBodyAllBackupGroupsBackupGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexBackupGroupsResponseBodyAllBackupGroupsBackupGroups self = new DescribeFlexBackupGroupsResponseBodyAllBackupGroupsBackupGroups();
            return TeaModel.build(map, self);
        }

        public DescribeFlexBackupGroupsResponseBodyAllBackupGroupsBackupGroups setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeFlexBackupGroupsResponseBodyAllBackupGroupsBackupGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

    }

    public static class DescribeFlexBackupGroupsResponseBodyAllBackupGroups extends TeaModel {
        @NameInMap("SharedGroups")
        public java.util.List<DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups> sharedGroups;

        @NameInMap("BackupGroups")
        public java.util.List<DescribeFlexBackupGroupsResponseBodyAllBackupGroupsBackupGroups> backupGroups;

        public static DescribeFlexBackupGroupsResponseBodyAllBackupGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeFlexBackupGroupsResponseBodyAllBackupGroups self = new DescribeFlexBackupGroupsResponseBodyAllBackupGroups();
            return TeaModel.build(map, self);
        }

        public DescribeFlexBackupGroupsResponseBodyAllBackupGroups setSharedGroups(java.util.List<DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups> sharedGroups) {
            this.sharedGroups = sharedGroups;
            return this;
        }
        public java.util.List<DescribeFlexBackupGroupsResponseBodyAllBackupGroupsSharedGroups> getSharedGroups() {
            return this.sharedGroups;
        }

        public DescribeFlexBackupGroupsResponseBodyAllBackupGroups setBackupGroups(java.util.List<DescribeFlexBackupGroupsResponseBodyAllBackupGroupsBackupGroups> backupGroups) {
            this.backupGroups = backupGroups;
            return this;
        }
        public java.util.List<DescribeFlexBackupGroupsResponseBodyAllBackupGroupsBackupGroups> getBackupGroups() {
            return this.backupGroups;
        }

    }

}
