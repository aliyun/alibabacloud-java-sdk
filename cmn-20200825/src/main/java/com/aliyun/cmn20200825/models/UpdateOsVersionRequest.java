// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class UpdateOsVersionRequest extends TeaModel {
    // 文件名
    @NameInMap("FileName")
    public String fileName;

    // 文件路径
    @NameInMap("FilePath")
    public String filePath;

    // instanceId
    @NameInMap("InstanceId")
    public String instanceId;

    // 型号
    @NameInMap("Model")
    public String model;

    // 系统版本
    @NameInMap("OsVersion")
    public String osVersion;

    // osVersionId
    @NameInMap("OsVersionId")
    public String osVersionId;

    // 状态
    @NameInMap("Status")
    public String status;

    // 厂商
    @NameInMap("Vendor")
    public String vendor;

    public static UpdateOsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOsVersionRequest self = new UpdateOsVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOsVersionRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateOsVersionRequest setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public UpdateOsVersionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateOsVersionRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public UpdateOsVersionRequest setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
    public String getOsVersion() {
        return this.osVersion;
    }

    public UpdateOsVersionRequest setOsVersionId(String osVersionId) {
        this.osVersionId = osVersionId;
        return this;
    }
    public String getOsVersionId() {
        return this.osVersionId;
    }

    public UpdateOsVersionRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateOsVersionRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
