// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ShareBatchPrivateDataRequest extends TeaModel {
    @NameInMap("ProjectType")
    public Integer projectType;

    @NameInMap("SourceTargetList")
    public java.util.List<ShareBatchPrivateDataRequestSourceTargetList> sourceTargetList;

    @NameInMap("TargetProjectId")
    public Long targetProjectId;

    public static ShareBatchPrivateDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ShareBatchPrivateDataRequest self = new ShareBatchPrivateDataRequest();
        return TeaModel.build(map, self);
    }

    public ShareBatchPrivateDataRequest setProjectType(Integer projectType) {
        this.projectType = projectType;
        return this;
    }
    public Integer getProjectType() {
        return this.projectType;
    }

    public ShareBatchPrivateDataRequest setSourceTargetList(java.util.List<ShareBatchPrivateDataRequestSourceTargetList> sourceTargetList) {
        this.sourceTargetList = sourceTargetList;
        return this;
    }
    public java.util.List<ShareBatchPrivateDataRequestSourceTargetList> getSourceTargetList() {
        return this.sourceTargetList;
    }

    public ShareBatchPrivateDataRequest setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public static class ShareBatchPrivateDataRequestSourceTargetList extends TeaModel {
        @NameInMap("TargetTableId")
        public Long targetTableId;

        @NameInMap("TargetTableName")
        public String targetTableName;

        public static ShareBatchPrivateDataRequestSourceTargetList build(java.util.Map<String, ?> map) throws Exception {
            ShareBatchPrivateDataRequestSourceTargetList self = new ShareBatchPrivateDataRequestSourceTargetList();
            return TeaModel.build(map, self);
        }

        public ShareBatchPrivateDataRequestSourceTargetList setTargetTableId(Long targetTableId) {
            this.targetTableId = targetTableId;
            return this;
        }
        public Long getTargetTableId() {
            return this.targetTableId;
        }

        public ShareBatchPrivateDataRequestSourceTargetList setTargetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            return this;
        }
        public String getTargetTableName() {
            return this.targetTableName;
        }

    }

}
