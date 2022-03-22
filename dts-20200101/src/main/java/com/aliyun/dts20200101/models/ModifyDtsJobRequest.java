// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DbList")
    public java.util.Map<String, ?> dbList;

    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("EtlOperatorColumnReference")
    public String etlOperatorColumnReference;

    // 文件上传后的url
    @NameInMap("FileOssUrl")
    public String fileOssUrl;

    // 修改任务的方式，当为UPDATE_RESERVED时为修改reserve字段，不传默认修改dbList
    @NameInMap("ModifyTypeEnum")
    public String modifyTypeEnum;

    @NameInMap("RegionId")
    public String regionId;

    // 新增的reserved字段，新增而不是覆盖
    @NameInMap("Reserved")
    public String reserved;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    public static ModifyDtsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobRequest self = new ModifyDtsJobRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDtsJobRequest setDbList(java.util.Map<String, ?> dbList) {
        this.dbList = dbList;
        return this;
    }
    public java.util.Map<String, ?> getDbList() {
        return this.dbList;
    }

    public ModifyDtsJobRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ModifyDtsJobRequest setEtlOperatorColumnReference(String etlOperatorColumnReference) {
        this.etlOperatorColumnReference = etlOperatorColumnReference;
        return this;
    }
    public String getEtlOperatorColumnReference() {
        return this.etlOperatorColumnReference;
    }

    public ModifyDtsJobRequest setFileOssUrl(String fileOssUrl) {
        this.fileOssUrl = fileOssUrl;
        return this;
    }
    public String getFileOssUrl() {
        return this.fileOssUrl;
    }

    public ModifyDtsJobRequest setModifyTypeEnum(String modifyTypeEnum) {
        this.modifyTypeEnum = modifyTypeEnum;
        return this;
    }
    public String getModifyTypeEnum() {
        return this.modifyTypeEnum;
    }

    public ModifyDtsJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDtsJobRequest setReserved(String reserved) {
        this.reserved = reserved;
        return this;
    }
    public String getReserved() {
        return this.reserved;
    }

    public ModifyDtsJobRequest setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

}
