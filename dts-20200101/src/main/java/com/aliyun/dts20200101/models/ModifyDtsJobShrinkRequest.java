// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DbList")
    public String dbListShrink;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("EtlOperatorColumnReference")
    public String etlOperatorColumnReference;

    @NameInMap("FileOssUrl")
    public String fileOssUrl;

    @NameInMap("FilterTableName")
    public String filterTableName;

    @NameInMap("ModifyTypeEnum")
    public String modifyTypeEnum;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Reserved")
    public String reserved;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    public static ModifyDtsJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobShrinkRequest self = new ModifyDtsJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDtsJobShrinkRequest setDbListShrink(String dbListShrink) {
        this.dbListShrink = dbListShrink;
        return this;
    }
    public String getDbListShrink() {
        return this.dbListShrink;
    }

    public ModifyDtsJobShrinkRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyDtsJobShrinkRequest setEtlOperatorColumnReference(String etlOperatorColumnReference) {
        this.etlOperatorColumnReference = etlOperatorColumnReference;
        return this;
    }
    public String getEtlOperatorColumnReference() {
        return this.etlOperatorColumnReference;
    }

    public ModifyDtsJobShrinkRequest setFileOssUrl(String fileOssUrl) {
        this.fileOssUrl = fileOssUrl;
        return this;
    }
    public String getFileOssUrl() {
        return this.fileOssUrl;
    }

    public ModifyDtsJobShrinkRequest setFilterTableName(String filterTableName) {
        this.filterTableName = filterTableName;
        return this;
    }
    public String getFilterTableName() {
        return this.filterTableName;
    }

    public ModifyDtsJobShrinkRequest setModifyTypeEnum(String modifyTypeEnum) {
        this.modifyTypeEnum = modifyTypeEnum;
        return this;
    }
    public String getModifyTypeEnum() {
        return this.modifyTypeEnum;
    }

    public ModifyDtsJobShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobShrinkRequest setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public ModifyDtsJobShrinkRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

}
